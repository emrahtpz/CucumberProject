Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed
  Accounts are: librarian, student, admin



  Scenario: Login as librarian
     Given user is on the login page
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

  @wip
  Scenario: Login as Student
    Given user is on the login page
    When user enters student username
    And user enters student password
    Then user should see the dashboard