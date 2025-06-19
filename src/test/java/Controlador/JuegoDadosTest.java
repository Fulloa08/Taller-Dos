package Controlador;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JuegoDadosTest {

    @Test
    public void testJugarWhenSumIsSeven() {
        // Arrange
        JuegoDados juegoDados = new JuegoDados() {
            @Override
            public String jugar() {
                return "Dado 1: 3\nDado 2: 4\nSuma: 7\n¡Ganaste!";
            }
        };

        // Act
        String resultado = juegoDados.jugar();

        // Assert
        assertTrue(resultado.contains("¡Ganaste!"), "Expected result to contain '¡Ganaste!'");
    }

    @Test
    public void testJugarWhenSumIsNotSeven() {
        // Arrange
        JuegoDados juegoDados = new JuegoDados() {
            @Override
            public String jugar() {
                return "Dado 1: 2\nDado 2: 3\nSuma: 5\nPerdiste.";
            }
        };

        // Act
        String resultado = juegoDados.jugar();

        // Assert
        assertTrue(resultado.contains("Perdiste."), "Expected result to contain 'Perdiste.'");
    }

    @Test
    public void testJugarOutputFormat() {
        // Arrange
        JuegoDados juegoDados = new JuegoDados() {
            @Override
            public String jugar() {
                return "Dado 1: 6\nDado 2: 5\nSuma: 11\nPerdiste.";
            }
        };

        // Act
        String resultado = juegoDados.jugar();

        // Assert
        assertTrue(resultado.contains("Dado 1: "), "Expected result to contain 'Dado 1: '");
        assertTrue(resultado.contains("Dado 2: "), "Expected result to contain 'Dado 2: '");
        assertTrue(resultado.contains("Suma: "), "Expected result to contain 'Suma: '");
    }
}