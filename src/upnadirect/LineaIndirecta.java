package upnadirect;

public class LineaIndirecta implements Aseguradora {

    public String getNombre() {
        return "LINEA INDIRECTA";
    }

    public Oferta calcularOferta(Cliente c, Bien b, int annoActual) {
        float porcentaje = 0.03f;
        int edad = c.getEdad(annoActual);

        if ((b.getTipo().equals("vehiculo") && b.getValor() < 20000) || (b.getTipo().equals("vivienda") && b.getValor() < 150000)) {
            porcentaje = 0.04f;
        }

        if (b.getTipo().equals("vehiculo") && b.getValor() >= 20000 && edad > 60) {
            porcentaje = 0.06f;
        }

        float importe = b.getValor() * porcentaje;
        Oferta oferta = new Oferta(this, importe);
        oferta.calcularComision();
        return oferta;
    }
}
