import java.util.Scanner;

public class minimo_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Introduce el tercer número: ");
        double numero3 = scanner.nextDouble();

        double minimo = minimo3(numero1, numero2, numero3);

        System.out.println("El valor mínimo de los tres números es: " + minimo);
        scanner.close();
    }

    public static double minimo3(double num1, double num2, double num3) {
        return Math.min(Math.min(num1, num2), num3);

    }
}

