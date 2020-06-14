package ru.job4j.condition;

public class StringEq {
    public static void main(String[] args) {
        String login = new String("Den");
        String root = new String("Root");
        if (login.equals(root)) {
            System.out.println("login equals root");
        } else {
            System.out.println("login does not equal root");
        }
    }
}
