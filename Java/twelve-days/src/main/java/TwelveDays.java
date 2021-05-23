import java.util.HashMap;
import java.util.Map;

class TwelveDays {

    public enum TwelveDaysEnum {
        FIRST("first", 1, "a Partridge in a Pear Tree"),
        SECOND("second", 2, "two Turtle Doves"),
        THIRD("third", 3, "three French Hens"),
        FOURTH("fourth", 4, "four Calling Birds"),
        FIFTH("fifth", 5, "five Gold Rings"),
        SIXTH("sixth", 6, "six Geese-a-Laying"),
        SEVENTH("seventh", 7, "seven Swans-a-Swimming"),
        EIGHTH("eighth", 8, "eight Maids-a-Milking"),
        NINTH("ninth", 9, "nine Ladies Dancing"),
        TENTH("tenth", 10, "ten Lords-a-Leaping"),
        ELEVENTH("eleventh", 11, "eleven Pipers Piping"),
        TWELFTH("twelfth", 12, "twelve Drummers Drumming");

        private static final Map<Integer, TwelveDaysEnum> BY_DAY_VALUE = new HashMap<>();

        static {
            for (TwelveDaysEnum t : values()) {
                BY_DAY_VALUE.put(t.dayValue, t);
            }
        }

        private String label;
        private int dayValue;
        private String gift;

        TwelveDaysEnum(String label, int dayValue, String gift) {
            this.label = label;
            this.dayValue = dayValue;
            this.gift = gift;
        }
    }

    public String verse(int verseNumber) {
        StringBuilder giftsStringBuilder = new StringBuilder();
        StringBuilder verseStringBuilder = new StringBuilder();

        for (int i = verseNumber; i > 0; i--) {
            TwelveDaysEnum currentDay = TwelveDaysEnum.BY_DAY_VALUE.get(i);

            if (verseNumber == 1) {
                giftsStringBuilder.append(currentDay.gift);
                break;
            } else if (i == 1) {
                giftsStringBuilder.append("and ");
                giftsStringBuilder.append(currentDay.gift);
                break;
            } else {
                giftsStringBuilder.append(currentDay.gift);
                giftsStringBuilder.append(", ");
            }
        }

        verseStringBuilder.append(
                String.format("On the %s day of Christmas my true love gave to me: %s.\n",
                        TwelveDaysEnum.BY_DAY_VALUE.get(verseNumber).label,
                        giftsStringBuilder.toString()
                ));

        return verseStringBuilder.toString();
    }

    public String verses(int startVerse, int endVerse) {
        StringBuilder versesStringBuilder = new StringBuilder();

        for (int i = startVerse; i <= endVerse; i++) {
            versesStringBuilder.append(verse(i));
            if (i == endVerse) {
                break;
            }
            versesStringBuilder.append("\n");
        }

        return versesStringBuilder.toString();
    }

    String sing() {
        return verses(1, 12);
    }
}