package main.java.co.edu.uniquindio.poo.Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        OperacionAritmetica suma = new Suma();
        System.out.println("Suma: " + suma.realizarOperacion(5,3));

        OperacionAritmetica resta = new Resta(suma);
        System.out.println("Suma con resta: " + resta.realizarOperacion(5,3,4));

        OperacionAritmetica multiplicacion = new Multiplicacion(suma);
        System.out.println("Suma con multiplicación: " + multiplicacion.realizarOperacion(5,3,5));

        OperacionAritmetica division = new Division(suma);
        System.out.println("Suma con division: " + division.realizarOperacion(5,3,2));
    }
}