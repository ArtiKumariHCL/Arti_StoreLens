package com.sat.AppHooks;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.sat.Recording.MyScreenRecorder;
import com.sat.testbase.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	
	TestBase testbase = new TestBase();	
	WebDriver driver = TestBase.getDriver();
	
	
	//private TestBase driverFactory;
//	private WebDriver driver;
	Properties prop;
	
	@Before(order=1)
	//@Test
	public void launchbrowser() throws Exception
	{
		//driverFactory=new TestBase();
//		testbase.startRecording();
		MyScreenRecorder.startRecording("launchbrowser");
		//driver=driverFactory.initializationFireFox();
		testbase.initializationFireFox();
		//driver=driverFactory.initialization();
		
	}

	@After(order=0)
	public void QuitBrowser() throws Exception 
	{
//		testbase.stopRecording();
 	MyScreenRecorder.stopRecording();
 	//testbase.quit();
       driver.quit();
	}
	
//	@After(order=1)
//	public void teardown(Scenario scenario)
//	{
//		if(scenario.isFailed())
//		{
//			String screenshotname=scenario.getName().replaceAll(" ","_");
//			byte[] sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(sourcepath, "image/png", screenshotname);
//			}
//	}

}
