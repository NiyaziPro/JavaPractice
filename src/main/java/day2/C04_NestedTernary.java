package day2;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {


        /*

                1. Kullanıcıdan iki sayı alın.
                2. Ternary kullanarak,
                    - Sayılar birbirine eşit ise, konsola "Sayılar birbirine eşit" yazdırın.
                    - Sayılar birbirine eşit değil ise, büyük olan sayının karesini ekrana yazdırın.

         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen birinci sayi'yi giriniz : ");
        int num1 = input.nextInt();
        System.out.println("Lutfen ikinci sayi'yi giriniz : ");
        int num2 = input.nextInt();

        System.out.println(num1 == num2 ? "Sayılar birbirine eşit" : num1 > num2 ? num1 * num1 : num2 * num2);

        String sonuc = num1 == num2 ? "Sayılar birbirine eşit" : num1 > num2 ? num1 * num1+"" : num2 * num2+"";
        System.out.println("sonuc = " + sonuc);


    }
}
