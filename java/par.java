import java.util.Scanner;

public class par{


     

        
    public static void main(String[] args) {
        Scanner numpar=new Scanner(System.in);
        int sal=0;
        do{ 
            
            System.out.println("");
        System.out.println("ingrese un numero entero");

        int num = numpar.nextInt();

        if(num%2==0){
            System.out.println(" ###### el numero ingresado es par ####### ");

        }else{
            System.out.println("###### el numero ingresado no es par #######");
        }
        
}while(sal!=5);
numpar.close();


    }
}