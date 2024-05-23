package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C03_List {
    public static void main(String[] args) {
         /*
                - Bir List olusturunuz.
                - 1'den 15'e kadar sayilar ekleyiniz.
                - Devaminda, 10'dan buyuk olan elemanlari 2 katina cikarin.

                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 22, 24, 26, 28, 30
         */

        ArrayList<Integer> mylist = new ArrayList<>();

        for (int i = 1; i < 16; i++) {
            mylist.add(i);
        }
        System.out.println(mylist);


        for (int sayi : mylist) {
            if (sayi > 10) {
                mylist.set(mylist.indexOf(sayi), sayi * 2);
            }
        }
        System.out.println(mylist);

        System.out.println("-------------------------------------");

        /*
        -Kullanıcıdan
        -10 elemanlı bir List isteyiniz.
        - listeyi yazdırınız.
        - Devaminda, 10'dan buyuk olan elemanlari 2 katina cikarin.

        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 22, 24, 26, 28, 30
 */
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);


        for (int i = 1; i < 11; i++) {
            System.out.print("Lutfen List'e eklemek istediginiz sayiyi giriniz : ");

            list.add(input.nextInt());
        }

        System.out.println(list);


        for (int sayi : list) {

            if (sayi > 10) {

                //listede bir elemanın indexi nedir:indexOf(10)
                list.set(list.indexOf(sayi), sayi * 2);


            }
        }

        System.out.println("yeni liste : " + list);


    }
}
