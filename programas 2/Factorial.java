public class Factorial{
    public static void main(String[] args) {
        System.out.println("Número\tFactorial");
        
        for (int i = 1; i <= 20; i++) {
            long factorial = calcularFactorial(i);
            System.out.println(i + "\t" + factorial);
        }
    }

    public static long calcularFactorial(int n) {
        if (n == 0) {
            return 1; // 0! es 1 por definición.
        }
        
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}

