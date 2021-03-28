import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsogramCheckerTest {

    @Test
    public void testEmptyString() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram(""));
        assertTrue(iso.isIsogramWithStreams(""));
    }

    @Test
    public void testLowercaseIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("isogram"));
        assertTrue(iso.isIsogramWithStreams("isogram"));
    }

    @Test
    public void testNotIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("eleven"));
        assertFalse(iso.isIsogramWithStreams("eleven"));
    }

    @Test
    public void testDuplicateEndAlphabet() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("zzyzx"));
        assertFalse(iso.isIsogramWithStreams("zzyzx"));
    }

    @Test
    public void testMediumLongIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("subdermatoglyphic"));
        assertTrue(iso.isIsogramWithStreams("subdermatoglyphic"));
    }

    @Test
    public void testCaseInsensitive() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("Alphabet"));
        assertFalse(iso.isIsogramWithStreams("Alphabet"));
    }

    @Test
    public void testDuplicatMixedCase() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("alphAbet"));
        assertFalse(iso.isIsogramWithStreams("alphAbet"));
    }

    @Test
    public void testIsogramWithHyphen() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("thumbscrew-japingly"));
        assertTrue(iso.isIsogramWithStreams("thumbscrew-japingly"));
    }

    @Test
    public void testIsogramWithDuplicatedCharAfterHyphen() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("thumbscrew-jappingly"));
        assertFalse(iso.isIsogramWithStreams("thumbscrew-jappingly"));
    }

    @Test
    public void testIsogramWithDuplicatedHyphen() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("six-year-old"));
        assertTrue(iso.isIsogramWithStreams("six-year-old"));
    }

    @Test
    public void testMadeUpNameThatIsAnIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("Emily Jung Schwartzkopf"));
        assertTrue(iso.isIsogramWithStreams("Emily Jung Schwartzkopf"));
    }

    @Test
    public void testDuplicatedCharacterInTheMiddleIsNotIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("accentor"));
        assertFalse(iso.isIsogramWithStreams("accentor"));
    }

    @Test
    public void testSameFirstAndLast() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("angola"));
        assertFalse(iso.isIsogramWithStreams("angola"));
    }

}
