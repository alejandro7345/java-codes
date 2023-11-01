import java.util.Scanner;

public class Rectangulo {



    double longitud;
    double anchura;

    public Rectangulo(){

        this.longitud=1.0;
        this.anchura=1.0;
        
    }


    public void setLongitud(double longitud) {
        if (longitud > 0) {
            this.longitud = longitud;
        } else {
            System.out.println("La longitud debe ser un número positivo.");
        }
    }

    public void setAnchura(double anchura) {
        if (anchura > 0) {
            this.anchura = anchura;
        } else {
            System.out.println("La anchura debe ser un número positivo.");
        }
    }

    public double CalcularPerimetro(){
        return 2*(longitud+anchura);

    }


    public double calcularArea() {
        return (longitud * anchura);
    }

        
    public double getLongitud() {
        return longitud;
    }

    public double getAnchura() {
        return anchura;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double longi=1;
        double ancho=1;
        Rectangulo miRectangulo = new Rectangulo();
        System.out.println("ingrese el la longitud del reectangulo");
        longi=scanner.nextDouble();
        miRectangulo.setLongitud(longi);
        System.out.println("ingrese el ancho del rectangulo");
        ancho=scanner.nextDouble();

        miRectangulo.setLongitud(longi);
        miRectangulo.setAnchura(ancho);

        System.out.println("Longitud: " + miRectangulo.getLongitud());
        System.out.println("Anchura: " + miRectangulo.getAnchura());
        System.out.println("Perimetro: " + miRectangulo.CalcularPerimetro());
        System.out.println("area:"+ miRectangulo.calcularArea());
       
        

        

        scanner.close();






    }

    

    
}