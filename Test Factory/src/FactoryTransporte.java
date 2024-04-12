


    /**
     * Fbrica encargada de devolver el coste y el tipo de embalaje
     * del prodducto segun lo que hemos introucido
     */
    public class FactoryTransporte {

        public static final int Camion=1;
        public static final int Bicicleta=2;

        /**
         * Devuelve el producto del tipo de la Interface
         * @param type
         */
        public static Itransporte getTransporte(int type){
            switch (type) {
                // tipo camion
                case Camion:
                    return new Camion();
                // tipo bicicleta
                case Bicicleta:
                    return new Bicicleta();
                default:
                    return null;
            }
        }
    }

