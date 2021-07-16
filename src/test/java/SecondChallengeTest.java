import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondChallengeTest {

    /*
    Input: ABCD, DABC
    Output: true

    Input: AABB, BBAA
    Output: true

    Input: AAAB, AAB
    Output: false

    Input: AAAB, AABC
    Output: false

    Input: ACBA, ABBC
    Output: false
     */

    private SecondChallenge sc;

    @BeforeEach
    void setUp() {
        sc = new SecondChallenge();
    }

    @Test
    @DisplayName("Valid Anagrams")
    void isValidAnagram() {
        assertTrue(sc.isAnagram("ABCD", "DABC"), "Result should be true");
        assertTrue(sc.isAnagram("AABB", "BBAA"), "Result should be true");
    }

    @Test
    @DisplayName("Inputs lengths are not equal")
    void isNotValidAnagramDueToLength() {
        assertFalse(sc.isAnagram("AAAB", "AAB"), "Result should be false");
    }

    @Test
    @DisplayName("Inputs are not valid anagrams")
    void isNotValidAnagrams() {
        assertFalse(sc.isAnagram("AAAB", "AABC"), "Result should be false");
        assertFalse(sc.isAnagram("ACBA", "ABBC"), "Result should be false");
    }
}