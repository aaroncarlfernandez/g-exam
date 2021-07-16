import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThirdChallengeTest {
    private ThirdChallenge tc;

    @BeforeEach
    void setUp() {
        tc = new ThirdChallenge();
    }

    /*
    Input: [4, 2, -3, 1, 6]
    Output: true
    There is a subarray with zero sum from index 1 to 3.

    Input: [4, 2, 0, 1, 6]
    Output: true
    There is a subarray with zero sum from index 2 to 2.

    Input: [-3, 2, 3, 1, 6]
    Output: false
    There is no subarray with zero sum.
     */

    @Test
    @DisplayName("Zero sum sub array exists")
    void isZeroSumExistsTrue() {
        int[] inp1 = {4, 2, -3, 1, 6};
        int[] inp2 = {4, 2, 0, 1, 6};
        assertTrue(tc.isZeroSumExists(inp1));
        assertTrue(tc.isZeroSumExists(inp2));
    }

    @Test
    @DisplayName("Zero sum sub array does not exists")
    void isZeroSumExistsFalse() {
        int[] inp1 = {-3, 2, 3, 1, 6};
        assertFalse(tc.isZeroSumExists(inp1));
    }
}