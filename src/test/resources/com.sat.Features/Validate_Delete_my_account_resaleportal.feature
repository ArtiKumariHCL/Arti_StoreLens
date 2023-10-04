@3314_CheckSoldArchieveByAdmin
Feature: TC3314 : Test user able to receives email when add a new item with Pending status and check admin able to update all information and update the status to SoldArchieve

  Scenario Outline: TC3314_Verify user able to receives email when new item is added  with 'Pending' status and check admin able to update all information and update the status to SoldArchieve
    When User navigates to ResalePortal "<url>" login page
    And user enters valid ResalePortal "<username>" and "<password>"
    And click on signin
    Then Navigate to manage account
    Then click on Send me my data and validate the popup
   Then confirmation email should sent with "Personal Data request | weekday 2nd Hand Curated"

    Examples: 
      | Brand   | Country | Store             | Service | StoreStatus | url                | username             | password               | Store_Name                   | brand_name | Gender | Category | Condition | Color | Pattern | Material | Unsolditem              | status         | existingseller            | tab       | fromDate | fromYear | fromMonth | todate | toYear | toMOnth | availableSlot | Unsold Item | Number of Items |
      | WEEKDAY | Sweden  | Drottninggatan 63 | Resell  | Store Open  | resale_portal_url1 | resale_portal_userid | resale_portal_password | Drottninggatan 63, Stockholm | Other      | Women  | Dresses  | Vintage   | Black | Floral  | Cotton   | Pick-up item from store | Pre-registered | testerswathi135@gmail.com | All Items |       11 |     2023 | May       |     11 |   2024 | May     | 10:00         | Pickup      |               1 |
