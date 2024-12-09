package udla.pflores.errores;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args){
        Calculadora cal = new Calculadora();

        String valor = JOptionPane.showInputDialog("Ingrese un numero");

        try{
            //divisor = Integer.parseInt(valor); //tambien va en el try porque se quiere controlar
            //int division = 10 / 0;
            //int division = 10/divisor;
            int denominador = Integer.parseInt(valor);
            double division = cal.dividir(10, denominador);
            System.out.println(division);
        }catch (DivisionPorCeroException ae){ //Mandamos una excepcion creada por nosotros
            //Es un metodo que recibe un parametro, Exception es la forma más general de excepciones
            //si se usa el arithmetic exception puede no atrapar algunos errores
            System.out.println("Captura el error aritmetico: "+ ae.getMessage());
            main(args);
        }catch(DivisionLetrasException nfe){
            System.out.println("error por formato " + nfe.getMessage());
            main(args);
        }
        System.out.println("Continuamos el flujo de aplicación");
    }
}
