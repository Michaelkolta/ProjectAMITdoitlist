package Tests;

import Base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

// Scenario 6: Verify App Behavior After Screen Rotation
public class ScreenRotationTask extends BaseTest {


    // Functions

    // Rotate to LANDSCAPE
    private void rotateLandscape() {
        ((AndroidDriver) driver).rotate(ScreenOrientation.LANDSCAPE);
    }

    private void rotatePortrait() {
        ((AndroidDriver) driver).rotate(ScreenOrientation.PORTRAIT);
    }



    // ------Test action ----
    // Rotate to landscape
    public void RotateLandscape() throws InterruptedException {
        rotateLandscape();
        Thread.sleep(2000);
    }
    public void RotatePortrait() throws InterruptedException {
        // Rotate back to portrait
        rotatePortrait();
        Thread.sleep(2000);
    }
}







