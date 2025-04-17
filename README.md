## Automation project 
### Pre requisites
*To run this project the first step is install [java jdk 21](https://www.oracle.com/java/technologies/downloads/#java21) and configure the environment variables (JAVA_HOME).
*The next steps is install gradle from [gradle page](https://gradle.org/install/)
*Install [git bash](https://git-scm.com/downloads) 

###Installing the project 
*Once you have installed java and gradle you can clone the project with the following command and the project github url 
```
    git clone
```

###Run project
Project can be execute from the runner file located in 'src/test/java/runner/TestRunner.java' by clicking on 'Click to run tests' (green arrow in public class TestRunner)

## Documentation
This project was build in Page Object Model design pattern that means that there is a BasePage that includes all the Selenium code, that way we can give easily maintenance to the project. Each class included in pages package are a subclass of BasePage (extends BasePage) and includes the locators and the functions that these the page needs. Examples of classes: LoginPage, HomePage.
The building tool used was gradle, and all dependencies are in build.gradle file.
Resources package includes the cucumber feature files, that explain every step that the test case are executing in gherkin format and can be easily understanded. Here is an example:
    
    Scenario Outline: Empty username and correct password
            When I add a correct <password>
            And I click on login button
            Then I should see empty username field validation

            Examples:
                |username       |   password     |
                |standard_user  |  secret_sauce  |