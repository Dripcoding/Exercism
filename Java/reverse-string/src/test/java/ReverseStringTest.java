import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void testAnEmptyString() {
        assertEquals("", new ReverseString().reverse(""));
        assertEquals("", new ReverseString().reverseWithCharArray(""));
    }

    @Test
    public void testAWord() {
        assertEquals("tobor", new ReverseString().reverse("robot"));
        assertEquals("tobor", new ReverseString().reverseWithCharArray("robot"));
    }

    @Test
    public void testACapitalizedWord() {
        assertEquals("nemaR", new ReverseString().reverse("Ramen"));
        assertEquals("nemaR", new ReverseString().reverseWithCharArray("Ramen"));
    }

    @Test
    public void testASentenceWithPunctuation() {
        assertEquals("!yrgnuh m'I", new ReverseString().reverse("I'm hungry!"));
        assertEquals("!yrgnuh m'I", new ReverseString().reverseWithCharArray("I'm hungry!"));
    }

    @Test
    public void testAPalindrome() {
        assertEquals("racecar", new ReverseString().reverse("racecar"));
        assertEquals("racecar", new ReverseString().reverseWithCharArray("racecar"));
    }

    @Test
    public void testAnEvenSizedWord() {
        assertEquals("reward", new ReverseString().reverse("drawer"));
        assertEquals("reward", new ReverseString().reverseWithCharArray("drawer"));
    }
}
