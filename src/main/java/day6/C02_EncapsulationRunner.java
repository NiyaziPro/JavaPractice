package day6;

import java.util.Arrays;

public class C02_EncapsulationRunner {
    public static void main(String[] args) {


        //        Ali,Can,25 özelliklerine sahip bir obje oluşturunuz ve yazdırınız

        C01_Encapsulation objAli = new C01_Encapsulation("Ali", "Can", 25);
        System.out.println(objAli);
        System.out.println(objAli.getYas());
        System.out.println(objAli.getIsim());

        //        yaşı 30 olarak güncelleyiniz

        objAli.setYas(30);
        System.out.println(objAli);

        //        değişkenleri set edilmemiş ikinci bir obje oluşturunuz ve yazdırınız

        C01_Encapsulation objAyse = new C01_Encapsulation();
        System.out.println(objAyse); // {isim='null', soyisim='null', yas=0}
        objAyse.setIsim("Ayse");
        objAyse.setSoyisim("Yilmaz");
        objAyse.setYas(40);
        System.out.println(objAyse); // {isim='Ayse', soyisim='Yilmaz', yas=40}
        objAyse.setYas(-5);
        System.out.println(objAyse.getYas());

        //        isim ve soyismin sadece ilk harfi okunsun diğerleri * olsun,
        //        getter metodunda gerekli düzeltmeyi yapınız.
        C01_Encapsulation obj = new C01_Encapsulation("Veli", "Han", -5);
        System.out.println(obj);
        System.out.println(obj.getIsim() + " " + obj.getSoyisim());

        obj.setIsim("fAtMa");
        System.out.println(obj);

    }
}
