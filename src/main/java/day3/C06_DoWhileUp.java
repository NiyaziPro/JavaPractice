package day3;

import java.util.Scanner;

public class C06_DoWhileUp {
    public static void main(String[] args) {


         /*

                - Kullanıcıdan pozitif tamsayılar isteyin.

                - 0 girdisi alındığında, döngüyü durdurun.

                - Döngü durdurulduğunda, toplam girilen sayı adedini ve sayıların toplamını print edin.

                - Kullanıcı negatif bir sayı girerse, bunun mümkün olmadığını belirtin.

                - Negatif sayı girilirse, bu sayıyı, sayı adedine veya toplamaya eklemeyin.

                --> Girilen x sayının toplamı: y

         */

        Scanner input = new Scanner(System.in);

        int toplam = 0;
        int sayac = 0;

       /* do {
            System.out.print("Lutfen pozitif bir tamsayi giriniz : ");
            int sayi = input.nextInt();
            if (sayi == 0) {
                break;
            } else if (sayi < 0) {
                System.out.println("Gecersiz giris!");
            } else {
                sayac++;
                toplam += sayi;
            }
        } while (true);

        System.out.println("Girilen " + sayac + " tane pozitif sayinin toplami : " + toplam);*/

        // BEST PRACTICE
        int sayi;
        do {
            System.out.print("Lutfen pozitif bir tamsayi giriniz : ");
            sayi = input.nextInt();

            if (sayi < 0) {
                System.out.println("Gecersiz giris!");
            } else {
                sayac++;
                toplam += sayi;
            }
        } while (sayi != 0);
        System.out.println("Girilen " + sayac + " tane pozitif sayinin toplami : " + toplam);
    }
}
