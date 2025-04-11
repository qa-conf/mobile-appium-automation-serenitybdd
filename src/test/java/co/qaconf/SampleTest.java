package co.qaconf;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SampleTest {

    private AppiumDriver driver;

    @BeforeEach
    public void configuracionAppium() throws MalformedURLException {
        XCUITestOptions options = new XCUITestOptions()
                .setPlatformName("iOS")
                .setUdid("00008101-0015254A36A0001E")
                .setPlatformVersion("18.3.2")
                .setBundleId("com.google.ios.youtube")
                .setAutoAcceptAlerts(true);

        driver = new IOSDriver(new URL("http://127.0.0.1:4723/"), options);
    }

    @Test
    void sampleTestSerenity(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement lupaYoutube = wait.until(
                ExpectedConditions.presenceOfElementLocated(AppiumBy.iOSNsPredicateString("name == 'id.ui.navigation.search.button'"))
        );
        lupaYoutube.click();
    }
}
