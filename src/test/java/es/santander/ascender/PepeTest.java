package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PepeTest {
      @Test //hay que ponerlo siempre que hagamos un test
      public void testSumar() {
        Pepe sut = new Pepe(); //preparo
        assertTrue(sut.sumar(4, 3) == 7); //no hay que poner a y b sino (4, 3) assertTrue == 7 es verificar y sut.sumar es ejecutar
      }  
    }

