package day6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {
    public static void main(String[] args) {
        /*
            verilen bir arrayden tekrar eden elemanları silip
            unique elemanlardan oluşan bir array haline dönüştüren metod oluşturun
            int arr[]={1,2,2,3,4,4,5};-->{1,2,3,4,5}
             */

        int[] arr = {1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5};
        System.out.println(Arrays.toString(arr));

        arr = benzersizyap(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static int[] benzersizyap(int[] arr) {
        Set<Integer> mySet = new HashSet<>();
        for (int w : arr) {
            mySet.add(w);
        }
        int[] uniqueArr = new int[mySet.size()];
        int index = 0;
        for (int s : mySet) {
            uniqueArr[index] = s;
            index++;
        }

        return uniqueArr;
    }

}
