package ru.job4j.Converter;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void rubleToEuro() {
        double expected = 5.65;
        double out = Point.distance(-1, -1, 3, 3);
        Assert.assertEquals(expected, out, 0.01);

    }

}