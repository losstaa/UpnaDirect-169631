package upnadirect;

public class Mafro implements Aseguradora {

    public String getNombre() {
        return "MAFRO";
    }

    public Oferta calcularOferta(Cliente c, Bien b, int annoActual) {
        float porcentaje = 0.03f;
        int edad = c.getEdad(annoActual);

        if (b.getTipo().equals("vehiculo") && edad < 20){
            porcentaje = 0.05f;
        }

        if (b.getTipo().equals("vivienda") && b.getValor() > 200000 && c.getSalario() < 20000){
            porcentaje = 0.02f;
        }

        float importe = b.getValor() * porcentaje;
        Oferta oferta = new Oferta(this, importe);
        oferta.calcularComision();
        return oferta;
    }
}
