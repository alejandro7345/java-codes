public class PruebaSistemaNomina {
    public static void main(String[] args) {
        // Crea objetos de las subclases con fecha de nacimiento
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 0.9, new Fecha(10, 20, 1990));
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Karen", "Price", "222-22-2222", 16.75, 40, new Fecha(12, 15, 1985));
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Sue", "Jones", "333-33-3333", 10000, .06, new Fecha(10, 10, 1978));
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444", 5000, .04, 300, new Fecha(7, 17, 1992));

        Empleado[] empleados = {empleadoAsalariado, empleadoPorHoras, empleadoPorComision, empleadoBaseMasComision};

        System.out.println("Empleados procesados en forma polimorfica:\n");

        // Obtén el mes actual (simulado)
        int mesActual = obtenerMesActual();

        // Procesa en forma genérica a cada elemento en el arreglo de empleados
        for (Empleado empleadoActual : empleados) {
            System.out.println(empleadoActual);  // invoca a toString

            if (empleadoActual.obtenerFecha().obtenerMes() == mesActual) {
                System.out.println("¡Es el mes de cumpleanios!");

                // Aplica la bonificación
                double ingresosConBonificacion = empleadoActual.ingresos() + 100.0;
                System.out.printf("Ingresos con bonificación: $%,.2f%n%n", ingresosConBonificacion);
            } else {
                System.out.printf("Ingresos: $%,.2f%n%n", empleadoActual.ingresos());
            }
        }
    }

    // Método para obtener el mes actual (simulado)
    public static int obtenerMesActual() {
        // Lógica para obtener el mes actual, por ejemplo, utilizando la fecha y el tiempo del sistema
        return 11; // Aquí suponemos que es noviembre (mes 11)
    }
}
