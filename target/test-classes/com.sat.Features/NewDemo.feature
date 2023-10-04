@US12337
Feature: Validation of checkbox in items tab for Expired item

  Background: 
    When user navigating to ResaleApp with valid credentials and signin

  Scenario Outline: Run the automatic cloudflow job
    And select "<Brand>","<Country>","<Store>"
    And user scroll into "Expired"
    Then user click on "Expired" pages
    And user enter seller name as "WDx0234567" in search textbox
    And user select any of item
    Then user click on seller name
    And user click on Item Tab
    And user click on checkbox and select item
    Then user click on three dot
    And user change item status to "Pick-up" and validate item satus
    When user navigating to PowerApps with valid credentials and signin
    Then user click on "Solutions"
    And user search with "Store Lens Resale"
    And user search with "SendEmail_Seller_UnSoldItems"
    And user run the automatic cloudflow job

    Examples: 
      | Brand   | Country | Store                     |
      | WEEKDAY | Sweden  | Drottninggatan 63(SE0655) |
