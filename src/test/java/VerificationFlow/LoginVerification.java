package VerificationFlow;

import Logic.LoginLogic;
import org.openqa.selenium.WebDriver;

public class LoginVerification {

    public void loginVerification(WebDriver driver, String username, String password) {
        LoginLogic loginLogic = new LoginLogic();
        loginLogic.Login(driver, username, password);

    }
}
