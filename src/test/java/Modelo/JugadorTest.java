package Modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JugadorTest {

    /**
     * Test class for the Jugador class.
     * This class ensures the proper functionality of the getNombre method.
     */

    @Test
    void testGetNombreWithValidName() {
        Jugador jugador = new Jugador("Carlos");
        String resultado = jugador.getNombre();
        assertEquals("Carlos", resultado, "El nombre obtenido no coincide con el esperado.");
    }

    @Test
    void testGetNombreWithEmptyName() {
        Jugador jugador = new Jugador("");
        String resultado = jugador.getNombre();
        assertEquals("", resultado, "El nombre obtenido no coincide con el esperado cuando el nombre está vacío.");
    }

    @Test
    void testGetNombreWithWhitespaceName() {
        Jugador jugador = new Jugador(" ");
        String resultado = jugador.getNombre();
        assertEquals(" ", resultado, "El nombre obtenido no coincide con el esperado cuando el nombre está compuesto de espacios.");
    }

    @Test
    void testGetNombreWithLongName() {
        String nombreLargo = "JuanCarlosPérezMartínezElTerceroDeSuNombre";
        Jugador jugador = new Jugador(nombreLargo);
        String resultado = jugador.getNombre();
        assertEquals(nombreLargo, resultado, "El nombre obtenido no coincide con el esperado cuando el nombre es largo.");
    }
}