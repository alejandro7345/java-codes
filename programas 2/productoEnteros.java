public class productoEnteros {

    
        public static void main(String[] args) {
            int producto = 1;
    
            for (int numero = 1; numero <= 15; numero += 2) {
                producto *= numero;
            }
    
            System.out.println("El producto de los enteros impares del 1 al 15 es: " + producto);
        }
    }
    
    

