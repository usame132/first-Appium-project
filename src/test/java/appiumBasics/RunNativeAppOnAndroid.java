package appiumBasics;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class RunNativeAppOnAndroid {


    @Test
    public void openApp() throws MalformedURLException {

        File app= new File("ApiDemos-debug.apk");

        DesiredCapabilities caps= new DesiredCapabilities();
        //  caps.setCapability("deviceName","usame"); // Mobile Capability Type kullanmak daha sağlıklı olur, string hatalardan kaçınmak için.
        // caps.setCapability("app","C:\\Users\\Usame Muhammed\\IdeaProjects\\AppiumV\\ApiDemos-debug.apk");
        // caps.setCapability("automationName","UiAutomator2");
         caps.setCapability(MobileCapabilityType.DEVICE_NAME,"usame");
         caps.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
         caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),caps); // Appiumun eski versiyonlarında server sonunua wd/hub ekleniyordu "http://127.0.0.1:4723/wd/hub"


    }
}
