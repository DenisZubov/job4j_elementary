package ru.job4j.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public double ManFit(short height) {
        double in = 187;
        double expected = 100.05;
        double out = ru.job4j.calculator.Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
        return in;
    }
        @Test
        public double WomanFit ( short height){
            double in = 187;
            double expected = 88.55;
            double out = ru.job4j.calculator.Fit.womanWeight(in);
            Assert.assertEquals(expected, out, 0.01);
            return in;

        }

    }


