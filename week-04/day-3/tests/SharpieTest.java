import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {

    @Test
    public void use() {
        Sharpie sharpie = new Sharpie("blue", 2);
        sharpie.use();
        assertEquals("There is no ink", sharpie.use());
    }

}