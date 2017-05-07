Feature: Login Feature

  Scenario: Sign In into Website
    When I open  website
    Then I Enter Username
    Then I ennter password
    Then I Click submit
    Then I am on Homepage of website
