/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class UpnaDirect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       VistaConsola view = new VistaConsola();
       view.iniciar();
       
        Cliente c1 = new Cliente(1800, 20000);
        if (!c1.esValido(2025)) {
            System.out.println("RESULTADO: Error - Cliente no válido");
            System.out.println("    Mensaje: El año de nacimiento debe ser mayor a 1900");
        } else {
            System.out.println("FALLO: El cliente debería ser inválido");
        }
        
        Cliente c2 = new Cliente(1990, 25000);
        System.out.println("   Cliente creado: año 1990, salario 25000");

        Bien b1 = new Bien("vehiculo", 60000);
        if (!b1.esValido()) {
            System.out.println("RESULTADO: Error - Bien no válido");
            System.out.println("   Mensaje: El valor máximo para vehículos es 50000");
        } else {
            System.out.println("FALLO: El bien debería ser inválido");
        }
        
        
        VistaFalsa vista = new VistaFalsa();
        PresentadorOferta presentador = new PresentadorOferta(vista);

        Cliente c3 = new Cliente(2005, 15000);
        Bien b2 = new Bien("vehiculo", 30000);

        System.out.println("   Cliente creado: año 2005, salario 15000");
        System.out.println("   Bien creado: vehiculo, valor 30000");
        System.out.println("   Calculando mejor oferta");

        presentador.ofrecerMejorOferta(c3, b2, 2025);

        String resultado = vista.ultimoTexto;
        String esperado = "LINEA INDIRECTA | 900 | 9";

        if (resultado != null && resultado.equals(esperado)) {
            System.out.println("RESULTADO: " + resultado);
            System.out.println("   Estado: PASS - Coincide con lo esperado");
        } else {
            System.out.println("RESULTADO: " + resultado);
            System.out.println("   Esperado: " + esperado);
            System.out.println("   Estado: FAIL - No coincide");
        }
    }
    
}
