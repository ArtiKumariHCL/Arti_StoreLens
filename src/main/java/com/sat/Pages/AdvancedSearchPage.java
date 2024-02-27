package com.sat.Pages;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

//import com.sat.testUtil.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;
import com.sat.testUtil.Testutil;
import com.sat.testUtil.Wait;
import com.sat.testbase.TestBase;
import io.cucumber.datatable.DataTable;


public class AdvancedSearchPage {
	private WebDriver driver;
	Testutil testutil = new Testutil();
	@FindBy(xpath = "//div[@data-control-name='icnAdvanceSearch']")
	private WebElement AdvancedSearchIcon;
	
	@FindBy(xpath = "//div[@data-control-name='icnAdvanceSearch_IST']")  
	private WebElement AdvancedSearch;
	
	@FindBy(xpath = "//div[@data-control-name='lblAdvSrch']")
	private WebElement AdvancedSearchPageTitle;
	
	@FindBy(xpath = "//div[@data-control-name='lblAdvSrchHeader']")
	private WebElement AdvancedSearchPageText;
	
	@FindBy(xpath = "//input[@appmagic-control='TxtKeywordAdvtextbox']")
	private WebElement keyWordFieldText;
	
	@FindBy(xpath = "//div[@data-control-name='lblAdvSrch_IST']")
	private WebElement AdvancedSearchInStorePageTitle;
	
	@FindBy(xpath = "//div[@data-control-name='lblAdvSrchHeader_IST']")
	private WebElement AdvancedSearchInStorePageText;
	
	@FindBy(xpath = "//input[@appmagic-control='TxtKeywordAdv_ISTtextbox']")
	private WebElement keyWordFieldInStoreText;
	
	@FindBy(xpath = "//input[@appmagic-control='TxtBrandAdvtextbox']")
	private WebElement BrandEntryBox;
	
	@FindBy(xpath = "//input[@appmagic-control='TxtKeywordAdvtextbox']")
	private WebElement itemEntryBox;
	
	@FindBy(xpath = "//input[@appmagic-control='txtPurchasePrice_1textbox']")
	private WebElement PurchaseEntryBox;
	 
	@FindBy(xpath = "//input[@appmagic-control='TxtBrandAdv_ISTtextbox']")
	private WebElement inStoreBrandEntryBox;
	
	@FindBy(xpath = "//div[@data-control-name='cbCategoryAdv']") 
	private WebElement catogeryComboBox;
	
	@FindBy(xpath = "//div[@data-control-name='cbCategoryAdv_IST']") 
	private WebElement inStoreCatogeryComboBox;
	
	@FindBy(xpath = "//div[@data-container-name='contAdvSize-container']") //div[@data-control-name='cbAdvItemSize']
	private WebElement sizeComboBox;
	
	@FindBy(xpath = "//div[@data-container-name='contAdvSizeInstore-container']") 
	private WebElement inStoresizeComboBox;
	
	@FindBy(xpath = "//div[@data-control-name='cbColorAdv']") 
	private WebElement colorComboBox;
	
	@FindBy(xpath = "//div[@data-control-name='cbPatternAdv']") 
	private WebElement patternComboBox;
	
	@FindBy(xpath = "//div[@data-control-name='cbAdvStatus_2']") 
	private WebElement inTrendComboBox;
	
	@FindBy(xpath = "//div[@data-control-name='cbColorAdvInstore']") 
	private WebElement inStorecolorComboBox;
	
	@FindBy(xpath = "//div[@data-control-name='cbAdvStatus_4']") 
	private WebElement inStoretrendComboBox;
	
	@FindBy(xpath = "//div[@data-control-name='cbPatternAdvInstore']") 
	private WebElement inStorepatternComboBox;
	
	@FindBy(xpath = "//div[@data-control-name='cbAdvStatus']")  
	private WebElement statusComboBox;
	
	@FindBy(xpath = "//ul[@role='listbox']")
	private WebElement Categorylists;
	
	@FindBy(xpath ="//div[text()='SEARCH']")
	private WebElement search;
	
	@FindBy(xpath = "//div[text()='CANCEL']")
	private WebElement cancel;
	
	@FindBy(xpath = "//div[@id='react-combobox-view-1']")
    private WebElement statusDropDown;
	
	@FindBy(xpath = "//input[@appmagic-control='TxtMinPriceAdvtextbox']")
    private WebElement minPrice;

    @FindBy(xpath = "//input[@appmagic-control='TxtMaxPriceAdvtextbox']")
    private WebElement maxPrice;
    
    @FindBy(xpath = "//input[@appmagic-control='TxtMinPriceAdv_ISTtextbox']")
    private WebElement inStorminPrice;

    @FindBy(xpath = "//input[@appmagic-control='TxtMaxPriceAdv_ISTtextbox']")
    private WebElement inStoremaxPrice;
    
    @FindBy(xpath = "//div[@data-control-name='btnAdvCount']")
	private WebElement fieldCount;

    @FindBy(xpath = "//input[@appmagic-control='txtSearchAIStextbox']")
	private WebElement searchTextBox;
    
    @FindBy(xpath = "(//div[@data-control-name='icnSellerDetailsMSS_1'])[1]") //(//div[@data-control-name='lblGallerySellerNameMSS_1'])[1]
	private WebElement sellerNameInResultGrid;
    
    @FindBy(xpath = "//*[@data-control-name='btnSaveExistingItemDetailsMIS_1']")
	private WebElement saveItem;
    
    @FindBy(xpath = "(//input[@appmagic-control='cbSelectItemMIS_4'])[1]") //cbSelectItemMSS
	private WebElement checkBox;
    
    @FindBy(xpath = "//div[@data-control-name='icnSelectAllOptionsSS_4']") //icnSelectAllOptionsMSS
	private WebElement click3Dot;
    
    @FindBy(xpath = "//*[text()='Change Store']")
	private WebElement changeStore;
    
    @FindBy(xpath = "//*[text()='Edit Country']")
	private WebElement editCountry;
    
    @FindBy(xpath = "//*[@data-control-name='btnSaveChangeStoreMIS_13']")
	private WebElement saveChageStore;
    
    @FindBy(xpath = "//div[@data-control-name='ddCountry_4']")
	private WebElement clickCountry;
    
    @FindBy(xpath = "//div[@data-control-name='ddCountry_4']")
	private WebElement ChangeCountry;
    
    @FindBy(xpath = "//div[@data-control-name='ddStore_5']")
	private WebElement ChangeStore;
    
    @FindBy(xpath = "(//div[@data-control-name='icnSelectExistingItemMIS_2'])[1]")
	private WebElement expiredItem;
    
    @FindBy(xpath = "//div[@data-control-name='Container7_2']") // icnSellerExistingItemMIS_2 //Container7_2
	private WebElement sellername;
    
    @FindBy(xpath = "//div[text()='Items']/parent::div")  //div[@data-control-name='icnTabSellerItemsPreRegisteredMIS_5']
	private WebElement item;
    
    @FindBy(xpath = "//div[@data-control-name='icnSortTrendHeader']")
	private WebElement sortTrend;
    
    @FindBy(xpath = "//div[@data-control-name='icnSortOrderNumber']")
	private WebElement sortOrderNumber;
    
    @FindBy(xpath = "//div[@data-control-name='icnSortBrandHeaderMIS']")
	private WebElement sortBrand;
    
    @FindBy(xpath = "//div[@data-control-name='icnSortCategoryHeaderMIS']")
	private WebElement sortCategory;
    
    @FindBy(xpath = "//div[@data-control-name='icnSortSizeHeaderMIS']")
	private WebElement sortSize;
    
    @FindBy(xpath = "//div[@data-control-name='icnSortItemsIdHeaderMIS']")
	private WebElement sortItemId;
    
    @FindBy(xpath = "//div[@data-control-name='icnSortDateSubmittedHeaderMIS']")
   	private WebElement sortDate;
    
    @FindBy(xpath = "//div[@data-control-name='lblb2bheader']")
   	private WebElement sortB2B;
    
    @FindBy(xpath = "//div[@data-control-name='icnSortStatusHeaderMIS']")
   	private WebElement sortStatus;
    
    @FindBy(xpath = "//div[@data-control-name='icnSortPriceHeaderMIS']")
   	private WebElement sortPrice;
    
    @FindBy(xpath = "//div[@data-control-name='icnSortTrendHeader_1']")
   	private WebElement sortInstoreTrend;
    
    @FindBy(xpath = "//div[@data-control-name='icnSortOrderNumber_1']")
   	private WebElement sortInstoreOrderNumber;
    
    @FindBy(xpath = "//div[@data-control-name='icnSortStatusHeaderMIS_2']")
   	private WebElement sortInstoreStatus;
    
    @FindBy(xpath = "//div[@data-control-name='icnSortPriceHeaderMIS_2']")
   	private WebElement sortInstorePrice;
    
    @FindBy(xpath = "//div[@data-control-name='icnSortSizeHeaderEXP_1']")
   	private WebElement sortInstoreSize;
    
    @FindBy(xpath = "//div[@data-control-name='icnSortBrandHeaderMIS_2']")
   	private WebElement sortInstoreBrand;
    
    @FindBy(xpath = "//div[@data-control-name='icnSortCategoryHeaderMIS_2']")
   	private WebElement sortInstoreCategory;
    
    @FindBy(xpath = "//div[@data-control-name='icnSortItemsIdHeaderMIS_2']")
   	private WebElement sortInstoreItemId;
    
    @FindBy(xpath = "//div[@data-control-name='icnSortDateSubmittedHeaderMIS_2']")
   	private WebElement sortInstoreDate;
    
    @FindBy(xpath = "(//input[@appmagic-control='cbSelectItemMIS'])[1]") //cbSelectItemMSS
	private WebElement checkBoxAllItemPage;
    
    @FindBy(xpath = "//div[@data-control-name='btnReturnAllItems']")
   	private WebElement returnToSeller;
    
    @FindBy(xpath = "//div[@data-control-name='btn_Next_Pending_Item_PS_3']//div[contains(text(),'NEXT')] ")
   	private WebElement nextButtonReturnToSeller;
    
    @FindBy(xpath = "//div[@data-control-name='btn_ScanParcel_PS_1']//div[text()='SCAN PARCEL']")
   	private WebElement scan_button_ReturnToSeller;
    
    @FindBy(xpath ="//div[text()='Add parcel ID manually']")
	private WebElement addparcelIdManually_RS;
    
    @FindBy(xpath ="//input[@appmagic-control='txt_ParcelID_PS_automanual_1textbox']")
	private WebElement parcelNumber_RS;
    
    @FindBy(xpath = "//div[text()='DONE']/ancestor::div[@data-control-name='btn_Next_Pending_Item_PS_4'] ")
   	private WebElement parcelIDDone_ReturnToSeller;
    
  @FindBy(xpath = "//div[text()='DONE']/ancestor::div[@data-control-name='btn_Next_Pending_Item_PS_3']")
 	private WebElement done_ReturnToSeller;
  
  @FindBy(xpath = "//div[@data-control-name='btnOKStatusChangeMIS_15']//div[text()='OK']")
 	private WebElement okButton_ReturnToSeller;
  
  @FindBy(xpath = "//div[@data-control-name='Header_17']")
 	private WebElement orderId;
  
  @FindBy(xpath = "(//div[@data-control-name='lblOrderStatusMIS'])[1]")
	private WebElement returnOrderId;
  
  @FindBy(xpath = "//div[@data-control-name='lblb2bheader']")
	private WebElement b2BSellerColAllItem;
    
  @FindBy(xpath = "//div[@data-control-name='lblSellerTypeHeaderMIS_3']")
	private WebElement b2BSellerColInstore;
  
  @FindBy(xpath = "//div[@data-focuszone-id='FocusZone1']")
	private WebElement b2BSellerFieldAllItem;
  
  @FindBy(xpath = "//div[@data-focuszone-id='FocusZone2']")
	private WebElement b2BSellerFieldInStore;
  
//    @FindBy(xpath = "")
//   	private WebElement ;
    
	@FindBy(xpath = "//div[text()='Environment']")
	private WebElement clickOnEnvironment;
	@FindBy(xpath = "(//div[text()='PP Dev v2'])[2]")
	private WebElement selectOnEnvironment;
	@FindBy(xpath = "(//span[text()='Apps'])[1]")
	private WebElement clickOnApps;
	@FindBy(xpath = "//a[text()='Resale Dev v13_Automation_Sprint26']")
	private WebElement selectOnApps;
	
	
	public int randomNumber;
	public AdvancedSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 public void ClickOnCheckboxOnAllItemPage() throws InterruptedException
	 {
		 Thread.sleep(5000);
		 Wait.untilPageLoadComplete(driver, 80);
		 Wait.elementToBeClickable(driver, checkBoxAllItemPage, 3);
		 testutil.actionMethodClick(driver, checkBoxAllItemPage);
		// checkBoxAllItemPage.click();
		 Wait.waitForInvisibilityOfElement(driver, checkBoxAllItemPage, 200);
		  Wait.untilPageLoadComplete(driver, 80); 
	 }

	 public void ClickOnReturnToSeller() throws InterruptedException
	 {
		 Thread.sleep(5000);
		 Wait.untilPageLoadComplete(driver, 80);
		 Wait.elementToBeClickable(driver, returnToSeller, 3);
		 testutil.actionMethodClick(driver, returnToSeller);
		// returnToSeller.click();
		 Wait.waitForInvisibilityOfElement(driver, returnToSeller, 200);
		  Wait.untilPageLoadComplete(driver, 80); 
	 }
	 
	 public void next_button_ReturnToSeller() throws InterruptedException  {
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
			Thread.sleep(3000);
			Wait.elementToBeClickable(driver, nextButtonReturnToSeller, 3);
			testutil.actionMethodClick(driver, nextButtonReturnToSeller);
			Thread.sleep(3000);
		}
	 public void scan_parcel_Return_To_Seller() throws InterruptedException  {

			boolean isButtonDisplayed=scan_button_ReturnToSeller.isDisplayed();
			if(isButtonDisplayed) {
				System.out.println("Button is displayed on the web page");
			}
				else {
					System.out.println("Button is not displayed on the web page");
				}
			Thread.sleep(3000);
			Wait.elementToBeClickable(driver, scan_button_ReturnToSeller, 3);
			scan_button_ReturnToSeller.click();
			Thread.sleep(3000);
			}	

	 public void generate_parcelId_Return_To_Seller() throws AWTException, InterruptedException
		{
//			Robot robot = new Robot();
//	        System.out.println("About to zoom in");
//				for (int i = 0; i < 4; i++) {
//		            robot.keyPress(KeyEvent.VK_CONTROL);
//		            robot.keyPress(KeyEvent.VK_ADD);
//		            robot.keyRelease(KeyEvent.VK_ADD);
//		            robot.keyRelease(KeyEvent.VK_CONTROL);
//				}
				Thread.sleep(3000);
				System.out.println("Trying to create unique id manually");
				testutil.actionMethodClick(driver, addparcelIdManually_RS);
			 	int number = ThreadLocalRandom.current().nextInt();
				System.out.println("random  number before absolute:" + number);
				 randomNumber = Math.abs(number);
				System.out.println("random number is:" + randomNumber);
				Wait.waitUntilElementVisible(driver, parcelNumber_RS);
				parcelNumber_RS.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				parcelNumber_RS.sendKeys(String.valueOf(randomNumber));
				//parcelNumber_RS.sendKeys(Keys.ENTER);
				parcelIDDone_ReturnToSeller.click();
				Thread.sleep(3000);
				Wait.waitForInvisibilityOfElement(driver, parcelIDDone_ReturnToSeller, 5);
				done_ReturnToSeller.click();
				Thread.sleep(3000);
				Wait.waitForInvisibilityOfElement(driver, done_ReturnToSeller, 5);
		}
	 public void validateOrderId()
	 {
		 okButton_ReturnToSeller.click();
			Wait.waitForInvisibilityOfElement(driver, okButton_ReturnToSeller, 5);
			String actual_orderid= orderId.getText();
			String return_orderid= returnOrderId.getText();
			assertTrue(actual_orderid.equalsIgnoreCase(return_orderid));
			Wait.untilPageLoadComplete(driver, 30);
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

	
	public void clickOnAdvancedSearchIcon() {
		Wait.elementToBeClickable(driver, AdvancedSearchIcon, 80);
		testutil.actionMethodClick(driver, AdvancedSearchIcon);
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Wait.untilPageLoadComplete(driver,80);
		AdvancedSearchIcon.click();
		Wait.untilPageLoadComplete(driver, 80);
	}
	
	public void clickOnAdvanceSearch() throws InterruptedException
	{
		Thread.sleep(3000);
		Wait.elementToBeClickable(driver, AdvancedSearch, 80);
		testutil.actionMethodClick(driver, AdvancedSearch);
		
		Wait.untilPageLoadComplete(driver, 500);
		Thread.sleep(3000);
		AdvancedSearch.click();
		Wait.untilPageLoadComplete(driver, 500);
	}
	
	public void sortingOfTrendAndOrderNumber()
	{
		b2BSellerColAllItem.click();
		sortTrend.click();
		sortTrend.click();
		sortOrderNumber.click();
		sortOrderNumber.click();
	}
	
	public void sortingOfAllColumn()
	{
		sortDate.click();
		sortDate.click();
		sortItemId.click();
		sortItemId.click();
		sortCategory.click();
		sortCategory.click();
		sortBrand.click();
		sortBrand.click();
		sortSize.click();
		sortSize.click();
		sortPrice.click();
		sortPrice.click();
		sortB2B.click();
		sortB2B.click();
		sortStatus.click();
		sortStatus.click();
		
	}
	
	public void sortingOfInStoreTrendAndOrderNumber()
	{
		b2BSellerColInstore.click();
		sortInstoreTrend.click();
		sortInstoreTrend.click();
		sortInstoreOrderNumber.click();
		sortInstoreOrderNumber.click();
	}
	
	public void sortingOfInStoreAllColumn()
	{
		sortInstoreDate.click();
		sortInstoreDate.click();
		sortInstoreItemId.click();
		sortInstoreItemId.click();
		sortInstoreCategory.click();
		sortInstoreCategory.click();
		sortInstoreBrand.click();
		sortInstoreBrand.click();
		sortInstoreSize.click();
		sortInstoreSize.click();
		sortInstorePrice.click();
		sortInstorePrice.click();
		sortInstoreStatus.click();
		sortInstoreStatus.click();
	}
	
	public void validateAdvSrchPageTitle(String AdvSrch, String advsrchtxt) {
		String advcsrchtitle = AdvancedSearchPageTitle.getText();
		Wait.untilPageLoadComplete(driver, 30);
		assertTrue(AdvSrch.equalsIgnoreCase(advcsrchtitle));
		Wait.untilPageLoadComplete(driver, 30);
		String advcsrchtext = AdvancedSearchPageText.getText();
		assertTrue(advsrchtxt.equalsIgnoreCase(advcsrchtext));
		Wait.untilPageLoadComplete(driver, 30);
	}
	public void validateKeyWordField(String keywrdtext) {
		String keyWordText = keyWordFieldText.getAttribute("placeholder");
		Wait.untilPageLoadComplete(driver, 30);
		assertTrue(keywrdtext.equalsIgnoreCase(keyWordText));
		Wait.untilPageLoadComplete(driver, 30);
	}
	
	public void validateB2bColAllItem(String actualColName) {
		String exceptedColName = b2BSellerColAllItem.getAttribute("InnerText");
		Wait.untilPageLoadComplete(driver, 30);
		assertTrue(exceptedColName.equalsIgnoreCase(actualColName));
		Wait.untilPageLoadComplete(driver, 30);
	}
	
	public void validateB2bColInstore(String actualColName) {
		String exceptedColName = b2BSellerColInstore.getAttribute("InnerText");
		Wait.untilPageLoadComplete(driver, 30);
		assertTrue(exceptedColName.equalsIgnoreCase(actualColName));
		Wait.untilPageLoadComplete(driver, 30);
	}
	
	public void validateInStoreAdvSrchPageTitle(String AdvSrch, String advsrchtxt) {
		String advcsrchtitle = AdvancedSearchInStorePageTitle.getText();
		Wait.untilPageLoadComplete(driver, 30);
		assertTrue(AdvSrch.equalsIgnoreCase(advcsrchtitle));
		Wait.untilPageLoadComplete(driver, 30);
		String advcsrchtext = AdvancedSearchInStorePageText.getText();
		assertTrue(advsrchtxt.equalsIgnoreCase(advcsrchtext));
		Wait.untilPageLoadComplete(driver, 30);
	}
	public void validateInStoreKeyWordField(String keywrdtext) {
		String keyWordText = keyWordFieldInStoreText.getAttribute("placeholder");
		Wait.untilPageLoadComplete(driver, 30);
		assertTrue(keywrdtext.equalsIgnoreCase(keyWordText));
		Wait.untilPageLoadComplete(driver, 30);
	}
	
	public void validateBrandEntryBox() {
		Wait.untilPageLoadComplete(driver, 30);
		BrandEntryBox.click();
		String fieldType = BrandEntryBox.getAttribute("type");
		Wait.untilPageLoadComplete(driver, 30);
		assertTrue(fieldType.equalsIgnoreCase("text"));
		Wait.untilPageLoadComplete(driver, 30);
	}
	
	public void validatePurchasePriceEntryBox()
	{
		Wait.untilPageLoadComplete(driver, 30);
		PurchaseEntryBox.click();
		String fieldType = PurchaseEntryBox.getAttribute("type");
		Wait.untilPageLoadComplete(driver, 30);
		assertTrue(fieldType.equalsIgnoreCase("text"));
		Wait.untilPageLoadComplete(driver, 30);
	}
	
	public void validatePurchasePriceField()
	{
		if(PurchaseEntryBox.isDisplayed())
			System.out.println("Purchases proce text box is displayed");
		else
			System.out.println("Purchases proce text box is not displayed");
			
	}
		
	public void enterBrand(String brand)
	{
		Wait.untilPageLoadComplete(driver, 30);
		BrandEntryBox.sendKeys(brand);
		Wait.untilPageLoadComplete(driver, 30);
	}
	
	public void enterB2bSeller(String b2BSeller)
	{
		Wait.untilPageLoadComplete(driver, 30);
		b2BSellerFieldAllItem.sendKeys(b2BSeller);
		Wait.untilPageLoadComplete(driver, 30);
	}
	
	public void enterB2bSellerInstore(String b2BSeller)
	{
		Wait.untilPageLoadComplete(driver, 30);
		b2BSellerFieldInStore.sendKeys(b2BSeller);
		Wait.untilPageLoadComplete(driver, 30);
	}
	
	public void enterItemId(String itemid)
	{
		Wait.untilPageLoadComplete(driver, 30);
		itemEntryBox.sendKeys(itemid);
		Wait.untilPageLoadComplete(driver, 30);
	}
	
	public void validateInStoreBrandEntryBox() {
		Wait.untilPageLoadComplete(driver, 30);
		inStoreBrandEntryBox.click();
		String fieldType = BrandEntryBox.getAttribute("type");
		Wait.untilPageLoadComplete(driver, 30);
		assertTrue(fieldType.equalsIgnoreCase("text"));
		Wait.untilPageLoadComplete(driver, 30);
	}
		
	public void enterInStoreBrand(String brand)
	{
		Wait.untilPageLoadComplete(driver, 30);
		inStoreBrandEntryBox.sendKeys(brand);
		Wait.untilPageLoadComplete(driver, 30);
	}
	
	public void enterTextInSearchBox(String text)
	{
		Wait.untilPageLoadComplete(driver, 90);
		WebElement searchbox=driver.findElement(By.xpath("//input[@appmagic-control='txtSearchMSS_1textbox']"));
		Wait.elementToBeClickable(driver, searchbox, 3);
		searchbox.sendKeys(text,Keys.ENTER);
		Wait.untilPageLoadComplete(driver, 90);
//		searchTextBox.sendKeys(text);
		Wait.untilPageLoadComplete(driver, 90);
		//searchTextBox.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//div[@appmagic-control='txtSearchMSS_1']")).sendKeys(Keys.ENTER);
		Wait.untilPageLoadComplete(driver, 90);
		
	}
	
	public void validateCategoryDropDown() {
		catogeryComboBox.click();
		String CategoryBox = Categorylists.getAttribute("role");
		assertTrue(CategoryBox.equalsIgnoreCase("listbox"));
	}
	
	 public void selectCategory(String category)
	    {
	    	Wait.untilPageLoadComplete(driver, 30);
	    	catogeryComboBox.click();
	    	Wait.untilPageLoadComplete(driver, 30);
	    	driver.findElement(By.xpath("//span[text()='"+category+"']")).click();
	    	Wait.untilPageLoadComplete(driver, 30);
	    }
	 
	 public void validateInstoreCategoryDropDown() {
		 inStoreCatogeryComboBox.click();
			String CategoryBox = Categorylists.getAttribute("role");
			assertTrue(CategoryBox.equalsIgnoreCase("listbox"));
		}
		
		 public void selectInstoryCategory(String category)
		    {
		    	Wait.untilPageLoadComplete(driver, 30);
		    	inStoreCatogeryComboBox.click();
		    	Wait.untilPageLoadComplete(driver, 30);
		    	driver.findElement(By.xpath("//span[text()='"+category+"']")).click();
		    	Wait.untilPageLoadComplete(driver, 30);
		    }
	 
	 public void validateSizeDropDown() {
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		 Wait.untilPageLoadComplete(driver, 80);
			sizeComboBox.click();
			String CategoryBox = Categorylists.getAttribute("role");
			assertTrue(CategoryBox.equalsIgnoreCase("listbox"));
			
		}
	 
	public void selectSize(String size)
	{
    	Wait.untilPageLoadComplete(driver, 80);
    	driver.findElement(By.xpath("//span[text()='"+size+"']")).click();
    	Wait.untilPageLoadComplete(driver, 80);
	}
	
	public void validateInStoreSizeDropDown() {
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		 Wait.untilPageLoadComplete(driver, 80);
		 inStoresizeComboBox.click();
			String CategoryBox = Categorylists.getAttribute("role");
			assertTrue(CategoryBox.equalsIgnoreCase("listbox"));
			
		}
	 
	public void validateColorDropDown() {
		Wait.untilPageLoadComplete(driver,200);
		colorComboBox.click();
		Wait.untilPageLoadComplete(driver,200);
		String CategoryBox = Categorylists.getAttribute("role");
		assertTrue(CategoryBox.equalsIgnoreCase("listbox"));
	}
	
	public void validateInStoreColorDropDown() {
		Wait.untilPageLoadComplete(driver,200);
		inStorecolorComboBox.click();
		Wait.untilPageLoadComplete(driver,200);
		String CategoryBox = Categorylists.getAttribute("role");
		assertTrue(CategoryBox.equalsIgnoreCase("listbox"));
	}
	
	public void validateInStoreTrendDropDown() {
		Wait.untilPageLoadComplete(driver,200);
		inStoretrendComboBox.click();
		Wait.untilPageLoadComplete(driver,200);
		String CategoryBox = Categorylists.getAttribute("role");
		assertTrue(CategoryBox.equalsIgnoreCase("listbox"));
	}
	
	public void validateTrendDropDown() {
		Wait.untilPageLoadComplete(driver,200);
		inTrendComboBox.click();
		Wait.untilPageLoadComplete(driver,200);
		String CategoryBox = Categorylists.getAttribute("role");
		assertTrue(CategoryBox.equalsIgnoreCase("listbox"));
	}
	
	public void selectDropDownValue(String color)
	{
    	Wait.untilPageLoadComplete(driver, 30);
    	driver.findElement(By.xpath("//span[text()='"+color+"']")).click();
    	Wait.untilPageLoadComplete(driver, 30);
	}
	
	public void selectColor(String color)
	{
//		Wait.untilPageLoadComplete(driver, 30);
//		colorComboBox.click();
    	Wait.untilPageLoadComplete(driver, 30);
    	driver.findElement(By.xpath("//span[text()='"+color+"']")).click();
    	Wait.untilPageLoadComplete(driver, 30);
	}
	
	
	public void validatePatternDropDown() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Wait.untilPageLoadComplete(driver, 80);
		patternComboBox.click();
		String CategoryBox = Categorylists.getAttribute("role");
		assertTrue(CategoryBox.equalsIgnoreCase("listbox"));
	}
	
	public void validateInStorePatternDropDown() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Wait.untilPageLoadComplete(driver, 80);
		inStorepatternComboBox.click();
		String CategoryBox = Categorylists.getAttribute("role");
		assertTrue(CategoryBox.equalsIgnoreCase("listbox"));
	}
	
	public void selectPattern(String pattern)
	{
//		Wait.untilPageLoadComplete(driver, 80);
//		patternComboBox.click();
    	Wait.untilPageLoadComplete(driver, 80);
    	driver.findElement(By.xpath("//span[text()='"+pattern+"']")).click();
    	Wait.untilPageLoadComplete(driver, 80);
	}
   
    public void validateStatusDropDown()
    {
    	Wait.untilPageLoadComplete(driver, 70);
    	statusComboBox.click();
		String CategoryBox = Categorylists.getAttribute("role");
		assertTrue(CategoryBox.equalsIgnoreCase("listbox"));
    }
    public void selectStatus(String status)
    {
    	Wait.untilPageLoadComplete(driver, 70);
    	statusComboBox.click();
    	Wait.untilPageLoadComplete(driver, 70);
    	driver.findElement(By.xpath("//span[text()='"+status+"']")).click();
    	Wait.untilPageLoadComplete(driver, 30);
    }
    public void selectPriceRange() throws InterruptedException
    {
    	Wait.untilPageLoadComplete(driver, 30);
    	WebElement Slider= driver.findElement(By.xpath("//*[@id='slider_siena_38117b5637789092']/div[4]"));
    			Thread.sleep(5000);
    			Actions action=new Actions(driver);
    			action.dragAndDropBy(Slider,80,0);
    			Thread.sleep(3000);
    	
    }
    
    public void enterPriceRange(String minprc,String maxprc)
    {
        minPrice.clear();
        minPrice.sendKeys(minprc);
        maxPrice.clear();
        maxPrice.sendKeys(maxprc);
    }
    
    public void enterInStorePriceRange(String minprc,String maxprc)
    {
    	inStorminPrice.clear();
    	inStorminPrice.sendKeys(minprc);
        inStoremaxPrice.clear();
        inStoremaxPrice.sendKeys(maxprc);
    }
    
    public void validateAndClickSearchButton()
    {
    	String searchText=search.getText();
    	Wait.untilPageLoadComplete(driver, 30);
    	assertTrue(searchText.equalsIgnoreCase("search"));
    	Wait.untilPageLoadComplete(driver, 80);
    	search.click();
    	Wait.untilPageLoadComplete(driver, 80);
    }
    
    public void clickOnSellerName()
    {
    	Wait.untilPageLoadComplete(driver, 100);
    	Wait.elementToBeClickable(driver, sellerNameInResultGrid, 3);
    	sellerNameInResultGrid.click();
    	//driver.findElement(By.xpath("(//div[@data-control-name='lblGallerySellerNameMSS_1'])[1]")).click();
    	Wait.waitForInvisibilityOfElement(driver, sellerNameInResultGrid, 200);
    	Wait.untilPageLoadComplete(driver, 80);
    }
    
    
    public void validateFieldCount()
    {
     List<WebElement> total=driver.findElements(By.xpath("//div[@class='appmagic-button middle left disabled']"));
    int fieldSize=total.size();
    int hidefield=fieldSize-2;
    	String count=fieldCount.getAttribute("innerText");
    	System.out.println("Number of Field count in search box is "+fieldSize);
    	System.out.println("Hide Field count in search box is "+hidefield);
    	Wait.untilPageLoadComplete(driver, 30);
    	assertTrue(count.equalsIgnoreCase(count));
    	Wait.untilPageLoadComplete(driver, 80);
    }
    public void validateAndClickCancelButton()
    {
    	String cancelText=cancel.getText();
    	Wait.untilPageLoadComplete(driver, 30);
    	assertTrue(cancelText.equalsIgnoreCase("CANCEL"));
    	Wait.untilPageLoadComplete(driver, 90);
    	cancel.click();
    	Wait.untilPageLoadComplete(driver, 90);
    }
    public void clickPages(String pagename) throws InterruptedException
    {
    	Wait.elementToBeClickable(driver, driver.findElement(By.xpath("(//div[text()='"+pagename+"'])[1]")), 80);
		testutil.actionMethodClick(driver, driver.findElement(By.xpath("(//div[text()='"+pagename+"'])[1]")));
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("(//div[text()='"+pagename+"'])[1]")).click();
    	Wait.untilPageLoadComplete(driver, 80);
    }
    
   public void validateLifeOfItem(String brand)
   {
	   LocalDate today=LocalDate.now();
	   System.out.println("Today's Date := "+today);
	   switch(brand) {
	   case "COS":
		   //Add 10 Week to current date
		   LocalDate lifeOfItem1=today.plus(10,ChronoUnit.WEEKS);
		   System.out.println("Life of Item is := "+lifeOfItem1);
		   String actualCos=driver.findElement(By.xpath("//*[text()='Default is set to 10 weeks']")).getAttribute("innerText");
		   Wait.untilPageLoadComplete(driver, 30);
	 	   assertTrue(actualCos.equalsIgnoreCase("Default is set to 10 weeks"));
	 	   Wait.untilPageLoadComplete(driver, 80);
		   break;
	   case "WEEKDAY": 
		 //Add 5 Week to current date
		   LocalDate lifeOfItem2=today.plus(5,ChronoUnit.WEEKS);
		   System.out.println("Life of Item is := "+lifeOfItem2);
		   String actualWeekday=driver.findElement(By.xpath("//*[text()='Default is set to 5 weeks']")).getAttribute("innerText");
		   Wait.untilPageLoadComplete(driver, 30);
	 	   assertTrue(actualWeekday.equalsIgnoreCase("Default is set to 5 weeks"));
	 	   Wait.untilPageLoadComplete(driver, 80);
		   break;
		   default :
			   System.out.println("Brand Not Found");
	   } 
	   }
	   
	   public void validateStatus(String status)
	   {
	     String actualStatus=driver.findElement(By.xpath("//div[text()='In Store']")).getAttribute("innerText");
	     System.out.println("Actual Status is"+actualStatus);
	     System.out.println("Expected Status is"+status);
 	     Wait.untilPageLoadComplete(driver, 30);
 	     assertTrue(actualStatus.equalsIgnoreCase(status));
 	     Wait.untilPageLoadComplete(driver, 80);
	   }
	   
	   public void validatePickUpDateBlank()
	   {
		   String actualValue=driver.findElement(By.xpath("//input[@aria-label='PickupDate']")).getAttribute("innerText");
		     System.out.println("Actual Status is"+actualValue);
		     if(actualValue.equals(" ")){
		            System.out.println("Final Pick Up Date is Blank");
		        }

		        else{
		        	System.out.println("Final Pick Up Date is Not Blank");
		        	System.out.println("Actual Status is"+actualValue);
		        	}
	   }
	  public void clickOnSave()
	  {
		  Wait.untilPageLoadComplete(driver, 80);
		  saveItem.click();
		  Wait.untilPageLoadComplete(driver, 80);
	  }
	 
	 public void selectChangeStore()
	 {
		 Wait.untilPageLoadComplete(driver, 100);
	    	Wait.elementToBeClickable(driver, changeStore, 3);
	    	changeStore.click();
	    	Wait.waitForInvisibilityOfElement(driver, changeStore, 200);
	    	Wait.untilPageLoadComplete(driver, 80);
		
	 }
	 public void changeCountryAndStore(String country,String store) throws InterruptedException
	 {
		 Wait.untilPageLoadComplete(driver, 80);
		 Wait.elementToBeClickable(driver, editCountry, 3);
		 editCountry.click();
	    	Wait.waitForInvisibilityOfElement(driver, editCountry, 200);
		 
		 Wait.elementToBeClickable(driver, ChangeCountry, 5);
		 ChangeCountry.click();
			WebElement countrySelection = driver.findElement(By.xpath("//div[contains(@id,'appmagic-dropdownFlyoutdropdown_siena_') and text()='" + country + "']"));
			Wait.waitForPresenceOfElementLocated(driver, countrySelection, 5);
			countrySelection.click();
			Thread.sleep(5000);
			
			Wait.elementToBeClickable(driver, changeStore, 10);
			changeStore.click();
			WebElement storeSelection = driver.findElement(By.xpath("//div[contains(@id,'appmagic-dropdownFlyoutdropdown_siena_') and contains(text(),'" + store + "')]"));
			//String storeSelectionvalue = storeSelection.getText();
			Wait.waitForInvisibilityOfElement(driver, storeSelection, 5);
			Wait.waitForInvisibilityOfElementLocated(driver, storeSelection, 5);
			Wait.elementToBeClickable(driver, storeSelection, 5);
			List<WebElement> ele = driver.findElements(By.xpath("//div[contains(text(),'" + store + "') and contains(@class,'appmagic-dropdownListItem')]"));
			Boolean flag = false;
			while (!flag) {
				for (int i = 0; i < ele.size(); i++) {
					if (isClickable(ele.get(i))) {
						// ele.get(i).click();
						testutil.actionMethodClick(driver, ele.get(i));
						flag = true;
						i = ele.size();
					}
				}
				Wait.elementToBeClickable(driver, saveChageStore, 5);
				testutil.actionMethodClick(driver, saveChageStore);
			}	

	 }
	  public void validateItemIdAndStatus(String status) 
	  {
		  String actualStatus=driver.findElement(By.xpath("(//div[@data-control-name='lblStatusMIS'])[1]")).getAttribute("innerText");
		     System.out.println("Actual Status is"+actualStatus);
		     System.out.println("Expected Status is"+status);
	 	     Wait.untilPageLoadComplete(driver, 30);
	 	     assertTrue(actualStatus.equalsIgnoreCase(status));
	 	     Wait.untilPageLoadComplete(driver, 80);
		  
		  String actualItemId=driver.findElement(By.xpath("(//div[@data-control-name='lblItemIdMIS'])[1]")).getAttribute("innerText");
		     System.out.println("Actual Status is"+actualItemId);
		     String expectedItemId=driver.findElement(By.xpath("(//div[@data-control-name='lblItemIdAddedByCustomerMIS_9'])[1]")).getAttribute("innerText");
		     System.out.println("Actual Status is"+expectedItemId);
		     
		     if(actualItemId.equals(expectedItemId)){
		            System.out.println("Item is move in Transit page");
		            //driver.quit();
		        }

		        else{
		        	System.out.println("Item is not move in Transit page");
		        	System.out.println("Actual Status is"+actualItemId);
		        	}
		  
	  }
	   
	   
	   public void scrollTillViewElement(String ele)
	   {
		  WebElement viewElement=driver.findElement(By.xpath("(//div[text()='"+ele+"'])[2]"));
		  Wait.untilPageLoadComplete(driver, 80);
		   Wait.scrollToView(driver,viewElement);
		   Wait.scrollToView(driver,viewElement);
		   Wait.untilPageLoadComplete(driver, 80);
	   }

	   public void validateleftMenu(DataTable datatable) throws InterruptedException {
		   List<String> actual = datatable.asList();
			System.out.println("Size = "+ actual.size());
			
			try {
			for (int i = 0; i <= actual.size()-1; i++) {
		                 String content = actual.get(i);
		            	WebElement data=driver.findElement(By.xpath("(//div[text()='"+content+"'])[1]"));
		            	System.out.println("Data Contain : "+data.getText());
		            	Wait.scrollToView(driver,data);
		            	
		            	if(actual.get(i).equalsIgnoreCase(data.getText()))
		            	{
		            		System.out.println("This is Expected:" + data.getText()+" == "+" This is Actual:  "+actual.get(i));
		            	}
		            	else
		            	{
		            		System.out.println( "This is Expected  "+data.getText()+" is not equal "+"This is Actual  "+actual.get(i));
		            	}
		}

	   		} catch (Exception e) {

	   			System.out.println("EXception :" + e + " has occurered");

	   		}
	   	}
	   public void clickOnMenu() throws InterruptedException
	   {
		   WebElement scroll=driver.findElement(By.xpath("//div[@data-control-name='btnBrandSettings']"));
		   Wait.scrollToView(driver,scroll);
		   driver.findElement(By.xpath("//div[@data-control-name='btnBrandSettings']")).click();
		   Thread.sleep(3000);
		   Wait.scrollToView(driver,scroll);
		   driver.findElement(By.xpath("//div[@data-control-name='btnCountrySettings']")).click();
		   Thread.sleep(3000);
		   Wait.scrollToView(driver,scroll);
		   driver.findElement(By.xpath("//div[@data-control-name='btnStoreSettings']")).click();
		   Thread.sleep(3000);
	   }
	   
	   public void clickleftMenu(DataTable datatable) throws InterruptedException {
		   Thread.sleep(2000);
		   List<String> actual = datatable.asList();
			System.out.println("Size = "+ actual.size());
			WebElement scroll=driver.findElement(By.xpath("//div[@data-control-name='btnBrandSettings']"));
				   
			for (int i = 0; i <= actual.size()-1; i++) {
				 Thread.sleep(2000);
		                 String content = actual.get(i);
		                 //Thread.sleep(5000);
		            	WebElement data=driver.findElement(By.xpath("//div[@data-control-name='btn"+content+"']"));
		            	System.out.println("Data Contain : "+data.getText());
		            	Thread.sleep(5000);
		            	Wait.scrollToView(driver,data);
		            	Wait.scrollToView(driver,data);
		            	Thread.sleep(5000);
		            	 Wait.elementToBeClickable(driver,data, 5);
		     			try {
		     				Thread.sleep(3000);
		     			} catch (InterruptedException e1) {
		     				// TODO Auto-generated catch block
		     				e1.printStackTrace();
		     			}
		     			System.out.println("going to click on " +data.getText());
		     			try {
		     				testutil.actionMethodClick(driver, data);
		     			}catch(Exception e) {
		     				testutil.actionMethodClick(driver, data);
		     			}

		     			System.out.println("clciked on "+data.getText());
		            	
			}    	
		            	
	   	}
	   
	   public void clickOnItem()
	    {
	    	Wait.untilPageLoadComplete(driver, 100);
	    	Wait.elementToBeClickable(driver, expiredItem, 3);
	    	expiredItem.click();
	    	Wait.waitForInvisibilityOfElement(driver, expiredItem, 200);
	    	Wait.untilPageLoadComplete(driver, 80);
	    }
	   
	   public void clickOnSeller()
	    {
//	    	Wait.untilPageLoadComplete(driver, 100);
	    	Wait.elementToBeClickable(driver, sellername, 3);
	    	sellername.click();
	    	Wait.waitForInvisibilityOfElement(driver, sellername,5);
//	    	Wait.untilPageLoadComplete(driver, 80);
	    }
	   public void clickOnItemTab()
	    {
		   Wait.elementToBeClickable(driver, item, 5);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("going to click on Items tab");
			try {
				testutil.actionMethodClick(driver, item);
			}catch(Exception e) {
				testutil.actionMethodClick(driver, item);
			}

			System.out.println("clciked on Items tab");
		}
	   public void ClickOnCheckboxAndSelectItem()
		 {
			 Wait.untilPageLoadComplete(driver, 80);
			 Wait.elementToBeClickable(driver, checkBox, 3);
			 checkBox.click();
			 Wait.waitForInvisibilityOfElement(driver, checkBox, 200);
			  Wait.untilPageLoadComplete(driver, 80); 
		 }
		 
	   
	   
		 public void clickOnThreeDot()
		 {
			 Wait.untilPageLoadComplete(driver, 100);
		    	Wait.elementToBeClickable(driver, click3Dot, 3);
		    	click3Dot.click();
		    	Wait.waitForInvisibilityOfElement(driver, click3Dot, 200);
		    	Wait.untilPageLoadComplete(driver, 80);
			
		 }
		 
		 public void changeStatusAndvalidate(String status)
		 {
			 WebElement actualStatus=driver.findElement(By.xpath("(//*[text()='"+status+"'])[3]"));
			 Wait.untilPageLoadComplete(driver, 100);
		    Wait.elementToBeClickable(driver, actualStatus, 3);
			 actualStatus.click();
			 Wait.waitForInvisibilityOfElement(driver, actualStatus, 200);
		    Wait.untilPageLoadComplete(driver, 80);
		     System.out.println("Actual Status is"+actualStatus.getText());
		     String expectedStatus=driver.findElement(By.xpath("(//div[@data-control-name='lblUnsoldAddedByCustomerMIS_7'])[1]")).getAttribute("innerText");
		     System.out.println("Actual Status is"+expectedStatus);
		     
		     if(actualStatus.getText().equals(expectedStatus)){
		            System.out.println("Status of item changed");
		            //driver.quit();
		        }

		        else{
		        	System.out.println("Status of item is not change");
		        	}
			 
		 }
	   
	    
}
