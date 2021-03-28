public class Hamming {

    public static final String ERROR_MESSAGE = "leftStrand and rightStrand must be of equal length.";
    public static final String LEFT_STRAND_EMPTY = "left strand must not be empty.";
    public static final String RIGHT_STRAND_EMPTY = "right strand must not be empty.";
    private final String leftStrand;
    private final String rightStrand;
    private int hammingDistance;

    public Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        this.hammingDistance = 0;

        if (leftStrand.isEmpty() && !rightStrand.isEmpty()) {
            throw new IllegalArgumentException(LEFT_STRAND_EMPTY);
        }

        if (rightStrand.isEmpty() && !leftStrand.isEmpty()) {
            throw new IllegalArgumentException(RIGHT_STRAND_EMPTY);
        }

        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }

        this.hammingDistance = calculateHammingDistance();
    }

    private int calculateHammingDistance() {
        String leftStrand = this.getLeftStrand();
        String rightStrand = this.getRightStrand();

        int distance = 0;
        if (leftStrand.isEmpty() && rightStrand.isEmpty()) {
            return distance;
        }

        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                distance++;
            }
        }

        return distance;
    }

    public String getLeftStrand() {
        return leftStrand;
    }

    public String getRightStrand() {
        return rightStrand;
    }

    public int getHammingDistance() {
        return hammingDistance;
    }
}
