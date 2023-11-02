public class Factoriales {
    public static void main(String[] args) {
        System.out.println("Numero\tFactorial");
        
        for (int i = 1; i <= 20; i++) {
            long factorial = calcularFactorial(i);
            System.out.println(i + "\t" + factorial);
        }
    }
    
    public static long calcularFactorial(int numero) {
        long factorial = 1;
        
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
}