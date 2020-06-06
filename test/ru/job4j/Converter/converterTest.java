package ru.job4j.Converter;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

public class converterTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollars() {
        int in = 180;
        int expected = 3;
        int out = converter.rubleToDollars(in);
        Assert.assertEquals(expected, out);
    }

}