package Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.Base;
import Pages.HomePage;
import Pages.LeavePage;
import Pages.LoginPage;

public class LeaveTestCases extends Base {
	
	@Test
	public static void getRejectedLeaves() throws IOException {
		new LoginPage(driver).validateLoginPageTitle();
		new LoginPage(driver).loginToTheApplication();
		new HomePage(driver).clickOnLeaveList();
		new LeavePage(driver).getRejectedLeaveList();
	}

}
