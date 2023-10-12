@B2BUerStory
Feature: Validation of B2B File Upload for a New Order 

@US12046
  Scenario Outline: Validation of B2B File Upload functionality for WEEKDAY
  When user navigating to B2BAppHomePage with valid credentials and signin
    Then user validate text "The Bread and Butter Collection"
    Then validate B2B entity "<ManageNewItem>" and "<ManageExpiredItem>"
    Then verify all entities are appearing under Manage new items
      |NEW ORDERS - PENDING|Create orders & scan parcel ID|SENDING - IN TRANSIT|Send items to store|RECEIVING - IN TRANSIT|Receive items from store|
    Then verify all entities are appearing on the left panel Common Task
      | Home | New order | Items | Orders | 
    And click on New Order button
    Then navigate to New Order
     And user validate and select Receiving Store "Weekday Shoreditch(GB0977)" from Receiving Store dropdown
    And click on upload file to excel "<path>" and Click on done button
    Then validate the field data with entities "<path>"
      | Item ID | B2bItemID | Item Name | Gender | Category (Lookup) | Size (Lookup) | Color | Material | Pattern | Condition | PriceNew | Brand | Article Number |
    Then verify all entities are appearing on the pending screen
      | Order number | Created Date | Sending Store | Receiving Store | Step 1/3 |
    And click on next button
    Then verify all entities are appearing on the pending screen
      | Order number | Created Date | Sending Store | Receiving Store | Step 2/3 | 2 Items |
    And click on next button
    Then verify all entities are appearing on the pending screen
      | Order number | Created Date | Sending Store | Receiving Store | Step 3/3 | Scan the parcel label to register parcel ID into this system |
    And Click on Scan parcel button
    Then Validate the following entities present in the register parcel ID
      | Scan the parcel label to register parcel ID into this system | Scan barcode on parcel label | Add parcel ID manually |
    And Generate the unique parcel ID and click on done
    And click on Home button
    Then Validate the count of sending In-transit
    And Click on Sending In-transit and valiadate the detail matches with uploaded file
      | Date | B2B Name | Parcel Id | Order Number | Items | Sending Store | Receiving Store | Order Status |

    Examples: 
      | User                    | ManageNewItem    | ManageExpiredItem    | path                                              |
      | ari.kumari@storelens.com | Manage new items | Manage expired items |C:\Users\hcladmin\Desktop\B2bTemplateV7_0037.xlsx |

@11878
 Scenario Outline: Validation of duplicate item detail while uploading B2B File for new order
 When user navigating to B2BAppHomePage with valid credentials and signin
 Then user validate text "The Bread and Butter Collection"
    Then validate B2B entity "<ManageNewItem>" and "<ManageExpiredItem>"
    Then verify all entities are appearing under Manage new items
      |NEW ORDERS - PENDING|Create orders & scan parcel ID|SENDING - IN TRANSIT|Send items to store|RECEIVING - IN TRANSIT|Receive items from store|
    Then verify all entities are appearing on the left panel Common Task
      | Home | New order | Items | Orders | 
    And click on New Order button
    Then navigate to New Order
    And user validate and select Receiving Store "Weekday Shoreditch(GB0977)" from Receiving Store dropdown
    And click on upload file to excel "<path>" and Click on done button
    Then validate the field data with entities "<path>"
      | Item ID | B2bItemID | Item Name | Gender | Category (Lookup) | Size (Lookup) | Color | Material | Pattern | Condition | PriceNew | Brand | Article Number |
    Then verify all entities are appearing on the pending screen
      | Order number | Created Date | Sending Store | Receiving Store | Step 1/3 |
      Then user validate warning message for duplicate item detail
      
   Examples: 
      | User                    | ManageNewItem    | ManageExpiredItem    | path                                              |
      | ari.kumari@storelens.com | Manage new items | Manage expired items |C:\Users\hcladmin\Desktop\B2bTemplateV7_0036.xlsx |
         
@11876
  Scenario Outline: Validation of B2B File Upload functionality for HM Flamingo
    Then validate B2B entity "<ManageNewItem>" and "<ManageExpiredItem>"
    Then verify all entities are appearing under Manage new items
      |NEW ORDERS - PENDING|Create orders & scan parcel ID|SENDING - IN TRANSIT|Send items to store|RECEIVING - IN TRANSIT|Receive items from store|
    Then verify all entities are appearing on the left panel Common Task
      | Home | New order | Items | Orders | 
    And click on New Order button
    Then navigate to New Order
    When user navigating to B2BAppHomePage with valid credentials and signin
    And click on upload file to excel "<path>" and Click on done button
    Then validate the field data with entities "<path>"
      | Item ID | B2bItemID | Item Name | Gender | Category (Lookup) | Size (Lookup) | Color | Material | Pattern | Condition | PriceNew | Brand | Article Number |
    Then verify all entities are appearing on the pending screen
      | Order number | Created Date | Sending Store | Receiving Store | Step 1/3 |
    And click on next button
    Then verify all entities are appearing on the pending screen
      | Order number | Created Date | Sending Store | Receiving Store | Step 2/3 | 2 Items |
    And click on next button
    Then verify all entities are appearing on the pending screen
      | Order number | Created Date | Sending Store | Receiving Store | Step 3/3 | Scan the parcel label to register parcel ID into this system |
    And Click on Scan parcel button
    Then Validate the following entities present in the register parcel ID
      | Scan the parcel label to register parcel ID into this system | Scan barcode on parcel label | Add parcel ID manually |
    And Generate the unique parcel ID and click on done
    And click on Home button
    Then Validate the count of sending In-transit
    And Click on Sending In-transit and valiadate the detail matches with uploaded file
      | Date | B2B Name | Parcel Id | Order Number | Items | Sending Store | Receiving Store | Order Status |

    Examples: 
      | User                    | ManageNewItem    | ManageExpiredItem    | path                                              |
      | ari.kumari@storelens.com | Manage new items | Manage expired items |C:\Users\hcladmin\Desktop\B2bTemplateV7_0036.xlsx |
      