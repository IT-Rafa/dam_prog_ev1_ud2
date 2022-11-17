package es.itrafa.b3.prog_ev1_u2_b3_e7;

/*
    Ejercicio U2_B3_E7:
    Hacer un main en Unidad2 que pruebe el nuevo método mayorAutonomia()
    class Coche {
        String modelo;
        int pasajeros;
        int deposito;
        int kpl;

        Coche(String m, int p, int d, int k) {
            modelo = m;
            pasajeros = p;
            deposito = d;
            kpl = k;
        }

        int calcularAutonomia() {
            return deposito * kpl;
        }

        Coche mayorAutonomia(Coche c){
            Coche cocheMayorAut=new Coche("nada",0,0,0);
            if(calcularAutonomia()>c.calcularAutonomia()){
                cocheMayorAut.modelo=modelo;
                cocheMayorAut.pasajeros=pasajeros;
                cocheMayorAut.deposito=deposito;
                cocheMayorAut.kpl=kpl;
            }else{
                cocheMayorAut.modelo=c.modelo;
                cocheMayorAut.pasajeros=c.pasajeros;
                cocheMayorAut.deposito=c.deposito;
                cocheMayorAut.kpl=c.kpl;
            }
            return cocheMayorAut;
        }
    }
 */
class Coche {
    String modelo;
    int pasajeros;
    int deposito;
    int kpl;

    Coche(String m, int p, int d, int k) {
        modelo = m;
        pasajeros = p;
        deposito = d;
        kpl = k;
    }

    int calcularAutonomia() {
        return deposito * kpl;
    }

    /**
     * Retorna un objeto Coche nuevo, con los valores, c1 o c2, que tiene la mayor
     * autonomia.
     * @param c Coche a comparar con el objeto actual
     * @return Nuevo Coche con la autonomía más alta
     */
    Coche mayorAutonomia(Coche c) {
        Coche cocheMayorAut = new Coche("nada", 0, 0, 0);
        if (calcularAutonomia() > c.calcularAutonomia()) {
            cocheMayorAut.modelo = modelo;
            cocheMayorAut.pasajeros = pasajeros;
            cocheMayorAut.deposito = deposito;
            cocheMayorAut.kpl = kpl;

        } else {
            cocheMayorAut.modelo = c.modelo;
            cocheMayorAut.pasajeros = c.pasajeros;
            cocheMayorAut.deposito = c.deposito;
            cocheMayorAut.kpl = c.kpl;

        }
        return cocheMayorAut;
    }
}

class Unidad2 {
    public static void main(String[] args) {
        Coche c1 = new Coche("Ford Fiesta", 5, 60, 10);
        Coche c2 = new Coche("Ford Scord", 5, 80, 15);
        Coche cMayor = c1.mayorAutonomia(c2);

        System.out.println("el coche de mayor autonomía es: "+ cMayor.modelo);
    }
}