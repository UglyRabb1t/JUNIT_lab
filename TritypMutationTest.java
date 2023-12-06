package com.example.lab3_tritype;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypMutationTest {
    @Test
    public void testOneExpect4() {
        TritypMutantOne tri = new TritypMutantOne();
        /* 应该满足 1==2 使 triOut 为2，再满足下方对应的合法性的检测
        * 但使其无法构成三角形 */
        assertEquals(4, tri.Triang(1, 1, 2));
    }

    @Test
    public void testTwoExpect4() {
        TritypMutantTwo tri = new TritypMutantTwo();
        /* 应该满足 1==2 使 triOut 为1，再满足下方的检测
         * 但使其无法构成三角形1+2==3 */
        assertEquals(4, tri.Triang(2, 2, 4));
    }
}
