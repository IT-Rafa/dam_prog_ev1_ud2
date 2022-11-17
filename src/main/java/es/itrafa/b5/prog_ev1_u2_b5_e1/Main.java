package es.itrafa.b5.prog_ev1_u2_b5_e1;

/*
    EJERCICIO U2_B5_E1:
    Prueba la clase anterior Circulo desde un main() escrito por ti. El main() debe de crear dos
    círculos, comparar su radio e imprimir las coordenadas del círculo devuelto por elMayor().
    Por otro lado, escribe el método elMayor() con el operador condicional sustituyendo al if
    class Circulo{
        int coordenadaX;
        int coordenadaY;
        int radio;

        Circulo elMayor(Circulo c){
            if(this.radio>c.radio){
                return this;
            }else{
                return c;
            }
        }
    }
 */
class Circulo {
    int coordenadaX;
    int coordenadaY;
    int radio;

    Circulo elMayor(Circulo c) {
        return (this.radio > c.radio) ? this : c;
    }
}

class Unidad2 {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.coordenadaX = 5;
        c1.coordenadaY = 15;
        c1.radio = 25;

        Circulo c2 = new Circulo();
        c2.coordenadaX = 10;
        c2.coordenadaY = 20;
        c2.radio = 30;

        Circulo mayor = c1.elMayor(c2);
        System.out.println("El circulo mayor tiene");
        System.out.println("\tCoor. x = " + mayor.coordenadaX);
        System.out.println("\tCoor. y = " + mayor.coordenadaY);
        System.out.println("\tRadio   = " + mayor.radio);
    }
}