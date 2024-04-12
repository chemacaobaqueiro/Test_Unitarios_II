public class Bicicleta implements Itransporte{

    private final static int palet=0;
    private final static int envoltorio_carton=1;
    private final static int caja_de_madera=2;

    /**
     * Constructor donde vamos a decidir el coste que va a tener el envio
     * @param cp es el codigo postal que se va a recibir y con el que voy a decidir que coste va a tener el envio
     */

    @Override
    public float costeTotal(Integer cp) {

        float coste;

        if (cp>30000){
            coste=20f;
        } else if (cp>50000) {
            coste=60f;
        }
        else {
            coste=10f;
        }

        return  coste;
    }

    /**
     * Contructor donde vamos a decidir que tipo de enbalaje va a ser utilizado dependiendo del peso del paquete
     * @param x dimension x del paquete
     * @param y dimension y del paquete
     * @param z deimension z del paquete
     * @param peso peso del pedido que recibimos
     */
    @Override
    public int tipoEmbalaje(Float x, Float y, Float z, Float peso) {

        int embalaje=0;

        if (peso<10){
            embalaje=envoltorio_carton;
        }

        if (peso>10 & peso<50){
            embalaje=caja_de_madera;
        }

        if (peso>50){
            embalaje=palet;
        }
        return embalaje;
    }
}
