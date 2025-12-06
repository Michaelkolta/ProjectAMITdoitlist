package Tests;

import Base.BaseTest;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;


//Scenario 1: Verify That User Can Add a New Task
public class BehaviorAfterScreenRotation extends BaseTest {


    public void BehaviorAfterScreenRotation() throws InterruptedException {
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(3)")).click();
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")).sendKeys("Add a New Task");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")).sendKeys("This test case verifies that the user is able to successfully add a new task in the application by entering a valid task title and description, then saving it. After saving, the new task should appear in the task list with the correct details.");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(1)")).click();


    }






}
