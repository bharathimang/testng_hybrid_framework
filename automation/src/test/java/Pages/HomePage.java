package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import Wrappers.GenericWrapper;

public class HomePage extends Base {
	WebDriver lDriver;
	
	@FindBy(xpath="//table[@class='quickLaungeContainer']//td[1]")
	WebElement assignLeave;
	
	@FindBy(xpath="//table[@class='quickLaungeContainer']//td[2]")
	WebElement leaveList;
	
	@FindBy(xpath="//table[@class='quickLaungeContainer']//td[3]")
	WebElement timeSheets;
	
	@FindBy(xpath="//table[@class='quickLaungeContainer']//td[4]")
	WebElement applyLeave;
	
	@FindBy(xpath="//table[@class='quickLaungeContainer']//td[5]")
	WebElement myLeave;
	
	@FindBy(xpath="//table[@class='quickLaungeContainer']//td[6]")
	WebElement myTimeSheets;
	
	public HomePage(WebDriver driver) {
		lDriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLeaveList() throws IOException {
		leaveList.click();
		test.log(Status.PASS, "Clicking on the leave details");
		log.info("Clicking on the leave details");
		GenericWrapper.takeScreenShot();
	}

}
