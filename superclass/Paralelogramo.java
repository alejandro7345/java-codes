class Paralelogramo extends CuadrilateroCalculo {
    public Paralelogramo(Punto punto1, Punto punto2, Punto punto3, Punto punto4){
        super(punto1, punto2, punto3, punto4);
    }
 
    //Calcular el area del paralelogrtamo
    @Override
    public double calcularArea(){

        double base= distanciaEntrePuntos(getPunto1(), getPunto2());
        double altura= Math.abs(getPunto1().getY() - getPunto3().getY());

        double area= base*altura;
        return area;
    }

    //Calcular el perimetro del paralelogramo
    @Override
    public double calcularPerimetro(){

        double lado1 = distanciaEntrePuntos(getPunto1(), getPunto2());
        double lado2 = distanciaEntrePuntos(getPunto2(), getPunto3());
        
        return 2*(lado1+lado2);
    }
}

