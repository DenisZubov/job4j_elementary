package ru.job4j.calculator;

class MathFunc {

    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }
    public static void main(String[] args) {
        int result = MathFunc.func1(10);
        System.out.println(result);

    }
}