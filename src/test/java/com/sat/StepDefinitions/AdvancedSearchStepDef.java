package com.sat.StepDefinitions;

import com.sat.Pages.AdvancedSearchPage;
import com.sat.Pages.PowerAppsAutomateFlowPage;
import com.sat.Pages.ResaleAppLoginPage;
import com.sat.testbase.TestBase;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AdvancedSearchStepDef {
		
	private AdvancedSearchPage advancedSearch = new AdvancedSearchPage(TestBase.getDriver());
	private PowerAppsAutomateFlowPage powerApps= new PowerAppsAutomateFlowPage(TestBase.getDriver());
	
	
	@And("click on the Advanced Search in All Items page")
	public void click_on_the_advanced_search_in_all_items_page() {
		try {
			advancedSearch.clickOnAdvancedSearchIcon();
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }

	}
	@Then("validate {string} in the advance search page and {string}")
	public void validate_in_the_advance_search_page(String advsrch, String advsrchtxt) {
		try {
			advancedSearch.validateAdvSrchPageTitle(advsrch, advsrchtxt);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}
		
	@Then("validate the Key Word field {string}")
	public void validate_the_key_word_field(String keywordtext) {
		try {
			advancedSearch.validateKeyWordField(keywordtext);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}
//	@Then("validate Brand entry field and category dropdown")
//	public void validate_Brand_entry_field_and_category_dropdown() {
//		advancedSearch.validateBrandEntryBox();
//		advancedSearch.validateCategoryDropDown();
//	}
	
	@Then("user validate {string} in the advance search page and {string}")
	public void user_validate_in_the_InStore_advance_search_page(String advsrch, String advsrchtxt) {
		try {
			advancedSearch.validateInStoreAdvSrchPageTitle(advsrch, advsrchtxt);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}
		
	@Then("user validate the Key Word field {string}")
	public void user_validate_the_InStore_key_word_field(String keywordtext) {
		try {
			advancedSearch.validateInStoreKeyWordField(keywordtext);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}
	
	@Then("validate Brand entry field and category dropdown")
	public void validate_Brand_entry_field_and_category_dropdown() {
		try {
			advancedSearch.validateBrandEntryBox();
			advancedSearch.validateCategoryDropDown();
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}
	
	@Then("validated Brand entry field and category dropdown")
	public void validated_Instore_Brand_entry_field_and_category_dropdown() {
		try {
			advancedSearch.validateInStoreBrandEntryBox();
			advancedSearch.validateInstoreCategoryDropDown();
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}
	
	@Then("user entered Brand as {string} in Brand textbox")
	public void user_enterd_InStore_Brand_as_in_Brand_textbox(String string) {
		try {
			advancedSearch.enterInStoreBrand(string);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}
	
	@Then("user selected category {string} from category dropdown")
	public void user_selected_InStore_category_from_category_dropdown(String string) {
		try {
			advancedSearch.selectInstoryCategory(string);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}
	
	@Then("user entered price range {string} to {string}")
	public void user_entered_InStore_price_range(String min,String max) throws InterruptedException {
		try {
			advancedSearch.enterInStorePriceRange(min, max);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}
	
	@Then("user enter Brand as {string} in Brand textbox")
	public void user_enter_Brand_as_in_Brand_textbox(String string) {
		try {
			advancedSearch.enterBrand(string);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }}
		

	@Then("user select category {string} from category dropdown")
	public void user_select_category_from_category_dropdown(String string) {
		try {
			advancedSearch.selectCategory(string);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}

	@Then("user enter price range {string} to {string}")
	public void user_enter_price_range(String min,String max) throws InterruptedException {
		//advancedSearch.selectPriceRange();
		try {
			advancedSearch.enterPriceRange(min, max);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}

	@Then("validate price range field and status dropdown")
	public void validate_price_range_field_and_status_dropdown() {
		try {
			advancedSearch.validateStatusDropDown();
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}

	@Then("user select Status {string} from status dropdown")
	public void user_select_Status_from_status_dropdown(String string) {
		try {
			advancedSearch.selectStatus(string);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}
	
	@Then("user validate and select size {string} from size dropdown")
	public void user_validate_and_select_size_from_size_dropdown(String string) {
		try {
			advancedSearch.validateSizeDropDown();
			advancedSearch.selectSize(string);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}
	
	@Then("user validated and select size {string} from size dropdown")
	public void user_validated_and_select_Instore_size_from_size_dropdown(String string) {
		try {
			advancedSearch.validateInStoreSizeDropDown();
			advancedSearch.selectSize(string);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}

	@Then("user validate and select color {string} from color dropdown")
	public void user_validate_and_select_color_from_color_dropdown(String string) {
		try {
			advancedSearch.validateColorDropDown();
			advancedSearch.selectColor(string);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}

	@Then("user validate and select pattern {string} from pattern dropdown")
	public void user_validate_and_select_pattern_from_pattern_dropdown(String string) {
		try {
			advancedSearch.validatePatternDropDown();
			advancedSearch.selectPattern(string);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}
	
	@Then("user validated and select color {string} from color dropdown")
	public void user_validated_and_select_InStore_color_from_color_dropdown(String string) {
		try {
			advancedSearch.validateInStoreColorDropDown();
			advancedSearch.selectColor(string);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}

	@Then("user validated and select pattern {string} from pattern dropdown")
	public void user_validated_and_select_InStore_pattern_from_pattern_dropdown(String string) {
		try {
			advancedSearch.validateInStorePatternDropDown();
			advancedSearch.selectPattern(string);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}

	@Then("user validate and click on Search button")
	public void user_click_on_Search_button() {
		try {
			advancedSearch.validateAndClickSearchButton();
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}
	
	@Then("user validate and click on Cancel button")
	public void user_click_on_Cancel_button() {
		try {
			advancedSearch.validateAndClickCancelButton();
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}
	
	@Then("user validate field count in search box")
	public void user_validate_field_count()
	{
		try {
			advancedSearch.validateFieldCount();
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}
	
	@Then("user validate result Grid")
	public void user_validate_result_Grid() {
		
	}

	@Then("user click on {string} pages")
	public void user_click_on_pages(String page) {
		try {
			advancedSearch.clickPages(page);
		} catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}
	
	
	@Then("user click on {string}")
	public void user_click_on_solutions(String page) {
		try {
			powerApps.clickOnSolutions(page);
		} catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}

	@And("user search with {string}")
	public void user_search_value(String page) {
		try {
			powerApps.search(page);
		} catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}

	
	@Then("user click on the Advance Search")
	public void user_click_on_the_advance_search() {
		try {
			advancedSearch.clickOnAdvanceSearch();
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}
	
	@Then("user enter seller name as {string} in search textbox")
	public void user_enter_seller_name_as_in_search_textbox(String string) {
		try {
			advancedSearch.enterTextInSearchBox(string);
       } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}

	@Then("user click on seller name from result grid")
	public void user_click_on_seller_name_from_result_grid() {
		try {
			advancedSearch.clickOnSellerName();
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}
	
	@Then("user vlidate status of item {string}")
	public void user_validate_staus_of_item(String status) {
		advancedSearch.validateStatus(status);
	}
	@Then("user validate final pick up time of item {string}")
	public void user_validate_final_pick_up_time_of_item(String brand) {
		advancedSearch.validateLifeOfItem(brand);	}

	@Then("user scroll into {string}")
	public void user_scroll_into_view(String element) {
		try {
	advancedSearch.scrollTillViewElement(element);	
		 } catch (Exception e) {
	            System.out.println("Exception :" + e + " has occurred");
	        }
}
	
	@Then("verify all entities are appearing on the left panel")
    public void verify_all_entities_are_appearing_on_the_left_panel(DataTable datatable) {
        try {
        	advancedSearch.validateleftMenu(datatable);
        	//advancedSearch.clickOnMenu();
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
    }
	@Then("user click on all entities are appearing on the left panel")
    public void user_click_on_all_entities_are_appearing_on_the_left_panel(DataTable datatable) throws InterruptedException {
        try {
		
        	//advancedSearch.clickleftMenu(datatable);
        	advancedSearch.clickOnMenu();
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
    }
	
	@Then("user validate final pick up time of item is blank")
	public void user_validate_final_pick_up_time_of_item_is_blank() {
		advancedSearch.validatePickUpDateBlank();
	}

	@Then("user click on save button")
	public void user_click_on_save_button() {
		advancedSearch.clickOnSave();
	}

	@Then("user click on checkbox and select item")
	public void user_click_on_checkbox_and_select_item() {
		try {
		
		advancedSearch.ClickOnCheckboxAndSelectItem();
    } catch (Exception e) {
        System.out.println("Exception :" + e + " has occurred");
    }
		
	}

	@Then("user click on three dot")
	public void user_click_on_three_dot() {
		try {
        advancedSearch.clickOnThreeDot();
		} catch (Exception e) {
	        System.out.println("Exception :" + e + " has occurred");
	    }
		
	}
	
	@Then("select change store")
	public void select_change_store() {
		try {
		
        advancedSearch.selectChangeStore();
	} catch (Exception e) {
        System.out.println("Exception :" + e + " has occurred");
    }
		
	}

	@Then("user click on edit country check box and select country {string} store {string} and click on save button")
	public void user_click_on_edit_country_check_box_and_select_country_store_and_click_on_save_button(String country,String store) throws InterruptedException {
	 try {
		advancedSearch.changeCountryAndStore(country,store);
	} catch (Exception e) {
        System.out.println("Exception :" + e + " has occurred");
    }
	}

	@Then("verify item is display in In-Trainsit page and status should be {string}")
	public void verify_item_is_display_in_In_Trainsit_page_and_status_should_be(String string) {
		try {
		advancedSearch.validateItemIdAndStatus(string);
		} catch (Exception e) {
	        System.out.println("Exception :" + e + " has occurred");
	    }
	}

	@Then("user select any of item")
	public void user_select_any_of_item() {
		try {
		advancedSearch.clickOnItem();
		} catch (Exception e) {
	        System.out.println("Exception :" + e + " has occurred");
	    }
	}
	@Then("user click on seller name")
	public void user_click_on_seller_nsme() {
		try {
		advancedSearch.clickOnSeller();
		} catch (Exception e) {
	        System.out.println("Exception :" + e + " has occurred");
	    }
	}
	@Then("user click on Item Tab")
	public void user_click_on_item_tab() {
		advancedSearch.clickOnItemTab();
	}
	@Then("user change item status to {string} and validate item satus")
	public void user_chabge_item_status_and_validate(String status) {
		try {
		advancedSearch.changeStatusAndvalidate(status);
		} catch (Exception e) {
	        System.out.println("Exception :" + e + " has occurred");
	    }
	}

	@Then("user run the automatic cloudflow job")
	public void user_run_cloudflow_job() {
		powerApps.executeCloudFlow();
	}

	
}
