package com.sat.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//	@RunWith(Cucumber.class)
	@CucumberOptions(
			features={"src/test/resources/com.sat.Features"},
			glue={"com.sat.StepDefinitions","com.sat.AppHooks"},
			monochrome=true,
			strict = true,
			plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
			//plugin={"pretty","json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:target/cucumber-reports/report.html"},
			//tags=("@AdminTool_And_Click&Meet"))
			//tags ={"@ResalRegistration or @ResalForgotpassword or @RegisteringItem"})//@ResalForgotpassword //@RegisteringItem //@ResalRegistration
	tags= {"@TC-14511"
			
			//"@Missing or \r \n "+"@Broken or \r \n "+"@CancelOrder"+"@US12046 or \r \n "+"@11878 or \r \n "
			
			
//		"@Validation_of_B2B_File_Upload_for_a_New_Order_for_HM_Flamingo or \r \n" +
//			"@Validation_of_B2B_File_Upload_for_a_Existing_Order_for_HM_Flamingo or \r \n" +
//			"@B2B_validation_under_store_side"
			//"@TC_5857_5873_5874_5877_5881_5886_5889_Verify_User_Next_Available_Time_To_Book_The_Appointment_For_Particular_Date_From_Click&Meet or \r \n" +
		  //  "@TC5412_5718_5722_5723_5724_5729_5730_5345_Verify_User_Next_Available_Time_To_Book_The_Appointment_For_Particular_Date_From_Resale_Portal or \r \n" +
		//	"@3162_5485_ResalRegistrationDifferentUrl or \r \n" +
		  //  "@6342_6200_Validation_of_User_able_to_select_Multiple_item_from_AllItem_to_change_the_store_for_allbrand_in_Resale_Portal or \r \n" +
		//	"@TC6341_6200_Verifyuserisabletoselectmultipleitemsfromselleritemstochangethestatus"
		  
		    
			})
	
	public class Current_workTestRunner extends AbstractTestNGCucumberTests{
		/* @Override
	      
	      @DataProvider(parallel = true) public Object[][] scenarios() { 
			 return super.scenarios();
		 }*/
	}
		
		/*@BeforeStep
		public void beforeStep() {
		}

		@AfterStep
		public void afterStep() {
		}

		@Before
		public void beforeScenario() {
		}

		@After
		public void afterScenario(Scenario scenario) {
			scenario.attach(Util.takeScreenShot(), "image/png", scenario.getName());
		}*/
	
	
	//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//	import cucumber.api.CucumberOptions;
//	import cucumber.api.testng.AbstractTestNGCucumberTests;
//	@CucumberOptions(features="src/test/resources/features",glue="stepDefinitions",tags="@Test01",plugin= {"pretty", "html:target/cucumber-reports" },monochrome=true)

//public class TestRunner {
//    private TestNGCucumberRunner testNGCucumberRunner;
// 
//    @BeforeClass(alwaysRun = true)
//    public void setUpClass() throws Exception {
//        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//    }
// 
//    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
//    public void feature(CucumberFeatureWrapper cucumberFeature) {
//        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//    }
// 
//    @DataProvider
//    public Object[][] scenarios() {
//        return testNGCucumberRunner.provideScenarios();
//    }
// 
//    @AfterClass(alwaysRun = true)
//    public void tearDownClass() throws Exception {
//        testNGCucumberRunner.finish();
//    }
//}	
//	
//		
//	
