import java.util.Scanner;
//Diámetro, circunferencia y área de un círculo

public class ejer2_6 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo (entero): ");
        int radio = scanner.nextInt();

        double diametro = 2 * radio;
        double circunferencia = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;

        System.out.printf("Diámetro: %.2f%n", diametro);
        System.out.printf("Circunferencia: %.2f%n", circunferencia);
        System.out.printf("Área: %.2f%n", area);

        scanner.close();
    }
    
}
