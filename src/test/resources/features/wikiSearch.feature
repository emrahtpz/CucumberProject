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

  Scenario: Wikipedia search functionality header verification
    Given user is on the Wikipedia home page
    When user writes "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user sees "Steve Jobs" in the main header


  @SO
  Scenario Outline: Wikipedia search functionality Image header verification
    Given user is on the Wikipedia home page
    When user writes "<searchValue>" in the wiki search box
    And user clicks wiki search button
    Then user sees "<expectedMainHeader>" in the image header
    Then user sees "<expectedTitle>" in the wiki title

    Examples: Search terms we are going to use in this template is as below
      | searchValue  | expectedMainHeader | expectedTitle |
      | Steve Jobs   | Steve Jobs         | Steve Jobs    |
      | Elon Musk    | Elon Musk          | Elon Musk     |
      | Mike Tyson   | Mike Tyson         | Mike Tyson    |
      | Marie Curie  | Marie Curie        | Marie Curie   |
      | Nikola Tesla | Nikola Tesla       | Nikola Tesla  |

