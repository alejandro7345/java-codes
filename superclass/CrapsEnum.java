import java.security.SecureRandom;

public class CrapsEnum {
    private static final SecureRandom numerosAleatorios=new SecureRandom();

    private enum Estado{CONTINUA,GANO,PERDIO};

    private static final int DOS_UNOS=2;
    private static final int TRES=3;
    private static final int SIETE=7;
    private static final int ONCE=11;
    private static final int DOCE=12;

    public static void main(String[] args) {
        
        Estado estadojuego;
        int miPuntoy=0;

        int sumadedados=tirarDados();

        switch (sumadedados) {
            case SIETE:
            case ONCE:
            estadojuego=Estado.GANO;
                
                break;
        case DOS_UNOS:
        case TRES:
        case DOCE:
        estadojuego=Estado.PERDIO;
        break;


            default:
            estadojuego=Estado.CONTINUA;
            miPuntoy=sumadedados;
            System.out.printf("El punto es %d%n",miPuntoy);
                break;
        }

        while (estadojuego==Estado.CONTINUA) {
            sumadedados=tirarDados();

            if (sumadedados==miPuntoy) 
            estadojuego=Estado.GANO;
            else
            if (sumadedados==SIETE) {
                estadojuego=Estado.PERDIO;
                
            }

            if (estadojuego==Estado.GANO) 
                System.out.println("el jugador gana");
                else 
                System.out.println("el jugador pierde");

                
            


                
            }

           
        }
        
    
     public static int tirarDados(){

                int dado1=1+numerosAleatorios.nextInt(6);
                int dado2=1+numerosAleatorios.nextInt(6);
                int suma =dado1+dado2;
                System.err.printf("el jugador tiro %d+%d=%d%n",dado1,dado2,suma);


                return suma;
            }
    
        }
