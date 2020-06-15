package ru.job4j.condition;

public class possibleDiv {
    public static void Div(int number) {
        if (number < 0) {
            System.out.println("This is negative numbers.");
        }
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
                   }

    public static void main(String[] args) {
        Div(0);
    }
}

