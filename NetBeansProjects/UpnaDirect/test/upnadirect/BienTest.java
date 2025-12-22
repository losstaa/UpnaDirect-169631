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
public class BienTest {
    
    @Test
    public void vehiculoValido() {
        Bien b = new Bien("vehiculo", 30000);
        assertTrue(b.esValido());
    }

    @Test
    public void viviendaInvalidaPorValor() {
        Bien b = new Bien("vivienda", 40000);
        assertFalse(b.esValido());
    }
    
}
