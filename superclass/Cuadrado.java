class Cuadrado extends Rectangulo{
    public Cuadrado(Punto punto1, Punto punto2, Punto punto3, Punto punto4){
        super(punto1, punto2, punto3, punto4);
    }
    
    //Calcular el area del cuadrado

    public double calcularArea(){
        
        double lado= distanciaEntrePuntos(getPunto1(), getPunto2());
        double area= lado*lado;

        return area;
    }

    //Calcular el perimetro del cuadado
    
    public double calcularPerimetro(){

        double lado= distanciaEntrePuntos(getPunto1(), getPunto2());

        return 4*lado;
    }
}

