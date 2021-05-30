
public class BeerSong {

    public BeerSong() {
    }

    // naive solution
    public String sing(int startVerse, int count) {
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

    public String singSong() {
        return sing(99, 100);
    }
}
