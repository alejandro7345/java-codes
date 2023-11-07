public class CuadrilateroMain {

    public static void main(String[] args){

        //Cuadrado
        Punto punto1= new Punto(0, 0);
        Punto punto2= new Punto(4, 0);
        Punto punto3= new Punto(4, 2);
        Punto punto4= new Punto(0, 2);

        Cuadrado cuadrado= new Cuadrado(punto1, punto2, punto3, punto4);
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perimetro del cuadrado: " + cuadrado.calcularPerimetro() + "\n");

        //Rectangulo
        Punto puntoRect1= new Punto(0, 0);
        Punto puntoRect2= new Punto(6, 0);
        Punto puntoRect3= new Punto(6, 3);
        Punto puntoRect4= new Punto(0, 3);

        Rectangulo rectangulo= new Rectangulo(puntoRect1, puntoRect2, puntoRect3, puntoRect4);
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
        System.out.println("Perimetro del rectangulo: " + rectangulo.calcularPerimetro() + "\n");

        //Paralelogramo 
        Punto puntoPar1= new Punto(0, 0);
        Punto puntoPar2= new Punto(5, 0);
        Punto puntoPar3= new Punto(3, 4);
        Punto puntoPar4= new Punto(2, 4);

        Paralelogramo paralelogramo= new Paralelogramo(puntoPar1, puntoPar2, puntoPar3, puntoPar4);
        System.out.println("Area del paralegramo: " + paralelogramo.calcularArea());
        System.out.println("Perimetro del paralelogramo: " + paralelogramo.calcularPerimetro() + "\n");

        //Trapezoide
        Punto puntoTrap1 = new Punto(0 ,0);
        Punto puntoTrap2 = new Punto(6 ,0);
        Punto puntoTrap3 = new Punto(4 ,3);
        Punto puntoTrap4 = new Punto(2 ,3);

        Trapezoide trapezoide= new Trapezoide(puntoTrap1, puntoTrap2, puntoTrap3, puntoTrap4);
        System.out.println("Area del Trapezoide: " + trapezoide.calcularArea());
        System.out.println("Perimetro del trapezoide: " + trapezoide.calcularPerimetro() + "\n");
    } 
    
}
