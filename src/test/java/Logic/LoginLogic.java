package Logic;

import org.openqa.selenium.WebDriver;
import practice.Pages.LoginPage;

public class LoginLogic extends LoginPage {



public void Login(WebDriver driver, String username, String password) {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.userName.sendKeys(username);
   loginPage.password.sendKeys(password);
   loginPage.loginbutton.click();
}
}
