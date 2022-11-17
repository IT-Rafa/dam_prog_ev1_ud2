package es.itrafa.b1.prog_ev1_u2_b1_e2;
/*
    Ejercicio U2_B1_E2.
    Crea un objeto peugeot308 con las siguientes características:
        ● Modelo “peugeot 308 sport”
        ● 5 pasajeros
        ● 60 litros de depósito
        ● 20 kpl
    El programa da los datos anteriores a los atributos correspondientes,
    calcula la autonomía del coche (kpl * depósito) y finalmente imprime
    los atributos del coche y su autonomía.
 */
class Coche{
    String modelo;
    int pasajeros;
    int deposito;
    int kpl;
}
class Init{
    public static void main(String[] args) {
        Coche peugeot = new Coche();
        peugeot.modelo = "peugeot 308 sport";
        peugeot.pasajeros=5;
        peugeot.deposito=60;
        peugeot.kpl=20;

        int autonomía = peugeot.deposito * peugeot.kpl;

        System.out.println("Modelo: " + peugeot.modelo);
        System.out.println("\tpasajeros: " + peugeot.pasajeros);
        System.out.println("\tdeposito:  " + peugeot.deposito);
        System.out.println("\tkpl:       " + peugeot.kpl);
        System.out.println("\tautonomía: " + autonomía);

    }
}