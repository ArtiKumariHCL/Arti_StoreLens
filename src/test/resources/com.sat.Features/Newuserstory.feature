@UserStory
Feature: Validation of life time/final pick up time of item

  Background: 
    When user navigating to ResaleApp with valid credentials and signin

  @US10690
  Scenario Outline: Validation of life time/final pick up time of item
    And select "<Brand>","<Country>","<Store>"
    Then user click on "All Sellers" pages
    Then user click on "SHOW ALL SELLERS" pages
    Then user click on "B2B Sellers only" pages
    And user enter seller name as "Arti" in search textbox
    Then user click on seller name from result grid
    And click on AddItem button and enter "<Number of Items>", select "<Unsold Item>" and click Next button and enter sign save it
    And click on "<status>" item and generate id by clicking on edit button and save it
    And user fil details "zara","Women","Hats","42","Never worn ","Leather","500"
    Then user vlidate status of item "In Store"
    And user validate final pick up time of item "<Brand>"

    Examples: 
      | Brand   | Country        | Store                                    | Number of Items | Unsold Item | status  |
      | COS     | Austria        | COS Neubaugasse(AT0671)                  |               1 | Pickup      | Pending |
      | Weekday | sweden         | Drottninggatan 63(SE0655)                |               1 | Pickup      | Pending |
      | Weekday | Belgium        | Meir 78(BE0401)                          |               1 | Pickup      | Pending |
      | Weekday | Netherland     | Weekday Amsterdam De Pijp(NL0658)        |               1 | Pickup      | Pending |
      | Weekday | United Kingdom | Virtual weekday Bread & Butter(GB000000) |               1 | Pickup      | Pending |
      | H&M     | Netherland     | H&M Alkmaar(NL0012)                      |               1 | Pickup      | Pending |
      | monki   | Austria        | Mariahilferstraße 52(AT0500)             |               1 | Pickup      | Pending |
      | Arket   | sweden         | Drottninggatan 56(SE0701)                |               1 | Pickup      | Pending |

  @US11877
  Scenario Outline: Validation of left panel in admin section
    #And select "<Brand>","<Country>","<Store>"
    Then verify all entities are appearing on the left panel
      | Brand settings | Country settings | Store settings | Manage Agreement | Manage users | Report | Status update |
    Then user click on all entities are appearing on the left panel
    | BrandSettings | CountrySettings | StoreSettings | ManageAgreement | ManageUsers | Report | StatusUpdate |
    
    
    Examples: 
      | Brand   | Country         | Store                     |
      #| COS     | The Netherlands | Virtual COS(NL0000)       |
      | WEEKDAY | United Kingdom  | Weekday Sheffield(GB0988) |

  @US11873&US11874
  Scenario Outline: Validation of COS Rollout for COS,AT
    And select "<Brand>","<Country>","<Store>"
    Then user click on "All Sellers" pages
    Then user click on "SHOW ALL SELLERS" pages
    Then user click on "B2B Sellers only" pages
    And user enter seller name as "Arti" in search textbox
    Then user click on seller name from result grid
    And click on AddItem button and enter "<Number of Items>", select "<Unsold Item>" and click Next button and enter sign save it
    And click on "<Status>" item and generate id by clicking on edit button and save it
    And user fil details "zara","Women","Hats","42","Never worn ","Leather","500"
    Then user vlidate status of item "Pending"
    And user validate final pick up time of item is blank
    Then user click on save button
    And user click on checkbox and select item
    Then user click on three dot
    And select change store
    And user click on edit country check box and select country "<Change Country>" store "<Change Store>" and click on save button
    Then user click on "In-Transit" pages
    And verify item is display in In-Trainsit page and status should be "In Transit"

    Examples: 
      | Brand | Country         | Store               | Number of Items | Unsold Item | Status  | Change Country | Change Store            |
      | COS   | The Netherlands | Virtual COS(NL0000) |               1 | Pickup      | Pending | Austria        | COS Neubaugasse(AT0671) |
      | COS   | The Netherlands | Virtual COS(NL0000) |               1 | Pickup      | Pending | Spain          | Fuencarral 16(ES0552)   |

  @US11466
  Scenario Outline: Validation of checkbox in items tab for Expired item
    And select "<Brand>","<Country>","<Store>"
    And user scroll into "Expired"
    Then user click on "Expired" pages
    And user select any of item
    Then user click on seller name
    And user click on Item Tab
    And user click on checkbox and select item
    Then user click on three dot
    And user change item status to "In Store 2nd try" and validate item satus
    And user scroll into "In-Store"
    Then user click on "In-Store" pages
    And user select any of item
    Then user click on seller name
    And user click on Item Tab
    And user click on checkbox and select item
    Then user click on three dot
    And user change item status to "Sold" and validate item satus
    And user scroll into "In Store 2nd try"
    Then user click on "In Store 2nd try" pages
    And user select any of item
    Then user click on seller name
    And user click on Item Tab
    And user click on checkbox and select item
    Then user click on three dot
    And user change item status to "Sold" and validate item satus
    And user scroll into "Payout failed"
    Then user click on "Payout failed" pages
    And user select any of item
    Then user click on seller name
    And user click on Item Tab
    And user click on checkbox and select item
    Then user click on three dot
    And user change item status to "Sold" and validate item satus

    Examples: 
      | Brand   | Country        | Store                             |
      | WEEKDAY | Sweden         | Drottninggatan 63(SE0655)         |
      | WEEKDAY | Belgium        | Meir 78(BE0401)                   |
      | WEEKDAY | Netherland     | Weekday Amsterdam De Pijp(NL0658) |
      | WEEKDAY | United Kingdom | Weekday Sheffield(GB0988)         |
