import org.openqa.selenium.By;

public class ShoppingCartPage extends BasePage {

    private By yourCart = By.xpath("//div[@id='cart_contents_container']");
    private By sauceLabsBikeLight = By.xpath("//a[@id='item_0_title_link']");
    private By sauceLabsOnesie = By.xpath("//a[@id='item_2_title_link']");


    public Boolean isCurrentPage(){
        return checkIfExists(driver, yourCart);
    }

    public Boolean checkIfBikeLightAddedToCart(){
        return checkIfExists(driver, sauceLabsBikeLight);
    }

    public Boolean checkIfOnesieAddedToCart(){
        return checkIfExists(driver, sauceLabsOnesie);
    }
}
