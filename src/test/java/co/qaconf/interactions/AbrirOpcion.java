package co.qaconf.interactions;

import co.qaconf.utils.MenuEnum;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.qaconf.userinterfaces.HomePage.MENU_ANDROID;
import static co.qaconf.userinterfaces.HomePage.MENU_IOS;
import static co.qaconf.utils.MobileHelper.getPlatformName;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AbrirOpcion implements Interaction {

    private MenuEnum opcionMenu;

    public AbrirOpcion(MenuEnum opcionMenu){
        this.opcionMenu = opcionMenu;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String platform = getPlatformName();
        String valorPlataforma = opcionMenu.getValorSegunPlataforma(platform);
        if("Android".equals(platform)){
            actor.attemptsTo(
                    WaitUntil.the(MENU_ANDROID.of(valorPlataforma), isClickable())
                            .forNoMoreThan(10).seconds(),
                    Click.on(MENU_ANDROID.of(valorPlataforma))
            );
        }else {
            actor.attemptsTo(
                    WaitUntil.the(MENU_IOS.of(valorPlataforma), isClickable())
                            .forNoMoreThan(10).seconds(),
                    Click.on(MENU_IOS.of(valorPlataforma))
            );
        }
    }
}
