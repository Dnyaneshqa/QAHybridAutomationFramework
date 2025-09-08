package pages.mobileui;

import base.MobileBasePage;

import org.openqa.selenium.By;

public class MobileLoginPage extends MobileBasePage {

    // Locators
    private By usernameField = By.id("com.example.app:id/username");
    private By passwordField = By.id("com.example.app:id/password");
    private By loginButton   = By.id("com.example.app:id/loginBtn");

    public MobileLoginPage(AppiumDriver<AndroidElement> driver) {
        super(driver);
    }

    public void login(String username, String password) {
        type(usernameField, username);
        type(passwordField, password);
        click(loginButton);
    }
}
