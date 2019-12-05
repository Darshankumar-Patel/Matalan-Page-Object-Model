Feature: Search
  As a user
  I want to search a item
  so that I can see the desired item

  Scenario: Search for a item
    Given I am on home page
    When I search for a "Christmas Jumpers"
    Then I should be able to see Christmas Jumpers page


