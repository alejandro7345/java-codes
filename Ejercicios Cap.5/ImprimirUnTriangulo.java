public class ImprimirUnTriangulo {
    public static void main(String[] args) {
        // Patrón a
        System.out.println("Patron a");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // Patrón b
         System.out.println("Patron b");
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // Patrón c
         System.out.println("Patron c");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // Patrón d
         System.out.println("Patron d");
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}