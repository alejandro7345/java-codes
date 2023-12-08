public class Motorista {
    private String Nombre;
    private int ID;
    private vehiculo auto;

    public Motorista(String Nombre,int ID) {
        this.Nombre=Nombre;
        this.ID=ID;
        
    }
    public void AsignarAuto(vehiculo auto){
        this.auto=auto;

    }
    public void imprimirMotorista(){
        System.out.println(" -------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("  ---------Reguistro---------");
        System.out.println(" ");
        System.out.println("  -informacion del motorista-");
        System.out.println("");
        System.out.println(  "    Nombre : "+Nombre);
        System.out.println(  "    Identificador : "+ID);

        if (auto!=null) {
        System.out.println("");
        System.out.println("-------Vehiculo asignado--------");
        System.out.println("");
        auto.imprimir();
        System.out.println(" ");
        System.out.println(" -------------------------------------------------------------------------");
            
        }else{
            System.out.println(" "); 
            System.out.println(" ");
            System.out.println("++++¡ Este motorista no tiene un vehiculo asignado !++++");
             System.out.println(" ");
              System.out.println("------------------------------------------------------------------- ");
        }
    }

    
}
