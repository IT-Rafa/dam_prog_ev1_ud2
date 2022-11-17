package es.itrafa.b3.prog_ev1_u2_b3_e4;

/*
    Ejercicio U2_B3_E4:
    Crea OtraClase
    OtraClase
        -char car
        -int num

        -OtraClase(char c, int n)
        -void suma1()

    sumar1() incrementa en 1 el atributo num

    Prueba el constructor desde el main de Unidad2
    y crea también objetos de
    OtraClase directamente desde Bluej
 */
class OtraClase {
    private char car;
    private int num;

    OtraClase(char c, int n) {
        this.car = c;
        this.num = n;
    }

    public void sumar1() {
        num++;
    }


    public char getCar() {
        return this.car;
    }

    public void setCar(char car) {
        this.car = car;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int n) {
        this.num = n;
    }
}

class Unidad2 {
    public static void main(String[] args) {
        OtraClase oc1;
        oc1 = new OtraClase('a', 77);
        System.out.println("OtraClase oc1 = '" + oc1.getCar() + "', " + oc1.getNum());
        oc1.sumar1();
        System.out.println("Sumamos 1 a num: " + oc1.getNum());
        oc1.sumar1();
        System.out.println("Sumamos 1 a num: " + oc1.getNum());
        oc1 = new OtraClase('T', 15);
        System.out.println("Creamos OtraClase oc1 = '" + oc1.getCar() + "', " + oc1.getNum());

    }
}