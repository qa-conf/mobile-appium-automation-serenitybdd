package co.qaconf.stepdefinitions;

import co.qaconf.tasks.BuscarVideo;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.qaconf.userinterfaces.HomePage.BOTON_BUSCAR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class BuscarVideoEnYoutubeStepDefinition {

    @Dado("que Juan esta en la app")
    public void queJuanEstaEnLaApp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("busco el {string}")
    public void buscoVideoYoutube(String videoBuscar) {
        theActorCalled("Juan").attemptsTo(
                WaitUntil.the(BOTON_BUSCAR, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_BUSCAR),
                BuscarVideo.enYoutube(videoBuscar)
        );
    }
    @Entonces("deberia de ver una lista de videos que quiera ver")
    public void deberiaDeVerUnaListaDeVideosQueQuieraVer() {

    }
}
