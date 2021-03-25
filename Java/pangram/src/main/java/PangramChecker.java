import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class PangramChecker {

    public static final int LETTERS_IN_ALPHABET = 26;

    public boolean isPangram(String input) {
        if (input.length() == 0) {
            return false;
        }
        String lowerCase = input.toLowerCase();
        for (char i = 'a'; i <= 'z'; i++) {
            if (lowerCase.indexOf(i) < 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPangramStreams(String input) {
        if (input.isEmpty()) {
            return false;
        }
        long letterCount = input.toLowerCase().chars().distinct().filter(Character::isAlphabetic).count();
        return letterCount == LETTERS_IN_ALPHABET;
    }
}
