package main.java.co.edu.uniquindio.poo.Ejercicio_1;

public class Multiplicacion extends Decorador{

    public Multiplicacion(OperacionAritmetica operacion) {
        super(operacion);

    }

    @Override
    public double realizarOperacion(double num1, double num2, double num3){
        double reultadoOperacionBase = operacion.realizarOperacion(num1, num2);
        return reultadoOperacionBase * num3;
    }
}