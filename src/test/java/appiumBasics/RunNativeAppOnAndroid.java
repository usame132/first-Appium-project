package appiumBasics;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class RunNativeAppOnAndroid {


    @Test
    public void openApp() throws MalformedURLException {

        DesiredCapabilities caps= new DesiredCapabilities();
         // caps.setCapability("deviceName","usame");
         // caps.setCapability("app","C:\\Users\\Usame Muhammed\\IdeaProjects\\AppiumV\\ApiDemos-debug.apk");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"usame");
        caps.setCapability(MobileCapabilityType.APP,"C:\\\\Users\\\\Usame Muhammed\\\\IdeaProjects\\\\AppiumV\\\\ApiDemos-debug.apk");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),caps);


    }
}
