package day5;

import day4.C05_EnUzunKelime;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Varargs {
    public static void main(String[] args) {
        // verilen kelimeler arasinda en uzun kelimeyi bulan bir method tanimlayiniz ve kullanimini orneklendiriniz
        // orn: enUzunKelimeyiBul("Java", "guzel","bir","programlama","dilidir") ==> return programlama

        String word1 = "Java";
        String word2 = "candir";
        String word3 = "gerisi";
        String word4 = "heyecandir";

        String longestWord = enUzunKelimeyiBul(word1, word2, word3, word4);
        String manipulated = word1 + " " + longestWord;

        System.out.println(longestWord);
        System.out.println(word1 + " " + enUzunKelimeyiBul(word1, word2));
        System.out.println(manipulated);

        System.out.println(enUzunKelimeyiBul("Java", "is", "easy"));


    }

    public static String enUzunKelimeyiBul(String... strings) {


        String enUzunKelime = "";

        for (String w : strings) {
            if (w.length() > enUzunKelime.length()) {
                enUzunKelime = w;

            }
        }
        return enUzunKelime;
    }
}
