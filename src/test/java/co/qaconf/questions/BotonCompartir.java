package co.qaconf.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.qaconf.userinterfaces.ShortsPage.BOTON_COMPARTIR;

public class BotonCompartir implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return BOTON_COMPARTIR.resolveFor(actor).isVisible();
    }

    public static BotonCompartir esVisible() {
        return new BotonCompartir();
    }
}
