package es.itrafa.b5.prog_ev1_u2_b5_e3;

/*
    EJERCICIO U2_B5_E3:
    Reescribe el método elMayor() de forma que en vez de devolver una referencia al
    mayor de dos círculos, devuelva una copia del círculo mayor, es decir, otro objeto
    Circulo distinto (un nuevo objeto), pero con los mismos valores que los dos
    iniciales.

    class Circulo{
        int coordenadaX;
        int coordenadaY;
        int radio;

        Circulo(int x, int y, int r){
            coordenadaX=x;
            coordenadaY=y;
            radio=r;
        }
        Circulo elMayor(Circulo c){
            return this.radio>c.radio?this:c;
        }
    }

    Una vez modificada pruébala con el siguiente main()
    class Unidad2{
        public static void main(String[] args) {
        Circulo c1=new Circulo(3,3,10);
        Circulo c2=new Circulo(50,45,5);
        Circulo circuloGrande=c1.elMayor(c2);
        System.out.println("el círculo mayor: ");
        System.out.println("\t coordenadaX: "+circuloGrande.coordenadaX);
        System.out.println("\t coordenaday: "+circuloGrande.coordenadaY);
        System.out.println("\t radio: "+circuloGrande.radio);
        System.out.println("demostramos que aunque circuloGrande incialmente es copia de c1 son objetos diferentes");
        System.out.println("cambiamos el radio de circulo grande pero no cambia el de c1");
        circuloGrande.radio=-99;
        System.out.println(circuloGrande.radio+", "+c1.radio);
        }
    }
 */
class Circulo {
    int coordenadaX;
    int coordenadaY;
    int radio;

    Circulo(int x, int y, int r) {
        coordenadaX = x;
        coordenadaY = y;
        radio = r;
    }

    Circulo elMayor(Circulo c) {
        return (this.radio > c.radio) ?
                new Circulo(this.coordenadaX, this.coordenadaY, this.radio) :
                new Circulo(c.coordenadaX, c.coordenadaY, c.radio);
    }
}

class Unidad2 {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(3, 3, 10);
        Circulo c2 = new Circulo(50, 45, 5);
        Circulo circuloGrande = c1.elMayor(c2);
        System.out.println("el círculo mayor: ");
        System.out.println("\t coordenadaX: " + circuloGrande.coordenadaX);
        System.out.println("\t coordenaday: " + circuloGrande.coordenadaY);
        System.out.println("\t radio: " + circuloGrande.radio);
        System.out.println("demostramos que aunque circuloGrande incialmente es copia de c1 son objetos diferentes");
        System.out.println("cambiamos el radio de circulo grande pero no cambia el de c1");
        circuloGrande.radio = -99;
        System.out.println(circuloGrande.radio + ", " + c1.radio);
    }
}