import java.util.HashMap;
import java.util.Map;

public class House {
    public static Integer FIRST_VERSE = 1;
    public static Integer FINAL_VERSE = 12;
    public static Map<String, String> characterActionsMap = new HashMap<>();
    public static Map<Integer, String> verseCharacterMap = new HashMap<>();

    // introduce the characters and their actions
    static {
        characterActionsMap.put("house", " that Jack built.");
        characterActionsMap.put("malt", " that lay in the house");
        characterActionsMap.put("rat", " that ate the malt");
        characterActionsMap.put("cat", " that killed the rat");
        characterActionsMap.put("dog", " that worried the cat");
        characterActionsMap.put("cow with the crumpled horn", " that tossed the dog");
        characterActionsMap.put("maiden all forlorn", " that milked the cow with the crumpled horn");
        characterActionsMap.put("man all tattered and torn", " that kissed the maiden all forlorn");
        characterActionsMap.put("priest all shaven and shorn", " that married the man all tattered and torn");
        characterActionsMap.put("rooster that crowed in the morn", " that woke the priest all shaven and shorn");
        characterActionsMap.put("farmer sowing his corn", " that kept the rooster that crowed in the morn");
        characterActionsMap.put("horse and the hound and the horn", " that belonged to the farmer sowing his corn");
    }

    // map verse number to characters
    static {
        verseCharacterMap.put(1, "house");
        verseCharacterMap.put(2, "malt");
        verseCharacterMap.put(3, "rat");
        verseCharacterMap.put(4, "cat");
        verseCharacterMap.put(5, "dog");
        verseCharacterMap.put(6, "cow with the crumpled horn");
        verseCharacterMap.put(7, "maiden all forlorn");
        verseCharacterMap.put(8, "man all tattered and torn");
        verseCharacterMap.put(9, "priest all shaven and shorn");
        verseCharacterMap.put(10, "rooster that crowed in the morn");
        verseCharacterMap.put(11, "farmer sowing his corn");
        verseCharacterMap.put(12, "horse and the hound and the horn");
    }

    public House() { }

    public String verse(int verse) {
        StringBuilder completeVerse = new StringBuilder();

        String character = verseCharacterMap.get(verse);
        String firstLine = String.format("This is the %s", character);

        completeVerse.append(firstLine);

        int count = verse;
        while (count != 0) {
            character = verseCharacterMap.get(count);
            completeVerse.append(characterActionsMap.get(character));
            count--;
        }

        return completeVerse.toString();
    }

    public String verses(int startVerse, int endVerse) {
        StringBuilder completeVerses = new StringBuilder();

        for (int i = startVerse; i <= endVerse; i++) {
            String verse = verse(i);
            completeVerses.append(verse);
            completeVerses.append("\n");
            System.out.println(i + " " + verse);
        }

        return completeVerses.toString().trim();
    }

    public String sing() {
        return verses(FIRST_VERSE, FINAL_VERSE);
    }
}
