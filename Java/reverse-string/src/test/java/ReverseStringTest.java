import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void testAnEmptyString() {
        assertEquals("", new ReverseString().reverse(""));
        assertEquals("", new ReverseString().reverseWithCharArray(""));
        assertEquals("", new ReverseString().reverseWithByteStream(""));
    }

    @Test
    public void testAWord() {
        assertEquals("tobor", new ReverseString().reverse("robot"));
        assertEquals("tobor", new ReverseString().reverseWithCharArray("robot"));
        assertEquals("tobor", new ReverseString().reverseWithByteStream("robot"));
    }

    @Test
    public void testACapitalizedWord() {
        assertEquals("nemaR", new ReverseString().reverse("Ramen"));
        assertEquals("nemaR", new ReverseString().reverseWithCharArray("Ramen"));
        assertEquals("nemaR", new ReverseString().reverseWithByteStream("Ramen"));
    }

    @Test
    public void testASentenceWithPunctuation() {
        assertEquals("!yrgnuh m'I", new ReverseString().reverse("I'm hungry!"));
        assertEquals("!yrgnuh m'I", new ReverseString().reverseWithCharArray("I'm hungry!"));
        assertEquals("!yrgnuh m'I", new ReverseString().reverseWithByteStream("I'm hungry!"));
    }

    @Test
    public void testAPalindrome() {
        assertEquals("racecar", new ReverseString().reverse("racecar"));
        assertEquals("racecar", new ReverseString().reverseWithCharArray("racecar"));
        assertEquals("racecar", new ReverseString().reverseWithByteStream("racecar"));
    }

    @Test
    public void testAnEvenSizedWord() {
        assertEquals("reward", new ReverseString().reverse("drawer"));
        assertEquals("reward", new ReverseString().reverseWithCharArray("drawer"));
        assertEquals("reward", new ReverseString().reverseWithByteStream("drawer"));
    }
}
