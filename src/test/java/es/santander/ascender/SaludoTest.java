package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SaludoTest {
    @Test
    public void testSaludar(){
        Saludo saludo = new Saludo();

        String resultado = saludo.saludar("Nicolas");

        assertEquals("Hola Nicolas", resultado); //para comprobar
    }
}
