package co.qaconf.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class HomePage {

    public static final Target BOTON_BUSCAR = the("Boton de buscar en Youtube")
            .locatedBy("//android.widget.ImageView[@content-desc='Search']");

    public static final Target CAMPO_BUSCAR_VIDEOS = the("Campo para busqueda de videos")
            .located(AppiumBy.className("android.widget.EditText"));
}
