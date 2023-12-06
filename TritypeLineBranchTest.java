package com.example.lab3_tritype;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeLineBranchTest {
    @Test
    public void illegalResult4() {
        Tritype tri = new Tritype();
        // 不合法边长
        assertEquals(4, tri.Triang(0, 2, 7));
    }

    @Test
    public void badResult4() {
        Tritype tri = new Tritype();
        // 不构成三角形
        assertEquals(4, tri.Triang(1, 2, 7));
    }

    @Test
    public void badIsoResult4() {
        Tritype tri = new Tritype();
        // 不构成三角形
        assertEquals(4, tri.Triang(2, 2, 7));
    }

    @Test
    public void scaleneResult1() {
        Tritype tri = new Tritype();
        // scalene
        assertEquals(1, tri.Triang(3, 4, 5));
    }

    @Test
    public void isoscelesResult2_1_2() {
        Tritype tri = new Tritype();
        // isosceles
        assertEquals(2, tri.Triang(2, 2, 1));
    }

    @Test
    public void isoscelesResult2_1_3() {
        Tritype tri = new Tritype();
        // isosceles
        assertEquals(2, tri.Triang(2, 1, 2));
    }

    @Test
    public void isoscelesResult2_2_3() {
        Tritype tri = new Tritype();
        // isosceles
        assertEquals(2, tri.Triang(1, 2, 2));
    }

    @Test
    public void test4() {
        Tritype tri = new Tritype();
        // equilateral
        assertEquals(3, tri.Triang(2, 2, 2));
    }
}