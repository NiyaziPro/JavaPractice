package day3;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        /*

                Kullanicidan bir kelime girdisi isteyin.
                Loop, Kelimede c harfine rastlanana kadar devam etsin
                a harflerinin sayisi hesaplansin

                aaabacaa
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz : ");
        String word = input.next();
        int sayac = 0;


        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                sayac++;
            }
            if (word.charAt(i) == 'c') {
                break;
            }
        }
        System.out.println("a karakterinin sayisi : " + sayac);



        /*
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
            sayac++;
            } else if (word.charAt(i)=='c') {
        System.out.println("a karakterinin sayisi : "+sayac);
            }
        }
         */

        //2. Yol
        int i = 0;
        int counter = 0;

        while (i < word.length() && word.charAt(i) != 'c') {
            if (word.charAt(i) == 'a') {
                counter++;
            }

            i++;
        }
        System.out.println("a karakterinin sayisi : " + counter);
    }
}
