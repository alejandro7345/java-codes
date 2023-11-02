import java.util.Scanner;

public class ValorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de valores:");
        int cantidadValores = scanner.nextInt();

        System.out.println("Ingrese los valores:");
        int m = Integer.MAX_VALUE;

        for (int i = 0; i < cantidadValores; i++) {
            int v = scanner.nextInt();
            if (v < m) {
                m = v;
            }
        }

        System.out.println("El menor valor es: " + m);

        scanner.close();
    }
}