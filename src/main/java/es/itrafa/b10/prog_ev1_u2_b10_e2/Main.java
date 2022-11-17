package es.itrafa.b10.prog_ev1_u2_b10_e2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
    Ejercicio U2_B10_E2:
    Leemos del teclado el precio de un artículo con nextBigDecimal(consulta API).
    Leemos del teclado el impuesto que queremos aplicarle, también con nextBigDecimal
    calculamos el pvp con métodos bigdecimal de forma traducimos a “lenguaje BigDecimal”
    pvp=precio+precio*impuesto/100

    Ejemplo de posible salida:
    precio: 67.99
    impuesto: 10.00
    Valor impuesto: 6.7990
    Precio final 74.7890

    OJO nextBigDecimal() depende de la configuración del idioma y teclado del ordenador
    en que se ejecuta. Puede ocurrir que el ejemplo anterior hubiera que teclearlo con coma
    decimal en lugar de punto decimal(Recuerda que esto mismo ocurría con nextFloat() y
    nextDouble())
 */
class Unidad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("precio: ");
        BigDecimal precio = sc.nextBigDecimal();
        System.out.print("impuesto: ");
        BigDecimal impuesto = sc.nextBigDecimal();

        // pvp = precio + (precio*impuesto) / 100
        BigDecimal impuestoPrecio = precio.multiply(impuesto).divide(new BigDecimal(100), 4, RoundingMode.UP);
        System.out.println("Valor impuesto: " + impuestoPrecio);
        System.out.println("Precio final: " + precio.add(impuestoPrecio));
    }
}