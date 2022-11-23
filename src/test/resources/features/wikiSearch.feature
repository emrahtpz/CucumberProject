Feature: Wikipedia search functionality
  As a user, I should be able to search terms and see relevant information
  Case: Search for "Steve Jobs", the title, the header, and the image header
  should be displayed as "Steve Jobs"


  Scenario: Wikipedia search functionality title verification
    Given user is on the Wikipedia home page
    When user writes "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user sees "Steve Jobs" in the wiki title

  Scenario: Wikipedia search functionality header verification
    Given user is on the Wikipedia home page
    When user writes "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user sees "Steve Jobs" in the main header


  @wip
  Scenario: Wikipedia search functionality Image header verification
    Given user is on the Wikipedia home page
    When user writes "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user sees "Steve Jobs" in the image header

