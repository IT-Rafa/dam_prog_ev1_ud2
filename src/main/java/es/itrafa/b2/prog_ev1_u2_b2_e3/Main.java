package es.itrafa.b2.prog_ev1_u2_b2_e3;

/*
    Ejercicio U2_B2_E3
    Observa este código.
    class Coche{
        String modelo;
        int pasajeros;
        int deposito;
        int kpl;
    }
    class Unidad2 {
        public static void main(String[] args) {
            Coche coche1 = new Coche();
            coche1.modelo="Ford K";
            coche1.pasajeros=5;
            coche1.deposito=60;
            coche1.kpl=20;
            Coche coche2 = new Coche();
            coche2.modelo="Ford K";
            coche2.pasajeros=5;
            coche2.deposito=60;
            coche2.kpl=20;
            Coche coche3=coche1;
        }
    }
    coche1 y coche2 apuntan realmente a objetos distintos, cada uno de estos objetos
    tiene los mismos valores, pero son objetos distintos. Por el contrario, coche3 y coche1
    son referencia al mismo objeto.

    SE PIDE: Hacer un dibujo que relacione los dos objetos con las 3 variables y Demostrar
    lo anterior utilizando el operador == obteniendo una salida similar a la siguiente
    ¿Es cierto que coche1 == coche2?: false
    ¿Es cierto que coche1 == coche3?: true
 */
class Coche {
    String modelo;
    int pasajeros;
    int deposito;
    int kpl;
}
/*
    Objeto Coche 1       |          Nombre referencia
        modelo="Ford K"  |
        pasajeros=5      |  <-------- coche1
        deposito=60      |         |
        kpl=20           |         |---- coche3

     Objeto Coche 2      |
        modelo="Ford K"  |
        pasajeros=5      |  <-------- coche2
        deposito=60      |
        kpl=20           |
 */
class Unidad2 {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.modelo = "Ford K";
        coche1.pasajeros = 5;
        coche1.deposito = 60;
        coche1.kpl = 20;
        Coche coche2 = new Coche();
        coche2.modelo = "Ford K";
        coche2.pasajeros = 5;
        coche2.deposito = 60;
        coche2.kpl = 20;
        Coche coche3 = coche1;

        System.out.println("¿Es cierto que coche1 == coche2?: " + (coche1 == coche2));
        System.out.println("¿Es cierto que coche1 == coche3?: " + (coche1 == coche3));
    }
}