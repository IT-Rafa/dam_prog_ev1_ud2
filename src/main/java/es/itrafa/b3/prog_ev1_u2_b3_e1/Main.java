package es.itrafa.b3.prog_ev1_u2_b3_e1;
/*
    Ejercicio U2_B3_E1:
    Cambia el siguiente código
    class Coche {
        String modelo;
        int pasajeros;
        int deposito;
        int kpl;
        void calcularAutonomia() {
            System.out.println("Autonomía:" + deposito * kpl);
        }
    }
    class Unidad2 {
        public static void main(String[] args) {
            Coche peugeot308 = new Coche();
            peugeot308.modelo = "Peugeot 308";
            peugeot308.pasajeros = 5;
            peugeot308.deposito = 60;
            peugeot308.kpl = 20;
            System.out.println("Modelo:" + peugeot308.modelo);
            System.out.println("deposito:" + peugeot308.deposito);
            System.out.println("kpl:" + peugeot308.kpl);
            peugeot308.autonomia();
        }
    }
    De forma que calcularAutonomia() devuelva un int como se explicó anteriormente.
 */
class Coche {
    String modelo;
    int pasajeros;
    int deposito;
    int kpl;
    int calcularAutonomia() {
        return deposito * kpl;
    }
}
class Unidad2 {
    public static void main(String[] args) {
        Coche peugeot308 = new Coche();
        peugeot308.modelo = "Peugeot 308";
        peugeot308.pasajeros = 5;
        peugeot308.deposito = 60;
        peugeot308.kpl = 20;
        System.out.println("Modelo:" + peugeot308.modelo);
        System.out.println("deposito:" + peugeot308.deposito);
        System.out.println("kpl:" + peugeot308.kpl);
        System.out.println("Autonomía: " + peugeot308.calcularAutonomia());
    }
}