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
public class AdaslesTest {
    
   @Test
    public void adaslesVehiculoJoven() {
        Cliente c = new Cliente(2010, 12000); // <20 años
        Bien b = new Bien("vehiculo", 15000);
        Aseguradora a = new Adasles();
        Oferta o = a.calcularOferta(c, b, 2025);
        assertEquals(900, o.getImporteSeguro(), 0.01); // 6% de 15000 = 900
    }
    
    @Test
    public void adaslesVehiculoMayor60() {
        Cliente c = new Cliente(1960, 30000); // >60 años
        Bien b = new Bien("vehiculo", 20000);
        Aseguradora a = new Adasles();
        Oferta o = a.calcularOferta(c, b, 2025);
        assertEquals(1200, o.getImporteSeguro(), 0.01); // 6% de 20000 = 1200
    }
    
}
