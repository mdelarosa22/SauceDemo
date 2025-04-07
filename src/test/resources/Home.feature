@Navigation
Feature: Test home page functionalities

    Scenario Outline: Verify the count of products displayed
        Given I go to saucedemo page
        When I add a valid <username>
        When I add a correct <password>
        And I click on login button
        Then I should see the correct amount of products

        Examples:
            |username       |   password     |
            |standard_user  |  secret_sauce  |
