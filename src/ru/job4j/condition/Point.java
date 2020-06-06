package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(-1, -1, 3, 3);
        System.out.println("Расстояние между точками равно " + result);
        double result1 = Point.distance(-7, 5, 8, 11);
        System.out.println("Расстояние между точками равно "+ result1);
        double result2 = Point.distance(-50, -20, 17, 4);
        System.out.println("Расстояние между точками равно "+ result2);


    }
}
