package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.summation(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1To3Then3() {
        int first = 2;
        int second = 1;
        int third = 3;
        int result = Max.summation(first, second, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2To4To4Then4() {
        int first = 2;
        int second = 2;
        int third = 4;
        int fourth = 4;
        int result = Max.summation(first, second, third, fourth);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}