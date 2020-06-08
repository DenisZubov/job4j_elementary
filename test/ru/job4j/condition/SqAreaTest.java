package ru.job4j.Converter;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.SqArea;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square() {
        double expected = 2;
        double out = SqArea.square(6,2);
        Assert.assertEquals(expected, out, 0.01);

    }
}