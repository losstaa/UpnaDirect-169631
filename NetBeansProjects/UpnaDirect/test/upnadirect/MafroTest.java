/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upnadirect;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class MafroTest {
    
    @Test
    public void mafroVehiculoJoven() {
        Cliente c = new Cliente(2008, 10000); // <20 años
        Bien b = new Bien("vehiculo", 10000);
        Aseguradora a = new Mafro();

        Oferta o = a.calcularOferta(c, b, 2025);
        assertEquals(500, o.getImporteSeguro(), 0.01);
    }
    
    @Test
    public void mafroViviendaCaraSalarioBajo() {
        Cliente c = new Cliente(1990, 15000); // salario < 20000
        Bien b = new Bien("vivienda", 250000); // valor > 200000
        Aseguradora a = new Mafro();
        Oferta o = a.calcularOferta(c, b, 2025);
        assertEquals(5000, o.getImporteSeguro(), 0.01); // 2% de 250000 = 5000
    }
}
