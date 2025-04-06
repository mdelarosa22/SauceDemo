package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    static{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
    }

    public static void navigateTo(String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

    public static void closeBrowser(){
        driver.quit();
    }

    public WebElement Find(String locator){
         return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    public void clickElement(String locator){
        Find(locator).click();
    }

    public void type(String locator, String keysToSend){
        Find(locator).sendKeys(keysToSend);
    }

    public void SelectFromDropdownByValue(String locator, String value){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByValue(value);
    }

    public void SelectFromDropdownByIndex(String locator, Integer index){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByIndex(index);
    }

    public String getTextLocator(String locator){
        return Find(locator).getText();
    }
}
