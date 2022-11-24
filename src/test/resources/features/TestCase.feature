@simple
Feature: Set the wifi Name

  Scenario Outline: Test for enter name successfully
    Given open the wifi settings page
    When should able to enter the name as "<name>"
    Then close the application

    Examples:
      | name   |
      | Sample |