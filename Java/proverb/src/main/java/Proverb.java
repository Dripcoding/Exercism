
class Proverb {

    private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    public String recite() {
        if (words.length == 0) {
            return "";
        }

        String lastLine = String.format("And all for the want of a %s.", words[words.length - 1]);
        if (words.length == 1) {
            return lastLine;
        }

        lastLine = String.format("And all for the want of a %s.", words[0]);
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < words.length - 1; i++) {
            String proverbLine = String.format("For want of a %s the %s was lost.\n", words[i], words[i + 1]);
            stringBuilder.append(proverbLine);
        }

        stringBuilder.append(lastLine);

        return stringBuilder.toString();
    }
}
