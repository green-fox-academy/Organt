import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    Apple object = new Apple();

    @Test
    public void testGetApple() {
        assertEquals("apple", object.getApple());
    }
}