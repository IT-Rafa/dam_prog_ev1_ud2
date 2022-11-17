package es.itrafa.b4.prog_ev1_u2_b4_e1;

/*
    Ejercicio U2_B4_E1:
    Añade a la clase Bicicleta los constructores necesarios para que funcione el
    siguiente main()
    class Bicicleta {
        int velocidade = 0;
        int marcha = 1;

        void cambiarMarcha(int novoValor) {
            marcha = novoValor;
        }
        void acelerar(int incremento) {
            velocidade = velocidade + incremento;
        }
        void frear(int decremento) {
            velocidade = velocidade - decremento;
        }
        void imprimirEstado() {
            System.out.println("Velocidade: "+velocidade+" Marcha: "+marcha);
        }
    }
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
            //un objeto bicicleta inicializado con velocidad 11 y marcha 2
            Bicicleta bicicleta3 = new Bicicleta(11,2);
            bicicleta3.imprimirEstado();
        }
    }
 */
class Bicicleta {
    int velocidade = 0;
    int marcha = 1;

    Bicicleta(int velocidade, int marcha) {
        this.velocidade = velocidade;
        this.marcha = marcha;
    }

    Bicicleta() {
        this.velocidade = 0;
        this.marcha = 1;
    }

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
        System.out.println("Velocidade: " + velocidade + " Marcha: " + marcha);
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

        //un objeto bicicleta inicializado con velocidad 11 y marcha 2
        Bicicleta bicicleta3 = new Bicicleta(11, 2);
        bicicleta3.imprimirEstado();
    }
}