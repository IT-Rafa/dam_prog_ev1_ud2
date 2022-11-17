package es.itrafa.b5.prog_ev1_u2_b5_e4;

/*
    EJERCICIO U2_B5_E4:
    Anteriormente, hicimos el siguiente ejercicio
    class Coche {
        String modelo;
        int pasajeros;
        int deposito;
        int kpl;

        public String getModelo() {
            return modelo;
        }
        public void setModelo(String m) {
            modelo =m;
        }
        public int getPasajeros() {
            return pasajeros;
        }
        public void setPasajeros(int p) {
            pasajeros = p;
        }
        public int getDeposito() {
            return deposito;
        }
        public void setDeposito(int d) {
            deposito = d;
        }
        public int getKpl() {
            return kpl;
        }
        public void setKpl(int k) {
            kpl = k;
        }
        void calcularAutonomia() {
            System.out.println("Autonomía:" + deposito * kpl);
        }
        double gasofaNecesaria(int kilometros) {
            return (double) kilometros / kpl;
        }
    }
    class Unidad2{
        public static void main(String[] args) {
            Coche citroenC1= new Coche();
            citroenC1.setModelo("Citroen C1 special");
            citroenC1.setPasajeros(4);
            citroenC1.setDeposito(50);
            citroenC1.setKpl(25);
            System.out.println("un citroen C1 permite " + citroenC1.getPasajeros() + " pasajeros");
            System.out.println("un citroen C1 tiene consumo de " + citroenC1.getKpl() + " kilómetros por litro");
        }
    }
    Modifícalo para que los métodos set utilicen this de forma que no
    importe que el nombre del parámetro coincida con el del atributo.

    Por ejemplo,
    public void setModelo(String m) {
        modelo =m;
    }

    Lo puedo escribir como
    public void setModelo(String modelo) {
        this.modelo =modelo;
    }
 */

class Coche {
    String modelo;
    int pasajeros;
    int deposito;
    int kpl;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo =modelo;
    }
    public int getPasajeros() {
        return pasajeros;
    }
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    public int getDeposito() {
        return deposito;
    }
    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }
    public int getKpl() {
        return kpl;
    }
    public void setKpl(int kpl) {
        this.kpl = kpl;
    }
    void calcularAutonomia() {
        System.out.println("Autonomía:" + deposito * kpl);
    }
    double gasofaNecesaria(int kilometros) {
        return (double) kilometros / kpl;
    }
}
class Unidad2{
    public static void main(String[] args) {
        Coche citroenC1= new Coche();
        citroenC1.setModelo("Citroen C1 special");
        citroenC1.setPasajeros(4);
        citroenC1.setDeposito(50);
        citroenC1.setKpl(25);
        System.out.println("un citroen C1 permite " + citroenC1.getPasajeros() + " pasajeros");
        System.out.println("un citroen C1 tiene consumo de " + citroenC1.getKpl() + " kilómetros por litro");
    }
}