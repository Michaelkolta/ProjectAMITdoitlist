package Tests;

import Base.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;


// Scenario 3: Verify That User Can Delete a Task
public class DeleteTask extends BaseTest {


    // Locators
    private WebElement selectTask() throws InterruptedException {
        return driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(3)"));
    }
      private WebElement checkboxbutton(){
        return driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.CheckBox\")"));
    }

    private WebElement recyclebinbutton (){
        return driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(1)"));
    }
    // ------------------- TEST -------------------

    // Select the task
    public void SelectTask() throws InterruptedException {
        selectTask().click();
}
    // Mark the checkbox
    public void Checkbox(){
     checkboxbutton().click();
    }

    //Delete the task
    public void RecycleButton(){
        recyclebinbutton().click();
    }



}




