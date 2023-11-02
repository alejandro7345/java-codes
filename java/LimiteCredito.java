import java.util.Scanner;

public class LimiteCredito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        @SuppressWarnings("unused")
        int numeroCuenta;
        System.out.print("Ingrese el numero de cuenta: ");
        numeroCuenta = scanner.nextInt();

        System.out.print("Ingrese el saldo al inicio del mes: ");
        int saldoInicial = scanner.nextInt();

        System.out.print("Ingrese el total de todos los articulos cargados por el cliente en el mes: ");
        int cargos = scanner.nextInt();

        System.out.print("Ingrese el total de todos los creditos aplicados a la cuenta del cliente en el mes: ");
        int creditos = scanner.nextInt();

        System.out.print("Ingrese el limite de credito permitido: ");
        int limiteCredito = scanner.nextInt();

        int nuevoSaldo = saldoInicial + cargos - creditos;

        System.out.println("Nuevo saldo: " + nuevoSaldo);

        if (nuevoSaldo > limiteCredito) {
            System.out.println("Se excedio el limite de su credito.");
        }

        scanner.close();
    }
}