package Tests;

import Base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionStateBuilder;


// Scenario 8: Validate Offline Functionality (if supported)
public class OfflineFunctionality {



    public void TurnOffInternet () throws InterruptedException {

        // TURN OFF Internet
        AndroidDriver androidDriver = (AndroidDriver) BaseTest.driver;
        androidDriver.setConnection(
                new ConnectionStateBuilder()
                        .withWiFiDisabled()
                        .withDataDisabled()
                        .build()
        );

        Thread.sleep(2000);

        // -------- Try to add and view tasks (Offline Mode) --------
        System.out.println("📝 Testing Add Task Without Internet...");

        // Example:
        // ClickAddButton();
        // EnterTaskTitle("Offline Task");
        // EnterTaskDescription(""Adding task while offline");
        // ClickSaveButton();

        Thread.sleep(2000);

        // Try to view tasks
        System.out.println("👀 Viewing Tasks While Offline...");
        // open list page (depends on your app, adjust locator)
        // e.g., driver.findElement(...).click();

        Thread.sleep(2000);

    }

    // TURN Internet back ON

    public void TurnOnInternet () throws InterruptedException {

        AndroidDriver androidDriver = (AndroidDriver) BaseTest.driver;
        androidDriver.setConnection(
                new ConnectionStateBuilder()
                        .withWiFiEnabled()
                        .withDataEnabled()
                        .build()
        );

        Thread.sleep(2000);


    }



}
