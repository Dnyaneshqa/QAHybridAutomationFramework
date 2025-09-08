package StepDef.mobileStepDef;


import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.MobileDriverManager;
import pages.mobile.MobileLoginPage;

import static org.testng.Assert.assertTrue;

public class MobileSteps {

    private AppiumDriver driver;
    private MobileLoginPage mobileLoginPage;

    @Given("I launch the mobile app")
    public void i_launch_the_mobile_app() throws Exception {
        driver = MobileDriverManager.getDriver();
        mobileLoginPage = new MobileLoginPage(driver);
    }

    @When("I login with username {string} and password {string}")
    public void i_login_with_username_and_password(String username, String password) {
        mobileLoginPage.login(username, password);
    }

    @Then("I should see the home screen")
    public void i_should_see_the_home_screen() {
        // Example check: validate Home Screen element visible
        assertTrue(driver.getPageSource().contains("Home"));
    }
}
