

    import java.util.Scanner;

public class distancia_dos_puntos  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la coordenada x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Introduce la coordenada y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Introduce la coordenada x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Introduce la coordenada y2: ");
        double y2 = scanner.nextDouble();

        double distancia = distancia(x1, y1, x2, y2);

        System.out.println("La distancia entre los puntos es: " + distancia);
        scanner.close();
    }

    public static double distancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

    

