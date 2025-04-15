package co.qaconf.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import static co.qaconf.userinterfaces.HomePage.CAMPO_BUSCAR_VIDEOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EscribirEnInputs implements Interaction {

    private String nombreVideo;

    public EscribirEnInputs(String nombreVideo){
        this.nombreVideo = nombreVideo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombreVideo).into(CAMPO_BUSCAR_VIDEOS)
        );
    }

    public static EscribirEnInputs elTexto(String nombreVideo){
        return instrumented(EscribirEnInputs.class, nombreVideo);
    }
}
