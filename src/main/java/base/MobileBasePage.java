package base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MobileBasePage {

    protected AppiumDriver<AndroidElement> driver;
    private WebDriverWait wait;

    public MobileBasePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // ✅ Wait for element to be visible
    protected WebElement waitForVisibility(By locator) {
        return (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // ✅ Click element
    protected void click(By locator) {
        waitForVisibility(locator).click();
    }

    // ✅ Type text
    protected void type(By locator, String text) {
        WebElement element = waitForVisibility(locator);
        element.clear();
        element.sendKeys(text);
    }

    // ✅ Get element text
    protected String getText(By locator) {
        return waitForVisibility(locator).getText();
    }

    // ✅ Check if element is displayed
    protected boolean isDisplayed(By locator) {
        try {
            return waitForVisibility(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}