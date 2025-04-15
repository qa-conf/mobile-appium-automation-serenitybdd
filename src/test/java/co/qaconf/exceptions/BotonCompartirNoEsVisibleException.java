package co.qaconf.exceptions;

public class BotonCompartirNoEsVisibleException extends AssertionError{

    public static final String MENSAJE_BOTON_COMPARTIR_NO_VISIBLE = "El boton en shorts, no esta visible";

    public BotonCompartirNoEsVisibleException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
