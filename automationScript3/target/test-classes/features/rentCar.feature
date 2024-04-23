Feature: Car rental

  Scenario: As a user, I want to be able to rent a car
    Given traveloka landing page
    When user go to car rental product
    And select Without Driver option
    And enter rental location with Tangerang
    And select rental start date and time
    And select rental end date and time
    And click search icon button
    Then page move to car selection
    When user sort by highest price
    And select the most expensive car
    And select rental provider
    And choose pick up location at rental office
    And drop off location at Soekarno Hatta airport
    And fill note with "This note is filled by Selenium WebDriver with Java"
    And click continue
    Then page move to Your Booking
    When user fill contact name
    And fill contact number
    And fill contact email
    And select driver title
    And fill driver name
    And fill driver number
    And click continue again
    Then user fill special request
    When user check all requirements
    And continue to payment
    And select payment method
    Then user proceed to pay