package com.sat.testbase;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Properties;
//import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriverException;
import com.sat.testUtil.Testutil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver;
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();
	public static Properties prop;

	public TestBase() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/sat/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			e.printStackTrace();
			 }
	}

	public WebDriver initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {

			//WebDriverManager.chromedriver().setup();
			// tldriver.set(new ChromeDriver());
			//ChromeOptions options = new ChromeOptions();
			// options.addArguments("--headless", "--window-size=1920,1080");
			// driver.manage().window().maximize();
			//options.addArguments("--start-maximized");
			//options.addArguments("Zoom 75%");
			// WebDriver driver = new ChromeDriver(options);
			//tldriver.set(new ChromeDriver(options));
			//JavascriptExecutor jse = (JavascriptExecutor)driver;
			//String Zoom =  "document.body.style.zoom ='50%'";
			//jse.executeScript(Zoom);

			// System.setProperty("webdriver.chrome.driver",
			// "src/test/resources/com.sat.Drivers/chromedriver.exe");
			
			
			WebDriverManager.chromedriver().setup(); 
			//WebDriver driver = new ChromeDriver();
			//DriverFactory
			//driver.manage().window();
			//Dimension size = new Dimension((int)(driver.manage().window().getSize().getWidth()*0.75), (int)(driver.manage().window().getSize().getHeight()*0.75));
			//JavascriptExecutor executor = (JavascriptExecutor)driver;
			//executor.executeScript("document.body.style.zoom = '1.5'");
			//tldriver.set(driver.manage().window().setSize(size);)
			DesiredCapabilities caps = new DesiredCapabilities();
			//caps.setAcceptInsecureCerts(true);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.merge(caps);
			tldriver.set(new ChromeDriver(options));
			
			
		}
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		getDriver().manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		return getDriver();
	}
	
	
	
	public WebDriver initializationFireFox() {
		String browserName = prop.getProperty("browser1");

		if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			DesiredCapabilities caps = new DesiredCapabilities();
		FirefoxOptions options= new FirefoxOptions();
			options.addArguments("--start-maximized");
			options.merge(caps);
			tldriver.set(new FirefoxDriver(options));
			
			
		}

		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		getDriver().manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		return getDriver();
	}

	public WebDriver initializationChrome() {
		String browserName = prop.getProperty("browser1");

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			DesiredCapabilities caps = new DesiredCapabilities();
			ChromeOptions options = new ChromeOptions();
			//options.setBrowserVersion("116");
			options.addArguments("--start-maximized");
			options.merge(caps);
			tldriver.set(new ChromeDriver(options));
			
		}

		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		getDriver().manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		return getDriver();
	}
	
//	public void startRecording() throws Exception
//	{
//		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
//		String videoName = "TC_ATU_Test_Video" + timeStamp;
//		   String videoDir = getFilePath();
//		   
//		  
//	         
//	       recorder = new ATUTestRecorder(videoDir,videoName,false);
//	     
//
//		 //recorder = new ATUTestRecorder("C:\\Users\\TP_HCLPO-MP1\\Recordings_" + timeStamp,false);
//	recorder.start();
//	String Chromepath = “E:\\chromedriver.exe”;
//	System.setProperty(“webdriver.chrome.driver”, Chromepath);
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	driver.get(“https://www.ignatiuz.com/”);
//
//	}
//	
//	public void stopRecording() throws Exception
//	{
//	recorder.stop();
//	}

	
	public static synchronized WebDriver getDriver() {

		return tldriver.get();
	}

}
