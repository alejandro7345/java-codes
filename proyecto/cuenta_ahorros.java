public class cuenta_ahorros {

    private static double tasaInteresAnual;
    private double saldoAhorros;

    public cuenta_ahorros(double saldoInicial) {
        saldoAhorros = saldoInicial;
    }

    public void calcularInteresMensual() {
        double interesMensual = saldoAhorros * (tasaInteresAnual / 12);
        saldoAhorros += interesMensual;
    }

    public static void modificarTasaInteres(double nuevaTasa) {
        tasaInteresAnual = nuevaTasa;
    }

    public double obtenerSaldoAhorros() {
        return saldoAhorros;
    }



    public static void main(String[] args) {
        cuenta_ahorros. modificarTasaInteres(0.04); // Establecer tasa de interés al 4%

        cuenta_ahorros ahorrador1 = new cuenta_ahorros(2000.00);
        cuenta_ahorros ahorrador2 = new cuenta_ahorros(3000.00);

        for (int mes = 1; mes <= 12; mes++) {
            ahorrador1.calcularInteresMensual();
            ahorrador2.calcularInteresMensual();

            System.out.printf("Mes %d - Saldo Ahorrador 1: %.2f,    Saldo Ahorrador 2: %.2f%n", mes, ahorrador1.obtenerSaldoAhorros(), ahorrador2.obtenerSaldoAhorros());
            System.out.println("");
        }

        cuenta_ahorros.modificarTasaInteres(0.05); // Establecer tasa de interés al 5%
        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        System.out.println("Mes 13 - Saldo Ahorrador 1:  " + ahorrador1.obtenerSaldoAhorros());
        System.out.println("");
        System.out.println("Mes 13 - Saldo Ahorrador 2:  " + ahorrador2.obtenerSaldoAhorros());
    }
}
