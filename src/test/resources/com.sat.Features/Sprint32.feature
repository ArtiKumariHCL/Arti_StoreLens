@Sprint32
Feature: Validation of change store option from order screen

  #Background: 
    #When user navigating to ResaleApp with valid credentials and signin

@13034
 Scenario Outline: Validation of change store option from order screen
 When user navigating to B2BAppHomePage with valid credentials and signin
 Then user validate text "The bread and butter collection"
    Then validate B2B entity "<ManageNewItem>" and "<ManageExpiredItem>"
    Then verify all entities are appearing under Manage new items
      |NEW ORDERS - PENDING|Create orders & scan parcel ID|SENDING - IN TRANSIT|Send items to store|RECEIVING - IN TRANSIT|Receive items from store|
    Then verify all entities are appearing on the left panel Common Task
      | Home | New order | Items | Orders | 
      And click on Order button
      And click on three dots and Validate field are visible in B2B App
      | Remove order | Change store |
    Then Click on Change Store as "<StatusNeed>" option 
    And user update receiving store "<Store>"
    
    Examples: 
      | User                    | ManageNewItem    | ManageExpiredItem |StatusNeed  |Store|
      | ari.kumari@storelens.com | Manage new items | Manage expired item |Change store|Weekday Soho(GB0989) |
      
  
  @13034
 Scenario Outline: Validate store user can able to Return Order from All Item Page
 When user navigating to ResaleApp with valid credentials and signin
    And select "<Brand>","<Country>","<Store>"
    Then user click on "All Items" pages
    
    Examples: 
      | Brand   | Country | Store             |
      | WEEKDAY | Sweden  | Drottninggatan 63 |
     