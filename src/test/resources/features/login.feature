@regression
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed
  Accounts are: librarian, student, admin

  Background:
    Given user is on the login page

    @librarian
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

    @student
  Scenario: Login as Student
    When user enters student username
    And user enters student password
    Then user should see the dashboard

    @admin
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard