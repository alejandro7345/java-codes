public class SobrecargarMetodos {

    public static void main(String[] args) {
        System.out.printf("el cuadrado de el entero 7 es %d%n",cuadrado(7));
        System.out.printf("el cusdrado de double 7.5 es %f%n",cuadrado(7.5));

    }
    public static int cuadrado(int valorint){
        System.out.printf("%n Se llamo a cuadrado con argumento int: %d%n",valorint);
        return valorint*valorint;
    }
    public static double cuadrado(double valordouble){
        System.out.printf("%n Se llamo a cuadrado con argumento int: %d%n",valordouble);
        return  (valordouble*valordouble);
    }
    
}
