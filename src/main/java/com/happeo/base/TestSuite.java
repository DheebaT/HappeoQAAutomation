package com.happeo.base;

import org.testng.annotations.AfterMethod;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.happeo.testcases.ScenariosTest;
import com.happeo.utilities.ReadConfig;
public class TestSuite {

	ReadConfig rc = new ReadConfig();

	public String baseURL = rc.getApplicationURL();
	public static WebDriver driver;
	public static Logger log = Logger.getLogger(TestSuite.class);

	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;

	@BeforeSuite
	public void preSetUp()
	{
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
		String repName="Test-Report-"+timeStamp+".html";

		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+ "/extent-reports/"+repName);//specify location of the report
		htmlReporter.config().setDocumentTitle("Happeo QA Automation Report"); //Title of the report
		htmlReporter.config().setReportName("Functional Test Report");
		htmlReporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();

		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("Host Name", "LocalHost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User", "Dheeba");
		extent.setSystemInfo("Browser Name", "Chrome");
		System.out.println("Settingup extent report");
	}

	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser)
	{
		System.out.println("Open the driver");
		log.info("Open the driver");
		
		System.setProperty("webdriver.chrome.driver",rc.getChromePath());
		driver = new ChromeDriver();
		
		log.info("Browser is launched");
		System.out.println("Browser is launched");
		
		driver.get(baseURL);
		
		log.info("Url is launched");
		System.out.println("Url is launched");
		
		driver.manage().window().maximize();
		
		log.info("Browser is maximized");
		System.out.println("Browser is maximized");


	}


	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {

		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "Test Case Failed is " +result.getName()); // To add name in extent report
			test.log(Status.FAIL, "Test Case Failed is " +result.getThrowable()); //To add error or exception 

			String ScreenshotPath = ScenariosTest.getScreenshot(driver, result.getName());

			test.addScreenCaptureFromPath(ScreenshotPath);
		} else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "Test Case Skipped is " +result.getName());
		}else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "Test Case Passed is " +result.getName());
		}
		driver.quit();
	}	


	@AfterSuite
	public void endReport()
	{
		extent.flush();

	}
	public static String getScreenshot(WebDriver driver, String ScreenshotName) throws IOException
	{
		String dateName = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);

		String destination = System.getProperty("user.dir")+"/Screenshots/"+ScreenshotName +dateName+".png" ;
		File finalDestination = new File(destination);
		FileUtils.copyFile(src, finalDestination);
		return destination;


	}

}


