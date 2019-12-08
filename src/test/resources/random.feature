Feature: Select Random Jumper
  As an end user
  I want to select random Jumper
  So that I can find my desire jumper

  Scenario: Select Random Jumper from the screen
    Given I am on the search result page
    When I Select Random Jumper
    Then I should be able to see the Selected Jumper
