import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CABTest {

    @Test
    public void result() {
        CAB object = new CAB();
        object.solution = new ArrayList<>();
        object.solution.add('5');
        object.solution.add('2');
        object.solution.add('2');
        object.solution.add('2');
        assertEquals("cow ", object.result(2225));
    }
}