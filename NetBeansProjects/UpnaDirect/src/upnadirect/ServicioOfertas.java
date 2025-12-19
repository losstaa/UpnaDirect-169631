package upnadirect;

import upnadirect.*;

public class ServicioOfertas {

    private Aseguradora[] aseguradoras;

    public ServicioOfertas() {
        aseguradoras = new Aseguradora[3];
        aseguradoras[0] = new Mafro();
        aseguradoras[1] = new LineaIndirecta();
        aseguradoras[2] = new Adasles();
    }

    public Oferta obtenerMejorOferta(Cliente c, Bien b, int annoActual) {
        Oferta mejor = null;

        for (int i = 0; i < aseguradoras.length; i++) {
            Oferta actual = aseguradoras[i].calcularOferta(c, b, annoActual);

            if (mejor == null ||
                actual.getImporteSeguro() < mejor.getImporteSeguro() ||
                (actual.getImporteSeguro() == mejor.getImporteSeguro()
                 && actual.getComision() > mejor.getComision())) {
                mejor = actual;
            }
        }
        return mejor;
    }
}
