Feature: As a user I want to use menu sections

  @Smoke
  Scenario Outline: Docs sections should contain appropriate columns
    Given the user opens Cucumber website
    When the user clicks on the "Docs" section
    And the user clicks on the "<title>" item
    Then page with title "<title>" is displayed
    Examples:
      | title          |
      | Gherkin Syntax |
      | Installation   |