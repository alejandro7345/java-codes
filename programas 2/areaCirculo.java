import java.util.Scanner;

public class areaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el radio del círculo
        System.out.print("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular y mostrar el área del círculo
        double area = circuloArea(radio);
        System.out.println("El área del círculo es: " + area);
        scanner.close();
    }

    // Método para calcular el área de un círculo
    public static double circuloArea(double radio) {
        return Math.PI * radio * radio;


    }
}
