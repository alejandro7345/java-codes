import java.util.Scanner;

public class operaciones_2{
/**
 * @param args
 */
public static void main(String[] args){
int select=0;
Scanner numeros= new Scanner(System.in);
int num,num2;


    System.out.println("bienvenido");
    System.out.println("ingrese el primer numero");

    

    num= numeros.nextInt();

    System.out.println("ingrese el segundo numero");
     num2=numeros.nextInt();


    

do{
    System.out.println("  ");
    System.out.println("  ");
    System.out.println(" elija una de las opciones indicadas");
    System.out.println("1- suma");
    System.out.println("2- multiplicacion");
    System.out.println("3-resta");
    System.out.println("4-divicion");
    System.out.println("Salir");

    select=numeros.nextInt();
    System.out.println(" ");


    switch (select) {
        case 1:
        int suma = num+num2;
        System.out.println("la suma de "+num+"+"+num2+"="+suma);

        break;
        
        case 2:
        int multiplicacion=num*num2;
        System.out.println("la multiplicacion de "+num+"*"+num2+"="+multiplicacion);
        break;

        case 3:
        int resta=num-num2;
        System.out.println("la resta de "+num+"-"+num2+"="+resta);

        break;
        

        case 4:
        double div =num/num2;
        System.out.println("la divicion de "+num+"/"+num2+"="+div);
        break;

        case 5:
        select=-1;
        break;
    
        default:
        System.out.println("esta no es una opcion valida");
        
    


} }while(select!=-1);
numeros.close();
}



}








