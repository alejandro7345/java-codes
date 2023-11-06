import java.util.Scanner;

public class Esferamath {

    public static void main(String[] args)
    {

    Scanner entrada = new Scanner(System.in);

    System.out.println("escriba el radio de la esfera ");
    double radio = entrada.nextDouble();

    System.out.printf("el volumen es %f%n",volumenEsfera(radio));
    entrada.close();
}
// fin de main

// calcula y devuelve el volumen de una esfera
    public static double volumenEsfera(double radio)
    {
    double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    return volumen;
} 
// fin del método volumenEsfera
}
