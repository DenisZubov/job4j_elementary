package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTestTwo {

    @Test
    public void whenArrayHas4Then1() {
        int input[] = {5, 4, 3, 2};
        int value = 7;
        int result = FindLoop.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }
}