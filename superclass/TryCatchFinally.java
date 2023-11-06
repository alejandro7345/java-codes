

    public class TryCatchFinally{
        public static void main(String[] args) {
            try {
                // Código que puede lanzar una excepción
                int resultado = dividir(10, 0);
                System.out.println(resultado);
            } catch (ArithmeticException e) {
                // Manejo de la excepción
                System.out.println("Se ha producido una excepción: " + e.getMessage());
            } finally {
                // Bloque finally: se ejecutará siempre, ocurra o no una excepción
                System.out.println("Bloque finally: Esto se ejecuta siempre");
            }

        }
    
        public static int dividir(int numerador, int denominador) {
            if (denominador == 0) {
                throw new ArithmeticException("División por cero");
            }
            return numerador / denominador;
        }
    }
    
    

