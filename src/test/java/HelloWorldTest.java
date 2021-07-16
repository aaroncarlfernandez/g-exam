import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    private HelloWorld hw;

    @BeforeEach
    void setUp() {
        hw = new HelloWorld();
    }

    @Test
    void returnTrue() {
        assertTrue(hw.returnTrue(),"Result should be true");
    }
}