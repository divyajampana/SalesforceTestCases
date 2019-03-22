package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class TestCase4b extends ResuseMethods{
	public static void main(String[] args) throws InterruptedException {

		startReport("C:\\Data\\ExtentReport\\TestCase4b.html", "TestCase4b");
		InitializeDriver();
		Launch("https://login.salesforce.com/");
		logger.log(LogStatus.PASS, " Salesforce Application page is displayed ");
		//Enter username
		WebElement Uname =findElement(By.xpath("//input[@name='username']"), "User Name");
		Uname.clear();
		enterText(Uname, "User Name", "123");
		//Enter password
		WebElement Pwd =findElement(By.xpath("//input[@id='password']"), "Password");
		Pwd.clear();
		enterText(Pwd, "Password", "22131");
		//Click login
		WebElement login =findElement(By.xpath("//*[@id='Login']"), "Login button");
		clickObject(login, "Login button");
		Thread.sleep(2000);
		WebElement errMsg =findElement(By.xpath("//div[@id='error']"), "Error message");
		logger.log(LogStatus.PASS, errMsg.getText());
		String s1 = errMsg.getText();
		String s2 = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		compareStrings(s1, s2);
		endReport();


	}


}
