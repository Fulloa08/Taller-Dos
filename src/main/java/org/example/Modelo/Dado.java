package org.example.Modelo;

public class Dado {
    private int caraSuperior;

    public void lanzar(){
        caraSuperior = (int)(Math.random()*6)+1;
    }

    public int getCaraSuperior(){
        return caraSuperior;
    }
}
