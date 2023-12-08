public class Motocicleta extends vehiculo {

    private String tipo;




    public Motocicleta(int numero_llantas,String Marca,String Modelo,String num_serie,String tipo,String Color) {
        super(numero_llantas,Marca,Modelo,num_serie,Color);
        this.tipo=tipo;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo de Motocicleta : "+tipo);
    }
    
}
