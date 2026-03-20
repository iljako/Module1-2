package com.ilja.Module12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        int[] array = {3, 8, 15, 17};
        int target = 23;

        int[] result = TwoIndexes.getTwoIndexes(array, target);

        if (result != null) {
            System.out.println("Индексы: [" + result[0] + ", " + result[1] + "]");
            System.out.println("Значения: " + array[result[0]] + " + " + array[result[1]]);
            System.out.println("Сумма: " + (array[result[0]] + array[result[1]]));
        }
    }

    private static void task2() {
        // Тест 1: есть дубликаты
        int[] array1 = {4, 5, 6, 6, 8};
        System.out.println("Array: [4, 5, 6, 6, 8]");
        System.out.println("Результат: " + HasDuplicate.hasDuplicate(array1)); // true

        // Тест 2: нет дубликатов
        int[] array2 = {4, 5, 6, 7, 8};
        System.out.println("\nArray: [4, 5, 6, 7, 8]");
        System.out.println("Результат: " + HasDuplicate.hasDuplicate(array2)); // false
    }

}