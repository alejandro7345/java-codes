 import java.util.Scanner;

public class Codigo_Barras {


   


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];  // Un arreglo para almacenar los números ingresados

        // Leer cinco números entre 1 y 30
        for (int i = 0; i < 5; i++) {
            int numero;
            do {
                System.out.print("Introduce un numero entre 1 y 30: ");
                numero = scanner.nextInt();
            } while (numero < 1 || numero > 30);

            numeros[i] = numero;
        }

        // Mostrar las barras de asteriscos
        System.out.println("Barras de asteriscos:");
        for (int i = 0; i < 5; i++) {
            int numero = numeros[i];
            for (int j = 0; j < numero; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}

    

