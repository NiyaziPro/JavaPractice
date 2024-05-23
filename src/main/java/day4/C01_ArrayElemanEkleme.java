package day4;

import java.util.Arrays;
import java.util.Scanner;

public class C01_ArrayElemanEkleme {
    public static void main(String[] args) {

         /*

                kullanıcıdan bir array isteyelim.
                Belirtilen array'e, istenen elemanı ekleyin

                int[] arr = { 1, 4, 23, 12}

                Istenen eleman: 7

                arr = { 1, 4, 23, 12, 7}

         */

        Scanner input = new Scanner(System.in);
        System.out.print("Array'in eleman sayisini giriniz : ");

        int size = input.nextInt(); // 5

        int[] array = new int[size];


        for (int i = 0; i < array.length; i++) {
            System.out.print("Lutfen bir sayi giriniz : ");
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));

        System.out.print("Mevcut Array'e eklemek istediginiz elemani giriniz : ");
        int newEl = input.nextInt();
        int[] newArr = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];

        }
        newArr[newArr.length - 1] = newEl;

        System.out.println(Arrays.toString(newArr));


    }
}
