package es.itrafa.tarea1_Unidad2;

public class Punto2D {
    private double cx;
    private double cy;

    // GETTER / SETTER
    public double getX(){
        return this.cx;
    }

    public void setX(double cx){
        this.cx = cx;
    }

    public double getY(){
        return this.cy;
    }

    public void setY(double cy){
        this.cy = cy;
    }
    // CONSTRUCTORS
    Punto2D(){
        cx = 0.0;
        cy = 0.0;
    }

    Punto2D(double cx, double cy){
        this.cx = cx;
        this.cy = cy;
    }

    Punto2D(Punto2D p){
        this.cx = p.getX();
        this.cy = p.getY();
    }

    // METHODS
    /**
     * toString() Convierte el punto 2d en texto
     *
     */
    public String toString(){
        return "Punto2D[" + this.cx +
                "," + this.cy + "]";
    }

    /**
     * flip(), que intercambiará el valor de
     * las coordenadas X e Y del objeto
     */
    public void flip(){
        double back = cx;
        this.cx = this.cy;
        this.cy = back;
    }

    /**
     * dist(Punto2D p), que devolverá la distancia
     * al punto pasado como parámetro, calculada
     * como:
     *  raíz cuadrada de ((x2-x1)² + (y2-y1)²)
     */
    public double dist(Punto2D p){
        double x = p.getX() - this.cx;
        double y =  p.getY() - this.cy;

        return Math.sqrt((x * x) + (y * y));
    }

    /**
     * manhattanDist(Punto2D p), que devuelve la
     * distancia "Manhattan" al punto pasado como
     * parámetro. Esta distancia se calcula como
     * longitud del recorrido entre ambos puntos
     * teniendo en cuenta que sólo nos podemos
     * desplazar de forma horizontal y vertical

     */
    public double manhattanDist(Punto2D p){
        return Math.abs(p.getX()-this.cx) + Math.abs(p.getY()-this.cy);
    }
    /**
     * slope(Punto2D p), que devolverá la pendiente
     * existente entre el punto actual y el punto
     * pasado como argumento.
     * Dicha pendiente la calcularemos como el
     * cociente de la división de la diferencia de
     * las coordenadas Y entre la diferencia de las
     * coordenadas en X
     */
    public double slope(Punto2D p){
        return  (p.getY() - this.cy) / (p.getX() - this.cx) ;
    }
}
