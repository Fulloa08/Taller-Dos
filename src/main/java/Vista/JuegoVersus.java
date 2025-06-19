package Vista;

import Controlador.JuegoDados;
import Modelo.Jugador;
import Modelo.Versus;

import java.util.Scanner;

public class JuegoVersus {
    private Jugador jugador1;
    private Jugador jugador2;
    private JuegoDados juego;

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del Jugador 1: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Nombre del Jugador 2: ");
        String nombre2 = scanner.nextLine();

        jugador1 = new Jugador(nombre1);
        jugador2 = new Jugador(nombre2);
        juego = new JuegoDados();

        Versus versus = new Versus(jugador1, jugador2, juego);

        String continuar;
        do {
            versus.iniciar();
            System.out.print("\n¿Desean jugar otra ronda? (s/n): ");
            continuar = scanner.nextLine().toLowerCase();
        } while (continuar.equals("s"));

        System.out.println("\n🎯 Juego finalizado. Puntajes:");
        System.out.println(jugador1.getNombre() + ": " + jugador1.getPuntaje());
        System.out.println(jugador2.getNombre() + ": " + jugador2.getPuntaje());
    }
}
