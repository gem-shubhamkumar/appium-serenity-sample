@step
Feature: Set the wifi Name with Steps

  Scenario Outline: Test for enter name successfully with Steps
    Given step open the wifi settings page
    When step should able to enter the name as "<name>"
    Then step close the application

    Examples:
      | name   |
      | Sample |