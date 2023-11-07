public class PruebaEmpleadoPorComicion {

    public static void main(String[] args) {
        
        EmpleadPorComision empleado=new EmpleadPorComision("Sue", "Jones", "222-22-2222", 10000, .06);
        System.out.println("informacion del empleado obtenida por los metodos establecer :");
        System.out.printf("%n%s %s%n ", "el primer nombre es ", empleado.obtenerprimernombre());
        System.out.printf("%s %s%n", "el apellido paterno es ",empleado.obtenerapellidopaterno());
        System.out.printf("%s %s%n", "el numero de seguro social es ",empleado.obtenernumerosegurosocial());
         System.out.printf("%s %s%n", "las ventas brutas son",empleado.obtenerventasbrutas());
          System.out.printf("%s %s%n", "la tarifa de comision es ",empleado.obtenertarifacomicion());
        
          empleado.establecerventasbrutas(500);
          empleado.establecertarifacomicion(.1);

          System.out.printf("%n%s:%n%n%s%n", "informacion actualizada del empleado , obtenida mediante  toString",empleado);
        
        
    }
    
}
