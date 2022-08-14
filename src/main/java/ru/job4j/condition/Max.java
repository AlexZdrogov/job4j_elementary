package ru.job4j.condition;

public class Max {
    public static int summation(int first, int second) {
        return first > second ? first : second;
    }

    public static int summation(int first, int second, int third) {
        return summation(first, summation(second, third));
    }

    public static int summation(int first, int second, int third, int fourth) {
        int temp = summation(second, third, fourth);
        return summation(first, temp);
    }
}
