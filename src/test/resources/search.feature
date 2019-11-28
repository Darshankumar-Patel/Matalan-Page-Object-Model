Feature: Search
  As a user
  I want to search an item
  so that I can see the desired item

  Scenario: Search for an item
    Given I am on home page
    When I search for a "Boys school uniform"
    Then I should be able to see Boys school uniform page


