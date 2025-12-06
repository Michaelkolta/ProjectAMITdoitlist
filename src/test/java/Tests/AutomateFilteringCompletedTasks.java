package Tests;

import Base.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.nio.file.Watchable;

//Scenario 5: Automate Filtering Completed Tasks
public class AutomateFilteringCompletedTasks extends BaseTest {

    //Locators
    private WebElement widgetButton() {

        return driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(1)"));
    }

    private WebElement completedbutton() {
        return driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Completed\")"));
    }


// ------------------- TEST -------------------

    public void WidgetButton() throws InterruptedException {
        widgetButton().click();
        Thread.sleep(1000);
    }

    public void CompleteButton (){
        completedbutton().click();
    }

}