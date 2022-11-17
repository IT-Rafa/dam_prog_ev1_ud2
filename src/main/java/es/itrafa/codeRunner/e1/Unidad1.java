package es.itrafa.codeRunner.e1;
/*
    Escribe una clase que encapsule las típicas coordenadas x y en un objeto. Las coordenadas siempre son enteras.
    Además, la clase tiene los siguientes métodos:
    • sumarCoordenadas() que devuelve la suma de las coordenadas x e y
    • dividirCoordenadas() que devuelve la división de las coordenadas x e y
 */
class Coordenadas{
    // ATTRIBUTES
    int x;
    int y;

    // METHODS
    public int sumarCoordenadas(){
        return x+y;
    }
    public double dividirCoordenadas(){
        return (double)x / y;
    }
}
class Unidad1 {
    public static void main(String[] args) {
        Coordenadas punto1= new Coordenadas();
        punto1.x=3;
        punto1.y=8;
        System.out.println("("+punto1.x+","+punto1.y+")");

        Coordenadas punto2= new Coordenadas();
        punto2.x=5;
        punto2.y=5;
        System.out.println(punto2.sumarCoordenadas());

        Coordenadas punto3= new Coordenadas();
        punto3.x=5;
        punto3.y=2;
        System.out.println(punto3.sumarCoordenadas());

        Coordenadas punto4= new Coordenadas();
        punto4.x=10;
        punto4.y=8;
        System.out.println(punto4.dividirCoordenadas());

    }
}