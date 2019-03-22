package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class TestCase2 extends ResuseMethods{
	public static void main(String[] args) throws InterruptedException {

		startReport("C:\\Data\\ExtentReport\\TestCase2.html", "TestCase2");
		InitializeDriver();
		Launch("https://login.salesforce.com/");
		logger.log(LogStatus.PASS, " Salesforce Application page is displayed ");
		//Enter username
		WebElement Uname =findElement(By.xpath("//input[@name='username']"), "User Name");
		Uname.clear();
		enterText(Uname, "User Name", "info.satishraju@gmail.com");
		//Enter password
		WebElement Pwd =findElement(By.xpath("//input[@id='password']"), "Password");
		Pwd.clear();
		enterText(Pwd, "Password", "Divya@123");
		//Click login
		WebElement login =findElement(By.xpath("//*[@id='Login']"), "Login button");
		clickObject(login, "Login button");
		Thread.sleep(2000);
		logger.log(LogStatus.PASS, driver.getTitle()+ "  is displayed");
		String s1 = driver.getTitle();
		String s2 = "Home Page ~ Salesforce - Developer Edition";
		compareStrings(s1, s2);
		endReport();
	}

}