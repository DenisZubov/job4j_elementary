package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;

        while (amount > 0) {
            amount = amount - salary;
            amount = amount * ( 1 + percent/100 );
            year = year + 1;
        }
        return year;
    }
    {
        System.out.println(year(1800, 150, 30));
    }
}