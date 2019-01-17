import org.testng.annotations.Test;

public class BaseTests extends BasePage {

    @Test
    public InventoryPage standardValidLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.navigateToPage();
        loginPage.fillInUsernameField("standard_user");
        loginPage.fillInPasswordField("secret_sauce");
        loginPage.clickloginButton();
        return new InventoryPage();
    }

}
