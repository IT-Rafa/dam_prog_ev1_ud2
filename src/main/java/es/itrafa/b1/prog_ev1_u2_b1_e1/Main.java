package es.itrafa.b1.prog_ev1_u2_b1_e1;
/*
    Ejercicio U2_B1_E1:
     A este código
        class Coche{
            String modelo;
            int pasajeros;
            int deposito;
            int kpl;
        }
        class Unidad2{
            public static void main(String[] args) {
                Coche golf = new Coche();//se crea el objeto
                golf.pasajeros=5;//se usa el objeto
                System.out.println("pasajeros:" + golf.pasajeros); //se usa el objeto
            }
        }

    Añade instrucciones para que cree también un objeto Megane para el que almacenamos que
    tiene un depósito 60 litros e imprimimos este atributo por pantalla.
    Observa que un programa java es un conjunto de clases, como mínimo una. Una y sólo una
    clase debe contener el método main() que es
    el punto de entrada al programa y por tanto
    sólo puede haber un método main en todo el programa.
 */
class Coche{
    String modelo;
    int pasajeros;
    int deposito;
    int kpl;
}
class Init{
    public static void main(String[] args) {
        Coche golf = new Coche();//se crea el objeto
        Coche megane = new Coche();

        golf.pasajeros=5;//se usa el objeto
        megane.deposito=60;

        System.out.println("pasajeros golf: " + golf.pasajeros); //se usa el objeto
        System.out.println("deposito megane :" + megane.deposito);

    }
}