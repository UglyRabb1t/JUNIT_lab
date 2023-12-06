package com.example.lab3_tritype;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeConditionTest {
    /*
    * 选取的是这个 Decision
    * if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
      {
            triOut = 4;
            return (triOut);
      }
    * */
    @Test
    public void testFFF() {
        Tritype tri = new Tritype();
        assertEquals(3, tri.Triang(1, 1, 1));
    }

    @Test
    public void testTTT() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(0, 0, 0));
    }
}