import java.util.Arrays;
import java.util.List;

class DiamondPrinter {

    public List<String> printToList(char a) {
        int rowCount = a - 'A' + 1;
        int length = 2 * rowCount - 1;

        String[] lines = new String[length];
        for (int i = 0; i < length / 2 + 1; i++) {
            char current = (char) ('A' + i);

            // calculate indices for the letters
            int left = length / 2 - i;
            int right = length - left - 1;


            char[] buffer = new char[length];
            Arrays.fill(buffer, ' ');

            // add letters to the line
            buffer[left] = current;
            buffer[right] = current;

            String line = new String(buffer);

            // add line to the list
            lines[i] = line;
            lines[length - 1 -i] = line;
        }

        return Arrays.asList(lines);
    }
}
