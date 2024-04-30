package day1;

import java.util.Scanner;

public class C07_IfElse {
    public static void main(String[] args) {


        //kullanıcıdan bir tam sayı isteyiniz:
        //        sayının pozitif, negatif veya nötr olduğunu kontrol edip
        //        yazdıralım.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir tam sayi giriniz : ");
        int sayi = scanner.nextInt();

        if (sayi > 0) {
            System.out.println("Girilen sayi Pozitif !");
        } else if (sayi < 0) {
            System.out.println("Girilen sayi Negatif !");
        } else {
            System.out.println("Girilen sayi notr'dur !");
        }



    }
}
