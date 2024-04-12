import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class DatoTest {

    @Test
    @DisplayName("Test del Singleton")
    public void pruebaSingleton(){
        Dato obj1 = Dato.getInstance();
        Dato obj2 = Dato.getInstance();
        assertSame(obj1,obj2);
    }
}
