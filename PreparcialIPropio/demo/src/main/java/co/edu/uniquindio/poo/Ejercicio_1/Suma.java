package main.java.co.edu.uniquindio.poo.Ejercicio_1;

public class Suma implements OperacionAritmetica{
    private double num1;
    private double num2;

    @Override
    public double realizarOperacion(double num1, double num2){

        return num1 + num2;
    }
}