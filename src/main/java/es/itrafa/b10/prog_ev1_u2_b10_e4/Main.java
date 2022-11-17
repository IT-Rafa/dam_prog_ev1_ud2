package es.itrafa.b10.prog_ev1_u2_b10_e4;

/*
    Ejercicio U2_B10_E4:
    Repetimos el ejercicio anterior pero ahora con la siguiente consideración. Suponemos
    que somos el administrativo de una empresa y que hacemos los cálculos a boli y papel
    de la siguiente forma:
    1. Tomamos el precio
        y nos quedamos con dos decimales. Si hiciera falta redondeo,
        redondeamos hacia arriba.
        Por ejemplo 10.542 =>10.55
    2. lo mismo para el valor del impuesto en tanto por cien.
        Por ejemplo
        10.0=>10.00
    3. Paso el impuesto a tanto por uno con 2 decimales, redondeo si fuera necesario
        10.00/100=>0.10
    4. calculo el valor del impuesto para el precio. Resultado con 2 decimales y
        consiguiente redondeo si hiciera falta
        10.55*0.10=>1.0550=>1.06
    5. obtengo el pvp
        10,55+1,06=11,61

    Creo que legalmente, en una factura, es suficiente con redondear el total final (el pvp)
    pero lo que nos interesa ahora es ver que desde java podemos hacer un proceso como
    el de arriba, es decir, que tenemos el control deseado sobre escala y redondeo.
    Ahora se pide escribir este proceso en java, tomando el valor del precio y el impuesto en
    tanto por cien desde el teclado. Un ejemplo de ejecución podría ser:
    Ej. 1
    precio en euros: 10.543
    precio redondeado: 10.55
    impuesto en %: 10.0
    impuesto en % redondeado: 10.00
    impuesto en tanto por 1 y redondeado:  0.10
    impuesto en euros sobre el precio: 1.0550
    impuesto en euros sobre el precio redondeado: 1.06
    pvc: 11.61

    Ej.2:
    precio en euros: 10.123456
    precio redondeado: 10.13
    impuesto en %: 9.512
    impuesto en % redondeado: 9.52

    impuesto en tanto por 1 y redondeado:  0.10
    impuesto en euros sobre el precio: 1.0130
    impuesto en euros sobre el precio redondeado: 1.02
    pvc: 11.15

 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Unidad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Captura y redondea precio
        System.out.print("precio en euros: ");
        BigDecimal precio = new BigDecimal(sc.next()).setScale(2, RoundingMode.UP);
        System.out.println("precio redondeado: " + precio);

        // Captura y redondea impuesto como porcentaje 100
        System.out.print("impuesto en %: ");
        BigDecimal impuesto = new BigDecimal(sc.next()).setScale(2, RoundingMode.UP);
        System.out.println("impuesto en % redondeado: " + impuesto);

        // Calcula y redondea impuesto como porcentaje 1 (para usar con precio)
        impuesto = impuesto.divide(new BigDecimal("100"), 2, RoundingMode.UP);
        System.out.println("impuesto en tanto por 1 y redondeado: " + impuesto);

        // impuesto en euros
        BigDecimal valorImpuesto = precio.multiply(impuesto);
        System.out.println("impuesto en euros sobre el precio: " + valorImpuesto);

        // impuesto en euros redondeado
        valorImpuesto = valorImpuesto.setScale(2, RoundingMode.UP);
        System.out.println("impuesto en euros sobre el precio redondeado: " + valorImpuesto);

        // precio con impuesto
        BigDecimal pvp = precio.add(valorImpuesto);
        System.out.println("pvp: " + pvp);
    }
}