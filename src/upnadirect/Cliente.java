package upnadirect;

public class Cliente {
    private int annoNacimiento;
    private float salario;

    public Cliente(int annoNacimiento, float salario) {
        this.annoNacimiento = annoNacimiento;
        this.salario = salario;
    }

    public int getEdad(int annoActual) {
        return annoActual - annoNacimiento;
    }
    
    public float getSalario() {
        return salario;
    }

    public boolean esValido(int annoActual) {
        return annoNacimiento > 1900 && annoNacimiento <= annoActual && salario >= 0;
    }
}
