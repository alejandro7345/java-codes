

    import java.util.Scanner;

public class Simpletron{
    public static void main(String[] args) {
        int[] memoria = new int[100];
        int acumulador = 0;
        int contadorDeInstrucciones = 0;
        int codigoDeOperacion, operando;

        Scanner input = new Scanner(System.in);

        System.out.println("*** Bienvenido a Simpletron! ***");
        System.out.println("*** Por favor, introduzca en su programa una instruccion ***");
        System.out.println("*** (o palabra de datos) a la vez. Yo le mostrare ***");
        System.out.println("*** el numero de ubicacion y un signo de interrogacion (?) ***");
        System.out.println("*** Entonces usted escribira la palabra para esa ubicacion. ***");
        System.out.println("*** Teclee -9999 para dejar de introducir su programa. ***");

        // Entrada de programa
        int userInput;
        do {
            System.out.printf("%02d ? ", contadorDeInstrucciones);
            userInput = input.nextInt();
            memoria[contadorDeInstrucciones] = userInput;
            contadorDeInstrucciones++;
        } while (userInput != -9999);

        // Comienza la ejecución
        System.out.println("*** Se completo la carga del programa ***");
        System.out.println("*** Empieza la ejecucion del programa ***");

        // Ejecución de programa
        contadorDeInstrucciones = 0;

        boolean run = true;

        while (run) {
            int registroDeInstruccion = memoria[contadorDeInstrucciones];
            codigoDeOperacion = registroDeInstruccion / 100;
            operando = registroDeInstruccion % 100;

            switch (codigoDeOperacion) {
                case 10:
                System.out.print("Ingrese un valor: ");
                int valor = input.nextInt();
                memoria[operando] = valor;
                    break;
                case 11:
                System.out.println("Salida: " + memoria[operando]);
                    break;
                case 20:
                acumulador = memoria[operando];
                    break;
                case 21:
                    memoria[operando]=acumulador;
                    break;
                case 30:
                    acumulador+=memoria[operando];
                    break;
                case 31:
                    acumulador-=memoria[acumulador];
            
                    break;
                case 32:
                    if (memoria[operando] != 0) {
                        acumulador /= memoria[operando];
                    } else {
                        System.out.println("Error: División por cero.");
                        run = false;
                    }
                    break;
                case 33:
                    acumulador*=memoria[operando];
                    break;
                

                case 43:
                System.out.println("* Fin de la ejecucion *");
                    System.out.println("Contenido del acumulador: " + acumulador);
                    System.out.println("Estado final de la memoria:");
                    for (int i = 0; i < 100; i++) {
                        System.out.printf("%02d: %04d\n", i, memoria[i]);
                    }
                    run = false;
                    break;

                    
                
                
                default:
                    System.out.println("Error: Código de operación no válido.");
                    run = false;
            }

            contadorDeInstrucciones++;
        }

        // Impresión de la memoria
        System.out.println("Estado final de la memoria:");
        for (int i = 0; i < 100; i++) {
            System.out.printf("%02d: %d%n", i, memoria[i]);
        }

        input.close();
    }
}

    

