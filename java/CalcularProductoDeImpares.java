import java.text.DecimalFormat;

public class CalcularProductoDeImpares {
    public static void main(String[] args) {
        int producto = 1;

        for (int i = 1; i <= 15; i += 2) {
            producto *= i;
        }

        DecimalFormat formatter = new DecimalFormat("#,###");
        String resultadoFormateado = formatter.format(producto);

        System.out.println("El producto de los enteros impares del 1 al 15 es: " + resultadoFormateado);
    }
}