package upnadirect;

public class Oferta {

    private Aseguradora aseguradora;
    private float importeSeguro;
    private int comision;

    public Oferta(Aseguradora aseguradora, float importeSeguro) {
        this.aseguradora = aseguradora;
        this.importeSeguro = importeSeguro;
    }

    public void calcularComision() {
        float porcentaje;

        if (importeSeguro <= 1000) {
            porcentaje = 0.01f;
        } else {
            String nombre = aseguradora.getNombre();
            if (nombre.equals("MAFRO")) {
                porcentaje = 0.03f;
            } else if (nombre.equals("LINEA INDIRECTA")) {
                porcentaje = 0.04f;
            } else {
                porcentaje = 0.05f;
            }
        }

        comision = (int) Math.floor(importeSeguro * porcentaje);
    }

    public float getImporteSeguro() {
        return importeSeguro;
    }

    public int getComision() {
        return comision;
    }

    public String getNombreAseguradora() {
        return aseguradora.getNombre();
    }
}
