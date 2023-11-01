
 import java.util.Scanner;

public class multiplom {


   


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el primer número (0 para salir): ");
            int primerNumero = scanner.nextInt();

            if (primerNumero == 0) {
                break;
            }

            System.out.print("Ingrese el segundo número: ");
            int segundoNumero = scanner.nextInt();

            if (esMultiplo(primerNumero, segundoNumero)) {
                System.out.println("El segundo número es múltiplo del primero.");
            } else {
                System.out.println("El segundo número no es múltiplo del primero.");
            }
        }

        scanner.close();
    }

    public static boolean esMultiplo(int numero1, int numero2) {
        return numero2 % numero1 == 0;
    }
}

    

