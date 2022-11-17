package es.itrafa.b9.prog_ev1_u2_b9_e2;
import java.math.BigInteger;
/*
    EJERCICIO U2_B9_E2:
    La Galaxia de Andrómeda está a 2,5 millones de años luz de la tierra.
    Si me empeño en hablar en kilómetros en lugar de años luz, y quiero calcular los kilómetros de
    ida y vuelta a Andrómeda, observo, por el resultado negativo obtenido, que sobrepasé el rango
    de long (y recuerda que el resultado puede ser positivo y también haber sobrepasado dicho
    rango). Se pide hacer el cálculo con BigInteger.

    class Unidad2 {
        public static void main(String[] args) {
            long kilometrosEnLong = (long)365 * 24 * 60 * 60 * 300000 * 2500000*2;
            System.out.println("Kilometros a Ándromeda en Long ida y vuelta: " + kilometrosEnLong);
        }
    }

     // Solución 47304000000000000000
 */

class Unidad2 {
    public static void main(String[] args) {
        String diasAno = String.valueOf(365);
        String horasDía = String.valueOf(24);
        String minHora = String.valueOf(60);
        String segMin = String.valueOf(60);
        String kmInLY = String.valueOf(300000); // Km en año luz
        String dist_ly_andromeda = String.valueOf(2500000); // dist. a andromeda en año luz
        String veces = String.valueOf(2); // dist. a andromeda en año luz

        BigInteger kilometrosEnLong = new BigInteger(diasAno).
                multiply(new BigInteger(horasDía)).
                multiply(new BigInteger(minHora)).
                multiply(new BigInteger(segMin)).
                multiply(new BigInteger(kmInLY)).
                multiply(new BigInteger(dist_ly_andromeda)).
                multiply(new BigInteger(veces));
        System.out.println("Kilometros a Ándromeda en Long ida y vuelta: " + kilometrosEnLong);
    }
}