package co.qaconf.stepdefinitions;

import co.qaconf.exceptions.BotonCompartirNoEsVisibleException;
import co.qaconf.interactions.Abrir;
import co.qaconf.questions.BotonCompartir;
import co.qaconf.tasks.BuscarVideo;
import net.serenitybdd.annotations.Pending;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static co.qaconf.exceptions.BotonCompartirNoEsVisibleException.MENSAJE_BOTON_COMPARTIR_NO_VISIBLE;
import static co.qaconf.userinterfaces.HomePage.BOTON_BUSCAR;
import static co.qaconf.userinterfaces.ShortsPage.BOTON_COMPARTIR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

@ExtendWith(SerenityJUnit5Extension.class)
public class BuscarVideoEnYoutube {

    @Test
    @DisplayName("Buscar un video de futbol en Youtube")
    public void buscarVideoFutbolEnYoutube() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Juan").attemptsTo(
                WaitUntil.the(BOTON_BUSCAR, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_BUSCAR),
                BuscarVideo.enYoutube()
        );
    }

    @Test
    @DisplayName("Verificar la navegacion por las opciones de Menud e yOutube como Suscripciones y Principal")
    public void abrirOpcionesMenu() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Juan").attemptsTo(
                Abrir.laOpcion().suscripciones()
        );
        theActorInTheSpotlight().attemptsTo(
                Abrir.laOpcion().principal()
        );
    }


    @Test
    @DisplayName("Verificar que en Shorts la opcion COMPARTIR esta visible - Usando Question")
    public void verificarBotonCompartirEnShortsConQuestion() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Juan").attemptsTo(
                Abrir.laOpcion().shorts()
        );
        theActorInTheSpotlight().should(seeThat(
                BotonCompartir.esVisible()
        ).orComplainWith(BotonCompartirNoEsVisibleException.class, MENSAJE_BOTON_COMPARTIR_NO_VISIBLE)
        );
    }


    @Test
    @DisplayName("Verificar que en Shorts la opcion COMPARTIR esta visible - Usando Ensure")
    public void verificarBotonCompartirEnShortsConEnsure() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Juan").attemptsTo(
                Abrir.laOpcion().shorts()
        );
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(BOTON_COMPARTIR).isDisplayed()
        );
    }
}
