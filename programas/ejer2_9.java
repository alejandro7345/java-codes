
 import java.util.Scanner;

public class ejer2_9 {

   


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerosNegativos = 0;
        int numerosPositivos = 0;
        int ceros = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                numerosNegativos++;
            } else if (numero > 0) {
                numerosPositivos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Cantidad de números negativos: " + numerosNegativos);
        System.out.println("Cantidad de números positivos: " + numerosPositivos);
        System.out.println("Cantidad de ceros: " + ceros);

        scanner.close();
    }
}

    

