package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import Wrappers.GenericWrapper;

public class LoginPage extends Base {
	
	WebDriver lDriver;
	
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement uName;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@name='Submit']")
	WebElement btn;
	
	public LoginPage(WebDriver driver) {
		lDriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void validateLoginPageTitle() {
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expTitle=obj.getLoginTitle();
		Assert.assertEquals(actualTitle, expTitle, "Login Title Verification");
		test.log(Status.PASS, "Title validation is success");
		log.info("Title validation is success");
		
	}
	
	public void loginToTheApplication() throws IOException {
		uName.sendKeys(obj.getUserName());		
		pwd.sendKeys(obj.getPwd());		
		btn.click();
		test.log(Status.PASS, "Login is success");		
		GenericWrapper.takeScreenShot();
		test.addScreenCaptureFromPath("C:\\Users\\bhara\\eclipse-workspace\\automation\\target\\"+fileName+".png");
		log.info("Login is success");
	}
	

}
