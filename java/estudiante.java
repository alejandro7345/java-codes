public class estudiante
{
    public static void main(String[]args){}    
    private String nombre;
    private double promedio;
    
    public estudiante(String nombre,double promedio){
        this.nombre=nombre;
         if(promedio>0.0)
        if(promedio<=100.0)
        this.promedio=promedio;
    }

    public void establecernombre (String nombre){
        this.nombre=nombre;

    }
    public String obtenernombre(){
        return nombre;
    }
    public void establecerpromedio(double promedio){
        if (promedio>0.0)
        if(promedio<=100.0)
        this.promedio=promedio;
    }
    public double obtenerpromedio(){
        return promedio;
    }
    public String obtenerCalificacionEstudiante(){
    String calificacionestudiante ="";
    if(promedio>=90.0)
    calificacionestudiante="A";
    else if(promedio>=80.0)
    calificacionestudiante="B";
    else if (promedio>=70.0)
    calificacionestudiante="C";
    else if (promedio>=60.0)
    calificacionestudiante="D";
    else 
    calificacionestudiante="F";
    return calificacionestudiante;
    }

    
    
}
