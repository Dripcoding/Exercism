
public class BeerSong {

    public BeerSong() {
    }

    // solution that reduces code duplication and conditionals
    public String sing(int startVerse, int stopVerse) {
        StringBuilder verseBuilder = new StringBuilder();

        for (int i = startVerse; i > (startVerse - stopVerse); i--) {
            verseBuilder.append(sing(i));
        }

        return verseBuilder.toString();
    }

    public String sing(int verse) {
        StringBuilder verseBuilder = new StringBuilder();

        if (verse == 0) {
            verseBuilder.append("No more bottles of beer on the wall, no more bottles of beer.\n");
            verseBuilder.append("Go to the store and buy some more, 99 bottles of beer on the wall.\n\n");
        } else if (verse == 1) {
            verseBuilder.append(String.format("%s bottle of beer on the wall, %s bottle of beer.\n", verse, verse));
            verseBuilder.append("Take it down and pass it around, no more bottles of beer on the wall.\n\n");
        } else if (verse == 2) {
            verseBuilder.append("2 bottles of beer on the wall, 2 bottles of beer.\n");
            verseBuilder.append("Take one down and pass it around, 1 bottle of beer on the wall.\n\n");
        } else {
            verseBuilder.append(String.format("%s bottles of beer on the wall, %s bottles of beer.\n", verse, verse));
            verseBuilder.append(String.format("Take one down and pass it around, %s bottles of beer on the wall.\n\n", verse - 1));
        }

        return verseBuilder.toString();
    }

    public String singSong() {
        return sing(99, 100);
    }

    // naive solution
    public String naiveSing(int startVerse, int count) {
        StringBuilder verseBuilder = new StringBuilder();
        int current = startVerse;
        for (int i = 0; i < count; i++) {
            if (current == 0) {
                verseBuilder.append(
                        String.format("No more bottles of beer on the wall, no more bottles of beer.\n", current, current)
                );
            } else if (current == 1) {
                verseBuilder.append(
                        String.format("%s bottle of beer on the wall, %s bottle of beer.\n", current, current)
                );
            } else {
                verseBuilder.append(
                        String.format("%s bottles of beer on the wall, %s bottles of beer.\n", current, current)
                );
            }

            if (current == 0) {
                verseBuilder.append("Go to the store and buy some more, 99 bottles of beer on the wall.\n\n");
            } else if (current == 1) {
                verseBuilder.append(
                        String.format("Take it down and pass it around, no more bottles of beer on the wall.\n\n", current - 1)
                );
            } else if (current == 2) {
                verseBuilder.append(
                        String.format("Take one down and pass it around, %s bottle of beer on the wall.\n\n", current - 1)
                );
            } else {
                verseBuilder.append(
                        String.format("Take one down and pass it around, %s bottles of beer on the wall.\n\n", current - 1)
                );
            }
            current--;
        }
        return verseBuilder.toString();
    }

    public String singSongUsingNaiveSing() {
        return naiveSing(99, 100);
    }
}
