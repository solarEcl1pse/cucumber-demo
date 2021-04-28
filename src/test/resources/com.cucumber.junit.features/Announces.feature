Feature: As a user I want to use site search

  Scenario: Site search should display appropriate query result
    Given the user opens Cucumber website
    When the user clicks on the Search icon
    And the user types "Announces" to the search field
    And the user clicks on the "Blog" result section
    And the user clicks on the first Open Source link
    Then page with "Announcing cucumber-electron" title is displayed