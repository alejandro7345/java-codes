public class EmpleadPorComision extends Object
{
private final String primerNombre;
private final String apellidopaterno;
private final String numerosegurosocial;
private double ventasbrutas;
private double tarifacomicion;

public EmpleadPorComision(String primernombre,String apellidopaterno,String numerosegurosocial,double ventasbrutas,double tarifacomicion)
{
if(ventasbrutas<0.0)
   throw new IllegalArgumentException("las ventas brutas deben ser >=0.0");


if (tarifacomicion<=0.0 || tarifacomicion>=1.0) {
    throw new IllegalArgumentException("la tarifa de comicion debe ser >0.0 y 1.0");
    
    
}
this.primerNombre=primernombre;
this.apellidopaterno=apellidopaterno;
this.numerosegurosocial=numerosegurosocial;
this.ventasbrutas=ventasbrutas;
this.tarifacomicion=tarifacomicion;


}
public String obtenerprimernombre(){
    return primerNombre;
}

public String obtenerapellidopaterno(){
    return apellidopaterno;
}
public String obtenernumerosegurosocial(){
    return numerosegurosocial;
}
public void establecerventasbrutas(double ventasbrutas){
    if (ventasbrutas>=0.0) {
        throw new IllegalArgumentException("las ventas brutas deben ser >=0.0");
    }
        
        this.ventasbrutas=ventasbrutas;
        
    }

    public double obtenerventasbrutas(){
        return ventasbrutas;
    }
    public void establecertarifacomicion(double tarifacomicion){
        if (tarifacomicion<=0.0 || tarifacomicion>=1.0) {
            throw new IllegalArgumentException("la tarifa de comicion debe ser >0.0 y < 1.0");
            
            
        }
        this.tarifacomicion=tarifacomicion;
    }
    public double obtenertarifacomicion(){
        return tarifacomicion;
    }
    public double ingreso(){
        return tarifacomicion*ventasbrutas;
    }
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%S: %.2f%n%s: %.2f%", "empleado por comision",primerNombre,apellidopaterno,"numer de seguro social",numerosegurosocial,"ventas brutas",ventasbrutas,"tarifa de comision",tarifacomicion);
    }
}
    
