package InitializationTest;

import VerificationFlow.LoginVerification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import practice.Pages.LoginPage;
import practice.base.BaseTest;
import practice.data.DataProviders;

import java.util.List;

public class LoginTest extends BaseTest {

    @Test(description = "sdf", dataProviderClass = DataProviders.class,dataProvider = "loginData")
    public void successfullLogin(String username, String password)
    {

        LoginVerification loginVerification = new LoginVerification();
        loginVerification.loginVerification(this.driver,username,password);

    }
    @Test
    public void dynamicdropdown() throws InterruptedException {
        driver.get("https://www.google.com/");
       WebElement searchBox= driver.findElement(By.name("q"));
       searchBox.sendKeys("Selenium Tutorial");
       List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role = 'listbox']//li"));
       for(WebElement suggestion : suggestions)
       {
           if(suggestion.getText().contains("selenium tutorial for beginners"))
           {
               Thread.sleep(6000);

               suggestion.click();

           }

       }

    }
}
