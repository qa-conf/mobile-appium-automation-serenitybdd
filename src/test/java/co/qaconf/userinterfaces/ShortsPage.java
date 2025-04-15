package co.qaconf.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ShortsPage {
    public static final Target BOTON_COMPARTIR = the("Boton de compartir en Youtube")
            .locatedForAndroid(AppiumBy.accessibilityId("Share this video"))
            .locatedForIOS(AppiumBy.iOSClassChain("**/XCUIElsasasaementTypeButton[`name == 'id.reel_share_button'`][2]"));
}
