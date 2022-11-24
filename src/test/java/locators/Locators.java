package locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class Locators {

    public static By option_preference = AppiumBy.accessibilityId("Preference");
    public static By option_prefDependencies = AppiumBy.xpath("//android.widget.TextView[" +
            "@content-desc='3. Preference dependencies']");
    public static By checkBox_Wifi = AppiumBy.id("android:id/widget_frame");
    public static By option_wifiSettings = AppiumBy.xpath("(//android.widget.RelativeLayout)[2]");
    public static By input_wifiName = AppiumBy.id("android:id/edit");
    public static By alert_buttons = AppiumBy.className("android.widget.Button");

}
