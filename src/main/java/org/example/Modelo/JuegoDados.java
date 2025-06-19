package org.example.Modelo;

public class JuegoDados {
    private Dado dado1;
    private Dado dado2;
    private Calculadora calculadora;

    public void Juego(){
        dado1 = new Dado();
        dado2 = new Dado();
        calculadora = new Calculadora();
    }

    public String jugar(){
        dado1.lanzar();
        dado2.lanzar();

        int suma = calculadora.sumar(dado1.getCaraSuperior(), dado2.getCaraSuperior());

        return "Dado 1:" + dado1.getCaraSuperior() +
                "\nDado 2:" + dado2.getCaraSuperior() +
                "\nSuma: " + suma +
                "\nResultado: " + (suma == 7 ? "Ganaste" : "Perdiste. ");


}
