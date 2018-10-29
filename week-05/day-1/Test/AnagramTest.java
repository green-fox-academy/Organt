import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    String string1;
    String string2;

    @Test
    public void checkIfEquals() {

        assertTrue(Anagram.anagramChecker("poklop", "oklpop"));
    }

    @Test
    public void checkIfNotEquals() {
        assertFalse(Anagram.anagramChecker("poklop", null));
    }

}