package ru.job4j.condition;

public class Triangle {
    static boolean exist (double ab, double ac, double bc){
        if (ab + ac > bc&&ac + bc > ab&&ab + bc > ac) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args){
        System.out.println( exist(1,1,1) );
    }
}
