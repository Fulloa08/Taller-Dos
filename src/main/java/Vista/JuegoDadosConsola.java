package Vista;

import Controlador.JuegoDados;

import java.util.Scanner;

public class JuegoDadosConsola {

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        JuegoDados juego = new JuegoDados();

        System.out.println("🎲 Bienvenido al juego individual Lucky Seven 🎲");
        System.out.println("Presiona ENTER para lanzar los dados...");
        scanner.nextLine();

        System.out.println(juego.jugar());
    }
}
