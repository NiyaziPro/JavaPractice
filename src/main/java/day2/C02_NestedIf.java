package day2;

import java.util.Scanner;

public class C02_NestedIf {
    public static void main(String[] args) {
         /*

                 Kullanıcıdan bir pozitif tamsayı girmesini isteyin.
                    - Numara tek ise, konsola "Tek Sayı" yazdırın.
                    - Numara çift ise,
                        + Numara 10'dan küçük ise konsola "Çift Rakam" yazdırın.
                        + Numara 10'dan büyük ise konsola "Çift Sayı" yazdırın.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir pozitif tamsayi giriniz : ");
        int num = scan.nextInt();

        if (num >= 0) {
            if (num % 2 != 0) { // num % 2 == 1
                System.out.println("Tek sayi");
            } else {
                if (num < 10)
                    System.out.println("Çift Rakam");
                else
                    System.out.println("Çift Sayı");
            }
        } else {
            System.out.println("Negatif sayi girdiniz!");
        }


    }
}
