 import java.util.Scanner;


public class ejer2_1 {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
    
        System.out.print("Ingrese el primer numero: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();

       
        double suma = numero1 + numero2;
        double producto = numero1 * numero2;
        double diferencia = numero1 - numero2;
        double cociente = numero1 / numero2;

        
        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);
        System.out.println("Diferencia: " + diferencia);
        System.out.println("Cociente: " + cociente);

        scanner.close();
    }
}

    

