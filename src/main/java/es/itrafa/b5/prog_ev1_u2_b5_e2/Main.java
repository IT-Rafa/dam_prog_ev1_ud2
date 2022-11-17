package es.itrafa.b5.prog_ev1_u2_b5_e2;

/*
    EJERCICIO U2_B5_E2:
    Añade a Circulo un constructor de forma que funcione con el siguiente main()
    class Unidad2{
        public static void main(String[] args) {
            Circulo c1=new Circulo(3,3,10);
            Circulo c2=new Circulo(50,45,5);
            Circulo circuloGrande=c1.elMayor(c2);
            System.out.println("el círculo mayor: ");
            System.out.println("\t coordenadaX: "+circuloGrande.coordenadaX);
            System.out.println("\t coordenaday: "+circuloGrande.coordenadaY);
            System.out.println("\t radio: "+circuloGrande.radio);
        }
    }

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

    public Circulo(int coordenadaX, int coordenadaY, int radio) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.radio = radio;
    }

    Circulo elMayor(Circulo c) {
        if (this.radio > c.radio) {
            return this;
        } else {
            return c;
        }
    }
}

class Unidad2 {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(3, 3, 10);
        Circulo c2 = new Circulo(50, 45, 5);

        Circulo circuloGrande = c1.elMayor(c2);
        System.out.println("el círculo mayor: ");
        System.out.println("\t coordenadaX: " + circuloGrande.coordenadaX);
        System.out.println("\t coordenadaY: " + circuloGrande.coordenadaY);
        System.out.println("\t radio: " + circuloGrande.radio);
    }
}