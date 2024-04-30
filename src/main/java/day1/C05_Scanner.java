package day1;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // Task 1 : Kullanicidan bir tamsayi alip sayinin karesini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz : ");
        int num = scanner.nextInt();
        System.out.println("Girilen sayinin karesi : " + num * num);


        //Task2 :  Kullanicidan kilosunu ve boyunu alin, vucut kitle indeksini yazdıralım.
        //        //kilo/(boyun karesi)

        System.out.println("Lutfen kilonuzu kg olarak giriniz : ");
        double kilo = scanner.nextDouble();
        System.out.println("Lutfen boyunuzu metre olarak giriniz : ");
        double boy = scanner.nextDouble();

        double vki = kilo/(boy*boy);
        System.out.printf("Vucut kitle indeksi : %.2f ",vki);

    }
}
