package steps;

import org.testng.Assert;
import io.cucumber.java.en.Then;
import pages.HomePage;

public class HomeSteps {
    HomePage home = new HomePage();

    @Then("^I should see the correct amount of products$")
    public void IShouldSeeTheCorrectAmountProducts(){
        int expectedAmountOfProducts = 6;
        Assert.assertEquals(expectedAmountOfProducts, home.getProductsAmount());
    }
}
