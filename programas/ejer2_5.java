import java.util.Scanner;

public class ejer2_5 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " es un múltiplo de " + numero2);
        } else {
            System.out.println(numero1 + " no es un múltiplo de " + numero2);
        }

        scanner.close();
    }
    
}
