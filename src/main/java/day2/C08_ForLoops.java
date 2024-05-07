package day2;

import java.util.Scanner;

public class C08_ForLoops {
    public static void main(String[] args) {

        /*

                - Kullanıcıdan 5 sayı girmesini isteyin.

                - Bu sayılardan birler basamağı 7 veya 9 olanlar hariç, sayıların toplamını hesaplayın.

                1
                2
                19
                22
                47
                --> 25
         */

        Scanner input = new Scanner(System.in);
        // System.out.println("Lutfen bir sayi giriniz : ");
        // int a = input.nextInt();
        // System.out.println("Lutfen bir sayi giriniz : ");
        // int b = input.nextInt();
        // System.out.println("Lutfen bir sayi giriniz : ");
        // int c = input.nextInt();
        // System.out.println("Lutfen bir sayi giriniz : ");
        // int d = input.nextInt();
        // System.out.println("Lutfen bir sayi giriniz : ");
        // int e = input.nextInt();
        int sum = 0;
        for (int i = 1; i < 6; i++) {
            System.out.print("Lutfen bir tamsayi giriniz : ");
            int num = input.nextInt();
            if (num % 10 != 7 && num % 10 != 9) {
                sum += num;
            }

        }
        System.out.println("Toplam : " + sum);

        // 2.yol

        int total = 0;
        for (int i = 1; i < 6; i++) {
            System.out.print("Please enter a number : ");
            int num = input.nextInt();
            if (num % 10 == 7 || num % 10 == 9) {
               continue;
            }
            total += num;

        }
        System.out.println("Total : " + sum);

    }
}
