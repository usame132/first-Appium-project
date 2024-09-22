package appiumBasics;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class RunAppUsingPackage {

    @Test
    public void openApp() throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"usame");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.deskclock.DeskClock");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.deskclock");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),caps);
//        driver.findElement(By.id("com.google.android.deskclock:id/fab")).click(); // id ile clock e tıklama
//        Thread.sleep(3000);
//        driver.findElement(By.className("android.widget.EditText")).sendKeys("ankara");

            driver.findElement(MobileBy.AccessibilityId("Timer")).click();;
    }
}
