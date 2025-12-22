package upnadirect;

import org.junit.Test;
import static org.junit.Assert.*;

public class PresentadorOfertaTest {
    
    @Test
    public void pruebaCompletaCasoUso() {
        VistaFalsa vista = new VistaFalsa();
        PresentadorOferta presentador = new PresentadorOferta(vista);
        
        Cliente c = new Cliente(2005, 15000);
        Bien b = new Bien("vehiculo", 30000);
        
        presentador.ofrecerMejorOferta(c, b, 2025);
        
        assertEquals("LINEA INDIRECTA | 900 | 9", vista.ultimoTexto);
    }
}