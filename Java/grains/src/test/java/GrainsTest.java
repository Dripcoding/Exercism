import org.junit.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GrainsTest {

    private Grains grains = new Grains();

    @Test
    public void countAtSquare1() {
        BigInteger result = grains.grainsOnSquare(1);
        BigInteger result1 = grains.grainsOnSquareShiftLeft(1);

        assertEquals(new BigInteger("1"), result);
        assertEquals(new BigInteger("1"), result1);
    }

    @Test
    public void countAtSquare2() {
        BigInteger result = grains.grainsOnSquare(2);
        BigInteger result1 = grains.grainsOnSquareShiftLeft(2);

        assertEquals(new BigInteger("2"), result);
        assertEquals(new BigInteger("2"), result1);
    }

    @Test
    public void countAtSquare3() {
        BigInteger result = grains.grainsOnSquare(3);
        BigInteger result1 = grains.grainsOnSquareShiftLeft(3);

        assertEquals(new BigInteger("4"), result);
        assertEquals(new BigInteger("4"), result1);
    }

    @Test
    public void countAtSquare4() {
        BigInteger result = grains.grainsOnSquare(4);
        BigInteger result1 = grains.grainsOnSquareShiftLeft(4);

        assertEquals(new BigInteger("8"), result);
        assertEquals(new BigInteger("8"), result1);
    }

    @Test
    public void countAtSquare16() {
        BigInteger result = grains.grainsOnSquare(16);
        BigInteger result1 = grains.grainsOnSquareShiftLeft(16);

        assertEquals(new BigInteger("32768"), result);
        assertEquals(new BigInteger("32768"), result1);
    }

    @Test
    public void countAtSquare32() {
        BigInteger result = grains.grainsOnSquare(32);
        BigInteger result1 = grains.grainsOnSquare(32);

        assertEquals(new BigInteger("2147483648"), result);
        assertEquals(new BigInteger("2147483648"), result1);
    }

    @Test
    public void countAtSquare64() {
        BigInteger result = grains.grainsOnSquare(64);
        BigInteger result1 = grains.grainsOnSquare(64);

        assertEquals(new BigInteger("9223372036854775808"), result);
        assertEquals(new BigInteger("9223372036854775808"), result1);
    }

    @Test
    public void errorOnNullBoardSize() {
        IllegalArgumentException expected =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> grains.grainsOnSquare(0));
        IllegalArgumentException expected1 =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> grains.grainsOnSquareShiftLeft(0));

        assertThat(expected)
                .hasMessage("square must be between 1 and 64");
        assertThat(expected1)
                .hasMessage("square must be between 1 and 64");
    }

    @Test
    public void errorOnNegativeBoardSize() {
        IllegalArgumentException expected =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> grains.grainsOnSquare(-1));
        IllegalArgumentException expected1 =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> grains.grainsOnSquareShiftLeft(-1));

        assertThat(expected)
                .hasMessage("square must be between 1 and 64");
        assertThat(expected1)
                .hasMessage("square must be between 1 and 64");
    }

    @Test
    public void errorOnExcessiveBoardSize() {
        IllegalArgumentException expected =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> grains.grainsOnSquare(65));
        IllegalArgumentException expected1 =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> grains.grainsOnSquareShiftLeft(65));

        assertThat(expected)
                .hasMessage("square must be between 1 and 64");
        assertThat(expected1)
                .hasMessage("square must be between 1 and 64");
    }

    @Test
    public void totalNumberOfGrainsOnABoard() {
        BigInteger total = grains.grainsOnBoard();
        BigInteger total1 = grains.grainsOnBoardShiftLeft();

        assertEquals(new BigInteger("18446744073709551615"), total);
        assertEquals(new BigInteger("18446744073709551615"), total1);
    }

}
