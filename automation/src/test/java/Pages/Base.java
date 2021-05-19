package Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Utils.ConfigUtils;
import Wrappers.GenericWrapper;

public class Base {
	public static WebDriver driver;
	public static ConfigUtils obj;
	public static Logger log;
	public static ExtentTest test;
	public static ExtentReports report;
	public static String fileName=null;
	
	@BeforeSuite
	public void setup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		obj=new ConfigUtils();		
		driver.navigate().to(obj.getURL());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

		//Configuration of log4j
		log=Logger.getLogger("Base");
		PropertyConfigurator.configure("log4j.properties");
		//DOMConfigurator.configure("Log4j.xml");
		//*/
		
		ExtentHtmlReporter htmlReport=new ExtentHtmlReporter("Results.html");
		report=new ExtentReports();
		report.attachReporter(htmlReport);
		
		test=report.createTest("Test1");
	}
	
	@AfterSuite
	public void tearDown() {
		driver.close();
		report.flush();

	}

}
