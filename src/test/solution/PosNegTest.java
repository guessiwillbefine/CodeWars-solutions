package solution;

import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class PosNegTest {
    @Test
    public void countPositivesSumNegatives_BasicTest() {
        int[] expectedResult = new int[]{10, -65};
        assertArrayEquals(expectedResult, PositiveNegativeCount.countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    }

    @Test
    public void countPositivesSumNegatives_InputWithZeroes() {
        int[] expectedResult = new int[]{8, -50};
        assertArrayEquals(expectedResult, PositiveNegativeCount.countPositivesSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
    }

    @Test
    public void ZeroArgsShouldReturnEmptyArray() {
        int[] expectedResult = new int[]{};
        assertArrayEquals(expectedResult, PositiveNegativeCount.countPositivesSumNegatives(new int[]{}));
    }
    @Test
    public void nullArgsShouldReturnEmptyArray() {
        int[] expectedResult = new int[]{};
        assertArrayEquals(expectedResult, PositiveNegativeCount.countPositivesSumNegatives(null));
    }
}

