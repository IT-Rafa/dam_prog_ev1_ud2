package es.itrafa.b10.prog_ev1_u2_b10_e3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
    Ejercicio U2_B10_E3:
    Repite el ejercicio anterior sin nextBigDecimal().

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
 */
class Unidad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("precio: ");
        BigDecimal precio = new BigDecimal(sc.next());
        System.out.print("impuesto: ");
        BigDecimal impuesto = new BigDecimal(sc.next());

        // pvp = precio + (precio*impuesto) / 100
        BigDecimal impuestoPrecio = precio.multiply(impuesto).divide(new BigDecimal(100), 4, RoundingMode.UP);
        System.out.println("Valor impuesto: " + impuestoPrecio);
        System.out.println("Precio final: " + precio.add(impuestoPrecio));
    }
}