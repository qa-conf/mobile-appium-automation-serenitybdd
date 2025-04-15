package co.qaconf.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class HomePage {

    public static final Target BOTON_BUSCAR = the("Boton de buscar en Youtube")
            .locatedForAndroid(AppiumBy.xpath("//android.widget.ImageView[@content-desc='Search']"))
            .locatedForIOS(AppiumBy.iOSNsPredicateString("name == 'id.ui.navigation.search.button'"));

    public static final Target CAMPO_BUSCAR_VIDEOS = the("Campo para busqueda de videos")
            .locatedForAndroid(AppiumBy.className("android.widget.EditText"))
            .locatedForIOS(AppiumBy.className("XCUIElementTypeSearchField"));

    public static final Target MENU_IOS = the("Opcion general de menu en Youtube")
            .locatedBy("//XCUIElementTypeButton[@label='{0}']");

    public static final Target MENU_ANDROID = the("Opcion general de menu en Youtube")
            .locatedBy("//android.widget.TextView[@text='{0}']");

}
