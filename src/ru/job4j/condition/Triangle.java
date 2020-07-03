package ru.job4j.condition;

public class Triangle {
    static boolean exist (double ab, double ac, double bc){
        if (ab + ac > bc&&ac + bc > ab&&ab + bc > ac) {
            return ab + ac > bc && ac + bc > ab && ab + bc > ac;        }
        else {
            return false;
        }
    }

    public static void main(String[] args){
        System.out.println( exist(1,2,2) );
    }
}
