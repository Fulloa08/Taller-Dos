package org.example;

import Vista.JuegoDadosConsola;
import Vista.JuegoVersus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("🎲 BIENVENIDO AL JUEGO LUCKY SEVEN 🎲");
            System.out.println("1 - Juego individual");
            System.out.println("2 - Juego versus");
            System.out.println("3 - Salir");
            System.out.print("Selecciona una opción: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    JuegoDadosConsola juegoIndividual = new JuegoDadosConsola();
                    juegoIndividual.iniciar();
                    break;
                case "2":
                    JuegoVersus juegoVersus = new JuegoVersus();
                    juegoVersus.iniciar();
                    break;
                case "3":
                    System.out.println("Gracias por jugar. ¡Hasta la próxima!");
                    salir = true;
                    break;
                default:
                    System.out.println("⚠️ Opción inválida. Intenta de nuevo.\n");
            }

            if (!salir) {
                System.out.println("\nPresiona ENTER para volver al menú...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
