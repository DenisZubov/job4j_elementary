package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] array = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '}};

        boolean rsl = MatrixCheck.isWin(array);
        assertThat(rsl, is(true));
    }
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] array = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '}};

        boolean rsl = MatrixCheck.isWin(array);
        assertThat(rsl, is(false));
    }
    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] array = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '}};

        boolean rsl = MatrixCheck.isWin(array);
        assertThat(rsl, is(true));
    }

}
