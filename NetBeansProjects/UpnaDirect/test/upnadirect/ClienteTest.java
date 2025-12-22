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
public class ClienteTest {

    
    @Test
    public void clienteValido() {
        Cliente c = new Cliente(2000, 20000);
        assertTrue(c.esValido(2025));
    }

    @Test
    public void clienteInvalidoPorAnno() {
        Cliente c = new Cliente(1800, 20000);
        assertFalse(c.esValido(2025));
    }
    
}
