public class ejer2_8 {

//tabla cuadrados y cubos
  
        public static void main(String[] args) {
            System.out.println("numero  cuadrado  cubo");
            
            for (int numero = 0; numero <= 10; numero++) {
                int cuadrado = numero * numero;
                int cubo = numero * numero * numero;
                
                System.out.printf("%6d  %8d  %4d%n", numero, cuadrado, cubo);
            }
        }
    }
    
    

