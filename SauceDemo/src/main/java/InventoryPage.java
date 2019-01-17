import org.openqa.selenium.By;

public class InventoryPage extends BasePage {

    private By sauceLabsBikeLight = By.xpath("//a[@id='item_0_img_link']/../../div/button");
    private By cartButton = By.className("shopping_cart_link");
    private By sauceLabsOnesie = By.xpath("//a[@id='item_2_img_link']/../../div/button");
    private By productLabel = By.xpath("//div[@class='product_label']");


    public void addSauceLabsBikeLightToCart(){
        driver.findElement(sauceLabsBikeLight).click();
    }

    public void addSauceLabsOnesieToCart(){
        driver.findElement(sauceLabsOnesie).click();
    }

    public ShoppingCartPage clickShoppingCartButton(){
        driver.findElement(cartButton).click();
        return new ShoppingCartPage();
    }

    public Boolean isCurrentPage(){
       return checkIfExists(driver, productLabel);
    }

}
