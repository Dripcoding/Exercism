import java.math.BigInteger;

class Grains {

    public BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return BigInteger.valueOf(2).pow(square - 1);
    }

    public BigInteger grainsOnBoard() {
        BigInteger total = BigInteger.valueOf(0);
        for (int i = 0; i < 64; i++) {
            total = total.add(BigInteger.valueOf(2).pow(i));
        }
        return total;
    }

}
