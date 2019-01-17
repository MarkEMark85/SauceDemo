import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By usernameInputField = By.xpath("//input[@data-test='username']");
    private By passwordInputField = By.xpath("//input[@data-test='password']");
    private By loginButton = By.className("login-button");

    public void navigateToPage(){
        driver = getDriver();
        driver.get("https://www.saucedemo.com/");
    }

    public void fillInUsernameField(String username){
        driver.findElement(usernameInputField).sendKeys(username);
    }

    public void fillInPasswordField(String passwd){
        driver.findElement(passwordInputField).sendKeys(passwd);
    }

    public void fillInLoginInfo(String username, String passwd){
        driver.findElement(usernameInputField).sendKeys(username);
        driver.findElement(passwordInputField).sendKeys(passwd);
    }

    public InventoryPage clickloginButton(){
        driver.findElement(loginButton).click();
        return new InventoryPage();
    }


}
