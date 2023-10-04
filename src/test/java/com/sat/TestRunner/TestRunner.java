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
	tags= {	
			//"@TC_5857_5873_5874_5877_5881_5886_5889_Verify_User_gets_visitor_notification_email or \r \n" +
			//"@TC5975_5993_verify_Seler_details_with_different_roles or \r \n" +
		   // "@TC6061_5742_Verify_user_is_able_to_see_the_Unsold_item_status_for_item_status_in_Resale_app or \r \n" +
			//"@TC5341_5342_Verify_User_Is_Able_To_Book_The_Appointment_For_Missed_Item_and_able_to_cancle_the_registration or \r \n" +
			//"@TC_5335_US_5329_Verify_No_Time_Slot_Available_Message_where_no_time_slots_from_selected_date_from_Resale_Portal or \r \n" +
			//"@TC6063_6065_6102_5742_Verify_Unsold_item_status_column_is_hidden_in_Pending_screen_in_Resale_app or \r \n" +
			//"@TC6064_6067_6068_5742_Validate_in_Item_details_page_Unsold_item_field_and_Store_field_is_hidden_when_we_open_item_from_screen" 
			//"@TC_3454_5492_CancelNotPossible"
		
//                
//                "@3162_5485_ResalRegistration or \r \n" +
//                "@3167_5486_ResalForgotpassword or \r \n" +
//                "@TC_3454_5492_CancelNotPossible or \r \n" +
//               "@TC5341_5342_Verify_User_Is_Able_To_Book_The_Appointment_For_Missed_Item_and_able_to_cancle_the_registration or \r \n" +
//                "@TC5660_Validation_the_cancel_pop-ups_for_pending_items or \r \n" +
//                "@TC5638_5586_Validate_click_and_meet_portal_after_cancel_a_slot_cancel_pop-ups_is_showing_in_Black or \r \n" +
//                "@TC5675_Validation_of_countries_dropdown or \r \n" +
//                "@3169_3262_3269_3443_5487_5488_5490_User_Login_with_exesting_Account_and_RegisteringCancellingItem or \r \n" +
//                " @TC5676_ResalValidation_of_field"
                 
                 
                
		
			})
	
	public class TestRunner extends AbstractTestNGCucumberTests{
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
//			scenario.attach(Util.takeScreenShot(), "image/png", scenario.getName());
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
