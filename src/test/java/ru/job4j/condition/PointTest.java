package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertThat(dist).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when01to23then2Dot82() {
        double expected = 2.82;
        int x1 = 0;
        int y1 = 1;
        int x2 = 2;
        int y2 = 3;
        Point a = new Point(0, 1);
        Point b = new Point(2, 3);
        double dist = a.distance(b);
        assertThat(dist).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when51to23then3Dot60() {
        double expected = 3.60;
        int x1 = 5;
        int y1 = 1;
        int x2 = 2;
        int y2 = 3;
        Point a = new Point(5, 1);
        Point b = new Point(2, 3);
        double dist = a.distance(b);
        assertThat(dist).isEqualTo(expected, withPrecision(0.01));
    }
}