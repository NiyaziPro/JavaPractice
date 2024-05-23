package day4;


import java.util.Arrays;
import java.util.Scanner;

public class C05_EnUzunKelime {
    public static void main(String[] args) {
        /*
                Kullanıcıdan alınan cümledeki en uzun kelimeyi yazdiran bir kod yazınız.
                Ornek: "kullanicidan alinan cumle"
                ornek cumle : Java candir gerisi heyecan!

         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cumlenizi giriniz : ");
        String cumle = scan.nextLine();
        System.out.println(cumle);

        cumle= cumle.replaceAll("[\\p{P}]","");
        // "[\\p{P}]" : tum noktalama isaretleri
        // "[\\P{P}]" : tum noktalama isaretleri haric

        String enUzunKelime = "";

        String[] words = cumle.split("\\s+");
        System.out.println(Arrays.toString(words));

        for (String w : words) {
            if (w.length() > enUzunKelime.length()) {
                enUzunKelime = w;
            }
        }
        System.out.println(enUzunKelime);


    }
}
