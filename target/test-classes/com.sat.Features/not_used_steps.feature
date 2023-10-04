@3314_CheckSoldArchieveByAdmin
Feature: TC3314 : Test user able to receives email when add a new item with Pending status and check admin able to update all information and update the status to SoldArchieve

  Scenario Outline: TC3314_Verify user able to receives email when new item is added  with 'Pending' status and check admin able to update all information and update the status to SoldArchieve
    Scenario Outline: 5665_validate_send_data_BE_resale_portal

    Given user naviagtes to login page "<portal_url>" and click on Create an account link Name "<creatAccountlinkName>"
    And check create account page should have required fields "<Language>"
    And enter all the mandatory fileds "<Email>" and  "<Firstname>" and "<Lastname>" and "<Mobile>" and "<Street Address>" and "<Postal code>" and "<City>" in the page
    And click on Continue verify registered message "<success message>" and click on Ok
    Then remove created seller "<Email>" "<portal_url>"

    Examples: 
      | portal_url                 | creatAccountlinkName     | Language | Email                   | Firstname | Lastname | Mobile     | Street Address | Postal code | City     | success message          |
      | QA_ResalePortal_Weekday_SE | Create an account        | English  | abcdefg@gmail.com       | swetha    | hcl      | 9876543210 | Marathalli     |      554678 | Banglore | Registered successfully. |