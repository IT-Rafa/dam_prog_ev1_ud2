package es.itrafa.b5.prog_ev1_u2_b5_e6;

/*
    EJERCICIO U2_B5_E6:
    Recuerda el siguiente ejemplo ya visto. mayorAutonomia() devuelve
    un coche que internamente crea un objeto Coche y en él copia los
    datos del coche mayor. No teníamos en el boletín pasado forma de
    que devolviera directamente el coche propietario del método porque
    no conocíamos this. Reforma ahora el código de forma que no creamos
    ningún coche extra, simplemente si coche1 es mayor que coche2
    devuelve coche1 y en caso contrario coche2.

    OTRO USO DE THIS: una versión de constructor puede llamar a otra
    versión de constructor

    Es un uso menos importante y frecuente que el anterior pero está bien conocerlo.
    Recuerda que un constructor puede estar sobrecargado. Desde un constructor puedo
    aprovecharme del código de otro ya escrito sin estar duplicando código una y otra vez.

    Observa el siguiente ejemplo:
    https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html
    public class Rectangle {
            private int x, y;
            private int width, height;

        public Rectangle() {
            this(0, 0, 1, 1);
        }
        public Rectangle(int width, int height) {
            this(0, 0, width, height);
        }
        public Rectangle(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
        ...
    }
    If present, the invocation of another constructor must be the first line in the constructor.

    EJERCICIO PREVIO
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
     *

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

    Coche mayorAutonomia(Coche c) {
        if (this.calcularAutonomia() > c.calcularAutonomia()) {
            return this;
        } else {
            return c;
        }
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