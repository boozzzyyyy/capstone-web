Feature: Register

  Scenario: As user i able to be succesfully register
    Given At register page website | Register
    When Input valid email | Register
    And Input valid username | Register
    And Input valid password | Register
    And Input valid confirm password | Register
    And Click button register | Register
    Then At home page website | Register
