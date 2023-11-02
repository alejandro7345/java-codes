
import java.util.Scanner;

public class FaC{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la conversión:");
        System.out.println("1. Fahrenheit a Centígrados");
        System.out.println("2. Centígrados a Fahrenheit");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                 System.out.print("Introduce la temperatura en grados Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double centigrados = centigrados(fahrenheit);
            System.out.println("Equivalente en grados Centígrados: " + centigrados);
                break;

                case 2:
                 System.out.print("Introduce la temperatura en grados Centígrados: ");
            double centigrado = scanner.nextDouble();
            double fahrenhei = fahrenheit(centigrado);
            System.out.println("Equivalente en grados Fahrenheit: " + fahrenhei);
            break;
        
            default:
             System.out.println("Opción no válida.");
                break;
        }
            
       
       
        scanner.close();
    }

    public static double centigrados(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double fahrenheit(double centigrados) {
        return 9.0 / 5.0 * centigrados + 32;
    }
}

    

