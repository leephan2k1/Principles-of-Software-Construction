import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ptb2Test {
    private final String vn = "Phuong trinh vo nghiem";
    private Ptb2 ptb2;

    @BeforeEach
    void setUp() {
        ptb2 = new Ptb2(0, 4, 7);
    }

    @AfterEach
    void tearDown() {
        ptb2 = null;
    }

    @Test
    void ktVoNghiem() {
        String expected = vn;
        ptb2.setA(4);
        ptb2.setB(1);
        ptb2.setC(6);
        assertEquals(expected, ptb2.kqPtb2());
    }

    @Test
    void ktCo2Nghiem() {
        String expected = "-1.0 & -2.0";
        ptb2.setA(2);
        ptb2.setB(6);
        ptb2.setC(4);
        assertEquals(expected, ptb2.kqPtb2());
    }

    @Test
    void ktCo1Nghiem() {
        String expected = "-1.0";
        ptb2.setA(2);
        ptb2.setB(4);
        ptb2.setC(2);
        assertEquals(expected, ptb2.kqPtb2());
    }

    @Test
    void ktABang0() {
        String expected = "-0.5";
        ptb2.setA(0);
        ptb2.setB(4);
        ptb2.setC(2);
        assertEquals(expected, ptb2.kqPtb2());
    }
}