package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.Base;
import Pages.LoginPage;
import Utils.ConfigUtils;

public class LoginTest extends Base{
	
	@Test
	public static void doLogin() throws IOException {
	
		LoginPage obj=new LoginPage(driver);
		obj.validateLoginPageTitle();
		obj.loginToTheApplication();
		
	}

}
