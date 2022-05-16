package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */

public class Juego 
{
    public static void main(String[] args)
    {
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();

        String opcion_JUGADOR1;
        String opcion_JUGADOR2;

        int rondasjugadas = 0;    // Número de rondas jugadas
        int empates = 0;
        boolean fin_de_juego = false;

        // Bucle de juego
        do
        {
            System.out.printf("***** Ronda: %d ********", rondasjugadas);
            System.out.printf("Jugador 1 - Partidas ganadas: %d", jugador1.getExitos());
            System.out.printf("Jugador 2 - Partidas ganadas: %d", jugador2.getExitos());
            System.out.printf("Numero de empates: %d", empates);

            opcion_JUGADOR1 = jugador2.opcion_al_azar();
            opcion_JUGADOR2 = jugador2.opcion_al_azar();

            System.out.printf("Jugador 1: %-10s", opcion_JUGADOR1);
            System.out.printf("Jugador 2: %-10s", opcion_JUGADOR2);
            
            if((opcion_JUGADOR1.equals("piedra"))&&(opcion_JUGADOR2.equals("papel")))
            {
                System.out.println("Jugador 2 GANA");
                jugador2.exito();
                
            }
            else if((opcion_JUGADOR1.equals("papel"))&&(opcion_JUGADOR2.equals("piedra")))
            {
                System.out.println("Jugador 1 GANA");
                
            }
            else if((opcion_JUGADOR1.equals("piedra"))&&(opcion_JUGADOR2.equals("tijeras")))
            {
            	jugador1.getExitos() = ++jugador2.getExitos();
                System.out.println("Jugador 1 GANA");
            }
            else if((opcion_JUGADOR1.equals("tijeras"))&&(opcion_JUGADOR2.equals("piedra")))
            {
            	jugador2.getExitos() = ++jugador2.getExitos();
                System.out.println("Jugador 2 GANA");
            }
            else if((opcion_JUGADOR1.equals("tijeras"))&&(opcion_JUGADOR2.equals("papel")))
            {
            	jugador1.getExitos() = ++jugador2.getExitos();
                System.out.println("Jugador 1 GANA");
            }
            else if((opcion_JUGADOR1.equals("papel"))&&(opcion_JUGADOR2.equals("tijeras")))
            {
            	jugador2.getExitos() = ++jugador2.getExitos();
                System.out.println("Jugador 2 GANA");
            }
            if(opcion_JUGADOR1==opcion_JUGADOR2)
            {
            	empates++;
                System.out.println("\n\t\t\t Empate \n");
            }
            rondasjugadas++;
            if((jugador2.getExitos()>=3)||(jugador2.getExitos()>=3))
            {
            	fin_de_juego=true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(fin_de_juego!=true);
    }
}
