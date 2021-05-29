public class Bob {

    public static String RESPONSE_TO_QUESTION = "Sure.";
    public static String RESPONSE_TO_YELLING = "Whoa, chill out!";
    public static String RESPONSE_TO_YELLING_A_QUESTION = "Calm down, I know what I'm doing!";
    public static String RESPONSE_TO_NOTHING = "Fine. Be that way!";
    public static String DEFAULT_RESPONSE = "Whatever.";

    public Bob() {
    }

    public String hey(String message) {
        boolean yelling = message.equals(message.toUpperCase()) && message.matches(".*[A-Z].*");
        boolean question = message.trim().matches(".*\\?");
        boolean silence = message.trim().isEmpty();

        if (yelling && question) {
            return RESPONSE_TO_YELLING_A_QUESTION;
        }
        if (yelling) {
            return RESPONSE_TO_YELLING;
        }
        if (question) {
            return RESPONSE_TO_QUESTION;
        }
        if (silence) {
            return RESPONSE_TO_NOTHING;
        }
        return DEFAULT_RESPONSE;
    }

}

