package es.itrafa.b5.prog_ev1_u2_b5_e5;

/*
    EJERCICIO U2_B5_E5:
    En el boletín anterior, vimos este ejemplo
    class Coche{
        int pasajeros;
        int deposito;
        int kpl;

        int calcularAutonomia(){
            return deposito*kpl;
        }
        boolean mayorAutonomia(Coche c){
            return calcularAutonomia()>c.calcularAutonomia();
        }
    }

    class Unidad2 {
        public static void main(String[] args) {
            Coche coche1= new Coche();
            coche1.pasajeros=5;
            coche1.deposito=60;
            coche1.kpl=20;
            Coche coche2= new Coche();
            coche2.pasajeros=7;
            coche2.deposito=1000;
            coche2.kpl=30;
            System.out.println("Tiene coche1 más autonomía que coche2? "+ coche1.mayorAutonomia(coche2));
        }
    }
    e indicamos que mayorAutonomia() se entendería mejor si usamos this. Usa this y
    explica el funcionamiento del método.
 */

class Coche {
    int pasajeros;
    int deposito;
    int kpl;

    int calcularAutonomia() {
        return deposito * kpl;
    }

    boolean mayorAutonomia(Coche c) {
        return this.calcularAutonomia() > c.calcularAutonomia();
    }
}

class Unidad2 {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.pasajeros = 5;
        coche1.deposito = 60;
        coche1.kpl = 20;
        Coche coche2 = new Coche();
        coche2.pasajeros = 7;
        coche2.deposito = 1000;
        coche2.kpl = 30;
        System.out.println("Tiene coche1 más autonomía que coche2? " + coche1.mayorAutonomia(coche2));
    }
}