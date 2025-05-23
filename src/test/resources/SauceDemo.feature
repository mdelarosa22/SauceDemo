@Login
Feature: Login to SauceDemo page

    Go to saucedemo and test successfull and unsuccessfull Login

    Background: Navigate to saucedemo page
        Given  I go to saucedemo page


    Scenario Outline: Empty username and correct password
        When I add a correct <password>
        And I click on login button
        Then I should see empty username field validation

        Examples:
            |username       |   password     |
            |standard_user  |  secret_sauce  |


    Scenario Outline: Correct username and empty password
        When I add a valid <username>
        And I click on login button
        Then I should see empty password field validation

        Examples:
            |username       |   password     |
            |standard_user  |  secret_sauce  |


    Scenario Outline: Invalid username and correct password
        When I add a invalid <username>
        When I add a correct <password>
        And I click on login button
        Then I should see incorrect credentials validation

        Examples:
            |username   |   password     |
            |user       |  secret_sauce  |


    Scenario Outline: Valid username and incorrect password
        When I add a valid <username>
        When I add an incorrect <password>
        And I click on login button
        Then I should see incorrect credentials validation

        Examples:
            |username       |   password    |
            |standard_user  |   pass        |


    Scenario Outline: Valid credencials but locked user
        When I add a valid <username>
        When I add a correct <password>
        And I click on login button
        Then I should see locked user validation

        Examples:
            |username         |   password        |
            |locked_out_user  |   secret_sauce    |
            

    Scenario Outline: Valid credencials successfull login
        When I add a valid <username>
        When I add a correct <password>
        And I click on login button
        Then I should see homepage correctly

        Examples:
            |username       |   password        |
            |standard_user  |   secret_sauce    |
