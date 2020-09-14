package ru.job4j.condition;

public class exist{

    public static String existt(double ab, double ac, double bc) {
        String rsl = (ab + ac) > bc && (ac + bc) > ab && (ab + bc) > ac? "Получится":"Не получится";
        return rsl;
    }
    public static void main(String[] args) {
        String msg = exist.existt(3, 3, 7);
        System.out.println(msg);
    }
}