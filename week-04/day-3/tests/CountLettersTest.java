import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {

    Map<Character, Integer> map = new HashMap<>();

    @Before
    public void testMap(){
        map.put('H', 1);
        map.put('e', 1);
        map.put('l', 2);
        map.put('o', 2);

    }

    @Test
    public void countLetters() {
        CountLetters object = new CountLetters();
        assertEquals(map, object.countLetters("Helloo"));
    }
}