package day3;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        /*

                - Kullanıcıdan bir sayı girdisi isteyin.

                - Girilen sayıdan başlayarak,
                10'un katına gelene kadar ardışık şekilde sayıları yazdırın.

                22

                22, 23, 24, 25, 26, 27, 28, 29

         */


        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir  tamsayi giriniz : ");
        int num = input.nextInt();

        while (num % 10 != 0) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();

        /*for (int i = num; i % 10 != 0; i++) {
            System.out.print(num + " ");
        }*/


    }
}
