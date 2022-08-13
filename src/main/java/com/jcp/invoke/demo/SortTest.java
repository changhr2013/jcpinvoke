package com.jcp.invoke.demo;

import somepackage.MultiplyDemo;

import java.util.Random;

/**
 * @author changhr2013
 * @date 2020/4/12
 */
public class SortTest {

    public static final Random random = new Random();

    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = random.nextInt(10000);
        }

        int[] array1 = array.clone();
        int[] array2 = array.clone();

        long start = System.currentTimeMillis();
        MultiplyDemo.selectionSort(array1, 100000);
        long duration = System.currentTimeMillis() - start;

        long start2 = System.currentTimeMillis();
        selectionSortJava(array2, 100000);
        long duration2 = System.currentTimeMillis() - start2;

        System.out.println(duration);
        System.out.println(duration2);

    }

    public static void selectionSortJava(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            // 寻找 [i, n) 区间里的最小值
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
