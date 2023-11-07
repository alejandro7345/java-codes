public class CuadrilateroCalculo {
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;
    private Punto punto4;

    public CuadrilateroCalculo(Punto punto1, Punto punto2, Punto punto3, Punto punto4){
        this.punto1=punto1;
        this.punto2=punto2;
        this.punto3=punto3;
        this.punto4=punto4;
    }

    public Punto getPunto1(){
        return punto1;
    }
    public Punto getPunto2(){
        return punto2;
    }
    public Punto getPunto3(){
        return punto3;
    }
    public Punto getPunto4(){
        return punto4;
    }

    public double calcularArea(){
        double x1 = punto1.getX();
        double y1 = punto1.getY();
        double x2 = punto2.getX();
        double y2 = punto2.getY();
        double x3 = punto3.getX();
        double y3 = punto3.getY();
        double x4 = punto4.getX();
        double y4 = punto4.getY();

        double area = 0.5*Math.abs(x1*y2+x2*y3+x3*y4+x4*y1 -y1*x2)-y2*x3-y3*x4-y4*x1;
        return area;
    }

    //Calcular el perimetro de un cuadrialtero sumando sus lados
    public double calcularPerimetro(){

        double lado1 = distanciaEntrePuntos(punto1, punto2);
        double lado2 = distanciaEntrePuntos(punto2, punto3);
        double lado3 = distanciaEntrePuntos(punto3, punto4);
        double lado4 = distanciaEntrePuntos(punto3, punto4);
        
        return lado1+lado2+lado3+lado4;
    }

    //Calcular la distancia entre dos puntos
    public double distanciaEntrePuntos(Punto p1, Punto p2){

        return Math.sqrt(Math.pow(p2.getX() - p1.getX(),2) + Math.pow(p2.getY() - p1.getY(),2));
    }

}
