## Automation project created with Selenium WebDriver, Java, Cucumber, TestNG, Gradle in Visual Studio Code
### This project includes test cases to test different positive and negative scenarios in a login page
### Pre requisites
- To run this project the first step is install [java jdk 21](https://www.oracle.com/java/technologies/downloads/#java21) and configure the environment variables (JAVA_HOME).
- The next steps is install gradle from [gradle page](https://gradle.org/install/)
- Install [git bash](https://git-scm.com/downloads)

### Installing the project
- Once you have installed java and gradle you can clone the project with the following command and the project github url 
```
    git clone
```

### Run project
- Project can be execute from the runner file located in 'src/test/java/runner/TestRunner.java' by clicking on 'Click to run tests' (green arrow in public class TestRunner)

## Documentation
- This project was build in **Page Object Model** design pattern that means that there is a BasePage that includes all the **Selenium Webdriver** code, that way we can give easily maintenance to the project. 
- Each class included in pages package are a subclass of **BasePage** (extends BasePage) and includes the locators and the functions that these the page needs. Examples of classes: LoginPage, HomePage.
- The building tool used was **Gradle**, and all dependencies are in build.gradle file.
Resources package includes the **Cucumber** feature files, that explain every step that the test case are executing in gherkin format and can be easily understanded. Here is an example:
    
             Scenario Outline: Empty username and correct password
                When I add a correct <password>
                And I click on login button
                Then I should see empty username field validation

                Examples:
                    |username       |   password     |
                    |standard_user  |  secret_sauce  |


- This demo includes different posible scenarios that can be applied to SauceDemo LoginPage.

- If you want to execute Home.feature test case please comment **@Login** tag in SauceDemo.feature and uncomment that line in Home.feature file.

- After run the project the results you can access to the report from Debug Console in terminal, a link shall be created an this could be opened in a browser.