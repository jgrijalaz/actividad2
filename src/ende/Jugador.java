package ende;

/**
 * @author jgrijalaz
 */
class Jugador{

    /**
     * Escoge piedra, papel o tijera al azar
     */
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

    public void setÉxitos()
    {
        éxitos++;
    }
    public int getÉxitos()
    {
        return(éxitos);
    }

    int éxitos;      // número de partidas ganadas
    int winTotal;
}
