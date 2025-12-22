package upnadirect;

public class VistaFalsa implements VistaOferta {

    public String ultimoTexto;

    @Override
    public void mostrarMensaje(String msg) {}

    @Override
    public void mostrarOferta(String texto) {
        ultimoTexto = texto;
    }
}
