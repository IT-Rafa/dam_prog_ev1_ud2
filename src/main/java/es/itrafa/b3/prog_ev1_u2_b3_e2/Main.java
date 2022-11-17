package es.itrafa.b3.prog_ev1_u2_b3_e2;

/*
    Ejercicio U2_B3_E2:
    Escribe la siguiente clase Bicicleta
    Bicicleta
        -int velocidade
        -int marcha

        -void cambiarMarcha(int novoValor)
        -void acelerar(int incremento)
        -void frear(int decremento)
        -void imprimirEstado()

    de forma que sea manejada por el siguiente main
    class Unidad2{
        public static void main(String[] args) {
            // Crea dous obxectos bicicleta
            Bicicleta bicicleta1 = new Bicicleta();
            Bicicleta bicicleta2 = new Bicicleta();
            // Invoca os métodos destes obxectos
            bicicleta1.acelerar(10);
            bicicleta1.cambiarMarcha(2);
            bicicleta1.imprimirEstado();
            bicicleta2.acelerar(10);
            bicicleta2.cambiarMarcha(2);
            bicicleta2.acelerar(10);
            bicicleta2.cambiarMarcha(3);
            bicicleta2.imprimirEstado();
        }
    }
 */
class Bicicleta {
    int velocidade;
    int marcha;

    void cambiarMarcha(int novoValor) {
        marcha = novoValor;
    }

    void acelerar(int incremento) {
        velocidade += incremento;
    }

    void frear(int decremento) {
        velocidade -= decremento;
    }

    void imprimirEstado() {
        System.out.println( "Velocidade: " + velocidade + " Marcha: " + marcha);
    }
}

class Unidad2 {
    public static void main(String[] args) {
        // Crea dous obxectos bicicleta
        Bicicleta bicicleta1 = new Bicicleta();
        Bicicleta bicicleta2 = new Bicicleta();

        // Invoca os métodos destes obxectos
        bicicleta1.acelerar(10);
        bicicleta1.cambiarMarcha(2);
        bicicleta1.imprimirEstado();

        bicicleta2.acelerar(10);
        bicicleta2.cambiarMarcha(2);
        bicicleta2.acelerar(10);
        bicicleta2.cambiarMarcha(3);
        bicicleta2.imprimirEstado();
    }
}