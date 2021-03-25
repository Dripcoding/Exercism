class RaindropConverter {

    public static final String THREE_AS_A_FACTOR = "Pling";
    public static final String FIVE_AS_A_FACTOR = "Plang";
    public static final String SEVEN_AS_A_FACTOR = "Plong";

    String convert(int number) {
        StringBuilder stringBuilder = new StringBuilder();

        if (number % 3 == 0) {
            stringBuilder.append(THREE_AS_A_FACTOR);
        }

        if (number % 5 == 0) {
            stringBuilder.append(FIVE_AS_A_FACTOR);
        }

        if (number % 7 == 0) {
            stringBuilder.append(SEVEN_AS_A_FACTOR);
        }

        if (stringBuilder.length() == 0) {
            stringBuilder.append(number);
        }

        return stringBuilder.toString();
    }

}
