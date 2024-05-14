package day3;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {
        /*
            Kullanıcıdan tek bir tamsayı alınız.
            Girilen sayının 1 den 10 a kadar sayılarla
            çarpım tablosunu yapınız.
            */


        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen tek bir tamsayi giriniz :");
        int num = scanner.nextInt();

        if (num <= 0 || num % 2 == 0) {
            System.out.println("Yanlış giriş.Lütfen TEK bir tamsayı giriniz. ");
        } else {

            for (int i = 1; i < 11; i++) {

                System.out.println(num + " x " + i + " = " + (num * i));
            }

        }
    }
}
