@3162_5485_ResalRegistration
Feature: TC_3162_5485 : Registering a seller in Resale portal

  Scenario Outline: TC_3162_5485_Register a seller
    Given user naviagtes to login page "<portal_url>" and click on Create an account link Name "<creatAccountlinkName>"
    And check create account page should have required fields "<Language>"    
    And enter all the mandatory fileds "<Email>" and  "<Firstname>" and "<Lastname>" and "<Mobile>" and "<Street Address>" and "<Postal code>" and "<City>" in the page
    And click on Continue verify registered message "<success message>" and click on Ok
    Then remove created seller "<Email>"

    Examples: 
      | portal_url                 | creatAccountlinkName     | Language | Email                  | Firstname | Lastname | Mobile     | Street Address | Postal code | City     |success message| 
      | QA_ResalePortal_Weekday_SE | Create an account        | English  | swethahcl960@gmail.com | swetha    | hcl      | 9876543210 | Marathalli     |      554678 | Banglore | Registered successfully |
      #| QA_ResalePortal_Weekday_NL | Create an account        |English| swethahcl960@gmail.com | swetha    | hcl      | 9876543210 | Marathalli     |      554678 | Banglore |  |
      #| QA_ResalePortal_Weekday_BE | Create an account        |English| swethahcl960@gmail.com | Swetha    | hcl      | 9876543210 | Marathalli     |      554678 | Banglore |  |
      #| QA_ResalePortal_monki_SE   | Create an account        |English| swethahcl960@gmail.com | Swetha    | hcl      | 9876543210 | Marathalli     |      554678 | Banglore |  |
      | QA_ResalePortal_HM_NL      | Start hier!              | Dutch    | swethahcl960@gmail.com | Swetha    | hcl      | 9876543210 | Marathalli     |      554678 | Banglore |  |
      | QA_ResalePortal_HM_DE      | Erstelle hier dein Konto | German   | swethahcl960@gmail.com | Swetha    | hcl      | 9876543210 | Marathalli     |      554678 | Banglore |  |
      #| QA_ResalePortal_arket_SE   | Create an account        | English|swethahcl960@gmail.com | Swetha    | hcl      | 9876543210 | Marathalli     |      554678 | Banglore |  |
      #| Weekday_BE_resale_portal_url | Swetha.pr@hcl.com | Swetha    | pr       | 9876543210 | Marathalli     |      554678 | Banglore |
      #| resale_portal_url1           | Swetha.pr@hcl.com | Swetha    | pr       | 9876543210 | Marathalli     |      554678 | Banglore |
      #| resale_portal_url1 | sriswathianusha.nulu@gmail.com | Anusha    | Nulu     | 9876543210 | Kukatpally     |      537828 | Hyderabad |
      #| resale_portal_url1 | testerswathi135@gmail.com | HCLtester@22 | Tester    | swathi   | 9876543210 | Marathalli     |      554678 | Banglore |
