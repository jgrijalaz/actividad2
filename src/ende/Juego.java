package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */

public class Juego
{

    private Jugador jugador1 = new Jugador();
    private Jugador jugador2 = new Jugador();

    private String opcion_JUGADOR1;
    private String opcion_JUGADOR2;

    private int rondasjugadas = 0;    // Número de rondas jugadas
    private int empates = 0;
    private boolean fin_de_juego = false;

    // Bucle de juego
    public void jugar()
    {
        do
        {
            System.out.printf("***** Ronda: %d ********", rondasjugadas);
            System.out.printf("Jugador 1 - Partidas ganadas: %d", jugador1.getExitos());
            System.out.printf("Jugador 2 - Partidas ganadas: %d", jugador2.getExitos());
            System.out.printf("Numero de empates: %d", empates);

            opcion_JUGADOR1 = jugador2.opcionAlAzar();
            opcion_JUGADOR2 = jugador2.opcionAlAzar();

            System.out.printf("Jugador 1: %-10s", opcion_JUGADOR1);
            System.out.printf("Jugador 2: %-10s", opcion_JUGADOR2);

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
                System.out.println("FIN DEL JUEGO!!");
            }

        }
        while(!fin_de_juego);
    }

    private void gana1()
    {
        jugador1.exito();
        System.out.println("Gana jugador1");
    }

    private void gana2()
    {
        jugador1.exito();
        System.out.println("Gana jugador2");
    }

    private void empate()
    {
        empates++;
        System.out.println("Empate");
    }

}
