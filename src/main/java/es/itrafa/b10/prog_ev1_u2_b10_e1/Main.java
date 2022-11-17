package es.itrafa.b10.prog_ev1_u2_b10_e1;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
    Ejercicio U2_B10_E1
    Con numero1 y numero2
    BigDecimal numero1 = new BigDecimal("10.7");
    BigDecimal numero2 = new BigDecimal("5.4");
    Realiza las siguientes operaciones:
    ● numero1+numero2
    ● numero1-numero2
    ● numero1*numero2
    ● numero1/numero2

    Consulta la API de BigDecimal para descubrir los métodos que te permiten hacer las
    operaciones anteriores.
    La operación de división genera una excepción, intenta razonar por qué y consultando la
    API escoge la versión del método divide() que te permite indicar redondeo para
    solucionar el problema.
 */
class Unidad2 {
    public static void main(String[] args) {
        BigDecimal numero1 = new BigDecimal("10.7");
        BigDecimal numero2 = new BigDecimal("5.4");

        System.out.println(numero1 + " + " + numero2 + " = " + numero1.add(numero2));
        System.out.println(numero1 + " - " + numero2 + " = " + numero1.subtract(numero2));
        System.out.println(numero1 + " * " + numero2 + " = " + numero1.multiply(numero2));
        System.out.println(numero1 + " / " + numero2 + " = " + numero1.divide(numero2,5, RoundingMode.UP));
    }
}