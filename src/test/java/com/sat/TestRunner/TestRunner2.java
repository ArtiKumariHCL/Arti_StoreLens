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
			//"@TC5637_ResalValidation_of_cancel_Color_black or \r \n" +
//		     "@TC5638_5586_Validate_click_and_meet_portal_after_cancel_a_slot_cancel_pop-ups_is_showing_in_Black or \r\n" +
//		     "@TC5660_Validation_the_cancel_pop-ups_for_pending_items or \r\n" +
//			 "@TC5675_Validation_of_countries_dropdown or \r\n "+
//		     "@TC5676_ResalValidation_of_field or \r \n" +
//		    "@TC5216_5217_5219_Resale_app or \r \n" + 
//		    "@TC5266_5267_5268_personal_shopper_screen  or \r \n" +
//			"@TC5776_5793_5802_NewBrand_Item or \r \n" +
//			 "@3162_5485_ResalRegistration or \r \n"+
//			"@5887_Validating_extend_booking_button_in_click_and_Meet_Portal or \r \n" +
//			 "@TC_3454_5492_CancelNotPossible"
			
			
			
			//"@TC_5857_5873_5874_5877_5881_5886_5889_Verify_User_gets_visitor_notification_email or \r \n" +
		//	"@TC5975_5993_verify_Seler_details_with_different_roles or \r \n" +
		 //   "@TC6061_5742_Verify_user_is_able_to_see_the_Unsold_item_status_for_item_status_in_Resale_app or \r \n" +
		//	"@TC6063_6065_6102_5742_Verify_Unsold_item_status_column_is_hidden_in_Pending_screen_in_Resale_app or \r \n" +
		//	"@TC6064_6067_6068_5742_Validate_in_Item_details_page_Unsold_item_field_and_Store_field_is_hidden_when_we_open_item_from_screen" 
		//	"@TC5341_5342_Verify_User_Is_Able_To_Book_The_Appointment_For_Missed_Item_and_able_to_cancle_the_registration or \r \n" +
		//	"@TC_5335_US_5329_Verify_No_Time_Slot_Available_Message_where_no_time_slots_from_selected_date_from_Resale_Portal or \r \n" +
		//	"@TC_3454_5492_CancelNotPossible"
		
		
		
		
		//	"@2286_Verify_Admin_Staff_user_is_able_to_close_the_Service_with_Customise_message or\r\n" + 
//			"@TC_2289_Verify_Customer_received_the_Cancellation_Email_when_Service_is_Closed or\r\n" + 
//			"@2295_Verify_Store_when_user_is_opening_the_Closed_Service_All_Services_are_Closed or \r\n" + 
//			"@TC_2322_Verify_Customer_is_received_Reminder_of_your_appointment_email or \r\n" + 
//			"@TC_2765_2837_3372_Verify_Customer_is_able_to_book_the_Slot__in_Booking_Portal_and_get_confirmation_email or\r\n" + 
//			"@TC_2839_2855_2858_Verify_User_gets_visitor_notification_email or \r\n" + 
//			"@TC_2841_3376_Verify_User_gets_booking_cancellation_email_for_Rental_Portal_booking or\r\n" + 
//			"@TC_2942_2936_2958_2966_2990_2994_Verify_User_Is_Able_To_Add_A_New_Service_And_View_Added_Services_For_Selected_Brand_country_and_store or\r\n" + 
//			"@2949_Verify_user_is_able_to_disable_Service_with_a_time_period_for_selected_Brand_in_Admin_Canvas_App or\r\n" + 
//			"@2951_Verify_user_is_able_to_enable_multiple_Services_for_selected_Brand_in_Admin_Canvas_App or\r\n" + 
//			"@2961_2974_Verify_User_Is_Able_To_Disable_Service_With_A_Time_Period_And_Remove_It or \r\n" + 
//			"@2969_2970_2978_Verify_User_Is_Able_To_Enable_And_Disable_multiple_Service or \r\n" + 
//			"@2998_Verify_user_is_able_to_export_booking_details_for_selected_Brand_and_Country_in_Admin_Canvas_App or \r\n" + 
//			"@3303_3302_Verify_user_is_able_to_view_available_services_and_bookings_for_selected_Brand_and_Country_in_Admin_Canvas_App or\r\n" + 
//			"@TC_3905_Verify_user_is_able_to_book_a_time_after_registering_an_items_through_portal"
			})
	
	public class TestRunner2 extends AbstractTestNGCucumberTests{
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
