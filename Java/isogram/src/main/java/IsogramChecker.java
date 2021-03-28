import java.util.HashMap;
import java.util.Map;

class IsogramChecker {

    public IsogramChecker() {
    }

    boolean isIsogram(String phrase) {
        if (phrase.isEmpty()) {
            return true;
        }

        String lowerCase = phrase.toLowerCase();
        Map<String, Integer> letterDict = new HashMap<>();

        for (int i = 0; i < phrase.length(); i++) {
            String current = Character.toString(lowerCase.charAt(i));

            if (!letterDict.containsKey(current)) {
                letterDict.put(current, 1);
            } else if (!current.equals("-") && !current.equals(" ") && letterDict.get(current) >= 1) {
                return false;
            }

            letterDict.put(current, letterDict.get(current) + 1);
        }

        return true;
    }

}
