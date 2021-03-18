import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class ResistorColor {
    public enum ColorsEnum {
        black( "black", 0),
        brown("brown", 1),
        red("red", 2),
        orange("orange", 3),
        yellow("yellow", 4),
        green("green", 5),
        blue( "blue", 6),
        violet("violet", 7),
        grey("grey", 8),
        white("white", 9);

        private final String label;
        private final int value;

        ColorsEnum(String label, int value) {
            this.label = label;
            this.value = value;
        }

        public String getLabel() {
            return this.label;
        }

        public int getValue() {
            return this.value;
        }

        public static String[] getColorNames() {
            List<String> colorNames = new ArrayList<>();

            for (ColorsEnum c : ColorsEnum.values()) {
                colorNames.add(c.label);
            }

            return colorNames.toArray(String[]::new);
        }

        public static String[] getColorNamesWithStream() {
            return Arrays.stream(ColorsEnum.values()).map(ColorsEnum::getLabel).toArray(String[]::new);
        }

        public static String[] getColorNamesWithStreamOf() {
            return Stream.of(ColorsEnum.values()).map(ColorsEnum::getLabel).toArray(String[]::new);
        }
    }

    public int colorCode(String color) {
        return ColorsEnum.valueOf(color).getValue();
    }

    public String[] colors() {
        return ColorsEnum.getColorNames();
    }

    public String[] colorsWithStream() {
        return ColorsEnum.getColorNamesWithStream();
    }

    public String[] colorsWithStreamOf() {
        return ColorsEnum.getColorNamesWithStreamOf();
    }
}
