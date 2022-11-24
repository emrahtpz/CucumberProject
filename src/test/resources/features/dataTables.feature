Feature:  Examples of Cucumber data table implementation


  Scenario: Sometime happens
    #Given user does something
    Then user should see below words displayed
      | Apple      | 21kg |
      | Kiwi       | 2kg  |
      | Orange     | 3kg  |
      | Strawberry | 3kg  |
      | Mango      | 7kg  |
      | Tomato     | 3kg  |
      | Cucumber   | 4kg  |

  @wip
  Scenario: Library login example using data table
    Given user is on the login page of library app
    When user enters username and password as below
      | username | student17@library |
      | password | 0UID4kr8          |
    Then user should see title is Library

