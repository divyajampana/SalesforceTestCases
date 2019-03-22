package pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class TestCase5 extends ResuseMethods{
	public static void main(String[] args) throws InterruptedException {

		startReport("C:\\Data\\ExtentReport\\TestCase5.html", "TestCase5");
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
		//Click user menu
		WebElement Usermenu = findElement(By.xpath("//span[@tabindex='0']"), "User Menu");
		clickObject(Usermenu, "User Menu");
		List<WebElement> dropdownList=driver.findElements(By.id("userNavMenu"));
		logger.log(LogStatus.PASS, dropdownList.get(0).getText() + "," );
		logger.log(LogStatus.PASS, "are displayed");
		endReport();
	}

}
