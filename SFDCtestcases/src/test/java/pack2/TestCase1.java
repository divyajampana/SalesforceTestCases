package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class TestCase1 extends ResuseMethods{
	public static void main(String[] args) {

		startReport("C:\\Data\\ExtentReport\\TestCase1.html", "TestCase1");
		InitializeDriver();
		Launch("https://login.salesforce.com/");
		logger.log(LogStatus.PASS, " Salesforce Application page is displayed ");
		//Enter username
		WebElement Uname =findElement(By.xpath("//input[@name='username']"), "User Name");
		Uname.clear();
		enterText(Uname, "User Name", "info.satishraju@gmail.com");
		//Clear password
		WebElement Pwd =findElement(By.xpath("//input[@id='password']"), "Password");
		Pwd.clear();
		logger.log(LogStatus.PASS, " Password field is empty " );	
		//Click login
		WebElement login =findElement(By.xpath("//*[@id='Login']"), "Login button");
		clickObject(login, "Login button");
		WebElement errmsg =findElement(By.id("error"), "Error message");
		logger.log(LogStatus.PASS, errmsg.getText());
		String s1 = errmsg.getText();
		String s2 = "Please enter your password.";
		compareStrings(s1, s2);
		endReport();
	}

}


