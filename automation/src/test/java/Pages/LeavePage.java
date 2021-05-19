package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import Wrappers.GenericWrapper;

public class LeavePage extends Base {
	
	WebDriver lDriver;
	
	@FindBy(xpath="//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")
	WebElement allCheckBox;
	
	@FindBy(xpath="//input[@id='leaveList_chkSearchFilter_-1']")
	WebElement rejectedCheckBox;
	
	@FindBy(xpath="//input[@id='leaveList_chkSearchFilter_0']")
	WebElement cancelCheckBox;
	
	@FindBy(xpath="//input[@id='leaveList_chkSearchFilter_1']")
	WebElement pendingLeaveCheckBox;
	
	@FindBy(xpath="//input[@id='leaveList_chkSearchFilter_2']")
	WebElement plannedCheckBox;
	
	@FindBy(xpath="//input[@id='leaveList_chkSearchFilter_3']")
	WebElement takenCheckBox;
	
	@FindBy(xpath="//input[@id='btnSearch']")
	WebElement btnSearch;
	
	@FindBy(xpath="//table[@id='resultTable']//td[2]//a")
	List<WebElement> empNameList;
	
	public LeavePage(WebDriver driver) {
		lDriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getRejectedLeaveList() throws IOException {
		allCheckBox.click();
		allCheckBox.click();
		rejectedCheckBox.click();
		btnSearch.click();		
		System.out.println("No of leaves rejected "+empNameList.size());
		for(WebElement ele:empNameList) {
			String value=ele.getText();
			test.info(value);
		}
		test.log(Status.PASS, "Rejected Leave List");
		
		GenericWrapper.takeScreenShot();
	}

}
