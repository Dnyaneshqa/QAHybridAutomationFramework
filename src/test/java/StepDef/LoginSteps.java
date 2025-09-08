package StepDef;

import io.cucumber.java.en.*;
import managers.DriverManager;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {
    private WebDriver driver;
    private PageObjectManager pageObjectManager;
    private LoginPage loginPage;
    private HomePage homePage;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver = DriverManager.getDriver();
        driver.get("https://www.saucedemo.com/");
        pageObjectManager = new PageObjectManager(driver);
        loginPage = pageObjectManager.getLoginPage();
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("clicks login button")
    public void clicks_login_button() {
        loginPage.clickLogin();
    }

    @Then("user should see homepage")
    public void user_should_see_homepage() {
        homePage = pageObjectManager.getHomePage();
        assert homePage.getHomePageTitle().contains("Products");
    }
}
