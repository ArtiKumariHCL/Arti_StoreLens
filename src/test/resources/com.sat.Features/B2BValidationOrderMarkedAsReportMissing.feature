@12046_B2B_validation_under_store_side
Feature: B2B validation under store side and order mark as Missing and Broken and Cancel Order

@Weekdays
  Scenario Outline: Validation the store side for Weekdays, UK,GB0977
  When user navigating to ResaleApp with valid credentials and signin
    And select "<Brand>","<Country>","<Store>"
    And user scroll into "B2B"
    Then User navigated to "<B2Btab>" tab
    Then user validate text "WEEKDAY / RESALE / WEEKDAY SOHO" in Resale App B2B page
    Then user validate text "B2B" and "Action needed"
    Then validate under "<ActionNeeded>" following Entity
      | EXPIRED B2B | IN TRANSIT RECEIVING | IN TRANSIT SENDING |
      Then Click on In-Transit Receiving
      #And validate the count for Sending and receiving count
    #And user click on receiving count and validate text "IN TRANSIT RECEIVING"
     And validate the following field are present in "<B2Btab>"
      | Sending | Receiving |
      And validate the count for Sending and receiving count
    Then User navigated to "<B2Btab>" tab
    And user click on sending count and validate text "IN TRANSIT SENDING"
     And validate the following field are present in "<B2Btab>"
      | Sending | Receiving |
       Then User navigated to "<B2Btab>" tab
    And user click on expired count and validate text "EXPIRED B2B"
    Then User navigated to "<B2Btab>" tab
    Then user validate text "Sales data"
    Then user validate text "Items - number of sold items in Top 5 Categories"
    Then validate Sales data display latest five top categories details

    Examples: 
      | Brand | Country | Store                         | B2Btab |
     #| WEEKDAY | United Kingdom | Weekday Soho(GB0989)  |B2B    | 
      | WEEKDAY | United Kingdom | Weekday Shoreditch(GB0977)  |B2B    |
   
 @H&M  
   Scenario Outline: Validation the store side for H&M, Spain,ES000000
  When user navigating to ResaleApp with valid credentials and signin
    And select "<Brand>","<Country>","<Store>"
     And user scroll into "B2B"
    Then User navigated to "<B2Btab>" tab
    #Then user validate text "H&M / RESALE / VIRTUAL HM FLAMINGO" in Resale App B2B page
    Then user validate text "B2B" and "Action needed"
    Then validate under "<ActionNeeded>" following Entity
      | EXPIRED B2B | IN TRANSIT RECEIVING | IN TRANSIT SENDING |
      Then Click on In-Transit Receiving
      And validate the following field are present in "<B2Btab>"
      | Sending | Receiving |
      And validate the count for Sending and receiving count
      Then User navigated to "<B2Btab>" tab
    And user click on expired count and validate text "EXPIRED B2B"
    Then User navigated to "<B2Btab>" tab
    And user click on sending count and validate text "IN TRANSIT SENDING"
    And validate the following field are present in "<B2Btab>"
      | Sending | Receiving |
    Then User navigated to "<B2Btab>" tab
    Then user validate text "Sales data"
    Then user validate text "Items - number of sold items in Top 5 Categories"
    Then validate Sales data display latest five top categories details

     Examples: 
      | Brand | Country | Store                         | B2Btab |
      | H&M   | Spain   | Virtual HM Flamingo(ES000000) | B2B    |


  @Missing
  Scenario Outline: B2B validation under store side for order mark as Missing
    When user navigating to ResaleApp with valid credentials and signin
    #When user navigating to ResaleAppHomePage with valid credentials and signin
    When selecting "<Brand>","<Country>","<Store>"
    And user scroll into "B2B"
    Then User navigated to "<B2Btab>" tab
    Then validate under "<ActionNeeded>" following Entity
      | EXPIRED B2B | IN TRANSIT RECEIVING | IN TRANSIT SENDING |
    Then Click on In-Transit Receiving
    And click on three dots and Validate field are visible
      | Report as missing | Report as broken |
    Then Click on Report as "<StatusNeed>" status
    Then User navigated to "<tab>" tab
    And click on the Advanced Search in All Items page
    Then click on Advance Search Status Dropdown with "<AdvStatus>"
    And Validate order number added in All Items tab matches with In-trasit Receiving page

    Examples: 
      | Brand   | Country        | Store                      | B2Btab | ActionNeeded  | StatusNeed        | tab       | AdvStatus |
      #| H&M     | Spain          | Passeig de Gràcia 11(ES0200) | B2B    | Action needed | Report as missing | All Items | Missing   |
      #| H&M     | Spain          | Passeig de Gràcia 11(ES0200) | B2B    | Action needed | Report as broken  | All Items | Broken    |
      | WEEKDAY | United Kingdom | Weekday Shoreditch(GB0977) | B2B    | Action needed | Report as missing | All Items | Missing   |

  @Broken
  Scenario Outline: B2B validation under store side for order mark as Broken
    When user navigating to ResaleApp with valid credentials and signin
    When selecting "<Brand>","<Country>","<Store>"
    And user scroll into "B2B"
    Then User navigated to "<B2Btab>" tab
    Then validate under "<ActionNeeded>" following Entity
      | EXPIRED B2B | IN TRANSIT RECEIVING | IN TRANSIT SENDING |
    Then Click on In-Transit Receiving
    And click on three dots and Validate field are visible
      | Report as missing | Report as broken |
    Then Click on Report as "<StatusNeed>" status
    Then User navigated to "<tab>" tab
    And click on the Advanced Search in All Items page
    Then click on Advance Search Status Dropdown with "<AdvStatus>"
    And Validate order number added in All Items tab matches with In-trasit Receiving page

    Examples: 
      | Brand   | Country        | Store                      | B2Btab | ActionNeeded  | StatusNeed       | tab       | AdvStatus |
      | WEEKDAY | United Kingdom | Weekday Shoreditch(GB0977) | B2B    | Action needed | Report as broken | All Items | Broken    |

  @CancelOrder
  Scenario Outline: B2B validation under store side for order mark as Cancel Order
    When user navigating to ResaleApp with valid credentials and signin
    When selecting "<Brand>","<Country>","<Store>"
    And user scroll into "B2B"
    Then User navigated to "<B2Btab>" tab
    Then validate under "<ActionNeeded>" following Entity
      | EXPIRED B2B | IN TRANSIT RECEIVING | IN TRANSIT SENDING |
    And user click on sending count and validate text "IN TRANSIT SENDING"
    And click on three dots and Validate field are visible
      | Cancel Order |
    Then Click on Report as "<StatusNeed>" status

    Examples: 
      | Brand   | Country        | Store                      | B2Btab | ActionNeeded  | StatusNeed   | tab       | AdvStatus    |
      | WEEKDAY | United Kingdom | Weekday Shoreditch(GB0977) | B2B    | Action needed | Cancel Order | All Items | Cancel Order |
