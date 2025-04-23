package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {
    LoginPage login = new LoginPage();
    HomePage home = new HomePage();

    @Given("^(?:I|The user|The client) go to saucedemo page$")
    public void IGoToSauceDemoPage(){
        login.goToSauceDemoPage("https://www.saucedemo.com/v1/");
    }

    @When("I add a correct {word}")
    public void IAddACorrectPassword(String password){
        login.sendPassword(password);
    }
    
    @And("^(?:I|The user|The client) clicks? on login button$")
    public void IClickOnLoginButton(){
        login.clickLoginButton();
    }

    @Then("^(?:I|The user|The client) should see empty username field validation$")
    public void IShouldSeeEmptyUsername(){
        String requiredUserValidation = "Epic sadface: Username is required";
        Assert.assertEquals(requiredUserValidation, login.errorValidation());
    }

    @When("I add a valid {word}")
    public void IAddACorrectUsername(String username){
        login.sendUserName(username);
    }

    @Then("^(?:I|The user|The client) should see empty password field validation$")
    public void IShouldSeeEmptyPassword(){
        String requiredPasswordValidation = "Epic sadface: Password is required";
        Assert.assertEquals(requiredPasswordValidation, login.errorValidation());
    }

    @When("I add a invalid {word}")
    public void IAddIncorrectUsername(String username){
        login.sendUserName(username);
    }

    @Then("^(?:I|The user|The client) should see incorrect credentials validation$")
    public void IShouldSeeIncorrectCredentialsValidation(){
        String incorrectUsernameValidation = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(incorrectUsernameValidation, login.errorValidation());
    }

    @When("I add an incorrect {word}")
    public void IAddAnIncorrectPassword(String password){
        login.sendPassword(password);
    }

    @Then("^(?:I|The user|The client) should see homepage correctly$")
    public void IShouldSeeHomePage(){
        Assert.assertTrue(home.isDisplayedLabelProducts());
    }

    @Then("^(?:I|The user|The client) should see locked user validation$")
    public void IShouldSeeLockedValidation(){
        String lockedUserValidation = "Epic sadface: Sorry, this user has been locked out.";
        Assert.assertEquals(lockedUserValidation, login.errorValidation());
    }

}
