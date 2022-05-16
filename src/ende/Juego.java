package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */

public class Juego
{

    private Jugador jugador1 = new Jugador();
    private Jugador jugador2 = new Jugador();

    private int rondasjugadas = 0;    // Número de rondas jugadas
    private int empates = 0;
    private boolean fin_de_juego = false;

    // Bucle de juego
    public void jugar()
    {
        String opcion_JUGADOR1;
        String opcion_JUGADOR2;

        do
        {
            opcion_JUGADOR1 = jugador1.opcionAlAzar();
            opcion_JUGADOR2 = jugador2.opcionAlAzar();

            System.out.printf("\n***** Ronda: %d ********", rondasjugadas + 1);
            System.out.printf("\nJugador 1 - Partidas ganadas: %d", jugador1.getExitos());
            System.out.printf("\nJugador 2 - Partidas ganadas: %d", jugador2.getExitos());
            System.out.printf("\nNumero de empates: %d", empates);

            System.out.printf("\nJugador 1: %-10s", opcion_JUGADOR1);
            System.out.printf("\nJugador 2: %-10s", opcion_JUGADOR2);

            switch (opcion_JUGADOR1)
            {
                case "piedra" ->
                {
                    switch (opcion_JUGADOR2)
                    {
                        case "piedra" ->
                        {
                            empate();
                        }
                        case "papel" ->
                        {
                            gana2();
                        }
                        case "tijera" ->
                        {
                            gana1();
                        }
                    }
                }
                case "papel" ->
                {
                    switch (opcion_JUGADOR2)
                    {
                        case "piedra" ->
                        {
                            gana1();
                        }
                        case "papel" ->
                        {
                            empate();
                        }
                        case "tijera" ->
                        {
                            gana2();
                        }
                    }
                }
                case "tijera" ->
                {
                    switch (opcion_JUGADOR2)
                    {
                        case "piedra" ->
                        {
                            gana2();
                        }
                        case "papel" ->
                        {
                            gana1();
                        }
                        case "tijera" ->
                        {
                            empate();
                        }
                    }
                }
            }

            rondasjugadas++;

            if ((jugador1.getExitos() >= 3) || (jugador2.getExitos() >= 3))
            {
                fin_de_juego = true;
            }

        }
        while(!fin_de_juego);

        System.out.println("\nFIN DEL JUEGO!!");

        if(jugador1.getExitos() > jugador2.getExitos())
        {
            System.out.println("\nGanador: jugador1");
        }
        else
        {
            System.out.println("\nGanador: jugador2");
        }
    }

    private void gana1()
    {
        jugador1.exito();
        System.out.println("\nGana jugador1");
    }

    private void gana2()
    {
        jugador2.exito();
        System.out.println("\nGana jugador2");
    }

    private void empate()
    {
        empates++;
        System.out.println("\nEmpate");
    }

    public static void main(String[] args)
    {
        Juego miJuego = new Juego();
        miJuego.jugar();
    }
}
