Feature: Run cucumber test
  As a developer,
  I want to run the cucumber test
  So that we can use the framework for BDD.

  Scenario: Hello Marco

    Given I am user Marco
    When I ask for a greeting
    Then I should be greeted with 'Hello Marco'
    
  Scenario: Hello to anonymous

    Given I am user anonymous
    When I ask for a greeting
    Then I should be greeted with 'Hello World'
    
    
    