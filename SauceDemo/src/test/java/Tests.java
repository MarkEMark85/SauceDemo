import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Tests extends BaseTests {
    @Test
    public void addToCartTest(){
        SoftAssert softAssert = new SoftAssert();
        InventoryPage inventoryPage = standardValidLogin();
        assert
                inventoryPage.isCurrentPage();
        inventoryPage.addSauceLabsOnesieToCart();
        inventoryPage.addSauceLabsBikeLightToCart();
        ShoppingCartPage shoppingCartPage = inventoryPage.clickShoppingCartButton();
        assert
                shoppingCartPage.isCurrentPage();
        softAssert.assertTrue(shoppingCartPage.checkIfBikeLightAddedToCart());
        softAssert.assertTrue(shoppingCartPage.checkIfOnesieAddedToCart());
        softAssert.assertAll();

    }
}
