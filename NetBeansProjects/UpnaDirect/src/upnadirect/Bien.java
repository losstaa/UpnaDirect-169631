package upnadirect;

public class Bien {
    private String tipo;
    private float valor;

    public Bien(String tipo, float valor) {
        this.tipo = tipo.toLowerCase(); //para evitar comprobar si está en mayscúlas
        this.valor = valor;
    }

    public boolean esValido() {
        if (tipo.equals("vehiculo")) {
            return valor > 0 && valor <= 50000;
        }
        if (tipo.equals("vivienda")) {
            return valor >= 50000;
        }
        return false;
    }

    public String getTipo(){
        return tipo;
    }

    public float getValor() {
        return valor;
    }
}

