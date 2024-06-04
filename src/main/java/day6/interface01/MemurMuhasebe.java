package day6.interface01;

//çalışan memur ise;
//              1-Çalışanın aylık çalışma saatine göre 120 saat üstü her saat için brüt maaşı 15 dolar artır
//              2-Çalışanın çalışma süresi 10 yıl ve üzeri ise maaşından %35;
//                daha az ise maaşından %25 vergi kesintisi yapılıyor
public class MemurMuhasebe implements GenelMuhasebe {
    @Override
    public double ekMesaiHesapla(int calismaSaati) {
        if (calismaSaati > 120) {
            double ekMesai = (calismaSaati - 120) * 15;
            return ekMesai;
        } else {
            return 0;
        }
    }

    @Override
    public double vergiHesapla(double brutMaas, int calismaYili) {
        double vergi;
        if (calismaYili >= 10) {
            vergi = brutMaas * 0.35;
        } else {
            vergi = brutMaas * 0.25;
        }
        return vergi;
    }

    @Override
    public double netMaasHesapla(double brutMaas, int calismaYili, int calismaSaati) {
        System.out.println("Memur net Maas : " + (brutMaas + ekMesaiHesapla(calismaSaati) - vergiHesapla(brutMaas, calismaYili)));
        return brutMaas + ekMesaiHesapla(calismaSaati) - vergiHesapla(brutMaas, calismaYili);
    }
}
