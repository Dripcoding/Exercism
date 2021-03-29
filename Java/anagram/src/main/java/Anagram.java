import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Anagram {

    private final String word;

    public Anagram(String word) {
        this.word = word;
    }

    public List<String> match(List<String> possibleAnagrams) {
        List<String> anagrams = new ArrayList<>();
        String anagramTest = this.getWord().toLowerCase();

        for (String word : possibleAnagrams) {
            String lowerCase = word.toLowerCase();
            int charExistsInWord = 0;

            if (word.length() != anagramTest.length() || anagramTest.equals(lowerCase)) {
                continue;
            }

            for (int i = 0; i < anagramTest.length(); i++) {
                char current = anagramTest.charAt(i);
                String curr = Character.toString(current);
                // check if letter exists in test word
                if (lowerCase.contains(curr)) {
                    Pattern pattern = Pattern.compile(curr);
                    Matcher matcher = pattern.matcher(word);
                    // test word should use each letter only once
                    if (matcher.results().count() > 1) {
                        break;
                    }
                    charExistsInWord = 1;
                } else {
                    charExistsInWord = 0;
                    break;
                }
            }
            // test word contains all letters
            if (charExistsInWord == 1) {
                anagrams.add(word);
            }
        }

        return anagrams;
    }

    public String getWord() {
        return word;
    }

}
