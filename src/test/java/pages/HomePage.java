package pages;

public class HomePage extends BasePage {
    
    private String productsLabel = "//div[@class='product_label']";
    private String selectOrder = "//select[@class='product_sort_container']";
    private String products = "//div[@class=\"inventory_item_name\"]";
   
    public HomePage(){
        super(driver);
    }

    public boolean isDisplayedLabelProducts(){
        return isDisplayed(productsLabel);
    }

    public void selectOrderByValue(String value){
        SelectFromDropdownByValue(selectOrder, value);
    }

    public int getProductsAmount(){
        return getSize(products);
    }

}
