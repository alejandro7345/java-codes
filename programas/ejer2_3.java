
import java.util.Scanner;
public class ejer2_3 {



    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el primer entero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo entero: ");
        int numero2 = scanner.nextInt();
        System.out.print("Ingrese el tercer entero: ");
        int numero3 = scanner.nextInt();

        
        int suma = numero1 + numero2 + numero3;
        int promedio = suma / 3;
        int producto = numero1 * numero2 * numero3;
        int menor = Math.min(Math.min(numero1, numero2), numero3);
        int mayor = Math.max(Math.max(numero1, numero2), numero3);

        
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Producto: " + producto);
        System.out.println("Menor: " + menor);
        System.out.println("Mayor: " + mayor);

        scanner.close();
    }
}

    

