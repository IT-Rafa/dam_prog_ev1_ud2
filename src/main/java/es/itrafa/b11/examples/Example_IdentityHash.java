package es.itrafa.b11.examples;

class MiClase{
    int x=34;
    public String toString(){return ""+x;}
}
class Example_IdentityHash {
    public static void main(String[] args) {
        System.out.println("Creamos objeto MiClase mc");
        MiClase mc= new MiClase();
        System.out.println("\tContenido: " + mc);
        System.out.println("\tcódigo String: " + System.identityHashCode(mc));

        System.out.println("Creamos objeto String s");
        String s="hola";
        System.out.println("\tContenido: " + s);
        System.out.println("\tcódigo String: " + System.identityHashCode(s));
    }
}