import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ptb1Test {
    private final String vsn = "Phuong trinh vo so nghiem";
    private final String vn = "Phuong trinh vo nghiem";
    private Ptb1 ptb1;

    @BeforeEach
    void setUp() {
        ptb1 = new Ptb1(4,7 );
    }

    @AfterEach
    void tearDown() {
        ptb1 = null;
    }

    @Test
    void ktVoNghiem() {
        String expected = this.vn;
        assertEquals(expected, ptb1.kqPtb1());
    }

    @Test
    void ktVoSoNghiem() {
        String expected = this.vsn;
        ptb1.setA(0);
        ptb1.setB(0);
        assertEquals(expected, ptb1.kqPtb1());
    }

    @Test
    void ktNghiem() {
        String expected = "-1.75";
        assertEquals(expected, ptb1.kqPtb1());
    }
}