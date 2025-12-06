package Tests;

import Base.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;

//Scenario 4: Verify That User Can Mark a Task as Completed
public class MarkTaskComplete extends BaseTest {


        // Locator
        private WebElement markcompletecheckbox() {
            return driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.CheckBox\").instance(0)"));

        }


        // ------------------- TEST -------------------

    public void Markcompletecheckbox(){
            markcompletecheckbox().click();
    }

















}
