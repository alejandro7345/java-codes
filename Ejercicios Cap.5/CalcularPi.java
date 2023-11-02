public class CalcularPi {
    public static void main(String[] args) {
        int terminos = 200000;
        double pi = 0;
        int terminosRequeridos = 0;
        
        System.out.println("Tabla de valores aproximados de pi:");
        System.out.println("Terminos\t Valor Aproximado");
        
        //Calculo del valor pi
        for (int i = 1; i <= terminos; i++) {
            double termino = 4.0 / (2 * i - 1);
            
            if (i % 2 == 0) {
                pi -= termino;
            } else {
                pi += termino;
            }
            
            // Imprimir el valor de pi para cada término
            System.out.printf("%-9d %.10f\n", i, pi);
            
            // Comprobar si el valor comienza con 3.14159
            String piString = String.format("%.10f", pi);
            if (piString.startsWith("3.14159")) {
                terminosRequeridos = i;
                break;
            }
        }
        
        System.out.println("Cantidad de terminos requeridos para obtener un valor que comience con 3.14159: " + terminosRequeridos);
    }
}