@AdvanceSearchUS7690
Feature: Validate Advance Search in Resale App

  @AllItems
  Scenario Outline: Validate Advance Search of All Items page in Resale App
    When user navigating to ResaleApp with valid credentials and signin
    And select "<Brand>","<Country>","<Store>"
    Then user click on "All Items" pages
    And click on the Advanced Search in All Items page
    Then validate "Advance search" in the advance search page and "Please fill in the desired fields below to advance your search"
    Then validate the Key Word field "Search for Item ID,Brand,Price"
    And user validate and select size "40" from size dropdown
    Then validate Brand entry field and category dropdown
    And user enter Brand as "Asos" in Brand textbox
    And user select category "Hats" from category dropdown
    Then validate price range field and status dropdown
    And user enter price range "50" to "1000"
    And user select Status "Missing - waiting for pay out" from status dropdown
    Then user validate and click on Search button
    And click on the Advanced Search in All Items page
    Then user validate result Grid
    And user validate and select color "Blue" from color dropdown
    And user validate and select pattern "Floral" from pattern dropdown
    Then user validate and click on Search button
    Then user validate field count in search box
  #And click on the Advanced Search in All Items page
  #Then user validate and click on Cancel button
  
   Examples: 
      | Brand   | Country | Store             |
      | WEEKDAY | Sweden  | Drottninggatan 63 |
  
  @Archive
  Scenario Outline: Validate Advance Search of Archive page in Resale App
    When user navigating to ResaleApp with valid credentials and signin
    And select "<Brand>","<Country>","<Store>"
    Then user click on "Archive" pages
    And click on the Advanced Search in All Items page
    Then validate "Advance search" in the advance search page and "Please fill in the desired fields below to advance your search"
    Then validate the Key Word field "Search for Item ID,Brand,Price"
    And user validate and select size "40" from size dropdown
    Then validate Brand entry field and category dropdown
    And user enter Brand as "Asos" in Brand textbox
    And user select category "Hats" from category dropdown
    Then validate price range field and status dropdown
    And user enter price range "50" to "1000"
    And user select Status "Sold Archive" from status dropdown
    Then user validate and click on Search button
    And click on the Advanced Search in All Items page
    And user validate and select color "Blue" from color dropdown
    And user validate and select pattern "Floral" from pattern dropdown
    Then user validate and click on Search button
    Then user validate field count in search box
    
     Examples: 
      | Brand   | Country | Store             |
      | WEEKDAY | Sweden  | Drottninggatan 63 |

  @InStore
  Scenario Outline: Validate Advance Search of InStore page in Resale App
    When user navigating to ResaleApp with valid credentials and signin
    And select "<Brand>","<Country>","<Store>"
    Then user click on "In-Store" pages
    And user click on the Advance Search
    Then user validate "Advance search" in the advance search page and "Please fill in the desired fields below to advance your search"
    Then user validate the Key Word field "Search for Item ID,Brand,Price"
    And user validated and select size "40" from size dropdown
    Then validated Brand entry field and category dropdown
    And user entered Brand as "Asos" in Brand textbox
    And user selected category "Hats" from category dropdown
    And user entered price range "50" to "1000"
    Then user validate and click on Search button
    And user click on the Advance Search
    And user validated and select color "Blue" from color dropdown
    And user validated and select pattern "Floral" from pattern dropdown
    Then user validate and click on Search button
    
     Examples: 
      | Brand   | Country | Store             |
      | WEEKDAY | Sweden  | Drottninggatan 63 |

  @InStore2ndTry
  Scenario Outline: Validate Advance Search of InStore2ndTry page in Resale App
    When user navigating to ResaleApp with valid credentials and signin
    And select "<Brand>","<Country>","<Store>"
    Then user click on "In-Store 2nd Try" pages
    And user click on the Advance Search
    Then user validate "Advance search" in the advance search page and "Please fill in the desired fields below to advance your search"
    Then user validate the Key Word field "Search for Item ID,Brand,Price"
    And user validated and select size "40" from size dropdown
    Then validated Brand entry field and category dropdown
    And user entered Brand as "Adidas" in Brand textbox
    And user selected category "Hats" from category dropdown
    And user entered price range "50" to "1000"
    Then user validate and click on Search button
    And user click on the Advance Search
    And user validated and select color "Blue" from color dropdown
    And user validated and select pattern "Floral" from pattern dropdown
    Then user validate and click on Search button
    
     Examples: 
      | Brand   | Country | Store             |
      | WEEKDAY | Sweden  | Drottninggatan 63 |

  @Pending
  Scenario Outline: Validate Advance Search of Pending page in Resale App
    When user navigating to ResaleApp with valid credentials and signin
    And select "<Brand>","<Country>","<Store>"
    Then user click on "Pending" pages
    And user click on the Advance Search
    Then user validate "Advance search" in the advance search page and "Please fill in the desired fields below to advance your search"
    Then user validate the Key Word field "Search for Item ID,Brand,Price"
    And user validated and select size "38" from size dropdown
    Then validated Brand entry field and category dropdown
    And user entered Brand as "Arket" in Brand textbox
    And user selected category "Bags" from category dropdown
    And user entered price range "50" to "1000"
    Then user validate and click on Search button
    And user click on the Advance Search
    And user validated and select color "Blue" from color dropdown
    And user validated and select pattern "Floral" from pattern dropdown
    Then user validate and click on Search button
    
     Examples: 
      | Brand   | Country | Store             |
      | WEEKDAY | Sweden  | Drottninggatan 63 |

  @Storage
  Scenario Outline: Validate Advance Search of Storage page in Resale App
    When user navigating to ResaleApp with valid credentials and signin
    And select "<Brand>","<Country>","<Store>"
    And user scroll into "Storage"
    Then user click on "Storage" pages
    And user click on the Advance Search
    Then user validate "Advance search" in the advance search page and "Please fill in the desired fields below to advance your search"
    Then user validate the Key Word field "Search for Item ID,Brand,Price"
    And user validated and select size "42" from size dropdown
    Then validated Brand entry field and category dropdown
    And user entered Brand as "Adidas" in Brand textbox
    And user selected category "Accessories" from category dropdown
    And user entered price range "50" to "1000"
    Then user validate and click on Search button
    And user click on the Advance Search
    And user validated and select color "Blue" from color dropdown
    And user validated and select pattern "Floral" from pattern dropdown
    Then user validate and click on Search button
    
     Examples: 
      | Brand   | Country | Store             |
      | WEEKDAY | Sweden  | Drottninggatan 63 |

  @Expired
  Scenario Outline: Validate Advance Search of Expired page in Resale App
    When user navigating to ResaleApp with valid credentials and signin
    And select "<Brand>","<Country>","<Store>"
    And user scroll into "Expired"
    Then user click on "Expired" pages
    And user click on the Advance Search
    Then user validate "Advance search" in the advance search page and "Please fill in the desired fields below to advance your search"
    Then user validate the Key Word field "Search for Item ID,Brand,Price"
    And user validated and select size "42" from size dropdown
    Then validated Brand entry field and category dropdown
    And user entered Brand as "Adidas" in Brand textbox
    And user selected category "Jeans" from category dropdown
    And user entered price range "50" to "1000"
    Then user validate and click on Search button
    And user click on the Advance Search
    And user validated and select color "Blue" from color dropdown
    And user validated and select pattern "Floral" from pattern dropdown
    Then user validate and click on Search button

    Examples: 
      | Brand   | Country | Store             |
      | WEEKDAY | Sweden  | Drottninggatan 63 |
