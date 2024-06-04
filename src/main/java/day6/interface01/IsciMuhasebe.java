package day6.interface01;

public class IsciMuhasebe implements GenelMuhasebe {
    //      çalışan işçi ise:
    //              1-Çalışanın aylık çalışma saatine göre 160 saat üstü her saat için brüt maaşı 10 dolar artır
    //              2-Çalışanın çalışma süresi 10 yıl ve üzeri ise maaşından %30;
    //              daha az ise maaşından %20 vergi kesintisi yapılıyor
    @Override
    public double ekMesaiHesapla(int calismaSaati) {
        if (calismaSaati > 160) {
            double ekMesai = (calismaSaati - 160) * 10;
            return ekMesai;
        } else {
            return 0;
        }

    }

    @Override
    public double vergiHesapla(double brutMaas, int calismaYili) {
        double vergi;
        if (calismaYili >= 10) {
            vergi = brutMaas * 0.3;
        } else {
            vergi = brutMaas * 0.2;
        }
        return vergi;
    }

    @Override
    public double netMaasHesapla(double brutMaas, int calismaYili, int calismaSaati) {

        System.out.println("Isci net Maas : " + (brutMaas + ekMesaiHesapla(calismaSaati) - vergiHesapla(brutMaas, calismaYili)));
        return brutMaas + ekMesaiHesapla(calismaSaati)-vergiHesapla(brutMaas,calismaYili);

    }
}
