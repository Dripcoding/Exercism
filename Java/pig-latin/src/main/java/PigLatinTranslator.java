import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatinTranslator {

    public static final String AY = "ay";
    public static final String V0WEL_REGEX = "^([aeiou]|y[^aeiou]|xr)";
    public static final String CONSONANT_REGEX = "^([^aeiou]?qu|[^aeiouy]+|y(?=[aeiou]))";

    public final Pattern vowelPattern;
    public final Pattern consonantPattern;

    public PigLatinTranslator() {
        this.vowelPattern = Pattern.compile(V0WEL_REGEX);
        this.consonantPattern = Pattern.compile(CONSONANT_REGEX);
    }

    public String translate(String phrase) {
        StringBuilder result = new StringBuilder();
        String[] words = phrase.toLowerCase().split(" ");

        for (String word : words) {
            if (this.getVowelPattern().matcher(word).find()) {
                result.append(word);
            } else {
                Matcher matcher = this.getConsonantPattern().matcher(word);
                if (matcher.find()) {
                    result.append(word.substring(matcher.end())).append(matcher.group());
                }
            }

            result.append(AY);
            result.append(" ");
        }

        return result.toString().trim();
    }

    public Pattern getVowelPattern() {
        return vowelPattern;
    }

    public Pattern getConsonantPattern() {
        return consonantPattern;
    }
}