package es.itrafa.b5.prog_ev1_u2_b5_e8;

/*
    EJERCICIO U2_B5_E8:
    Incorpora un constructor copia al siguiente código y utilízalo desde elMayor()
    class Circulo{
        int coordenadaX;
        int coordenadaY;
        int radio;

        Circulo(int coordenadaX, int coordenadaY, int radio){
            this.coordenadaX=coordenadaX;
            this.coordenadaY=coordenadaY;
            this.radio=radio;
        }
        Circulo elMayor(Circulo c){
            Circulo copiaThis= new Circulo(this.coordenadaX,this.coordenadaY,this.radio);
            Circulo copiaC=new Circulo(c.coordenadaX,c.coordenadaY,c.radio);
            return this.radio>c.radio? copiaThis:copiaC;
        }
    }

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

    Circulo(int coordenadaX, int coordenadaY, int radio) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.radio = radio;
    }
    Circulo(Circulo c) {
        this(c.coordenadaX, c.coordenadaY, c.radio);
    }

    Circulo elMayor(Circulo c) {
        return (this.radio > c.radio) ?
                new Circulo(this) :
                new Circulo(c);
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
        System.out.println("demostramos que aunque circuloGrande inicialmente es copia de c1 son objetos diferentes");
        System.out.println("cambiamos el radio de circulo grande pero no cambia el de c1");
        circuloGrande.radio = -99;
        System.out.println(circuloGrande.radio + ", " + c1.radio);
    }
}