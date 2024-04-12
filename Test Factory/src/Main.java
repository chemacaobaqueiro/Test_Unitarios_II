/**
 * clase principal que llama a la factoria para crear los objetos
 */
public class Main {
    static Itransporte envio;
    public static void main(String[] args) {
        /**
         * Con nuestra variable de tipo interfaz llamamos a la factoria para decidir que vehiculo vamos a sacar
         **/
        envio = FactoryTransporte.getTransporte(FactoryTransporte.Camion);
        System.out.println("El coste del envio del camion sera de : "+envio.costeTotal(80000)+""+" Y el tipo de embalaje que se va a utilizar para este envio es : "+envio.tipoEmbalaje(210f,350f,650f,30000f));

        /**
         * Aqui hacemos lo mismo y lo corremos por pantalla para comprobar que funciona correctamente
         */
        envio = FactoryTransporte.getTransporte(FactoryTransporte.Bicicleta);
        System.out.println("El coste del envio del camion sera de : "+envio.costeTotal(30000)+""+" Y el tipo de embalaje que se va a utilizar para este envio es : "+envio.tipoEmbalaje(21f,35f,65f,20f));
    }
}
