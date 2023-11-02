import java.util.Scanner;

public class LadosTriangulo {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lectura de los tres enteros
        System.out.println("Ingrese el primer entero:");
        int a = scanner.nextInt();
        
        System.out.println("Ingrese el segundo entero:");
        int b = scanner.nextInt();
        
        System.out.println("Ingrese el tercer entero:");
        int c = scanner.nextInt();
        
        // Comprobación si pueden formar un triángulo rectángulo
        if (esTrianguloRectangulo(a, b, c)) {
            System.out.println("Los enteros pueden representar los lados de un triangulo rectangulo.");
        } else {
            System.out.println("Los enteros no pueden representar los lados de un triangulo rectangulo.");
        }
        
        // Cierra el Scanner
        scanner.close();
    }
  
    // Función para comprobar si los enteros pueden formar un triángulo rectángulo
    public static boolean esTrianguloRectangulo(int a, int b, int c) {
        // Comprobar si se cumple el teorema de Pitágoras
        if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
            return true;
        }
        return false;
    }
}