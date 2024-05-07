package day2;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        /*
                1. Kullanıcıdan bir sayı alın.
                2. Ternary kullanarak,
                    - Girilen sayı çift ise konsola "Çift Sayı" yazdırın.
                    - Girilen sayı tek ise, sayıyı 3 arttırarak konsola yazdırın.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz : ");
        int num = scan.nextInt();

        // 1.yol
        String sonuc = num % 2 == 0 ? "Çift Sayı" : num + 3 + "";
        System.out.println("Sonuc = " + sonuc);

        // 2.yol
        String sonuc2 = num % 2 == 0 ? "Çift Sayı" : String.valueOf(num + 3);
        System.out.println("sonuc2 = " + sonuc2);

        // 3.yol

        System.out.println(num % 2 == 0 ? "Çift Sayı" : num + 3);


    }
}
