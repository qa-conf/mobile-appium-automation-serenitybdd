package co.qaconf.tasks;

import co.qaconf.interactions.EscribirEnInputs;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.qaconf.userinterfaces.HomePage.CAMPO_BUSCAR_VIDEOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarVideo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_BUSCAR_VIDEOS),
                EscribirEnInputs.elTexto("Gol de Roberto Carlos")
        );
    }

    public static BuscarVideo enYoutube(){
        return instrumented(BuscarVideo.class);
    }
}
