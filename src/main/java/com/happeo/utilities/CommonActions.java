package com.happeo.utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.happeo.base.TestSuite;

public class CommonActions extends TestSuite {

	WebDriver ldriver;
	CommonXpaths cx =new CommonXpaths();

	public CommonActions(WebDriver rdriver) {

		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);

	}

	public void ClickOnElement(String Xpath)
	{
		try {

			driver.findElement(By.xpath(cx.getmemappingValue(Xpath))).click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			System.out.println("Clicked element succesfully");

		} catch(Exception e)
		{

			e.printStackTrace();
		}
	}
	public void ClickOnElementByCss(String css)
	{
		try {

			driver.findElement(By.cssSelector(cx.getmemappingValue(css))).click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			System.out.println("Clicked element succesfully");

		} catch(Exception e)
		{

			e.printStackTrace();
		}
	}

	public void EnterText(String Xpath, String value ) throws IOException 
	{
		try {

			driver.findElement(By.xpath(cx.getmemappingValue(Xpath))).sendKeys(value);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			System.out.println("Text entered succesfully");

		}catch(Exception e) {

			e.printStackTrace();

		}
	}
	public void EnterTextByCss(String css, String value ) throws IOException 
	{
		try {

			driver.findElement(By.cssSelector(cx.getmemappingValue(css))).sendKeys(value);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			System.out.println("Text entered succesfully");

		}catch(Exception e) {

			e.printStackTrace();

		}
	}
	
	public void VerifyElementPresentByLinkText(String Xpath)
	{
		//Actions actions = new Actions(driver);
		try {
		driver.findElement(By.linkText(cx.getmemappingValue(Xpath))).isDisplayed();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}
}
