@Sprint35AndUS-13654
Feature: Validation of mapping values of the file upload excel with dropdown values of store side app(Resale App)

  @US-13654
  Scenario Outline: Validation of mapping values of file upload excel with dropdown values of store side app(Resale App)
    When user navigating to ResaleApp with valid credentials and signin
    #Then click on back button in Home Page
    And select "<Brand>","<Country>","<Store>"
    Then user click on "All Items" pages
    And user click on item and open item detail page
    Then user click on brand dropdown list in item detail page
    Then User validate "BrandList" value from excel file with column heading "Brand"
    Then user click on gender dropdown list in item detail page
    Then User validated "GenderList" value from excel file with column heading "Gender"
    Then user click on category dropdown list in item detail page
    Then User validate "CategoryList" value from excel file with column heading "Category"
    Then user click on size dropdown list in item detail page
    Then User validate "SizeList" value from excel file with column heading "Size"
    Then user click on color dropdown list in item detail page
    Then User validate "ColorList" value from excel file with column heading "Color"
    Then user click on material dropdown list in item detail page
    Then User validate "MaterialList" value from excel file with column heading "Material"
    Then user click on pattern dropdown list in item detail page
    Then User validate "PatternList" value from excel file with column heading "Pattern"
    Then user click on trend dropdown list in item detail page
    Then User validated "TrendList" value from excel file with column heading "Trend"

    Examples: 
      | Brand | Country | Store                         |
      | H&M   | Spain   | Passeig de Gràcia 11(ES0200)  |
      | H&M   | Spain   | Virtual HM Flamingo(ES000000) |

  @TC_14483
  Scenario Outline: Validation of Stock check function in Resale App
    When user navigating to ResaleApp with valid credentials and signin
    And select "<Brand>","<Country>","<Store>"
    Then user click on "All Items" pages
    #And click on the Advanced Search in All Items page
    #And user select Status "Expired" from status dropdown
    #Then user validate and click on Search button
    And user click on checkbox and select item for all item page
    Then user click on Stock Check button
    #And user click on checkbox and select item
    #Then user click on three dot
    #Then user validate below status should be enable for Expired item
      #| Broken | Missing | Returned | Pick-up | Charity | In Store 2nd try |Unsold Picked Up Archived |
      #Then user click on three dot
     And user validate stock check function of an item  
     
     #Then user click on "All Items" pages
    #And click on the Advanced Search in All Items page
    #And user select Status "In Store" from status dropdown
    #Then user validate and click on Search button
    #And user click on checkbox and select item for all item page
    #Then user click on Stock Check button
    #Then user click on three dot
       #Then user validate below status should be enable for Instore item
      #| Sold | Broken | Missing | Returned |
      #Then user click on three dot
       #And user validate stock check function of an item 
      #
      #Then user click on "All Items" pages
    #And click on the Advanced Search in All Items page
    #And user select Status "In Store 2nd try" from status dropdown
    #Then user validate and click on Search button
    #And user click on checkbox and select item for all item page
    #Then user click on Stock Check button
    #Then user click on three dot
       #Then user validate below status should be enable for In Store 2nd try item
      #| Sold | Broken | Missing | Returned |
      #Then user click on three dot
     #And user validate stock check function of an item  
    #And user change item status to "In Store 2nd try" and validate item satus
   #

    Examples: 
      | Brand   | Country        | Store                                    |
      | H&M     | USA            | H&M Soho(US0715)                         |
      #| Weekday | United Kingdom | Virtual weekday Bread & Butter(GB000000) |
      
