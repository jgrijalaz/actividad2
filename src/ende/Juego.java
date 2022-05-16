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
        
        int exitos_jugador1 = jugador1.getExitos();
        int exitos_jugador2 = jugador2.getExitos();

        String opcion_JUGADOR1;
        String opcion_JUGADOR2;

        Integer rondasjugadas = 0;    // Número de rondas jugadas
        Integer empates = 0;
        boolean fin_de_juego = false;

        // Bucle de juego
        do
        {
            System.out.println("***** Ronda: " + rondasjugadas+" *********************\n");
            System.out.println("Numero de empates: "+ empates + "\n");
            opcion_JUGADOR1 = jugador2.opcion_al_azar();
            System.out.println("Jugador 1: " + opcion_JUGADOR1+"\t Jugador 1 - Partidas ganadas: " + exitos_jugador1);
            opcion_JUGADOR2 = jugador2.opcion_al_azar();
            System.out.println("Jugador 2: " + opcion_JUGADOR2+"\t Jugador 2 - Partidas ganadas: " + exitos_jugador2);
            
            if((opcion_JUGADOR1.equals("piedra"))&&(opcion_JUGADOR2.equals("papel")))
            {
                System.out.println("Jugador 2 GANA");
                exitos_jugador2 = ++jugador2.éxitos;
                
            }
            else if((opcion_JUGADOR1.equals("papel"))&&(opcion_JUGADOR2.equals("piedra")))
            {
            	exitos_jugador1 = ++jugador2.éxitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcion_JUGADOR1.equals("piedra"))&&(opcion_JUGADOR2.equals("tijeras")))
            {
            	exitos_jugador1 = ++jugador2.éxitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcion_JUGADOR1.equals("tijeras"))&&(opcion_JUGADOR2.equals("piedra")))
            {
            	exitos_jugador2 = ++jugador2.éxitos;
                System.out.println("Jugador 2 GANA");
            }
            else if((opcion_JUGADOR1.equals("tijeras"))&&(opcion_JUGADOR2.equals("papel")))
            {
            	exitos_jugador1 = ++jugador2.éxitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcion_JUGADOR1.equals("papel"))&&(opcion_JUGADOR2.equals("tijeras")))
            {
            	exitos_jugador2 = ++jugador2.éxitos;
                System.out.println("Jugador 2 GANA");
            }
            if(opcion_JUGADOR1==opcion_JUGADOR2)
            {
            	empates++;
                System.out.println("\n\t\t\t Empate \n");
            }
            rondasjugadas++;
            if((jugador2.éxitos>=3)||(jugador2.éxitos>=3))
            {
            	fin_de_juego=true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(fin_de_juego!=true);
    }
}
