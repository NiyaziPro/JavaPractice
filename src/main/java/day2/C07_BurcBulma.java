package day2;

import java.util.Scanner;

public class C07_BurcBulma {
    public static void main(String[] args) {
        //Kullanıcıya;
        //Kaçıncı ayda doğduğunuzu giriniz
        //Ayın kaçıncı gününde doğduğunuzu giriniz
        //sorularını yöneltiniz.

        //Kova Burcu : 22 Ocak - 19 Şubat
        //Balık Burcu : 20 Şubat - 20 Mart
        //Koç Burcu : 21 Mart - 20 Nisan
        //Boğa Burcu : 21 Nisan - 21 Mayıs
        //İkizler Burcu : 22 Mayıs - 22 Haziran
        //Yengeç Burcu : 23 Haziran - 22 Temmuz
        //Aslan Burcu : 23 Temmuz - 22 Ağustos
        //Başak Burcu : 23 Ağustos - 22 Eylül
        //Terazi Burcu : 23 Eylül - 22 Ekim
        //Akrep Burcu : 23 Ekim - 21 Kasım
        //Yay Burcu : 22 Kasım - 21 Aralık
        //Oğlak Burcu : 22 Aralık - 21 Ocak


        Scanner inp = new Scanner(System.in);
        System.out.print("Kacinci ayda dogudugunuzu giriniz : ");
        int month = inp.nextInt();
        System.out.print("Ayin kacinci gununde dogudugunuzu giriniz : ");
        int day = inp.nextInt();

        String burc = "YANLIS Girdiniz!";

        switch (month) {
            case 1:
                if (day < 1 || day > 31) {
                    System.out.println("Gecersiz bir gun girdiniz!");
                } else if (day < 22) {
                    burc = "OGLAK";
                } else {
                    burc = "KOVA";
                }
                break;
            case 2:
                if (day < 1 || day > 29) {
                    System.out.println("Gecersiz bir gun girdiniz!");
                } else if (day < 20) {
                    burc = "KOVA";
                } else {
                    burc = "BALIK";
                }
                break;
            case 3:
                if (day < 1 || day > 31) {
                    System.out.println("Gecersiz bir gun girdiniz!");
                } else if (day < 21) {
                    burc = "BALIK";
                } else {
                    burc = "KOC";
                }
                break;
            case 4:
                if (day < 1 || day > 30) {
                    System.out.println("Gecersiz bir gun girdiniz!");
                } else if (day < 21) {
                    burc = "KOC";
                } else {
                    burc = "BOGA";
                }
                break;
            case 5:
                if (day < 1 || day > 31) {
                    System.out.println("Gecersiz bir gun girdiniz!");
                } else if (day < 22) {
                    burc = "BOGA";
                } else {
                    burc = "IKIZLER";
                }
                break;
            case 6:
                if (day < 1 || day > 30) {
                    System.out.println("Gecersiz bir gun girdiniz!");
                } else if (day < 23) {
                    burc = "IKIZLER";
                } else {
                    burc = "YENGEC";
                }
                break;
            case 7:
                if (day < 1 || day > 31) {
                    System.out.println("Gecersiz bir gun girdiniz!");
                } else if (day < 23) {
                    burc = "YENGEC";
                } else {
                    burc = "ASLAN";
                }
                break;
            case 8:
                if (day < 1 || day > 31) {
                    System.out.println("Gecersiz bir gun girdiniz!");
                } else if (day < 23) {
                    burc = "ASLAN";
                } else {
                    burc = "BASAK";
                }
                break;
            case 9:
                if (day < 1 || day > 30) {
                    System.out.println("Gecersiz bir gun girdiniz!");
                } else if (day < 23) {
                    burc = "BASAK";
                } else {
                    burc = "TERAZI";
                }
                break;
            case 10:
                if (day < 1 || day > 31) {
                    System.out.println("Gecersiz bir gun girdiniz!");
                } else if (day < 23) {
                    burc = "TERAZI";
                } else {
                    burc = "AKREP";
                }
                break;
            case 11:
                if (day < 1 || day > 30) {
                    System.out.println("Gecersiz bir gun girdiniz!");
                } else if (day < 22) {
                    burc = "AKREP";
                } else {
                    burc = "YAY";
                }
                break;
            case 12:
                if (day < 1 || day > 31) {
                    System.out.println("Gecersiz bir gun girdiniz!");
                } else if (day < 22) {
                    burc = "YAY";
                } else {
                    burc = "OGLAK";
                }
                break;
            default:
                System.out.println("Gecersiz giris!");
        }

        System.out.println("Burcunuz : " + burc);

    }
}
