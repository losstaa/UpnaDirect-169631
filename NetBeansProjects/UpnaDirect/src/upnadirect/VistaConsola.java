package upnadirect;

import java.util.Scanner;
import upnadirect.*;


public class VistaConsola implements VistaOferta {

    private PresentadorOferta presenter;

    public VistaConsola() {
        presenter = new PresentadorOferta(this);
    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Año nacimiento: ");
        int anio = sc.nextInt();

        System.out.print("Salario: ");
        float salario = sc.nextFloat();

        System.out.print("Tipo bien (vehiculo/vivienda): ");
        String tipo = sc.next();

        System.out.print("Valor bien: ");
        float valor = sc.nextFloat();

        Cliente c = new Cliente(anio, salario);
        Bien b = new Bien(tipo, valor);

        presenter.ofrecerMejorOferta(c, b, 2025);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarOferta(String texto) {
        System.out.println("ASEGURADORA | IMPORTE | COMISION");
        System.out.println(texto);
    }
}
