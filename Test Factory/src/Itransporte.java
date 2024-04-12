public interface Itransporte {
    /**
     * Metodos que deberan ser implementados en las clases camion y bicicleta para decidir el y su respectivo coste
     * @param cp parametro para recibir el codigo postal para asi calcular el coste del envio
     * @return Retorna un dato tipo float que sera el coste
     */
    public float costeTotal(Integer cp);

    /**
     * Metodo que deberan ser implementados en las clases bicicleta y camion para decidir el tipo de envio
     * @param x dimension x del paquete
     * @param y dimension y del paquete
     * @param z dimension z del paquete
     * @param peso peso del paquete
     * @return devolvemos el peso para con ello calcular el tipo de embalaje que sera necesario para su envio
     */
    public int tipoEmbalaje(Float x,Float y, Float z, Float peso);
}
