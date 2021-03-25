public class Twofer {

    static final String NO_NAME_GIVEN_PHRASE = "One for you, one for me.";
    static final String EMPTY_NAME_GIVEN_PHRASE = "One for , one for me.";

    public String twofer(String name) {
        if (name == null) {
            return NO_NAME_GIVEN_PHRASE;
        }

        if (name.isEmpty()) {
            return EMPTY_NAME_GIVEN_PHRASE;
        }

        return String.format("One for %s, one for me.", name);
    }
}
