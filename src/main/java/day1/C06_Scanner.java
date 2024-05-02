package day1;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // Task 3 : Yarıçapı r olan dairenin alanını bulan kodu yazınız.
        //        //𝜋 sayısını = 3.14 alınız.
        //        //Formül : 𝜋 * (r*r)


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir dairenin yaricapini giriniz : ");
        double r = scanner.nextDouble();
        double pi = 3.14;
        double alan = pi * (r * r);

        System.out.printf("Dairenin Alani : %.2f", alan);
        System.out.println();


        //TASK 4:otomatik öğrenci numarası oluşturunuz
        //format:bölüm isminin ilk harfi+giriş yılı+kayıt sırası
        //örnek:Y20245

        System.out.print("Lutfen bolum isminizin ilk harfini  giriniz : ");
        String bolumIsim = scanner.next();
        System.out.print("Lutfen giris yilinizi giriniz : ");
        int girisYili = scanner.nextInt();
        System.out.print("Lutfen kayit siranizi giriniz :");
        int kayitNo = scanner.nextInt();

        String studentNo = bolumIsim + girisYili + kayitNo;
        System.out.println("Basarilar dileriz :) "+studentNo+" sizin ogrenci numaranizdir !");







    }
}
