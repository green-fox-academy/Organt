import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void areAnagrams() {
        Anagram object = new Anagram();
        assertTrue(object.areAnagrams("Helllllooo", "Helllllooo"));
        assertFalse(object.areAnagrams("Helllloooo", "Hellllloo"));
    }
}