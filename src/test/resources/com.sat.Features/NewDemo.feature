@US11879
Feature: Validation of Add Purchase Price for B2B Seller and Normal Seller

  Background: 
    When user navigating to ResaleApp with valid credentials and signin

  Scenario Outline: Validation of Add Purchase Price for B2B Seller and Normal Seller
    And select "<Brand>","<Country>","<Store>"
    Then user click on "All Sellers" pages
    Then user click on "SHOW ALL SELLERS" pages
    Then user click on "B2B Sellers only" pages
    And user enter seller name as "Arti" in search textbox
    Then user click on seller name from result grid
    And click on AddItem button and enter "<Number of Items>", select "<Unsold Item>" and click Next button and enter sign save it
    And Open the "<status>" item and validate
    Then validated Purchses Price text Box should be display for B2B Seller
    Then user click on "All Sellers" pages
    Then user click on "SHOW ALL SELLERS" pages
    And user enter seller name as "Arti" in search textbox
    Then user click on seller name from result grid
    And click on AddItem button and enter "<Number of Items>", select "<Unsold Item>" and click Next button and enter sign save it
    And Open the "<status>" item and validate
    #And click on "<status>" item and generate id by clicking on edit button and save it
    Then validated Purchses Price text Box should not be display for Normal Seller

    Examples: 
      | Brand   | Country | Store                     | Number of Items | Unsold Item | status  |
      | WEEKDAY | Sweden  | Drottninggatan 63(SE0655) |               1 | Pickup      | Pending |

  