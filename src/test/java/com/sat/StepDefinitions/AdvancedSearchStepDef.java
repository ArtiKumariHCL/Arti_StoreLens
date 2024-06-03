package com.sat.StepDefinitions;

import com.sat.Pages.AdvancedSearchPage;
import com.sat.Pages.PowerAppsAutomateFlowPage;
import com.sat.Pages.ResaleAppLoginPage;
import com.sat.Pages.StatusUpdatePage;
import com.sat.testbase.TestBase;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AdvancedSearchStepDef {
		
	private AdvancedSearchPage advancedSearch = new AdvancedSearchPage(TestBase.getDriver());
	private PowerAppsAutomateFlowPage powerApps= new PowerAppsAutomateFlowPage(TestBase.getDriver());
	private StatusUpdatePage statusupdate= new StatusUpdatePage(TestBase.getDriver());
	
	@Then("user click on Status update tab from left pane")
	public void user_click_on_tab_from_left_pane() {
		try {
			statusupdate.clickOnStatusTab();
		} catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}
	
	@Then("user click on Manage users tab from left pane")
	public void user_click_on_ManageUsers_from_left_pane() {
		try {
			statusupdate.clickOnManageUsersTab();
		} catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}
	
	@Then("user click on brand dropdown list in item detail page")
	public void user_click_on_brand_dropdown_list_in_item_detail_page() {
		advancedSearch.clickOnBrandList();
	}

	@Then("user click on gender dropdown list in item detail page")
	public void user_click_on_gender_dropdown_list_in_item_detail_page() {
		advancedSearch.clickOnGenderList();
	}

	@Then("user click on category dropdown list in item detail page")
	public void user_click_on_category_dropdown_list_in_item_detail_page() {
		advancedSearch.clickOnCategoryList();
	}

	@Then("user click on size dropdown list in item detail page")
	public void user_click_on_size_dropdown_list_in_item_detail_page() {
		advancedSearch.clickOnSizeList();
	}

	@Then("user click on material dropdown list in item detail page")
	public void user_click_on_material_dropdown_list_in_item_detail_page() {
		advancedSearch.clickOnMaterialList();
	}
	

	@Then("user click on color dropdown list in item detail page")
	public void user_click_on_color_dropdown_list_in_item_detail_page() {
		advancedSearch.clickOnColorList();
	}

	@Then("user click on pattern dropdown list in item detail page")
	public void user_click_on_pattern_dropdown_list_in_item_detail_page() {
		advancedSearch.clickOnPatternList();
	}

	@Then("user click on trend dropdown list in item detail page")
	public void user_click_on_trend_dropdown_list_in_item_detail_page() {
		advancedSearch.clickOnTrendList();
	}

	
	@Then("user search {string} in status update page")
	public void user_search_itemId(String itemid) {
		try {
			statusupdate.searchforItemID(itemid);
		} catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}
	
	@Then("user click on {string} in status update page")
	public void user_click_itemId(String itemid) {
		try {
			statusupdate.openIteminStatusPage(itemid);
		} catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}
	
	@Then("user change status of an item {string}")
	public void user_change_status_of_item(String status) {
		try {
			statusupdate.changeStatus(status);
		} catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}
	
	@Then("click on update button")
	public void user_click_on_update_button() {
		try {
			statusupdate.clickOnUpdate();
		} catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}
	
	@Then("user validate regular seller can not change status of Archive item")
	public void user_validate_regular_seller_can_not_change_status_of_archive_item() {
		try {
			statusupdate.validationOfRegularSeller();
		} catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}
	
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
	
	@Then("user validate acending and descending order of sorting for Trend column and Order Number column")
	public void validate_sorting_trend_and_ordernumber_column() {
		try {
			advancedSearch.sortingOfTrendAndOrderNumber();
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}
	
	@Then("user validate acending and descending order of sorting for All column")
	public void validate_sorting_for_all_column() {
		try {
			advancedSearch.sortingOfAllColumn();
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}
	
	@Then("user validated acending and descending order of sorting for Trend column and Order Number column")
	public void validated_sorting_InStoretrend_and_InStoreordernumber_column() {
		try {
			advancedSearch.sortingOfInStoreTrendAndOrderNumber();
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}
	
	@Then("user validated acending and descending order of sorting for All column")
	public void validate_sorting_forInStore__all_column() {
		try {
			advancedSearch.sortingOfInStoreAllColumn();
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}
	
	@Then("validated Purchses Price text Box should be display for B2B Seller")
	public void validate_purchse_entry_field() {
		try {
			advancedSearch.validatePurchasePriceEntryBox();
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
	}
	
	@Then("validated Purchses Price text Box should not be display for Normal Seller")
	public void validated_Purchses_Price_text_Box_should_not_be_display_for_Normal_Seller() {
		try {
		advancedSearch.validatePurchasePriceField();
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
	
	@Then("user validate column name {string} in all pages")
	public void user_validate_column_name_in_all_pages(String string) {
		try {
			advancedSearch.validateB2bColAllItem(string);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}
	
	@Then("user validated column name {string} in all pages")
	public void user_validated_column_name_in_all_pages(String string) {
		try {
			advancedSearch.validateB2bColInstore(string);
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
	
	@Then("user enter B2BSeller as {string} in B2BSeller textbox")
	public void user_enter_B2BSeller_as_in_B2BSeller_textbox(String string) {
		try {
			advancedSearch.enterB2bSeller(string);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }}
	
	@Then("user entered B2BSeller as {string} in B2BSeller textbox")
	public void user_entered_B2BSeller_as_in_B2BSeller_textbox(String string) {
		try {
			advancedSearch.enterB2bSellerInstore(string);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }}
	
	@Then("user enter itemId as {string} in textbox")
	public void user_enter_itemId_as_in_textbox(String string) {
		try {
			advancedSearch.enterItemId(string);
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
	
	@Then("user validate and select Trend {string} from Trend dropdown")
	public void user_validate_and_select_trend_from_trend_dropdown(String string) {
		try {
			advancedSearch.validateInStoreTrendDropDown();
			advancedSearch.selectDropDownValue(string);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
		
	}
	
	@Then("user validated and select Trend {string} from Trend dropdown")
	public void user_validated_and_select_trend_from_trend_dropdown(String string) {
		try {
			advancedSearch.validateTrendDropDown();
			advancedSearch.selectDropDownValue(string);
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
	
	@Then("user click on item and open item detail page")
	public void user_click_on_item_detail_from_result_grid() {
		try {
			advancedSearch.clickOnItemDetail();
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

	@Then("user click on checkbox and select item for all item page")
	public void user_click_on_checkbox_and_select_item_for_all_item_page() throws InterruptedException {
		//try {
		
		advancedSearch.ClickOnCheckboxOnAllItemPage();
//    } catch (Exception e) {
//        System.out.println("Exception :" + e + " has occurred");
//    }
	}
	
	@Then("user click on Return To Seller button")
	public void user_click_on_Return_To_seller_item_for_all_item_page() throws InterruptedException {
		try {
		
		advancedSearch.ClickOnReturnToSeller();
    } catch (Exception e) {
        System.out.println("Exception :" + e + " has occurred");
    }
	}
	
	@Then("user click on Stock Check button")
	public void user_click_on_stock_check_item_for_all_item_page() throws InterruptedException {
		try {
		
		advancedSearch.ClickOnStockCheck();
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
	
	@Then("click on next button on Return To Seller page")
	public void user_click_on_next_on_return_to_seller_page() {
		try {
		advancedSearch.next_button_ReturnToSeller();
		} catch (Exception e) {
	        System.out.println("Exception :" + e + " has occurred");
	    }
	}
	
	@Then("Click on Scan parcel button on Return To Seller page")
	public void click_on_scan_parcel_on_return_to_seller_page() {
		try {
		advancedSearch.scan_parcel_Return_To_Seller();
		} catch (Exception e) {
	        System.out.println("Exception :" + e + " has occurred");
	    }
	}
	
	@Then("Generate the unique parcel ID and click on done on Return To Seller page")
	public void generate_unique_parcel_id_on_return_to_seller_page() {
		try {
		advancedSearch.generate_parcelId_Return_To_Seller();
		} catch (Exception e) {
	        System.out.println("Exception :" + e + " has occurred");
	    }
	}
	
	@Then("user click on ok and validate order id")
	public void click_on_ok_and_validate_order_id_on_all_item_page() {
		try {
		advancedSearch.validateOrderId();
		} catch (Exception e) {
	        System.out.println("Exception :" + e + " has occurred");
	    }
	}
	
	@Then("user validate stock check function of an item")
    public void user_validate_stock_check_function_of_item() {
        try {
        	advancedSearch.stockCheck();
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
    }
	
	@Then("user validate below status should be enable for Expired item")
    public void user_validate_status_should_be_enable_for_Expired_item(DataTable datatable) {
        try {
        	advancedSearch.validateEnableStatus(datatable);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
    }
	
	@Then("user validate below status should be enable for Instore item")
    public void user_validate_status_should_be_enable_for_Instore_item(DataTable datatable) {
        try {
        	advancedSearch.validateEnableStatus(datatable);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
    }
	
	@Then("user validate below status should be enable for In Store 2nd try item")
    public void user_validate_statusshould_be_enable_for_InStore2ndtry_item(DataTable datatable) {
        try {
        	advancedSearch.validateEnableStatus(datatable);
        } catch (Exception e) {
            System.out.println("Exception :" + e + " has occurred");
        }
    }
}
