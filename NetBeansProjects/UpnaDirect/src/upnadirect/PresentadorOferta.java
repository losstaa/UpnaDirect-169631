package upnadirect;

import upnadirect.*;


public class PresentadorOferta {

    private VistaOferta view;
    private ServicioOfertas service;

    public PresentadorOferta(VistaOferta view) {
        this.view = view;
        this.service = new ServicioOfertas();
    }

    public void ofrecerMejorOferta(Cliente c, Bien b, int annoActual) {

        if (!c.esValido(annoActual) || !b.esValido()) {
            view.mostrarMensaje("Datos inválidos");
            return;
        }

        Oferta mejor = service.obtenerMejorOferta(c, b, annoActual);

        view.mostrarOferta(
            mejor.getNombreAseguradora() + " | " +
            mejor.getImporteSeguro() + " | " +
            mejor.getComision()
        );
    }
}
