@Navigation
Feature: Login to SauceDemo page

    Go to saucedemo and test successfull and unsuccessfull Login


    Scenario Outline: Empty username and correct password
        Given  I go to saucedemo page
        When I add a correct <password>
        And I click on login button
        Then I should see empty username field validation

        Examples:
            |username       |   password     |
            |standard_user  |  secret_sauce  |
            

    Scenario Outline: Correct username and empty password
        Given  I go to saucedemo page
        When I add a valid <username>
        And I click on login button
        Then I should see empty password field validation

        Examples:
            |username       |   password     |
            |standard_user  |  secret_sauce  |



    