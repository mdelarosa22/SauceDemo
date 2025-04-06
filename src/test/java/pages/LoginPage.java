package pages;

public class LoginPage extends BasePage{
    //locators
    private String usernameTextBox = "//input[@id='user-name']";
    private String passwordTextBox = "//input[@id='password']";
    private String loginButton = "//input[@id='login-button']";
    private String errorValidation = "//h3[@data-test='error']";

    public LoginPage(){
        super(driver);
    }

    public void goToSauceDemoPage(String url){
        navigateTo(url);
    }

    public void sendUserName(String username){
        type(usernameTextBox, username);
    }

    public void sendPassword(String password){
        type(passwordTextBox, password);
    }

    public void clickLoginButton(){
        clickElement(loginButton);
    }

    public String errorValidation(){
        return getTextLocator(errorValidation);
    }
}
