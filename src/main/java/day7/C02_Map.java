package day7;

import java.util.*;

public class C02_Map {
    public static void main(String[] args) {
        /*
            Bir map içerisinde verilen fiyatların toplamını bulan bir method yazınız. (for each loop kullanınız)
            Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95
        */

        HashMap<String, Double> urunFiyat = new HashMap<>();
        urunFiyat.put("Kemer", 19.99);
        urunFiyat.put("Gomlek", 29.99);
        urunFiyat.put("Ayakkabi", 89.99);
        urunFiyat.put("Kazak", 24.99);
        urunFiyat.put("Kravat", 19.99);

        double topFiyat = totalStockPrices(urunFiyat);
        System.out.println("Tum urunlerin Toplam fiyati : " + topFiyat + "$");

        System.out.println();
        tumUrunleriListele(urunFiyat);
        System.out.println();

        //----------------------------------------------------------------------
        //Kullanici sepete 3 tane urun eklesin ve sepetin toplam fiyati cikti olarak yazdiran bir method olusturun

        sepeteUrunEkle(urunFiyat);

    }

    private static void sepeteUrunEkle(HashMap<String, Double> urunFiyat) {
        List<String> sepet = new ArrayList<>();
        double toplamSepetFiyati = 0;

        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Urun ekle : ");
            String urunAdi = input.next();
            sepet.add(urunAdi);
            toplamSepetFiyati += urunFiyat.get(urunAdi);
        }

        System.out.println("Sepetteki urunler : "+sepet);
        System.out.println("Sepetin toplam fiyati : "+toplamSepetFiyati+"$");
    }

    private static double totalStockPrices(HashMap<String, Double> urunFiyat) {
        double toplam = 0;
        for (double e : urunFiyat.values()) {
            toplam += e;
        }
        return toplam;

    }

    private static void tumUrunleriListele(HashMap<String, Double> urunFiyat) {
        for (String urun : urunFiyat.keySet()) {
            System.out.print(urun + ",");
        }
    }


}
