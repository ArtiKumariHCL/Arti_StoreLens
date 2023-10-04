Feature: Validate Advance Search in Resale App

<<<<<<< HEAD
  Scenario Outline: Validate Advance Search in Resale App
  When user navigating to ResaleApp with valid credentials and signin
   And select "<Brand>","<Country>","<Store>"
    # And searching for existing seller "<existingseller>","<tab>"
    And naviagte to manage users section and search with "<User>" and select role to "<Role>" and save it
    Then user login to ResaleApp
    And click on the Advanced Search in All Items page
    Then validate "Advance search" in the advance search page and "Please fill in the desired fields below to advance your search"
    Then validate the Key Word field "Search for Item ID,Brand,Price"
    Then validate Brand entry field and category dropdown
=======
  @5269_Validation_of_Advanced_Search_on_Resale_App
  Scenario Outline: Title of your scenario outline
    When user navigating to ResaleApp with valid credentials and signin
    And select "<Brand>","<Country>","<Store>"
   	And naviagte to manage users section and search with "<User>" and select role to "<Role>" and save it
    #Then user login to ResaleApp
    #And click on the Advanced Search in All Items page
    #Then validate "Advance search" in the advance search page and "Please fill in the desired fields below to advance your search"
    #Then validate the Key Word field "Search for Item ID,Brand,Price"
    #Then validate Brand entry field and category dropdown
    #And enter min price "20" and max price "2500"
    #Then select the status "In Store"
    #And validate search and cancle button 
    Then Enter the Advance Search page fields 
    
>>>>>>> branch 'master' of https://github.com/Swetha-pr/HM_Automation.git

    Examples: 
      | User                    | Role          | Brand   | Country | Store             | existingseller            | tab       | Number of Items | Unsolditem | status  | Updatedstatus | brandCommission |
      | arti.kumari@storelens.com | Admin         | WEEKDAY | Sweden  | Drottninggatan 63 | testerswathi135@gmail.com | All Items |               1 | Pickup     | Pending | Sold          |              40 |
  