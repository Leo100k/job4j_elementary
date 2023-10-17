package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenEqual1To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenEqual4To4To3Then5() {
        int left = 4;
        int right = 5;
        int third = 3;
        int result = Max.max(left, right, third);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenEqual1To2To3To4Then4() {
        int left = 1;
        int right = 2;
        int third = 3;
        int fourth = 4;
        int result = Max.max(left, right, third, fourth);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenEqual1To7To3To4Then7() {
        int left = 1;
        int right = 7;
        int third = 3;
        int fourth = 4;
        int result = Max.max(left, right, third, fourth);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

}