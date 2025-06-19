package Controlador;

import java.util.Random;

public class JuegoDados {
    public String jugar() {
        Random random = new Random();
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int suma = dado1 + dado2;

        String resultado = "Dado 1: " + dado1 + "\nDado 2: " + dado2 + "\nSuma: " + suma;

        if (suma == 7) {
            resultado += "\n¡Ganaste!";
        } else {
            resultado += "\nPerdiste.";
        }

        return resultado;
    }
}
