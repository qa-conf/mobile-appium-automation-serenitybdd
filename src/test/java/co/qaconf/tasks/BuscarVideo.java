package co.qaconf.tasks;

import co.qaconf.interactions.EscribirEnInputs;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.qaconf.userinterfaces.HomePage.CAMPO_BUSCAR_VIDEOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarVideo implements Task {

    private String videoBuscar;

    public BuscarVideo(String videoBuscar){
        this.videoBuscar = videoBuscar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_BUSCAR_VIDEOS),
                EscribirEnInputs.elTexto(videoBuscar)
        );
    }

    public static BuscarVideo enYoutube(String videoBuscar){
        return instrumented(BuscarVideo.class, videoBuscar);
    }
}
