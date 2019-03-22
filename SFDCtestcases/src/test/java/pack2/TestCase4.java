package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class TestCase4 extends ResuseMethods{
	public static void main(String[] args) throws InterruptedException {


		startReport("C:\\Data\\ExtentReport\\TestCase4.html", "TestCase4");
		InitializeDriver();
		Launch("https://login.salesforce.com/");
		logger.log(LogStatus.PASS, " Salesforce Application page is displayed ");
		//Click on forgot password link
		WebElement forgotpwd = findElement(By.id("forgot_password_link"), "Forgot Password");
		clickObject(forgotpwd, "Forgot Password");
		Thread.sleep(2000);
		logger.log(LogStatus.PASS, driver.getTitle() + " page is displayed");
		//Enter username
		WebElement Uname =findElement(By.xpath("//input[@id='un']"), "User Name");
		enterText(Uname, "User Name", "info.satishraju@gmail.com");
		//Click on continue button
		WebElement Continue =findElement(By.xpath("//input[@value='Continue']"), "Continue button");
		clickObject(Continue, "Continue button");
		Thread.sleep(2000);
		WebElement Msg =findElement(By.xpath("//div[@class='message']"), "Message");
		logger.log(LogStatus.PASS, Msg.getText());
		endReport();

	}

}
