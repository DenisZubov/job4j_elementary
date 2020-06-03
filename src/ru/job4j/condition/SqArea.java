package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double rsl = Math.pow(p/(2*(k+1)),2)*k;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println("Периметр равен 6, k=2, площадь равна "+result1);
        double result2 = SqArea.square(10, 3);
        System.out.println("Периметр равен 10, k=3, площадь равна "+result2);
        double result3 = SqArea.square(20, 5);
        System.out.println("Периметр равен 20, k=5, площадь равна "+result3);
    }
}
