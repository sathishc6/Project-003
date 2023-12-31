Feature: Hotel Booking

  Scenario: Login Page
    Given user should launch the url
    When user should enter valid email in email field
    And user should enter valid vaild password in password field
    Then user should click the login button and proceed to next page

  Scenario: Search hotel
    When user should select the location
    And user should select the hotel
    And user should select the room type
    And user should select the number of rooms
    And user should select the check in date
    And user should select the check out date
    And user should select the adults per room
    And user should select the childrens per room
    Then user should click the search button and proceed to next page

  Scenario: Select Hotel
    When user should select the radio button and make sure its clicked
    Then user should the continue button

  Scenario: Book a Hotel
    When user should enter first name in the first name field
    And user should enter last name in the last name field
    And user should enter the billing address
    And user should enter the credit card number
    And user should enter the credit card type
    And user should enter the expiry date
    And user should enter the CVV number
    Then user should click the book now button and proceed to next page

  Scenario: Logout
    But user should click logout button
