@US11532
Feature: Validation on the store side for Weekdays, UK,GB0977,GB0989 and H&M, Spain,ES000000

  #Background: 
    #When user navigating to ResaleApp with valid credentials and signin
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
   
 
