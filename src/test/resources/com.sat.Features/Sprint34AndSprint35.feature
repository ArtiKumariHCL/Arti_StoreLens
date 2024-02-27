@Sprint34
Feature: Userstory of Sprint33 and Sprint34 and Sprint35

  @TC-14511
  Scenario: Validation of Advance search function in all item page and search funcion in order page
    When user navigating to B2BAppHomePage with valid credentials and signin
    And click on Item button
    And click on the Advanced Search in All Items page
    Then validate "Advance search" in the advance search page and "Please fill in the desired fields below to advance your search"
    Then validate the Key Word field "Search for Item ID,Brand,Price"
    And user enter itemId as "690002802701" in textbox
    Then validate Brand entry field and category dropdown
    And user enter Brand as "Weekday" in Brand textbox
    And user select category "Bags" from category dropdown
    And user select Status "Pending" from status dropdown
    Then user validate and click on Search button
    And click on Order button
    And user select "Order Status" from options dropdown
    And user select "Pending" from Status dropdown
    And user select "Order Number" from options dropdown
    And user enter "00665" in search textbox
    And user select "Parcel ID" from options dropdown
    And user enter "123456" in search textbox
    
     @US-13657
  Scenario: Validation of All Sending and Receiving Tab in order screen
    When user navigating to B2BAppHomePage with valid credentials and signin
     And click on Order button
     And validate the following "<tab>" are present in order in B2B App
      |All| Sending | Receiving |
      And click on Item button
      And validate the following "<tab>" are present in item page in B2B App
      | Active | Archive |
       And user validate column name "Order Number" in item page in B2B App
    
     @US11152
  Scenario Outline: Validation of accessing multiple brands by brand user
   When user navigating to ResaleApp with valid credentials and signin
   Then click on back button in Home Page
  And select "<Brand>","<Country>","<Store>"
  And user scroll into "Manage users"
   Then user click on Manage users tab from left pane
   And user enter seller name as "arti.kumari@storelens.com" in search textbox
   Then user click on seller name from result grid
   #And naviagte to manage users section and search for "<User>" and select role to "<Role>" and save it
    #And Go to "<settings>" and select the "<Brand>" disable it and click on save
    #And Go to "<settings>" and select the "<Brand>" the enable it
    #And Update "<Store contact email>" and save it
    #Then click on pencil icon and check "<Brand>" "<Country>" "<Store>" is now able to select

    #Examples: 
      #| settings       | Brand   | Store contact email    | Country | Store             |
      #| Brand settings | WEEKDAY | testerswathi@gmail.com | Sweden  | Drottninggatan 63 |
  
  
   Examples: 
      | Brand   | Country | Store             |
      | WEEKDAY | Sweden  | Drottninggatan 63 |
      
 @US14293
 Scenario Outline: Validation of accessing multiple brands by brand user
   When user navigating to ResaleApp with valid credentials and signin
   Then click on back button in Home Page
  And select "<Brand>","<Country>","<Store>"
  Then user click on "All Items" pages
    And click on the Advanced Search in All Items page
    And user select Status "Pending" from status dropdown
    Then user validate and click on Search button
    And user select any of item
    
  
  Examples: 
      | Brand   | Country | Store             |
  | WEEKDAY | United Kingdom | Weekday Soho(GB0989)|
  | WEEKDAY | United Kingdom | Weekday Shoreditch(GB0977) |
  
  @TC-14882
  Scenario Outline: Validation of B2B column name should be display in All Items
    When user navigating to ResaleApp with valid credentials and signin
    Then click on back button in Home Page
    And select "<Brand>","<Country>","<Store>"
    Then user click on "All Items" pages
    And user validate column name "B2B Name" in all pages
    Then user click on "Archive" pages
    And user validate column name "B2B Name" in all pages
    Then user click on "In-Store" pages
    And user validated column name "B2B Name" in all pages
    Then user click on "In-Store 2nd Try" pages
    And user validated column name "B2B Name" in all pages
    Then user click on "Expired" pages
    And user validated column name "B2B Name" in all pages

    Examples: 
      | Brand   | Country        | Store                                  |
      | WEEKDAY | United Kingdom | Virtual weekday B2B Partners(GB000000) |
      | WEEKDAY | United Kingdom | Weekday Soho(GB0989)                   |
      | WEEKDAY | United Kingdom | Weekday Shoreditch(GB0977)             |

  @TC-14902
  Scenario Outline: Validation of B2B column name should be display in All Items
    When user navigating to ResaleApp with valid credentials and signin
    Then click on back button in Home Page
    And select "<Brand>","<Country>","<Store>"
    Then user click on "All Items" pages
    And click on the Advanced Search in All Items page
    And user enter B2BSeller as "ArtiB2BSeller" in B2BSeller textbox
    Then user validate and click on Search button
    Then user click on "Archive" pages
    And click on the Advanced Search in All Items page
    And user enter B2BSeller as "ArtiB2BSeller" in B2BSeller textbox
    Then user validate and click on Search button
    Then user click on "In-Store" pages
    And user click on the Advance Search
    And user entered B2BSeller as "ArtiB2BSeller" in B2BSeller textbox
    Then user validate and click on Search button
    Then user click on "In-Store 2nd Try" pages
    And user click on the Advance Search
    And user entered B2BSeller as "ArtiB2BSeller" in B2BSeller textbox
    Then user validate and click on Search button
    Then user click on "Expired" pages
    And user click on the Advance Search
    And user entered B2BSeller as "ArtiB2BSeller" in B2BSeller textbox
    Then user validate and click on Search button

    Examples: 
      | Brand   | Country        | Store                                  |
      | WEEKDAY | United Kingdom | Virtual weekday B2B Partners(GB000000) |
      | WEEKDAY | United Kingdom | Weekday Soho(GB0989)                   |
      | WEEKDAY | United Kingdom | Weekday Shoreditch(GB0977)             |
  
      