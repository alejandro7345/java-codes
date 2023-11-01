import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Ingrese el nombre del cliente:");
        String cliente = scanner.nextLine();

        System.out.println("Ingrese la fecha de la factura:");
        String fecha = scanner.nextLine();

        LineaFactura[] factura = new LineaFactura[3];




        for (int i = 0; i < factura.length; i++) {
            System.out.println("Ingrese el nombre del producto " + (i + 1) + ":");
            String producto = scanner.nextLine();

            System.out.println("Ingrese la cantidad de " + producto + ":");
            int cantidad = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el precio unitario de " + producto + ":");
            double precioUnitario = Double.parseDouble(scanner.nextLine());

            factura[i] = new LineaFactura(cantidad, producto, precioUnitario);
        }








        Factura facturaActual = new Factura(cliente, fecha, factura);

        System.out.println("           ****FACTURA****           ");
        System.out.println("*************************************");
        System.out.println("  Fecha: " + facturaActual.fecha    );

        System.out.println("  Cliente: " + facturaActual.cliente);
     
        System.out.println("cantidad"+factura);
        
        System.out.println("  Total de la factura: -------$" + facturaActual.getTotal());

        scanner.close();
    }
}

