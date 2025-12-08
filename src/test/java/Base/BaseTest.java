package Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

    public static AppiumDriver driver;
    protected static WebDriverWait wait;

    // -------- Start Driver ----------
    public void startDriver() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appium:orientation", "PORTRAIT");
        caps.setCapability("appium:deviceName", "emulator-5554");
        caps.setCapability("appium:appPackage", "com.example.android.architecture.blueprints.main");
        caps.setCapability("appium:appActivity",
                "com.example.android.architecture.blueprints.main/com.example.android.architecture.blueprints.todoapp.TodoActivity");
        caps.setCapability("appium:noReset", true);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    // -------- Stop Driver ----------
    public void stopDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    // -------- Smart Wait Helpers ----------
    protected WebElement waitForElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void clickWhenReady(By locator) {
        waitForElement(locator).click();
    }

    protected void sendKeysWhenReady(By locator, String text) {
        waitForElement(locator).sendKeys(text);
    }
}
