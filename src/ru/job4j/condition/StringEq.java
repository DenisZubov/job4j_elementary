package ru.job4j.condition;

public class StringEq {
    public static boolean check(String login) {
        String root = new String("root");
        boolean result = false;
        if (root.equals(login)) {
            result = true;

        }

        return result;
    }

    public static void main(String[] args) {
        String name = "root";
        boolean result = StringEq.check("Denis");
        System.out.println(result);
    }

}