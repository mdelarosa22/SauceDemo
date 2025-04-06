package pages;

public class HomePage extends BasePage {
    
    private String productsLabel = "//div[@class='product_label']";

    public HomePage(){
        super(driver);
    }

    public boolean isDisplayedLabelProducts(){
        return isDisplayed(productsLabel);
    }
}
