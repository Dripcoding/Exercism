import java.util.HashMap;
import java.util.Map;

public class PangramChecker {

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

}
