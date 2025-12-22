package upnadirect;

public class Adasles implements Aseguradora {

    public String getNombre() {
        return "ADASLES";
    }

    public Oferta calcularOferta(Cliente c, Bien b, int annoActual) {
        float porcentaje = 0.02f;
        int edad = c.getEdad(annoActual);

        if (b.getTipo().equals("vehiculo") && (edad <= 20 || edad > 60)) {
            porcentaje = 0.06f;
        }

        float importe = b.getValor() * porcentaje;
        Oferta oferta = new Oferta(this, importe);
        oferta.calcularComision();
        return oferta;
    }
}
