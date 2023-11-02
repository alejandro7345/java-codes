
    import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero entero de cinco digitos: ");
        int numero = scanner.nextInt();

        // Verificar que el número tenga cinco dígitos
        if (numero < 10000 || numero > 99999) {
            System.out.println("El numero no es de cinco digitos. Introduce un nuevo valor.");
        } else {
            // Convertir el número a una cadena para facilitar la comparación
            String numeroStr = Integer.toString(numero);

            // Comprobar si la cadena es un palíndromo
            boolean esPalindromo = true;
            int longitud = numeroStr.length();
            for (int i = 0; i < longitud / 2; i++) {
                if (numeroStr.charAt(i) != numeroStr.charAt(longitud - 1 - i)) {
                    esPalindromo = false;
                    break;
                }
            }

            if (esPalindromo) {
                System.out.println("El numero es un palindromo.");
            } else {
                System.out.println("El numero no es un palindromo.");
            }
        }
        scanner.close();
    }
}

    

