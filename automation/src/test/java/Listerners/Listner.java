package Listerners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener {

	public void onTestStart(ITestResult result) {
		if(result.equals(ITestResult.SUCCESS)) {
			
		}
	}

	public void onTestSuccess(ITestResult result) {
	
	}

	public void onTestFailure(ITestResult result) {

	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {
	
	}

	public void onFinish(ITestContext context) {

	}

}
