import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void fib() {
        Fibonacci object = new Fibonacci();
        assertEquals(21, object.fib(8));
    }
}