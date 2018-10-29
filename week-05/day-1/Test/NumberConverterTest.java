import org.junit.Test;

import static org.junit.Assert.*;

public class NumberConverterTest {

    @Test
    public void numbersToWords () {
        assertEquals("seven hundred and forty five", convertor(745));
    }
}