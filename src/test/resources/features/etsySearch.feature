Feature: Etsy search feature


  Scenario: Etsy default title verification
    Given user is on the Etsy landing page
    Then user should see Etsy title as expected

    #expected: Etsy Turkey - Shop for handmade, vintage, custom, and unique gifts for everyone


  Scenario: Etsy search functionality title verification
    Given user is on the Etsy landing page
    When use types Wooden spoon in the search bar
    And user clicks the search button
    Then user sees title is Wooden spoon - Etsy
