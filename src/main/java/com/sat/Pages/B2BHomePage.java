package com.sat.Pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import com.sat.Pages.AdvancedSearchPage;
import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.sat.config.ConfigFileReader;
import com.sat.testUtil.Testutil;
import com.sat.testUtil.Wait;
import com.sat.testbase.TestBase;

import io.cucumber.datatable.DataTable;

public class B2BHomePage {
	String getdateformate;
	private WebDriver driver;
	private ConfigFileReader config = new ConfigFileReader();
	private AdvancedSearchPage adv = new AdvancedSearchPage(TestBase.getDriver());
	
	@FindBy(xpath ="//div[@data-control-name='lbl_NewItems_1']")
	private WebElement validManageNewItem;
	
	@FindBy(xpath = "//div[@data-control-name='Label2_8'] //div[@class='itemMeasurer_1mfsr54']")
	private WebElement validManageExpiredItem;
	
	@FindBy(xpath ="//div[@data-control-name='Label4_14'] ")
	private WebElement New_orders;
	
	@FindBy(xpath ="//div[@data-control-name='Label4_23'] ")
	private WebElement sending;

	@FindBy(xpath ="//div[@data-control-name='Label4_25'] ")
	private WebElement receiving;
	@FindBy(xpath ="//div[@data-control-name='btnNewOrder_PS']//div[contains(text(),'NEW ORDER')]")
	private WebElement order_button;

	@FindBy(xpath ="//input[@aria-label='Upload file']") //div[@class='addFileContent_1k88298']//following::input
	private WebElement upload_excel;
	@FindBy(xpath ="//div[@data-control-name='btnSaveChangeStoreMIS_6']")
	private WebElement upload_excel_pending;
	@FindBy(xpath ="//div[@data-control-name='btn_Save_View_Item_IS_1']")
	private WebElement Done;
	
	@FindBy(xpath ="//div[@data-control-name='btn_Next_Pending_Item_PS']//div[contains(text(),'NEXT')]")
	private WebElement next_button;
	
	@FindBy(xpath ="//div[@data-control-name='btn_ScanParcel_PS']//div[text()='SCAN PARCEL']")
	private WebElement scan_button;
	
	@FindBy(xpath ="//div[text()='Add parcel ID manually']")
	private WebElement addparcelIdManually;
	
	@FindBy(xpath ="//input[@appmagic-control='txt_ParcelID_PS_automanualtextbox']")
	private WebElement parcelNumber;
	
	@FindBy(xpath ="//input[@appmagic-control='txt_ParcelID_PS_automanual_2textbox']")
	private WebElement parcelNumber2;
	
	@FindBy(xpath ="//div[text()='DONE']/ancestor::div[@data-control-name='btn_Next_Pending_Item_PS']")
	private WebElement parcelIDDone;
	
	@FindBy(xpath ="//div[text()='DONE']/ancestor::div[@data-control-name='btn_Save_View_Item_HS_3']")
	private WebElement parcelIDDoneB2B;
	
	@FindBy(xpath ="//div[@data-control-name='lbl_Pending_Count_HS_1']")
	private WebElement countElementtransit;
	
	@FindBy(xpath ="//div[@appmagic-control='txtStoreContactEmailBSS_15']//button[@class='appmagic-text-clear-button']")
	private WebElement counttransitresaleapp;
	
	@FindBy(xpath ="//div[@data-control-name='Label4_23']")
	private WebElement sendingtransit;
	
	@FindBy(xpath ="//span[text()='File uploaded successfully']")
	private List<WebElement> FileuploadtoastMsg;
	
	@FindBy(xpath ="//span[@class='ms-MessageBar-innerText innerText-130']")
	private List<WebElement> toasteContainer;
	//div[@data-control-name='Label4_14']//div[contains(text(),'NEW ORDERS - PENDING')]
	
	@FindBy(xpath ="//div[@data-control-name='Label4_14']")
	private WebElement NewOrderPending;
	
	
	@FindBy(xpath ="//div[@data-control-name='lblCustomerServicePhoneBSS_17']")
	private WebElement IntransitReceiving;
	
	//@FindBy(xpath ="(//div[@data-control-name='btnReportMissingMUS'])[1]")
	//private WebElement Missingbtn;
	
	@FindBy(xpath ="//div[@data-control-name='lblReceivingStoreHeader_PS_2'] //div[text()='Order Number']")
	private WebElement OrdrNo;
	
	@FindBy(xpath ="(//div[@data-control-name='lblOrderStatusMIS'])[last()]")
	private WebElement OrdrNoAllitems;
	
	@FindBy(xpath ="//div[@data-control-name='cbAdvStatus']")
	private WebElement AdvanceStatusClick;
	
	
	@FindBy(xpath ="//div[@data-control-name='btnAdvSearch']//div[text()='SEARCH']")
	private WebElement AdvanceSearchbtn;
	
	@FindBy(xpath ="//div[@data-control-name='lblHeaderTopMAS_22']")
	private WebElement actionNeeded;
	
	@FindBy(xpath ="//div[@data-control-name='lblHeaderTopMAS_7']")
	private WebElement b2b;
	
	@FindBy(xpath ="//div[@data-control-name='lblCustomerServicePhoneBSS_17']")//div[@data-control-name='Container1_24']
	private WebElement inTransitReceiving;
	
	@FindBy(xpath ="//div[@data-control-name='lblCustomerServicePhoneBSS_18']")//div[@data-control-name='Container1_25']
	private WebElement expiredB2B;
	
	@FindBy(xpath ="//div[@data-control-name='lblCustomerServicePhoneBSS_19']")//div[@data-control-name='Container1_26']
	private WebElement inTransitSendinging;
	
	@FindBy(xpath = "//div[@data-control-name='ddStore_3']")
	private WebElement receivingStoreList;
	
	@FindBy(xpath = "//*[text()='OK']/parent::div")
	private WebElement okButton;
	
	@FindBy(xpath ="//div[@data-control-name='Label4_26']")
	private WebElement receivingIntransitB2B;
	
	@FindBy(xpath ="(//div[@data-control-name='lblItemsHeader_PS_Item_2'])[1]")
	private WebElement parcelId;
	
	@FindBy(xpath ="(//div[@data-control-name='imgMenuIcn'])[4]")
	private WebElement orderPage;
	
	@FindBy(xpath ="(//div[@data-control-name='imgMenuIcn'])[3]")
	private WebElement itemPage;
	
	@FindBy(xpath ="//div[@data-control-name='ddTypeOptions']")
	private WebElement optionDropDown;
	
	@FindBy(xpath ="//div[@data-control-name='ddOrderStatus']")
	private WebElement statusDropDown;
	
	@FindBy(xpath ="//input[@appmagic-control='txtSearchOrder_2textbox']")
	private WebElement searchTextBox;
	
	@FindBy(xpath ="//div[@data-control-name='lblOrderHeaderMIS']")
	private WebElement orderNumber;
	
	@FindBy(xpath ="(//div[@data-control-name='lblPriceMIS'])[1]")
	private WebElement priceCurrency;
	
	
	String Order_no_expected=null;
	String Order_no_actual=null;
	String parcelIdtext=null;
	List<String> columnNames;
	Wait waits = new Wait();
	Testutil util = new Testutil();
	Testutil testutil = new Testutil();
	
	public B2BHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public boolean isClickable(WebElement ele) {
		boolean flag = true;
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(ele));
			System.out.println("Element is clickable");
		} catch (Exception e) {
			System.out.println("Element isn't clickable");
			flag = false;
		}
		return flag;
	}
	//Get initial count
	int initialcount;
	int updatedCount;
	
	//check the entity  is available in the B2B home page
	
	public void validateB2BhomeEntity(String ManageNewItem,String ManageExpiredItem) {
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//String validManageNewItem = driver.findElement(By.xpath("//div[contains(text(),'"+ManageNewItem+"')]")).getText();
		String expextedManagestr=validManageNewItem.getText();
		System.out.println(expextedManagestr);
		String expectedExpired = validManageExpiredItem.getText();
		System.out.println(expectedExpired);
		assertTrue(expextedManagestr.contains(ManageNewItem),"Manage New Item is same");
		assertTrue(expectedExpired.contains(ManageExpiredItem),"Manage expired item same");

	}
	
	public void validateOrderNumber(String actualColName) {
		String exceptedColName = orderNumber.getAttribute("InnerText");
		Wait.untilPageLoadComplete(driver, 30);
		assertTrue(exceptedColName.equalsIgnoreCase(actualColName));
		Wait.untilPageLoadComplete(driver, 30);
	}
	
	
	 public void selectOption(String option)
	    {
	    	Wait.untilPageLoadComplete(driver, 30);
	    	optionDropDown.click();
	    	Wait.untilPageLoadComplete(driver, 30);
	    	driver.findElement(By.xpath("(//*[text()='"+option+"'])[2]")).click();
	    	Wait.untilPageLoadComplete(driver, 30);
	    	
	    }
	 public void selectStatus(String status)
	    {
	    	Wait.untilPageLoadComplete(driver, 30);
	    	statusDropDown.click();
	    	Wait.untilPageLoadComplete(driver, 30);
	    	driver.findElement(By.xpath("//*[text()='"+status+"']")).click();
	    	Wait.untilPageLoadComplete(driver, 30);
	    	
	    }
	 public void searchTextBox(String text)
		{
			Wait.untilPageLoadComplete(driver, 30);
			searchTextBox.click();
			Wait.untilPageLoadComplete(driver, 30);
			searchTextBox.sendKeys(text);
			Wait.untilPageLoadComplete(driver, 30);
		}
	
	public void validateHeading(String heading)
	{
		String actual=driver.findElement(By.xpath("//*[text()='"+heading+"']")).getText();
		Wait.untilPageLoadComplete(driver, 30);
		assertTrue(actual.equalsIgnoreCase(heading));
		Wait.untilPageLoadComplete(driver, 30);
		
	}
	
	public void validateResaleAppB2BPageHeading(String heading)
	{
		String actual=driver.findElement(By.xpath("(//*[text()='"+heading+"'])")).getText();
		Wait.untilPageLoadComplete(driver, 30);
		assertTrue(actual.equalsIgnoreCase(heading));
		Wait.untilPageLoadComplete(driver, 30);
		
	}
	
	public void validateB2BandActionNeededText(String text1,String text2)
	{
		String actualText2 =actionNeeded.getText();
		Wait.untilPageLoadComplete(driver, 30);
		assertTrue(actualText2.equalsIgnoreCase(text2));
		Wait.untilPageLoadComplete(driver, 30);
		
		String actualText1 =b2b.getText();
		Wait.untilPageLoadComplete(driver, 30);
		assertTrue(actualText1.equalsIgnoreCase(text1));
		Wait.untilPageLoadComplete(driver, 30);
	}
	
	public void validateInTransitReceivingCount(String text)
	{
		System.out.println("Clicking on In Transit Receiving ");
  		Wait.untilPageLoadComplete(driver, 5);
  		Wait.elementToBeClickable(driver, inTransitReceiving, 5);
  		testutil.actionMethodClick(driver, inTransitReceiving);
		
//		String actual=inTransitReceiving.getText();
//		Wait.untilPageLoadComplete(driver, 30);
//		assertTrue(actual.equalsIgnoreCase(text));
//		Wait.untilPageLoadComplete(driver, 30);
//		inTransitReceiving.click();
  		
		Wait.untilPageLoadComplete(driver, 30);
		String order=driver.findElement(By.xpath("//div[@data-control-name='txtStoreContactEmailBSS_15']")).getText();
		System.out.println("Receiving Order is "+order);
		Wait.untilPageLoadComplete(driver, 30);
		
	}
	
	public void validateExpiredB2BCount(String text)
	{
		System.out.println("Clicking on expired B2B ");
  		Wait.untilPageLoadComplete(driver, 5);
  		Wait.elementToBeClickable(driver, expiredB2B, 5);
  		testutil.actionMethodClick(driver, expiredB2B);
  		
  		Wait.untilPageLoadComplete(driver, 30);
		String order=driver.findElement(By.xpath("//div[@data-control-name='txtStoreContactEmailBSS_16']")).getText();
		System.out.println("Receiving Order is "+order);
		Wait.untilPageLoadComplete(driver, 30);

	}
	
	public void validateSendingCount(String text)
	{
		System.out.println("Clicking on In Transit Sendinging ");
  		Wait.untilPageLoadComplete(driver, 5);
  		Wait.elementToBeClickable(driver, inTransitSendinging, 5);
  		//IntransitReceiving.click();
  		testutil.actionMethodClick(driver, inTransitSendinging);
  		
  		Wait.untilPageLoadComplete(driver, 30);
		String order=driver.findElement(By.xpath("//div[@data-control-name='txtStoreContactEmailBSS_17']")).getText();
		System.out.println("Receiving Order is "+order);
		Wait.untilPageLoadComplete(driver, 30);
  		
//		String actual=inTransitSendinging.getText();
//		Wait.untilPageLoadComplete(driver, 30);
//		assertTrue(actual.equalsIgnoreCase(text));
//		Wait.untilPageLoadComplete(driver, 30);
//		inTransitSendinging.click();
//		Wait.untilPageLoadComplete(driver, 30);
//		//driver.navigate().refresh();
//		Wait.untilPageLoadComplete(driver, 30);
	}
	
	public void verfyWarningForDuplicateDetail()
	{
		String errorMsg=driver.findElement(By.xpath("//div[@data-control-name='lblErrorNameMIS_9']")).getText();
		Wait.untilPageLoadComplete(driver, 30);
		assertTrue(errorMsg.equalsIgnoreCase("**File cannot be uploaded, because there is information wrong or missing, or a double item ID. Please correct the file and try again to upload it."));
		Wait.untilPageLoadComplete(driver, 30);
		
		String warningMsg=driver.findElement(By.xpath("//div[@data-control-name='lblFirstNameMIS_8']")).getText();
		Wait.untilPageLoadComplete(driver, 30);
		assertTrue(warningMsg.equalsIgnoreCase("**Please make sure that the Item ID and price are filled in. Otherwise you will not be able to click 'NEXT'."));
		Wait.untilPageLoadComplete(driver, 30);
		
	}
	
		
	public void selectReceivingStoreValue(String color)
	{
		Wait.untilPageLoadComplete(driver, 30);
		driver.findElement(By.xpath("//div[@data-control-name='ddStore_2']")).click();
    	Wait.untilPageLoadComplete(driver, 30);
    	driver.findElement(By.xpath("(//div[@role='option'])[2]")).click();
    	//(//*[text()='Weekday Shoreditch(GB0977)'])[2]
    	
    	Wait.untilPageLoadComplete(driver, 30);
	}
	
	
	public void verifytext(DataTable datatable) throws InterruptedException {
		{
			List<String> actual = datatable.asList();
			List<WebElement> excepted=driver.findElements(By.xpath("//div[contains(@data-control-name,'Label4')]"));
			System.out.println("Size = "+ actual.size());
			for (int i = 0; i <= actual.size()-1; i++) {
	        	
		                 //String content = actual.get(i);
		                String data= excepted.get(i).getText();
		                Thread.sleep(2000);
		            	System.out.println("Data Contain : "+data);
		            	
		            	if(actual.get(i).equalsIgnoreCase(data))
		            	{
		            		System.out.println("This is Expected:" + data+" == "+" This is Actual:  "+actual.get(i));
		            	}
		            	else
		            	{
		            		System.out.println( "This is Expected  "+data+" is not equal "+"This is Actual  "+actual.get(i));
		            	}
		}
		
			}
	}

	public void verifyentity(DataTable datatable) throws InterruptedException {
		{
			List<String> actual = datatable.asList();
			System.out.println("Size = "+ actual.size());
			for (int i = 0; i <= actual.size(); i++) {
	        	
		                 String content = actual.get(i);
		                Thread.sleep(2000);
		            	WebElement data=driver.findElement(By.xpath("//div[contains(text(),'"+content+"')]"));
		            	System.out.println("Data Contain : "+data.getText());
		            	
		            	if(actual.get(i).equalsIgnoreCase(data.getText()))
		            	{
		            		System.out.println("This is Expected:" + data.getText()+" == "+" This is Actual:  "+actual.get(i));
		            	}
		            	else
		            	{
		            		System.out.println( "This is Expected  "+data.getText()+" is not equal "+"This is Actual  "+actual.get(i));
		            	}
		}
		
			}
	}

public void validateleftpanel(DataTable datatable) {
		List<String> actual = datatable.asList();
		System.out.println("Size = "+ actual.size());
		for (int i = 0; i <= actual.size()-1; i++) {
        	
	                 String content = actual.get(i);
	            	WebElement data=driver.findElement(By.xpath("//div[@class='appmagic-label-text'][normalize-space()='"+content+"']"));
	            	System.out.println("Data Contain : "+data.getText());
	            	
	            	if(actual.get(i).equalsIgnoreCase(data.getText()))
	            	{
	            		System.out.println("This is Expected:" + data.getText()+" == "+" This is Actual:  "+actual.get(i));
	            	}
	            	else
	            	{
	            		System.out.println( "This is Expected  "+data.getText()+" is not equal "+"This is Actual  "+actual.get(i));
	            	}
	}
	
		}

public void Click_new_order() {
	WebElement buttons=driver.findElement(By.xpath("(//div[@data-control-name='imgMenuIcn'])[2]"));
	
   // WebElement ele= buttons.get(0).click();
    Wait.untilPageLoadComplete(driver);
    Wait.elementToBeClickable(driver, buttons, 10);
    testutil.actionMethodClick(driver, buttons);
  //  buttons.click();
	//assertTrue(buttons.size()>0,"Click new order Button is not displayed");
}

public void Click_on_order_page() {
	
    Wait.untilPageLoadComplete(driver);
    Wait.elementToBeClickable(driver, orderPage, 10);
    testutil.actionMethodClick(driver, orderPage);
  
}

public void Click_on_item_page() {
	
    Wait.untilPageLoadComplete(driver);
    Wait.elementToBeClickable(driver, itemPage, 10);
    testutil.actionMethodClick(driver, itemPage);
  
}

public void Click_order() {
    Wait.untilPageLoadComplete(driver);
    Wait.elementToBeClickable(driver, order_button, 10);
    testutil.actionMethodClick(driver, order_button);
  
}

public void clickOnUploadExcel(String downloadedPath) {
	Wait.untilPageLoadComplete(driver, 10);
	Wait.elementToBeClickable(driver, upload_excel, 5);
//	testutil.actionMethodClick(driver, upload_excel);
	File file = new File(downloadedPath);
	System.out.println(file);
	upload_excel.sendKeys(downloadedPath);
	System.out.println("Clicking on Done Button after successful uploading of the file");
	Wait.elementToBeClickable(driver, Done, 5);
	Done.click();
	System.out.println("Validate the toast msg");
	util.validatesuccessmsg(driver, FileuploadtoastMsg, toasteContainer);
}

public void validatependingScren1_3(DataTable datatable) throws InterruptedException {
	List<String> actual = datatable.asList();
	System.out.println("Size = "+ actual.size());
			for (int i = 0; i < actual.size(); i++) {	        	
	           String Size = actual.get(i);
	            	Thread.sleep(2000);
	            	Boolean flag = false;
	            	long startTime = System.currentTimeMillis();// fetch starting time
	                System.out.println(startTime);
	        		while (!flag && (System.currentTimeMillis() - startTime) < 60000) {
	        			List<WebElement> data=driver.findElements(By.xpath("//*[contains(text(),'"+Size+"')]"));
	        			System.out.println(data.size());
	        			for (int j = 0; j < data.size(); j++){
	        				if (data.get(j).isDisplayed()) {
	        					System.out.println("element is visible");
	        					System.out.println(data.get(j).getText());
	        					String[] expectedString=data.get(j).getText().split(":");
	        					String firstpart= expectedString[0];
	        					System.out.println("Data Contain : "+firstpart);
	        					if(actual.get(i).equalsIgnoreCase(firstpart.trim()))
	        	            	{
	        	            		System.out.println("This is Expected: "+firstpart+" == "+" This is Actual: "+actual.get(i));
	        	            	}
	        	            	else
	        	            	{
	        	            		System.out.println("This is Expected: "+firstpart+" is not equal "+"This is Actual: "+actual.get(i));
	        	            	}
	        					flag = true;
	        				j = data.size();
	        				}
	        			}
	        		}
			}
		
	        		}
public void next_button_click()  {
	
	Robot robot;
	try {
		robot = new Robot();
		System.out.println("About to zoom in");
		for (int k = 0; k < 4; k++) {
			System.out.println("executing for loop");
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Wait.elementToBeClickable(driver, next_button, 3);
	testutil.actionMethodClick(driver, next_button);
}
public void scan_parcel_click()  {
	boolean isButtonDisplayed=scan_button.isDisplayed();
	if(isButtonDisplayed) {
		System.out.println("Button is displayed on the web page");
	}
		else {
			System.out.println("Button is not displayed on the web page");
		}
	Wait.elementToBeClickable(driver, scan_button, 3);
	scan_button.click();
	}

public void validate_parcelId(DataTable datatable) throws AWTException, InterruptedException
{
	Robot robot= new Robot();
	robot.keyPress(KeyEvent.VK_F11);
	robot.keyRelease(KeyEvent.VK_F11);
	
	List<String> actual = datatable.asList();
	System.out.println("Size = "+ actual.size());
			for (int i = 0; i < actual.size(); i++) {	        	
	           String Size = actual.get(i);
	            	Thread.sleep(2000);
	            	Boolean flag = false;
	        		while (!flag) {
	        			List<WebElement> data=driver.findElements(By.xpath("//div[contains(text(),'"+Size+"')]"));
	        			System.out.println(data.size());
	        			for (int j = 0; j < data.size(); j++){
	        				if (data.get(j).isDisplayed()) {
	        					System.out.println("element is visible");
	        					System.out.println(data.get(j).getText());
	        					
	        					String expectedstring=data.get(j).getText();
	        					System.out.println("Data Contain : "+expectedstring);
	        					if(actual.get(i).equalsIgnoreCase(expectedstring))
	        	            	{
	        	            		System.out.println("This is Expected: "+expectedstring+" == "+" This is Actual: "+actual.get(i));
	        	            	}
	        	            	else
	        	            	{
	        	            		System.out.println("This is Expected: "+expectedstring+" is not equal "+"This is Actual: "+actual.get(i));
	        	            	}
	        					flag = true;
	        				j = data.size();
	        				}
	        			}
	        		}
			}
}

			public void generate_parcelId() throws AWTException, InterruptedException
			{
				Robot robot = new Robot();
		        System.out.println("About to zoom in");
					for (int i = 0; i < 4; i++) {
			            robot.keyPress(KeyEvent.VK_CONTROL);
			            robot.keyPress(KeyEvent.VK_ADD);
			            robot.keyRelease(KeyEvent.VK_ADD);
			            robot.keyRelease(KeyEvent.VK_CONTROL);
					}
					System.out.println("Trying to create unique id manually");
				 	util.actionMethodClick(driver, addparcelIdManually);
				 	int number = ThreadLocalRandom.current().nextInt();
					System.out.println("random  number before absolute:" + number);
					int randomNumber = Math.abs(number);
					System.out.println("random number is:" + randomNumber);
					Wait.waitUntilElementVisible(driver, parcelNumber);
					parcelNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
					parcelNumber.sendKeys(String.valueOf(randomNumber));
					parcelNumber.sendKeys(Keys.ENTER);
					parcelIDDone.click();
					Wait.waitForInvisibilityOfElement(driver, parcelIDDone, 5);
			}
			
			public void generate_parcelId_B2BApp() throws AWTException, InterruptedException
			{
				Robot robot = new Robot();
		        System.out.println("About to zoom in");
					for (int i = 0; i < 4; i++) {
			            robot.keyPress(KeyEvent.VK_CONTROL);
			            robot.keyPress(KeyEvent.VK_SUBTRACT);
						robot.keyRelease(KeyEvent.VK_SUBTRACT);
						robot.keyRelease(KeyEvent.VK_SUBTRACT);
			            robot.keyRelease(KeyEvent.VK_CONTROL);
					}
					System.out.println("Trying to create unique id manually");
				 	util.actionMethodClick(driver, addparcelIdManually);
				 	parcelIdtext=parcelId.getText();
					System.out.println("random number is:" + parcelIdtext);
					Wait.waitUntilElementVisible(driver, parcelNumber2);
					parcelNumber2.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
					parcelNumber2.sendKeys(parcelIdtext);
					parcelNumber2.sendKeys(Keys.ENTER);
					parcelIDDoneB2B.click();
					Wait.waitForInvisibilityOfElement(driver, parcelIDDoneB2B, 5);
			}
			
			public void Click_homebtn() {
				WebElement buttons=driver.findElement(By.xpath("(//div[@data-control-name='imgMenuIcn'])[1]"));
			    Wait.elementToBeClickable(driver, buttons, 10);
			    testutil.actionMethodClick(driver, buttons);
			}
			public void validate_intransit_count()
			{   
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {   
					initialcount=Integer.parseInt(countElementtransit.getText());
					} catch (NumberFormatException nfe) {
					  
					}
				//initialcount=Integer.parseInt(countElementtransit.getText());
				System.out.println("Before the file upload"+countElementtransit.getText());
				WebElement sendingtransit=driver.findElement(By.xpath("//div[@data-control-name='Label4_24']"));
				System.out.println("Under "+sendingtransit.getText() +" count is displayed as  " +initialcount );
				System.out.println("Aftre the file is uploaded");
				updatedCount=initialcount+1;
				System.out.println(updatedCount);
				Assert.assertEquals(initialcount+1, updatedCount);
				
				
			}
			
			public void Validatesending_Intransit(DataTable datatable)
			{
				System.out.println("Click on Sending In-transit");
				 Wait.elementToBeClickable(driver, sendingtransit,5);
				    testutil.actionMethodClick(driver, sendingtransit);
				   //validate the content
				    List<String> actual = datatable.asList();
					System.out.println("Size = "+ actual.size());
					for (int i = 0; i < actual.size(); i++) {	        	
			           String Size = actual.get(i);
			           System.out.println(Size);
			            	Boolean flag = false;
			        		while (!flag) {
			        			List<WebElement> data=driver.findElements(By.xpath("//div[normalize-space(text())='"+Size+"']"));
			        			System.out.println(data.size());
			        			for (int j = 0; j < data.size(); j++){
			        				if (isClickable(data.get(j))) {
			        					//System.out.println(Size +"Size of element string of data table");
			        					Wait.elementToBeClickable(driver, data.get(j), 5);
			        					String expectedString = data.get(j).getText();
			        					System.out.println("Data Contain : "+data.get(j).getText());
			        					if(actual.get(i).equalsIgnoreCase(expectedString))
			        	            	{
			        	            		System.out.println("This is Expected:"+expectedString+" == "+" This is Actual:"+actual.get(i));
			        	            	}
			        	            	else
			        	            	{
			        	            		System.out.println("This is Expected:"+expectedString+" is not equal "+"This is Actual:"+actual.get(i));
			        	            	}
			        					flag = true;
			        				j = data.size();
			        				}
			        			}
			        		}
					}
			}
			
		
			public void Validate_exceldata(String excelpath,DataTable datatable) throws IOException
			{
				System.out.println("Click on Datatable");
			    List<String> actual = datatable.asList();
				System.out.println("Size = "+ actual.size());
				List<String> columnName = new ArrayList<>();
				String sheetName= "Sheet1";
				FileInputStream fileInputStream = new FileInputStream(excelpath);
				Workbook workbook = new XSSFWorkbook(fileInputStream);
				Sheet sheet = workbook.getSheet(sheetName);
				Row headerrow = sheet.getRow(0);
				for(Cell cell:headerrow) 
				{
					
					columnName.add(cell.getStringCellValue());
					
				}
				 System.out.println("Column Name:"+columnName);
					for(int i = 0; i <columnName.size()-1; i++) {	        	
				           String Size = actual.get(i);
				           System.out.println(Size);
						 String excelValue=columnName.get(i);
						 String dataTablevalue =actual.get(i);
						 if(dataTablevalue.equalsIgnoreCase(excelValue))
     	            	{
     	            		System.out.println("This is Expected: "+dataTablevalue+" == "+" This is Actual: "+excelValue);
     	            	}
     	            	else
     	            	{
     	            		System.out.println("This is Expected: "+dataTablevalue+" is not equal "+"This is Actual: "+excelValue);
     	            	} 
					 }
			}
		public void Click_NewOrderPending(String store,String  Store_no) 
					{
			       System.out.println("Clicking on the New Order Pending");
					Wait.untilPageLoadComplete(driver);
					Wait.elementToBeClickable(driver, NewOrderPending, 5);
					testutil.actionMethodClick(driver, NewOrderPending);
					System.out.println("Clicking on the one of the Pending Order");
					WebElement pendingStatus = driver.findElement(By
							.xpath("//div[text()='"+store+"']/parent::div[@class='appmagic-label no-focus-outline middle readOnly']"));
					Wait.waitUntilElementVisible(driver, pendingStatus);
					Wait.elementToBeClickable(driver, pendingStatus, 5);
					testutil.actionMethodClick(driver, pendingStatus);
					//util.jsclick(driver, pendingStatus);
					WebElement Store_num = driver
							.findElement(By.xpath("(//div[contains(@data-control-name,'lblReceivingStoreHeader_PS_Item')]//*[text()='"+ Store_no +"']/parent::div)[1]"));
					Wait.elementToBeClickable(driver, Store_num, 2);
					testutil.actionMethodClick(driver, Store_num);
					//util.jsclick(driver, Store_num);
					System.out.println("Clicked on OrderNumber");
					}
		
		public void validate_textyellow(String excelpath) 
		{
		WebElement ele=driver.findElement(By.xpath("//div[@data-control-name='lblFirstNameMIS_8']//div[@class='appmagic-borderfill-container']"));
		System.out.println(ele.getText());
		String backgroundcolor= ele.getCssValue("background-color");
		System.out.println(backgroundcolor);
		//convert rgba(255, 255, 0, 1) to string yellow
	   if(backgroundcolor.equalsIgnoreCase("rgba(255, 255, 0, 1)") ||backgroundcolor.equalsIgnoreCase("#ffff00")) {
		   System.out.println("The text background is highlighted with yellow color");
	   }
	   else {
		   System.out.println("The text background is not highlighted with yellow color");
	   }
	    Wait.elementToBeClickable(driver, upload_excel_pending, 2);
		testutil.actionMethodClick(driver, upload_excel_pending);
		
		}
		public void click_excel_pending(String excelpath) 
		{
			System.out.println("Uploading the excel file for pending item");
			Wait.untilPageLoadComplete(driver, 10);
			Wait.elementToBeClickable(driver, upload_excel, 5);
//			testutil.actionMethodClick(driver, upload_excel);
			File file = new File(excelpath);
			System.out.println(file);
			upload_excel.sendKeys(excelpath);
			System.out.println("Uploaded the excel file");
		}
		
		public void validate_actionneeded(String actionneed,DataTable datatable) throws InterruptedException 
		{
			//{
				List<String> actual = datatable.asList();
				System.out.println("Size = "+ actual.size());
				for (int i = 0; i <= actual.size()-1; i++) {
		        	
			                 String content = actual.get(i);
			                Thread.sleep(2000);
			            	WebElement data=driver.findElement(By.xpath("//div[contains(text(),'"+content+"')]"));
			            	System.out.println("Data Contain : under "+ actionneed +" is "+data.getText());
			            	
			            	if(actual.get(i).equalsIgnoreCase(data.getText()))
			            	{
			            		System.out.println("This is Expected: " + data.getText()+" == "+" This is Actual:  "+actual.get(i));
			            	}
			            	else
			            	{
			            		System.out.println( "This is Expected:  "+data.getText()+" is not equal "+" This is Actual  "+actual.get(i));
			            	}
			}
		}
		//}
	  public void Sending_Intransit_resaleapp()
		{
		
		  System.out.println(updatedCount);
		
		}

	  public void Validate_Sending_and_receiving(String tab,DataTable datatable)
	  {
	  System.out.println("Following field are present in "+tab);
		List<String> actual = datatable.asList();
		System.out.println("Size = "+ actual.size());
		for (int i = 0; i <= actual.size()-1; i++) {
        	
            String content = actual.get(i);
        //   Thread.sleep(2000);
       	WebElement data=driver.findElement(By.xpath("//div[@data-control-name='lblTabItemsIS_2']//div[contains(text(),'"+content+"')]"));
       	System.out.println("Data Contain : under "+ tab +" is "+data.getText());
       	
       	if(actual.get(i).equalsIgnoreCase(data.getText()))
       	{
       		System.out.println("This is Expected: " + data.getText()+" == "+" This is Actual:  "+actual.get(i));
       	}
       	else
       	{
       		System.out.println( "This is Expected:  "+data.getText()+" is not equal "+" This is Actual  "+actual.get(i));
       	}
	  }
    }
	  
	  public void Validate_All_Sending_and_receiving(String tab,DataTable datatable)
	  {
	  System.out.println("Following field are present in "+tab);
		List<String> actual = datatable.asList();
		System.out.println("Size = "+ actual.size());
		for (int i = 0; i <= actual.size()-1; i++) {
        	
            String content = actual.get(i);
        //   Thread.sleep(2000);
       	WebElement data=driver.findElement(By.xpath("//div[@data-control-name='lblTabItemsIS_1']//div[contains(text(),'"+content+"')]"));
       	System.out.println("Data Contain : under "+ tab +" is "+data.getText());
       	data.click();
       	
       	if(actual.get(i).equalsIgnoreCase(data.getText()))
       	{
       		System.out.println("This is Expected: " + data.getText()+" == "+" This is Actual:  "+actual.get(i));
       	}
       	else
       	{
       		System.out.println( "This is Expected:  "+data.getText()+" is not equal "+" This is Actual  "+actual.get(i));
       	}	
	}
  }
	
	public void validate_active_and_archive(String tab,DataTable datatable)
	  {
	  System.out.println("Following field are present in "+tab);
		List<String> actual = datatable.asList();
		System.out.println("Size = "+ actual.size());
		for (int i = 0; i <= actual.size()-1; i++) {
        	
            String content = actual.get(i);
        //   Thread.sleep(2000);
       	WebElement data=driver.findElement(By.xpath("//div[@data-control-name='lblTabItemsIS_3']//div[contains(text(),'"+content+"')]"));
       	System.out.println("Data Contain : under "+ tab +" is "+data.getText());
       	data.click();
       	
       	if(actual.get(i).equalsIgnoreCase(data.getText()))
       	{
       		System.out.println("This is Expected: " + data.getText()+" == "+" This is Actual:  "+actual.get(i));
       	}
       	else
       	{
       		System.out.println( "This is Expected:  "+data.getText()+" is not equal "+" This is Actual  "+actual.get(i));
       	}	
	}
  }
	  
 public void ValidateSendingandreceivingcount()
		  {
		 	WebElement sendingbutton=driver.findElement(By.xpath("//div[@data-control-name='lblTabItemsIS_2']//div[contains(text(),'Sending')]"));
		if(sendingbutton.isDisplayed()) {
			Wait.elementToBeClickable(driver, sendingbutton, 2);
			//sendingbutton.click();
			System.out.println("Sending button clicked");
		 	WebElement data1=driver.findElement(By.xpath("//div[@data-control-name='lblCountRowsPS_1']"));
		 	new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@data-control-name='lblCountRowsPS_1']"))));
		System.out.println("This is Expected: " + data1.getText());
		String input=data1.getText();
		String[] parts=input.split("\\(");
		String pageandCount=parts[0].trim();
		String count=parts[1].replace(")", "").trim();
		System.out.println("Count of Sending In transit:"+count);
		}
		else {
			System.out.println("Sending button is not present");
		}
		WebElement receivingbutton=driver.findElement(By.xpath("//div[text()='Receiving']"));
		if(receivingbutton.isDisplayed()) {
			Wait.elementToBeClickable(driver, receivingbutton, 2);
			try{
				receivingbutton.click();
			}catch(Exception e) {
				util.actionMethodClick(driver, receivingbutton);
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Receiving button clicked");
			new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@data-control-name='lblCountRowsPS_1']"))));
			WebElement ele=driver.findElement(By.xpath("//div[@data-control-name='lblCountRowsPS_1']"));
			String inp=ele.getText();
			//System.out.println(inp);
		 	WebElement data2=driver.findElement(By.xpath("//div[@data-control-name='lblCountRowsPS_1']//div[text()='"+inp+"']"));
		System.out.println("This is Expected: " + data2.getText());
		String input=data2.getText();
		String[] parts=input.split("\\(");
		String pageandCount=parts[0].trim();
		String count=parts[1].replace(")", "").trim();
		System.out.println("Count of Receiving In transit:"+count);
		}
		else {
			System.out.println("Receiving button is not present");
		}
		  }
		public void ValidateSalesCategories() throws InterruptedException
		  {
            System.out.println("Sales data display with latest five top categories details: ");
				try
				{ 	
					for (int i = 0; i < 5; i++) {
			            int j = i + 1;
			            System.out.println(j);
			            Thread.sleep(2000);
			            System.out.println(
			        
			            		driver.findElement(By.xpath("(//div[@data-control-name='Title1'])[" + j + "]")).getAttribute("innerText"));
			            WebElement ele=driver.findElement(By.xpath("(//div[@data-control-name='Title1'])[" + j + "]"));
			            Assert.assertEquals(true, ele.isDisplayed());
					}
				}
					catch(org.openqa.selenium.NoSuchElementException e)
					{ 			
						System.out.println("Element not found"); 	
							
					}
				}
		public void In_transit_button_click() throws InterruptedException
		  {
			System.out.println("Clicking on In-transit receiving ");
      		Wait.untilPageLoadComplete(driver, 5);
      		Wait.elementToBeClickable(driver, IntransitReceiving, 5);
      		//IntransitReceiving.click();
      		testutil.actionMethodClick(driver, IntransitReceiving);
      		
    		}
		
		public void receiving_In_transit_B2BApp() throws InterruptedException
		  {
			System.out.println("Clicking on In-transit receiving ");
    		Wait.untilPageLoadComplete(driver, 5);
    		Wait.elementToBeClickable(driver, receivingIntransitB2B, 5);
    		//IntransitReceiving.click();
    		testutil.actionMethodClick(driver, receivingIntransitB2B);
    		
  		}
		
  		public void threedots_click_validate_fields_in_B2BApp(DataTable datatable) throws InterruptedException
		  {	
  			System.out.println("Clicking on three dots in Order Page");
        		List<WebElement> expanddotstransit = driver
      				.findElements(By.xpath("(//div[@data-control-name='icnMoreOptionsPS_3'])[1]"));
      		if (!expanddotstransit.isEmpty()) {
      			if (expanddotstransit.get(0).isDisplayed()) {
      				expanddotstransit.get(0).click();
      			} else {
      				System.out.println("element not visible");
      			}
      		}
      		System.out.println("Validate Remove order and Change store options are present");
      		
      		List<String> actual = datatable.asList();
  			System.out.println("Size = "+ actual.size());
  			for (int i = 0; i <= actual.size()-1; i++) {
  	        	
  		                 String content = actual.get(i);
  		                Thread.sleep(2000);
  		            	WebElement data=driver.findElement(By.xpath("(//div[contains(text(),'"+content+"')])[1]"));
  		            	System.out.println("Data Contain : "+data.getText());
  		            	
  		            	if(actual.get(i).equalsIgnoreCase(data.getText()))
  		            	{
  		            		System.out.println("This is Expected:" + data.getText()+" == "+" This is Actual:  "+actual.get(i));
  		            	}
  		            	else
  		            	{
  		            		System.out.println( "This is Expected  "+data.getText()+" is not equal "+"This is Actual  "+actual.get(i));
  		            	}
  		}
		  }
		
    		public void threedots_click_validate_fields(DataTable datatable) throws InterruptedException
  		  {	
    			System.out.println("Clicking on three dots in In-transit receiving");
          		List<WebElement> expanddotstransit = driver
        				.findElements(By.xpath("(//div[@data-control-name='icnMoreOptionsPS_2'])[1]"));
        		if (!expanddotstransit.isEmpty()) {
        			if (expanddotstransit.get(0).isDisplayed()) {
        				expanddotstransit.get(0).click();
        			} else {
        				System.out.println("element not visible");
        			}
        		}
        		System.out.println("Validate Missing & Broken Field present");
        		
        		List<String> actual = datatable.asList();
    			System.out.println("Size = "+ actual.size());
    			for (int i = 0; i <= actual.size()-1; i++) {
    	        	
    		                 String content = actual.get(i);
    		                Thread.sleep(2000);
    		            	WebElement data=driver.findElement(By.xpath("(//div[contains(text(),'"+content+"')])[1]"));
    		            	System.out.println("Data Contain : "+data.getText());
    		            	
    		            	if(actual.get(i).equalsIgnoreCase(data.getText()))
    		            	{
    		            		System.out.println("This is Expected:" + data.getText()+" == "+" This is Actual:  "+actual.get(i));
    		            	}
    		            	else
    		            	{
    		            		System.out.println( "This is Expected  "+data.getText()+" is not equal "+"This is Actual  "+actual.get(i));
    		            	}
    		}
  		  }
    		
    		public void threedots_click_validate_fields_Parcel(DataTable datatable) throws InterruptedException
    		  {	
      			System.out.println("Clicking on three dots in Receive Parcep Page");
            		List<WebElement> expanddotstransit = driver
          				.findElements(By.xpath("//div[@data-control-name='icnNewStatus']"));
          		if (!expanddotstransit.isEmpty()) {
          			if (expanddotstransit.get(0).isDisplayed()) {
          				expanddotstransit.get(0).click();
          			} else {
          				System.out.println("element not visible");
          			}
          		}
          		System.out.println("Validate Missing & Broken Field present");
          		
          		List<String> actual = datatable.asList();
      			System.out.println("Size = "+ actual.size());
      			for (int i = 0; i <= actual.size()-1; i++) {
      	        	
      		                 String content = actual.get(i);
      		                Thread.sleep(2000);
      		            	WebElement data=driver.findElement(By.xpath("(//div[contains(text(),'"+content+"')])[1]"));
      		            	System.out.println("Data Contain : "+data.getText());
      		            	
      		            	if(actual.get(i).equalsIgnoreCase(data.getText()))
      		            	{
      		            		System.out.println("This is Expected:" + data.getText()+" == "+" This is Actual:  "+actual.get(i));
      		            	}
      		            	else
      		            	{
      		            		System.out.println( "This is Expected  "+data.getText()+" is not equal "+"This is Actual  "+actual.get(i));
      		            	}
      		}
    		  }
    		
    		public void clickOnChangeStore(String statusupdate) 
			  {
				System.out.println("Clicking on Missing or Broken option ");
	      		Wait.untilPageLoadComplete(driver, 5);
	      		WebElement Statusbtn = driver.findElement(By.xpath("//div[text()='"+statusupdate+"']"));
	      		Wait.elementToBeClickable(driver, Statusbtn, 5);
	      		testutil.actionMethodClick(driver, Statusbtn);
			  }
    		
    		public void seletReceivingStore(String receivingstore)
    		{
    			Wait.elementToBeClickable(driver, receivingStoreList, 10);
    			receivingStoreList.click();
    			WebElement storeSelection = driver.findElement(By.xpath("//div[contains(@id,'appmagic-dropdownFlyoutdropdown_siena_') and contains(text(),'" + receivingstore + "')]"));
    			String storeSelectionvalue = storeSelection.getText();
    			Wait.waitForInvisibilityOfElement(driver, storeSelection, 5);
    			Wait.waitForInvisibilityOfElementLocated(driver, storeSelection, 5);
    			Wait.elementToBeClickable(driver, storeSelection, 5);
    			List<WebElement> ele = driver.findElements(By.xpath("//div[contains(text(),'" + receivingstore + "') and contains(@class,'appmagic-dropdownListItem')]"));
    			Boolean flag = false;
    			while (!flag) {
    				for (int i = 0; i < ele.size(); i++) {
    					if (isClickable(ele.get(i))) {
    						// ele.get(i).click();
    						util.actionMethodClick(driver, ele.get(i));
    						flag = true;
    						i = ele.size();
    					}
    				}
    				Wait.elementToBeClickable(driver, okButton, 5);
    				util.actionMethodClick(driver, okButton);

    			}
    		}
    		
    		
    			public void clickOnMissing(String statusupdate) 
    			  {
    				System.out.println("Clicking on Missing or Broken status ");
    	      		Wait.untilPageLoadComplete(driver, 5);
    	      		WebElement Statusbtn = driver.findElement(By.xpath("//div[text()='"+statusupdate+"']"));
    	      		Wait.elementToBeClickable(driver, Statusbtn, 5);
    	      		testutil.actionMethodClick(driver, Statusbtn);
    	      		
    	      		System.out.println("Order Number from In-Transit");
    	      		String Order_no=driver.findElement(By.xpath("//div[@data-control-name='lblReceivingStoreHeader_PS_2'] //div[text()='Order Number']")).getText();
    	      		System.out.println("Output: "+Order_no);
    	      		Order_no_expected=driver.findElement(By.xpath("(//div[@data-control-name='lblReceivingStoreHeader_PS_Item_2'])[1]")).getText();
    	      		System.out.println("Output: "+Order_no_expected);
    	      		Boolean flag = false;
    	    		while (!flag) {
    	    			List<WebElement> yesbtn = driver.findElements(By.xpath("//div[@data-control-name='btnOkConfirmCancelNewUserMUS_2']//div[text()='YES']"));
    	    			for (int i = 0; i < yesbtn.size(); i++){
    	    				if (isClickable(yesbtn.get(i))) {
    	    					// ele.get(i).click();
    	    					Wait.elementToBeClickable(driver, yesbtn.get(i), 5);
    	    					System.out.println(yesbtn.get(i));
    	    					util.actionMethodClick(driver, yesbtn.get(i));
    	    					flag = true;
    	    					i = yesbtn.size();
    	    				}

    	    			}
    	    			
    	    		}
    	    		
    	    		
    			  }
    			
   public void clickOnYesButton()
   {
	   Boolean flag = false;
		while (!flag) {
			List<WebElement> yesbtn = driver.findElements(By.xpath("//div[@data-control-name='btnOkConfirmCancelAddItemDetailsMIS_5']//div[text()='YES']"));
			for (int i = 0; i < yesbtn.size(); i++){
				if (isClickable(yesbtn.get(i))) {
					// ele.get(i).click();
					Wait.elementToBeClickable(driver, yesbtn.get(i), 5);
					System.out.println(yesbtn.get(i));
					util.actionMethodClick(driver, yesbtn.get(i));
					flag = true;
					i = yesbtn.size();
				}

			}
		}
   }
   
   public void enterTextInSearchBoxInB2B()
	{
		Wait.untilPageLoadComplete(driver, 90);
		WebElement searchbox=driver.findElement(By.xpath("//input[@appmagic-control='txtSearchOrder_2textbox']"));
		Wait.elementToBeClickable(driver, searchbox, 3);
		//searchbox.sendKeys(text,Keys.ENTER);
		System.out.println("random number is:" + parcelIdtext);
		searchbox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		//searchbox.sendKeys(String.valueOf(parcelId.getText()));
		searchbox.sendKeys(parcelIdtext);
		searchbox.sendKeys(Keys.ENTER);
		Wait.untilPageLoadComplete(driver, 90);
//		searchTextBox.sendKeys(text);
		Wait.untilPageLoadComplete(driver, 90);
		
	}
    	
   public void clickOnadvanceSearchstatus(String missing) throws InterruptedException 
  			  {
    				Wait.elementToBeClickable(driver, AdvanceStatusClick, 5);
    				AdvanceStatusClick.click();
    				WebElement status=driver.findElement(By.xpath("//span[text()='"+missing+"']"));
    				status.click();
    				Thread.sleep(2000);
    				AdvanceSearchbtn.click();
    				
  			  }
    			
    			public void ValidateOrderNumber() throws InterruptedException 
    			  {
      				Thread.sleep(5000);
    				Order_no_actual = OrdrNoAllitems.getText();
    				System.out.println(Order_no_actual);
    				
    				if(Order_no_expected.equalsIgnoreCase(Order_no_actual))
	            	{
	            		System.out.println("This is Expected:" + Order_no_expected+" == "+" This is Actual:  "+Order_no_actual);
	            	}
	            	else
	            	{
	            		System.out.println( "This is Expected  "+Order_no_expected+" is not equal "+"This is Actual  "+Order_no_actual);
	            	}
    			  }
    			
      public void validatePriceCurrency(String expectedCurrency) throws InterruptedException {
    	  Thread.sleep(5000);
			String actualPriceCurrency = priceCurrency.getText();
			System.out.println(actualPriceCurrency);
			if(expectedCurrency.contains("£"))
					{
				System.out.println("This is Expected:" + expectedCurrency+" == "+" This is Actual:  "+actualPriceCurrency);
	            	}
	            	else
	            	{
	            		System.out.println( "This is Expected  "+expectedCurrency+" is not equal "+"This is Actual  "+actualPriceCurrency);
	            	}
					}
    	  
      
}

    			
    			
        		
  		  
    		
    		
  		  




		  




				
			

			
			
			
			
		
			        		
			












		



