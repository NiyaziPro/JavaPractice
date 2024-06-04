package day6.interface01;

public class C05_PersonelMaas {
    public static void main(String[] args) {
        /*
          Bir sirketin muhasebe departmanı çalışanların maaşını hesaplıyor
          Muhasebe departmanı maaş için şu kriterlere bakıyor:

          çalışan işçi ise;
              1-Çalışanın aylık çalışma saatine göre 160 saat üstü her saat için brüt maaşı 10 dolar artır
              2-Çalışanın çalışma süresi 10 yıl ve üzeri ise maaşından %30;
              daha az ise maaşından %20 vergi kesintisi yapılıyor

          çalışan memur ise;
              1-Çalışanın aylık çalışma saatine göre 120 saat üstü her saat için brüt maaşı 15 dolar artır
              2-Çalışanın çalışma süresi 10 yıl ve üzeri ise maaşından %35;
                daha az ise maaşından %25 vergi kesintisi yapılıyor

          Her çalışanın maaşı hesaplanırken bu 2 kritere dikkat edilmek zorundadır
          Bu kriterlere göre interface kullanarak çalışanların net maaşını hesaplayan kodu yazınız
           */


        // memur : 2000, 11 ,150

        MemurMuhasebe muhasebe1 = new MemurMuhasebe();
        System.out.println("Ek mesai : " + muhasebe1.ekMesaiHesapla(150));
        System.out.println("Vergi : " + muhasebe1.vergiHesapla(2000, 11));

        muhasebe1.netMaasHesapla(2000, 11, 150);

        System.out.println("-------------------------------------------");
        // isci : 1700 , 8 , 180
        IsciMuhasebe muhasebe2 = new IsciMuhasebe();

        System.out.println("Ek mesai : " + muhasebe2.ekMesaiHesapla(180));
        System.out.println("Vergi : " + muhasebe2.vergiHesapla(1700, 8));
        muhasebe2.netMaasHesapla(1700, 8, 180);
        System.out.println("-------------------------------------------");

        GenelMuhasebe muhasebe = new IsciMuhasebe();
        muhasebe.netMaasHesapla(2000, 8, 170);

    }
}
