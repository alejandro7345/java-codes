import java.util.Scanner;

public class ejerk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        


            System.out.print("Kilometros conducidos (-1 para salir): ");
            int kilometros = scanner.nextInt();

           

            System.out.print("Litros de combustible usados: ");
            int litros = scanner.nextInt();

           
            double kilometrosPorLitro = (double) kilometros / litros;

            System.out.printf("Kilometros por litro para este viaje: %.2f%n", kilometrosPorLitro);

          
        

        

        scanner.close();
    }
}
