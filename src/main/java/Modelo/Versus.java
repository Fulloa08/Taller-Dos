package Modelo;

import Controlador.JuegoDados;

public class Versus {
    private final Jugador jugador1;
    private final Jugador jugador2;
    private final JuegoDados juego;

    public Versus(Jugador jugador1, Jugador jugador2, JuegoDados juego) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.juego = juego;
    }

    public void iniciar() {
        System.out.println("\nTurno de " + jugador1.getNombre());
        String resultado1 = juego.jugar();
        System.out.println(resultado1);
        if (resultado1.contains("¡Ganaste!")) {
            jugador1.agregarPunto();
        }

        System.out.println("\nTurno de " + jugador2.getNombre());
        String resultado2 = juego.jugar();
        System.out.println(resultado2);
        if (resultado2.contains("¡Ganaste!")) {
            jugador2.agregarPunto();
        }

        System.out.println("\nPuntajes actuales:");
        System.out.println(jugador1.getNombre() + ": " + jugador1.getPuntaje());
        System.out.println(jugador2.getNombre() + ": " + jugador2.getPuntaje());
    }
}
