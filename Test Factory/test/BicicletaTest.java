import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BicicletaTest {

    @Test
    @DisplayName("Test de bicicleta")
    public void pruebaBicicleta(){
        Itransporte testbici = FactoryTransporte.getTransporte(FactoryTransporte.Bicicleta);
        assertTrue(testbici instanceof Bicicleta);
    }
}
