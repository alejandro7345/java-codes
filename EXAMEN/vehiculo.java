public class vehiculo {

    private int numero_llantas;
    private String Marca;
    private String Modelo;
    private String num_serie;
    private String Color;

    public vehiculo (int numero_llantas,String Marca,String Modelo,String num_serie,String Color) {
        this.numero_llantas=numero_llantas;
        this.Marca=Marca;
        this.Color=Color;

        this.Modelo=Modelo;
        this.num_serie=num_serie;
    }

    public void imprimir(){
        System.out.println("++++++++++Propiedades+++++++++++");
        System.out.println("");
        System.out.println(  " numero de serie : "+num_serie);
        System.out.println(  " Marca : "+Marca);
        System.out.println(  " Numero de llantas : "+numero_llantas);
        System.out.println(  " Modelo : "+Modelo);
        System.out.println(  " Color : "+Color);
        

    }




    


    
}