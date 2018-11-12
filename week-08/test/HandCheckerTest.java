import org.junit.Test;

import static org.junit.Assert.*;

public class HandCheckerTest {
    HandChecker checker = new HandChecker();

    @Test
    public void testHigherRank() {
        assertEquals("White wins! - (High card: Ace)", checker.higherRank("Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH"));
    }

    @Test
    public void testHigherRank2() {
        assertEquals("White wins! - (High card: Ace)", checker.higherRank("Black: 2H 3D 5S 8C KD White: 2C 3H 4S 9C AH"));
    }

    @Test
    public void testFullhouseCombo() {
        assertEquals("Black wins! - (Full house)", checker.higherRank("Black: 6H 4S 4C 4D 6H White: 2H 4S 4C 2D 4H"));
    }
    @Test
    public void testHigherRank3() {
        assertEquals("White wins! - (High card: 9)", checker.higherRank("Black: 2H 3D 5S 8C KD White: 2C 3H 4S 9C KH"));
    }

    @Test
    public void testHigherRank4() {
        assertEquals("Tie", checker.higherRank("Black: 2H 3D 5S 9C KD White: 2D 3H 5C 9S KH"));
    }


}
