package fr.lernejo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @Test
    void op() {
        Sample s = new Sample();
        assertEquals(3, s.op(Sample.Operation.ADD, 1, 2));
        assertEquals(6, s.op(Sample.Operation.MULT, 2, 3));
    }

    @Test
    void fact() {
        Sample s = new Sample();
        assertEquals(1, s.fact(0));
        assertEquals(1, s.fact(1));
        assertEquals(2, s.fact(2));
        assertEquals(6, s.fact(3));
        assertEquals(24, s.fact(4));
        assertEquals(120, s.fact(5));
        assertThrows(IllegalArgumentException.class, () -> s.fact(-1));
    }
}
