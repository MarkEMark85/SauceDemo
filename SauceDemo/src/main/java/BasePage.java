import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BasePage {

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mark\\Downloads\\chromedriver_win32\\chromedriver.exe");
    }

    static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    @AfterMethod(alwaysRun = true)
    public void cleanUpMethod() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
        driver = null;
    }

    public boolean checkIfExists(WebDriver driver, By by) {
        try {
            driver.findElement(by);
        } catch (NoSuchElementException ex) {

            return false;
        }
        return true;
    }
}
