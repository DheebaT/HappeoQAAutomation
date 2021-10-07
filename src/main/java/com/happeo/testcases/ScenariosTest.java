package com.happeo.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;


import com.happeo.base.TestSuite;
import com.happeo.utilities.CommonActions;
import com.happeo.utilities.ReadConfig;
import com.sun.glass.events.KeyEvent;

public class ScenariosTest extends TestSuite  {

	ReadConfig read = new ReadConfig();

	@Test (priority =2)
	public void TS_002() throws InterruptedException, IOException, AWTException {

		CommonActions lp = new CommonActions(driver);
		BasicConfigurator.configure();
		test =extent.createTest("TS_002");


		lp.ClickOnElement("gSignInBtn");
		test.pass("Clicked Sign In with Google");

		lp.EnterText("GmailID",read.getUsername());
		test.pass("Entered Username");

		lp.ClickOnElement("NextBtn");
		test.pass("Clicked Next");
		Thread.sleep(3000);


		lp.EnterText("Password",read.getPassword());
		test.pass("Entered Password");
		Thread.sleep(3000);

		lp.ClickOnElement("NextBtn");
		test.pass("clicked Next");

		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

		lp.ClickOnElement("ChannelsBtn");
		test.pass("Clicked on Channel Icon");
		Thread.sleep(3000);

		lp.EnterText("SearchBox",read.SearchBoxValForIntChnl());
		test.pass("Entered Interview Channel in Search box");
		Thread.sleep(5000);
		test.pass("Wait for sometime");

		lp.ClickOnElement("SelectInterviewChannel");
		test.pass("selected Interview channel");
		Thread.sleep(5000);
		Thread.sleep(3000);

		Thread.sleep(3000);
		lp.EnterTextByCss("clickOnTextArea",read.ToRandomPost());
		test.pass("Clicked on Posts");
		Thread.sleep(3000);


		lp.ClickOnElement("clickOnPostOptnBtn");
		test.pass("Click on dotted icon");
		Thread.sleep(1000);
		lp.ClickOnElement("SelectShareAnnouncement");
		test.pass("Clicked on view post");
		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		test.pass("Selected choose a custom date");
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		test.pass("In date picker box");
		StringSelection stringSelection = new StringSelection("21/09/2021");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		lp.ClickOnElement("ClickShareBtn");
		test.pass("Clicked on Share button");


		lp.ClickOnElement("SureShareBtn");
		test.pass("Successfully shared the Announcement post");

		Thread.sleep(5000);
		lp.ClickOnElement("ClickIAtoSignOut");
		test.pass("Clicked on IA icon to signout");

		lp.ClickOnElement("ClickSignOut");
		test.pass("Signed out Successfully");


	}

	@Test (priority =3)
	public void TS_003() throws InterruptedException, IOException, AWTException {

		test =extent.createTest("TS_003");
		BasicConfigurator.configure();
		CommonActions lp = new CommonActions(driver);


		lp.ClickOnElement("gSignInBtn");
		test.pass("Clicked Sign In with Google");

		lp.EnterText("GmailID",read.getUsername());
		test.pass("Entered Username");

		lp.ClickOnElement("NextBtn");
		test.pass("Clicked Next");
		Thread.sleep(3000);


		lp.EnterText("Password",read.getPassword());
		test.pass("Entered Password");
		Thread.sleep(3000);

		lp.ClickOnElement("NextBtn");
		test.pass("clicked Next");

		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);

		lp.ClickOnElement("ClickOnPagesMenu");
		test.pass("Clicked on Channels menu");

		lp.EnterText("SearchInPages",read.SearchBoxValForPageGroup());
		test.pass("Entered text in search box");

		lp.ClickOnElement("SelectThisPageGrp");
		test.pass("Clicked on Pages menu");

		Thread.sleep(5000);
		Thread.sleep(5000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		lp.ClickOnElementByCss("clickEditMenuBtn");
		test.pass("clicked on edit menu");
		Thread.sleep(3000);

		lp.ClickOnElement("clickOnManagePagesBtn");
		test.pass("clicked on Manage pages");
		Thread.sleep(3000);

		lp.ClickOnElement("clickOnDotted");
		test.pass("clicked on dotted icon");
		Thread.sleep(3000);

		lp.ClickOnElement("clickonAddSubPage");
		test.pass("clicked on Add sub page");
		Thread.sleep(3000);

		lp.EnterText("EnterPageName", read.PageNameVal());
		test.pass("entered page name");
		Thread.sleep(3000);

		lp.ClickOnElement("ClickCreateBtn");
		test.pass("new page created");
		Thread.sleep(5000);
		Thread.sleep(5000);

		
		Thread.sleep(5000);
		lp.ClickOnElement("ClickIAtoSignOut");
		test.pass("Clicked on IA icon to signout");

		lp.ClickOnElement("ClickSignOut");
		test.pass("Signed out Successfully");




	}

	@Test (priority = 1) 
	public void TS_001() throws InterruptedException, IOException, AWTException {

		CommonActions lp = new CommonActions(driver);
		BasicConfigurator.configure();
		test =extent.createTest("TS_001");

		lp.ClickOnElement("gSignInBtn");
		test.pass("Clicked Sign In with Google");

		lp.EnterText("GmailID",read.getUsername());
		test.pass("Entered Username");

		lp.ClickOnElement("NextBtn");
		test.pass("Clicked Next");
		Thread.sleep(3000);


		lp.EnterText("Password",read.getPassword());
		test.pass("Entered Password");
		Thread.sleep(3000);

		lp.ClickOnElement("NextBtn");
		test.pass("clicked Next");

		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);

		lp.ClickOnElement("ChannelsBtn");
		test.pass("Clicked on Channel Icon");
		Thread.sleep(3000);

		lp.EnterText("SearchBox",read.SearchBoxValForIntChnl());
		test.pass("Entered Interview Channel in Search box");
		Thread.sleep(5000);
		test.pass("Wait for sometime");

		lp.ClickOnElement("SelectInterviewChannel");
		test.pass("selected Interview channel");
		Thread.sleep(5000);
		Thread.sleep(5000);

		lp.ClickOnElement("ClickonPostsBtn");
		test.pass("Clicked on Posts Button");
		Thread.sleep(3000);
		lp.ClickOnElementByCss("CLickOnIconToView");
		test.pass("Clicked on dotted icon to view");
		Thread.sleep(3000);
		lp.ClickOnElement("CLickViewOnPost");
		test.pass("Clicked on view post");
		Thread.sleep(3000);
		lp.ClickOnElementByCss("clickOnLikeBtn");
		test.pass("liked the post");
		Thread.sleep(3000);


		lp.ClickOnElement("ClickIAtoSignOut");
		test.pass("Clicked on IA icon to signout");

		lp.ClickOnElement("ClickSignOut");
		test.pass("Signed out Successfully");

	}

}
