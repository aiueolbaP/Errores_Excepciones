package udla.pflores.errores;

import java.awt.font.NumericShaper;

public class Calculadora {




    public double dividir(int numerador, int denominador) throws DivisionPorCeroException{
        if(denominador == 0){
            throw new DivisionPorCeroException("No es posible dividir para 0");
        }
        return numerador/(double)denominador;
        //se usa el (dounle) para quitar la advertencia de que la division genera un float en un return double
    }

    public double dividir(int numerador, String denominador) throws DivisionLetrasException, DivisionPorCeroException{
        try {
            //int num = Integer.parseInt(numerador);
            int den = Integer.parseInt(denominador);
            return this.dividir(numerador, den);
        }catch (NumberFormatException e){
            throw new DivisionLetrasException("No se pueden dividir letras");
        }
    }
}
