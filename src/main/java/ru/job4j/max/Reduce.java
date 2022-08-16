package ru.job4j.max;

public class Reduce {
    private int[] array;

    public void to(int[] temp) {
        array = temp;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] temp = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(temp);
        reduce.print();
    }
}
