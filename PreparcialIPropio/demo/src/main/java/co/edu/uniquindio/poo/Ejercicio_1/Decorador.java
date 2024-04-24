package main.java.co.edu.uniquindio.poo.Ejercicio_1;


public abstract class Decorador implements OperacionAritmetica{
    protected OperacionAritmetica operacion;

    public Decorador(OperacionAritmetica operacion) {
        this.operacion = operacion;
    }

    @Override
    public double realizarOperacion(double num1, double num2){
        return this.operacion.realizarOperacion(num1, num2);
    }
}