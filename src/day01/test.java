package day01;

import java.util.Arrays;

public class test {
    static void main(String[] args) {
        System.out.println("hello world");
        int num=10;
        final int num2=10;
        System.out.println(num);
        System.out.println(num2);


        int[] arr={99,79,89,77,55,62,33,11,12,54,65};
        int[] arr1={99,79,89,77,55,62,33,11,12,54,65};
        int[] arr2={99,79,89,77,55};
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.equals(arr,arr1));
    }
}
