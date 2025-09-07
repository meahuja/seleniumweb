package practice.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class BaseTest {
    protected WebDriver driver;

@BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    //    driver.get("https://the-internet.herokuapp.com/login");
    }

@AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

