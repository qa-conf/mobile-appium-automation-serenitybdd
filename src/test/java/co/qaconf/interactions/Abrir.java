package co.qaconf.interactions;

import co.qaconf.utils.MenuEnum;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Abrir {

    public static Abrir laOpcion(){
        return new Abrir();
    }

    public AbrirOpcion principal(){
        return instrumented(AbrirOpcion.class, MenuEnum.PRINCIPAL);
    }

    public AbrirOpcion shorts(){
        return instrumented(AbrirOpcion.class, MenuEnum.SHORTS);
    }

    public AbrirOpcion suscripciones(){
        return instrumented(AbrirOpcion.class, MenuEnum.SUSCRIPCIONES);
    }

    public AbrirOpcion tu(){
        return instrumented(AbrirOpcion.class, MenuEnum.TU);
    }

    public AbrirOpcion library(){
        return instrumented(AbrirOpcion.class, MenuEnum.LIBRARY);
    }

    public AbrirOpcion historias(){
        return instrumented(AbrirOpcion.class, MenuEnum.HISTORIAS);
    }

}
