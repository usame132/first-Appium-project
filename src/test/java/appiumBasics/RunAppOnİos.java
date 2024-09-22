package appiumBasics;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class RunAppOnİos {

    @Test
    public  void  openAppOnIos() throws MalformedURLException {

        String userName="usamemuhammed_5ptqwx";
        String accessKey="V9k2CpeqLVZzeXLZSGop";

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", "ios");
        caps.setCapability("os_version", "14");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
        caps.setCapability("device", "iPhone 12");
        caps.setCapability("browserstack.user", "usamemuhammed_5ptqwx");
        caps.setCapability("browserstack.key", "V9k2CpeqLVZzeXLZSGop");
        caps.setCapability("app", "bs://b4abe9b959fe84af4b8728c37d02b25aa7e5f809");

        IOSDriver driver =new IOSDriver(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com"),caps);
        // C:\Users\Usame Muhammed\IdeaProjects\AppiumV\Bursev (1).ipa
    }
}