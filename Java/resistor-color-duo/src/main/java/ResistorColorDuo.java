import java.util.Arrays;
import java.util.stream.Collectors;

class ResistorColorDuo {
    public enum ColorsEnum {
        black( "black", "0"),
        brown("brown", "1"),
        red("red", "2"),
        orange("orange", "3"),
        yellow("yellow", "4"),
        green("green", "5"),
        blue( "blue", "6"),
        violet("violet", "7"),
        grey("grey", "8"),
        white("white", "9");

        private final String label;
        private final String value;

        ColorsEnum(String label, String value) {
            this.label = label;
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    public int value(String[] colors) {
        StringBuilder stringBuilder = new StringBuilder();
        int result;
        for (int i = 0; i < 2; i++) {
            stringBuilder.append(ColorsEnum.valueOf(colors[i]).getValue());
        }
        result = Integer.parseInt(stringBuilder.toString());
        return result;
    }

    public int valueUsingStreams(String[] colors) {
        String result = Arrays.stream(colors)
                .limit(2)
                .map(color -> ColorsEnum.valueOf(color).getValue())
                .collect(Collectors.joining());

        return Integer.parseInt(result);
    }
}
