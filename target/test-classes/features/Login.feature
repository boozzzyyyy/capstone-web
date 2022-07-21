Feature: Login

  Scenario: As user i able to be succesfully login
    Given At login page website | Login
    When Input valid email | Login
    And Input valid password | Login
    And Click button login | Login
    Then At home page website | Login
