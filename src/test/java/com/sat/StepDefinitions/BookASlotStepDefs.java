package com.sat.StepDefinitions;

import java.util.Properties;

import com.sat.Pages.BookingPortalPage;
import com.sat.Pages.ResaleLoginPage;
import com.sat.config.ConfigFileReader;
import com.sat.testbase.TestBase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BookASlotStepDefs {

	private BookingPortalPage bookingPortal = new BookingPortalPage(TestBase.getDriver());
	private ResaleLoginPage resalepagelogin = new ResaleLoginPage(TestBase.getDriver());
	private Properties prop;
	private ConfigFileReader config = new ConfigFileReader();
	
	
	public void main() {
		System.out.println("all related code is in booking portal step defs");
	}

}
