import java.util.Scanner;

public class TrianguloRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer los tres enteros
        System.out.println("Ingrese el primer entero:");
        int a = scanner.nextInt();
        
        System.out.println("Ingrese el segundo entero:");
        int b = scanner.nextInt();
        
        System.out.println("Ingrese el tercer entero:");
        int c = scanner.nextInt();
        
        // Verificar si los enteros forman un triángulo rectángulo
        if (esTrianguloRectangulo(a, b, c)) {
            System.out.println("Los enteros ingresados podrian representar los lados de un triangulo rectangulo.");
        } else {
            System.out.println("Los enteros ingresados NO podran representar los lados de un triangulo rectangulo.");
        }
        
        scanner.close();
    }
    
    public static boolean esTrianguloRectangulo(int a, int b, int c) {
        // Verificar la condición de los lados de un triángulo rectángulo (Teorema de Pitágoras)
        return (a * a == b * b + c * c) ||
                (b * b == a * a + c * c) ||
                (c * c == a * a + b * b);
    }
}