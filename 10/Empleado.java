public abstract class Empleado
  {
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    private final Fecha fechaNacimiento;
  
  // constructor
    public Empleado(String primerNombre, String apellidoPaterno, 
    String numeroSeguroSocial,Fecha FechaNacimiento)
    {
    this.primerNombre = primerNombre;
    this.apellidoPaterno = apellidoPaterno;
    this.numeroSeguroSocial = numeroSeguroSocial;
    this.fechaNacimiento=FechaNacimiento;
    } 

  // devuelve el primer nombre
    public String obtenerPrimerNombre()
    {
    return primerNombre;
    }

    // devuelve el apellido paterno
    public String obtenerApellidoPaterno()
    {
        return apellidoPaterno;
  } 

// devuelve el número de seguro social
public String obtenerNumeroSeguroSocial(){
    return numeroSeguroSocial;
      }

      public Fecha obtenerFecha(){
      return fechaNacimiento;
      }


      public int obtenerMesCumpleaos() {

        return fechaNacimiento.obtenerMes(); // Usa el método obtenerMes de la clase Fecha
    }


    @Override
    public String toString()
    {
    return String.format("%s %s%n numero de seguro social: %s",
    obtenerPrimerNombre(), obtenerApellidoPaterno(),
obtenerNumeroSeguroSocial());
    }
    
  // método abstracto sobrescrito por las subclases concretas
   public abstract double ingresos(); // aquí no hay implementación
   } // fin
