package Tests;

import Base.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

// Scenario 1: Verify That User Can Add a New Task
public class AddNewTask extends BaseTest {

    // Locators
    private WebElement addButton() {
        return driver.findElement(AppiumBy.androidUIAutomator(
                "new UiSelector().className(\"android.widget.Button\").instance(3)"
        ));
    }

    public WebElement titleField() {
        return driver.findElement(AppiumBy.androidUIAutomator(
                "new UiSelector().className(\"android.widget.EditText\").instance(0)"
        ));
    }

    public WebElement descriptionField() {
        return driver.findElement(AppiumBy.androidUIAutomator(
                "new UiSelector().className(\"android.widget.EditText\").instance(1)"
        ));
    }

    private WebElement saveButton() {
        return driver.findElement(AppiumBy.androidUIAutomator(
                "new UiSelector().className(\"android.widget.Button\").instance(1)"
        ));
    }

    // ------------------- TEST -------------------

    public void AddNewTaskTest() throws InterruptedException {

        Thread.sleep(1000);

        // Step 1: Click Add button
        addButton().click();
    }
    public void EnterTitle() throws InterruptedException {

        // Step 2: Enter Title
        titleField().sendKeys("Add a New Task");
    }
    public void EnterTitle2() throws InterruptedException {
        Thread.sleep(1000);
        // Step 2: Enter Title
        titleField().sendKeys("Add a New Task2");
    }

    public void EnterDescription() throws InterruptedException {
        // Step 3: Enter Description
        descriptionField().sendKeys(
                "This test case verifies that the user is able to successfully add a new task "
                        + "in the application by entering a valid task title and description, then saving it. "
                        + "After saving, the new task should appear in the task list with the correct details."
        );
    }

    public void EnterDescription2() throws InterruptedException {
        // Step 3: Enter Description
        Thread.sleep(1000);
        descriptionField().sendKeys(
                "This test case verifies that the user is able to successfully add a new task "
                        + "in the application by entering a valid task title and description, then saving it. "
                        + "After saving, the new task should appear in the task list with the correct details."
        );
    }
    public void ClickSave() throws InterruptedException {
        // Step 4: Click Save
        saveButton().click();
    }
}
