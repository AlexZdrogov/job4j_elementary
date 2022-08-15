package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to20then1() {
        Point a = new Point(1, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        double expected = 1;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when200to202then2() {
        Point a = new Point(2, 0, 0);
        Point b = new Point(2, 0, 2);
        double out = a.distance3d(b);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

}