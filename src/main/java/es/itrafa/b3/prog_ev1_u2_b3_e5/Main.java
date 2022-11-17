package es.itrafa.b3.prog_ev1_u2_b3_e5;

/*
    Ejercicio U2_B3_E5:
    Un constructor para la clase Coche.
    Hasta ahora utilizamos para crear objetos de la clase Coche el constructor por defecto.
    Modifica el ejemplo de la clase coche(la versión con setters y getters) añadiendo el
    constructor
    Coche
        -String modelo
        -int pasajeros
        -int deposito
        -int kpl

        -Coche(String m, int p, int d, int k)
        +String getModelo()
        +void setModelo(String modelo)
        +int getPasajeros()
        +void setPasajeros(int pasajeros)
        +int getDeposito()
        +void setDeposito(int deposito)
        +int getkpl()
        +void setkpl(int kpl)
        -void calcularAutonimia()
        -double gasofaNecesaria(int kilometros)

    ● Y desde main() probamos el constructor
        Coche coche1 = new Coche("Citroen C1", 5, 55, 18);
        System.out.println("coche1:");
        System.out.println("\tmodelo: " + coche1.getModelo());
        System.out.println("\tpasajeros: " + coche1.getPasajeros());
        System.out.println("\tdeposito: " + coche1.getDeposito());
        System.out.println("\tkpl: " + coche1.getKpl());

    ● Como Coche es una clase con una variedad de métodos, práctica a crear
        directamente con BlueJ objetos Coche y ejecuta sobre ellos algún método.
 */
class Coche {
    private String modelo;
    private int pasajeros;
    private int deposito;
    private int kpl;

    public Coche(String m, int p, int d, int k) {
        this.modelo = m;
        this.pasajeros = p;
        this.deposito = d;
        this.kpl = k;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPasajeros() {
        return this.pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getDeposito() {
        return this.deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public int getKpl() {
        return this.kpl;
    }

    public void setKpl(int kpl) {
        this.kpl = kpl;
    }

    public void calcularAutonomia() {
        System.out.println("Autonomía:" + deposito * kpl);
    }

    public double gasofaNecesaria(int kilometros) {
        return (double)kilometros / kpl;
    }
}

class Unidad2 {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Citroen C1", 5, 55, 18);

        System.out.println("coche1:");
        System.out.println("\tmodelo: " + coche1.getModelo());
        System.out.println("\tpasajeros: " + coche1.getPasajeros());
        System.out.println("\tdeposito: " + coche1.getDeposito());
        System.out.println("\tkpl: " + coche1.getKpl());
        System.out.print("\t");
        coche1.calcularAutonomia();
        System.out.println("\tgasofa necesaria: " + coche1.gasofaNecesaria(60));

    }
}