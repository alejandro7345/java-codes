
    
import java.util.Scanner;

public class EncontrarMenor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de valores a ingresar
        System.out.print("Introduce la cantidad de valores a ingresar: ");
        int cantidadValores = scanner.nextInt();

        // Verificar que la cantidad de valores sea al menos 1
        if (cantidadValores < 1) {
            System.out.println("Debes ingresar al menos un valor.");
            
        }

        // Solicitar los valores al usuario y encontrar el menor
        System.out.print("Introduce el primer valor: ");
        int menor = scanner.nextInt();

        for (int i = 1; i < cantidadValores; i++) {
            System.out.print("Introduce el siguiente valor: ");
            int valor = scanner.nextInt();

            if (valor < menor) {
                menor = valor;
            }
        }

        // Mostrar el menor valor
        System.out.println("El menor valor ingresado es: " + menor);
        scanner.close();
    }
}

