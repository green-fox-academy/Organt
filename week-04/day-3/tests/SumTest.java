import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {


    @Test
    public void TestSumAll() {
        List<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            myList.add(i);
        }
        Sum object = new Sum();
        assertEquals(1+2+3+4+5, object.sumAll(myList));

    }
}