import java.util.Scanner;

public class CuadradoHueco { 
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño del lado del cuadrado (entre 1 y 20): ");
        int lado = scanner.nextInt();

        // Verificar que el tamaño esté dentro del rango permitido
        if (lado < 1 || lado > 20) {
            System.out.println("El tamaño del lado debe estar entre 1 y 20.");
        } else {
            // Dibujar el cuadrado
            for (int i = 0; i < lado; i++) {

                for (int j = 0; j < lado; j++) {

                    if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        scanner.close();
}


}

    

