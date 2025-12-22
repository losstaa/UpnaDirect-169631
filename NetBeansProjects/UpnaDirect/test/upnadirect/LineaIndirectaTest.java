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
public class LineaIndirectaTest {
    
    @Test
    public void lineaIndirectaVehiculoBarato() {
        Cliente c = new Cliente(1990, 25000);
        Bien b = new Bien("vehiculo", 15000); // <20000
        Aseguradora a = new LineaIndirecta();
        Oferta o = a.calcularOferta(c, b, 2025);
        assertEquals(600, o.getImporteSeguro(), 0.01); // 4% de 15000 = 600
    }
    
    @Test
    public void lineaIndirectaVehiculoCaroMayor60() {
        Cliente c = new Cliente(1960, 35000); // >60 años
        Bien b = new Bien("vehiculo", 30000); // >=20000
        Aseguradora a = new LineaIndirecta();
        Oferta o = a.calcularOferta(c, b, 2025);
        assertEquals(1800, o.getImporteSeguro(), 0.01); // 6% de 30000 = 1800
    }
    
}
