import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CamionTest {

    @Test
    @DisplayName("Test de camion")
    public void pruebaClaseCamion(){
        Itransporte testCamion = FactoryTransporte.getTransporte(FactoryTransporte.Camion);
        assertTrue(testCamion instanceof Camion);
    }
}
