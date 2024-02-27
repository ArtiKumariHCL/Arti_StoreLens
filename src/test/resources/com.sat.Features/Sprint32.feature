@Sprint32
Feature: Userstory of Sprint32

  #Background:
  #When user navigating to ResaleApp with valid credentials and signin
  @US13034
  Scenario Outline: Validation of change store option from order screen
    When user navigating to B2BAppHomePage with valid credentials and signin
    Then user validate text "The bread and butter collection"
    Then validate B2B entity "<ManageNewItem>" and "<ManageExpiredItem>"
    Then verify all entities are appearing under Manage new items
      | NEW ORDERS - PENDING | Create orders & scan parcel ID | SENDING - IN TRANSIT | Send items to store | RECEIVING - IN TRANSIT | Receive items from store |
    Then verify all entities are appearing on the left panel Common Task
      | Home | New order | Items | Orders |
    And click on Order button
    And click on three dots and Validate field are visible in B2B App
      | Remove order | Change store |
    Then Click on Change Store as "<StatusNeed>" option
    And user update receiving store "<Store>"

    Examples: 
      | User                     | ManageNewItem    | ManageExpiredItem   | StatusNeed   | Store                |
      | ari.kumari@storelens.com | Manage new items | Manage expired item | Change store | Weekday Soho(GB0989) |
      | ari.kumari@storelens.com | Manage new items | Manage expired item | Remove store | Weekday Soho(GB0989) |
      

  @US13036-ResaleApp
  Scenario Outline: Validate store user can able to Return Order from All Item Page
    When user navigating to ResaleApp with valid credentials and signin
    And select "<Brand>","<Country>","<Store>"
    Then user click on "All Items" pages
    Then user click on "B2B items only" pages
    And user click on checkbox and select item for all item page
    Then user click on Return To Seller button
    Then verify all entities are appearing on the pending screen
      | Order number | Return date | B2B Seller : The bread and butter collection | Sending Store | Step 1/2: Print label | Order a transport and print a label for the parcel. | Receiving Store | 1 Items |
    And click on next button on Return To Seller page
    Then verify all entities are appearing on the pending screen
      | Order number | Return date | B2B Seller : The bread and butter collection | Sending Store | Step 2/2: Register parcel ID | Scan the parcel label to register parcel ID into this system |
    And Click on Scan parcel button on Return To Seller page
    Then Validate the following entities present in the register parcel ID
      | Step 3/3: Register parcel ID | Scan the parcel label to register parcel ID into this system | Scan barcode on parcel label | Add parcel ID manually |
    And Generate the unique parcel ID and click on done on Return To Seller page

    #Then user click on ok and validate order id
    Examples: 
      | Brand   | Country        | Store                      | StatusNeed |
      #| WEEKDAY | United Kingdom | Virtual weekday B2B Partners(GB000000)|Broken|
      #| WEEKDAY | United Kingdom | Weekday Soho(GB0989)|Broken|
      | WEEKDAY | United Kingdom | Weekday Shoreditch(GB0977) | Broken     |
  #| H&M   | Spain   | Virtual HM Flamingo(ES000000) |Broken|
  #| H&M     | Spain          | Passeig de Gràcia 11(ES0200) |Broken|
  @US13036-B2BApp
  Scenario Outline: Validate store user can able to Return Order from B2B App
    When user navigating to B2BAppHomePage with valid credentials and signin
    Then Click on Receiving In-Transit in B2B App
    Then user click on "SCAN TO RECEIVE" pages
    And Generate the unique parcel ID and click on done in B2B App
    And click on three dots and Validate field are visible in Receive Parcel page
      | Missing | Broken |
    Then Click on Change Store as "<StatusNeed>" option
    Then user click on "REGISTER" pages
    Then user click on yes button
    And click on Order button
    Then user validate returned order in order page

    Examples: 
      | Brand   | Country        | Store                      | StatusNeed |
      #| WEEKDAY | United Kingdom | Virtual weekday B2B Partners(GB000000)|Broken|
      #| WEEKDAY | United Kingdom | Weekday Soho(GB0989)|Broken|
      | WEEKDAY | United Kingdom | Weekday Shoreditch(GB0977) | Broken     |
  #| H&M   | Spain   | Virtual HM Flamingo(ES000000) |Broken|
  #| H&M     | Spain          | Passeig de Gràcia 11(ES0200) |Broken|
  @US13031
  Scenario Outline: Validate Admin/Brand user should be able to update status of Archive Page
    When user navigating to ResaleApp with valid credentials and signin
    And select "<Brand>","<Country>","<Store>"
    Then user click on "Archive" pages
    Then user click on "Archive" pages
    Then user click on "B2B items only" pages
    And user scroll into "Status update"
    Then user click on Status update tab from left pane
    Then user search "Ab1234" in status update page
    Then user click on "Ab1234" in status update page
    And user change status of an item "Storage"
    And click on update button
    Then user click on Status update tab from left pane
    Then user search "KAR1231" in status update page
    Then user click on "KAR1231" in status update page
    Then user validate regular seller can not change status of Archive item

    Examples: 
      | Brand   | Country | Store             |
      | WEEKDAY | Sweden  | Drottninggatan 63 |
