class Trapezoide extends CuadrilateroCalculo{
    public Trapezoide(Punto punto1, Punto punto2, Punto punto3, Punto punto4){
        super(punto1, punto2, punto3, punto4);
    }

    //Calcular el area del trapeziode
    @Override
    public double calcularArea(){
        double baseMayor = distanciaEntrePuntos(getPunto1(), getPunto2());
        double baseMenor = distanciaEntrePuntos(getPunto3(), getPunto4());
        double altura = Math.abs(getPunto1().getY() - getPunto3().getY());

        double area = 0.5*(baseMayor+baseMenor)*altura;
        return area;
    }

    //Calcular el perimetro del trapezoide
    @Override
    public double calcularPerimetro(){
        double lado1 = distanciaEntrePuntos(getPunto1(), getPunto2());
        double lado2 = distanciaEntrePuntos(getPunto2(), getPunto3());
        double lado3 = distanciaEntrePuntos(getPunto3(), getPunto4());
        double lado4 = distanciaEntrePuntos(getPunto4(), getPunto1());

        return lado1+lado2+lado3+lado4;
    }
}
