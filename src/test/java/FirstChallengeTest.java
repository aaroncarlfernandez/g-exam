import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstChallengeTest {
    private  FirstChallenge fc;
    /*
    1. firstRepeatedCharacter("ABCA") returns A
    2. firstRepeatedCharacter("BCABA") returns B
    3. firstRepeatedCharacter("glovol") returns l
    4. firstRepeatedCharacter("ABC") returns null
     */

    @BeforeEach
    void setUp() {
        fc = new FirstChallenge();
    }

    @Test
    @DisplayName("The repeated character is at the end")
    void firstRepeatedCharTest_WhenRepeatedCharEnd() {
        assertEquals('A', fc.firstRepeatedChar("ABCA"));
    }

    @Test
    @DisplayName("The repeated character is at the middle")
    void firstRepeatedCharTest_WhenRepeatedCharMid() {
        assertEquals('B', fc.firstRepeatedChar("BCABA"));
    }

    @Test
    @DisplayName("The repeated characters are at the middle")
    void firstRepeatedCharTest_WhenRepeatedCharsBothMid() {
        assertEquals('l', fc.firstRepeatedChar("glovol"));
    }

    @Test
    @DisplayName("There are no repeated characters")
    void firstRepeatedCharTest_WhenNoRepeatedChar() {
        assertEquals(null, fc.firstRepeatedChar("ABC"));
    }
}