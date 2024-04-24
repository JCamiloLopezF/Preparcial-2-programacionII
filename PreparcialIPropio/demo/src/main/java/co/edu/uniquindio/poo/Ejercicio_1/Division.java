package main.java.co.edu.uniquindio.poo.Ejercicio_1;

public class Division extends Decorador{

    public Division(OperacionAritmetica operacion) {
        super(operacion);
    }

    @Override
    public double realizarOperacion(double num1, double num2, double num3){
        double resultadoOperacionBase = operacion.realizarOperacion(num1, num2);
        if(num3 != 0){

            return resultadoOperacionBase/num3;
        }  
        else{
            
            System.out.println("no se puede dividir por cero");
        }
    }
}