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
        String opcion = "";

        int c = (int)(Math.random()*3);
        switch (c)
        {
            case 0 -> opcion = ("piedra");
            case 1 -> opcion = ("papel");
            case 2 -> opcion = ("tijeras");
        }

        return opcion;
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
