package Tests;

import Base.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



// Scenario 2: Verify That User Can Edit an Existing Task
public class EditExistingTask extends BaseTest {
    AddNewTask addNewTask;

    // ---------- Locators ----------
    private WebElement selectAddNewTask() {
        return driver.findElement(AppiumBy.androidUIAutomator(
                "new UiSelector().text(\"Add a New Task\")"));
    }

    private WebElement editTaskButton() {
        return driver.findElement(AppiumBy.androidUIAutomator(
                "new UiSelector().className(\"android.widget.Button\").instance(2)"));
    }

    private WebElement updateTitle() {
        return driver.findElement(AppiumBy.androidUIAutomator(
                "new UiSelector().text(\"Add a New Task\")"));
    }

    private WebElement updateDescription() {
        return driver.findElement(AppiumBy.androidUIAutomator(
                "new UiSelector().text(\"This test case verifies that the user is able to successfully add a new task in the application by entering a valid task title and description, then saving it. After saving, the new task should appear in the task list with the correct details.\")"));
    }

    private WebElement saveButton() {
        return driver.findElement(AppiumBy.androidUIAutomator(
                "new UiSelector().className(\"android.widget.Button\").instance(1)"));
    }

    // ---------- TEST STEPS ----------

    public void SelectAddaNewTask() throws InterruptedException {
        selectAddNewTask().click();
        Thread.sleep(1000);
    }



    public void EditTaskbutton() throws InterruptedException {
        editTaskButton().click();
        Thread.sleep(1000);
    }


    public void UpdateTexttitle() throws InterruptedException {
        updateTitle().clear();
        Thread.sleep(1000);
        addNewTask = new AddNewTask();
        addNewTask.titleField().sendKeys("Edited Existing Task");
        Thread.sleep(1000);


    }


    public void UpdateDescription() throws InterruptedException {
        updateDescription().clear();
        Thread.sleep(1000);
        addNewTask.descriptionField().sendKeys("Update Existing Task to new description");
        Thread.sleep(1000);
    }


    public void Savebutton() {
        saveButton().click();
    }
}
