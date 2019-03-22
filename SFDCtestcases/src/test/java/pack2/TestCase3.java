package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class TestCase3 extends ResuseMethods{

	public static void main(String[] args) throws InterruptedException {

		startReport("C:\\Data\\ExtentReport\\TestCase3.html", "TestCase3");
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
		//Select rememberMe check box
		WebElement run = findElement(By.xpath("//input[@name='rememberUn']"), "RememberMe");
		selectCheckBox(run, "RememberMe");
		//Click login
		WebElement login =findElement(By.xpath("//*[@id='Login']"), "Login button");
		clickObject(login, "Login button");
		Thread.sleep(2000);
		logger.log(LogStatus.PASS, driver.getTitle()+ "  is displayed");
		//Click userMenu
		WebElement Usermenu = findElement(By.xpath("//span[@tabindex='0']"), "User Menu");
		clickObject(Usermenu, "User Menu");
		//Click logOut
		WebElement logout = findElement(By.xpath("//a[@title='Logout']"), "Logout");
		clickObject(logout, "Logout");
		Thread.sleep(2000);
		logger.log(LogStatus.PASS, driver.getTitle() + " page is displayed");
		//Check username displayed on username field
		WebElement Uname1 =findElement(By.xpath("//input[@name='username']"), "User Name");
		String s1 =Uname1.getAttribute("value");
		String s2 ="info.satishraju@gmail.com";
		logger.log(LogStatus.PASS, s1);
		compareStrings(s1, s2);
		endReport();
	}

}

