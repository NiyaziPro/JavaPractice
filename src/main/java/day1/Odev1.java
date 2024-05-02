package day1;

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {

        //ÖDEV: bir ürünün kdv li fiyatını hesaplayınız:kdv oranı=0.8
        //ürün fiyatı kullanıcıdan alınacak
        //kdv miktarı=ürün fiyatı* kdv oranı
        //toplam fiyat=ürün fiyatı+kdv miktarı

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Kdv'siz ürün fiyatı'ni girin : ");
        double kdvOran = 0.08;


        if (input.hasNextDouble()) {
            double urunFiyat = input.nextDouble();
            double kdv = urunFiyat * kdvOran;
            System.out.println("KDV Miktari : " + kdv + " Euro");
            double toplamFiyat = urunFiyat + kdv;
            System.out.println("Toplam Fiyat : " + toplamFiyat + " Euro");
        } else {
            System.out.println("Lutfen gecerli bir urun fiyati girin !");
        }
    }
}
