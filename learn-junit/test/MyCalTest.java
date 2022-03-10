import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalTest {
    private  MyCal cal;

    @BeforeEach
    void setUp() {
       cal = new MyCal();
    }

    @AfterEach
    void tearDown() {
        cal = null;
    }

    @Test
    void plus() {
        float numberA = 2.5f;
        float numberB = 3f;
        float expected = 5.5f;
        assertEquals(expected, cal.add(numberA, numberB));
    }

    @Test
    void minus() {
        float numberA = 5f;
        float numberB = 3f;
        float expected = 2f;
        assertEquals(expected, cal.minus(numberA, numberB));
    }

    @Test
    void mul() {
        float numberA = 5f;
        float numberB = 3f;
        float expected = 15f;
        assertEquals(expected, cal.mul(numberA, numberB));
    }

    @Test
    void div() {
        float numberA = 5f;
        float numberB = 1f;
        float expected = 5f;
        assertEquals(expected, cal.div(numberA, numberB));
    }

    @Test
    void min() {
        float numberA = 5f;
        float numberB = 2f;
        float expected = 2f;
        assertEquals(expected, cal.min(numberA, numberB));
    }

    @Test
    void max() {
        float numberA = 5f;
        float numberB = 2f;
        float expected = 2f;
        assertEquals(expected, cal.max(numberA, numberB));
    }
}