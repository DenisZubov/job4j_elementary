package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 1;
        while (ivan <= nik) {
        ivan = 3*ivan*month;
        nik = 2*nik*month;
        month++;
        }
        return month;
    }
    public static void main(String[] args) {
        System.out.println("Через "+calc(50, 80)+" мес.");
    }
    }
