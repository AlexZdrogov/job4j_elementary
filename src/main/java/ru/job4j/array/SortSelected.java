package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, 0 + i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, 0 + i, data.length - 1);
            SwitchArray.swap(data, index, 0 + i);
        }
        return data;
    }
}
