import java.util.Scanner;

public class SecuenciaPares {

    public static boolean esPar(int numero){


        if (numero%2==0) {
            
            return true ;
        }

            else{
            
            return false ;}
            
        
    }


    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);

        

        System.out.println("indique la cantidad de enteros a realizar");
        
        int dato1= entrada.nextInt();
        

        int [] arreglo =new int[dato1];

        for(int n=1;n<=dato1;n++){
            System.out.println("");
            System.out.println("ingrese el valor numero "+n);
            System.out.println("");
            

            arreglo [n-1]=entrada.nextInt();
        }
        entrada.close();

        for (int i = 0; i <= dato1-1; i++) {

        if(esPar(arreglo[i])==true){
            System.out.println();
            System.out.printf("el numero %d es par", arreglo[i]);
            System.out.println();

        }
        else{
            System.out.println();
            System.out.printf("el numero %d es inpar", arreglo[i]);
            System.out.println();
        }
            
        }


    }
    
}
