package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        percent = percent / 100 + 1;
        amount *= percent;
        while (amount > salary) {
         amount = (amount - salary) * percent;
         year++;
        }
        return year;
    }
}
