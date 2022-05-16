package ende;
/**
 * Escoge piedra, papel o tijera al azar
 */

/**
 * @author jgrijalaz
 */
class Jugador
{
    private int exitos;      // número de partidas ganadas
    private int winTotal;

    public String opcion_al_azar()
    {
        int c = (int)(Math.random()*3);
        switch (c)
        {
            case 0 -> {return "piedra";}
            case 1 -> {return "papel";}
            case 2 -> {return "tijera";}
            default -> {return "";}
        }
    }

    public void exito()
    {
        exitos++;
    }

    public int getExitos()
    {
        return exitos;
    }

}
