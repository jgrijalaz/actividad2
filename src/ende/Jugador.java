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

    public String opcionAlAzar()
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

    public Figura opcionAlAzarEnum()
    {
        int c = (int)(Math.random()*3);
        switch (c)
        {
            case 0 -> {return Figura.PIEDRA;}
            case 1 -> {return Figura.PAPEL;}
            case 2 -> {return Figura.TIJERA;}
        }
        return Figura.PIEDRA; // porque hay que poner algo
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
