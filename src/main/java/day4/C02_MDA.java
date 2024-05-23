package day4;

import java.util.Arrays;
import java.util.Scanner;

public class C02_MDA {
    public static void main(String[] args) {
        /*
                Bir array oluşturun.
                Devamında, her bir elemanı, iç array elemanlarının
                toplamına eşit olan tek boyutlu yeni bir array haline getirin.
                Örn:
                int[][] arr = { {3,4}, {7,2}, {9,5} }
                --> { 7, 9, 14 }
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Distaki Array'in boyutunu giriniz : ");
        int size1 = input.nextInt();
        System.out.print("icteki Array'in boyutunu giriniz : ");
        int size2 = input.nextInt();

        int[][] arr = new int[size1][size2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("(" + i + "," + j + ") eleman giriniz : ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));

        int[] array = new int[arr.length];

        int index = 0;

        for (int[] w : arr) {
            int total = 0;
            for (int element : w) {

                total += element;
            }
            array[index] = total;
            index++;
        }

        System.out.println("Sonuc : " + Arrays.toString(array));


    }
}
