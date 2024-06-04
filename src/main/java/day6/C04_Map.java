package day6;

import java.util.HashMap;
import java.util.Map;

public class C04_Map {
    public static void main(String[] args) {

        /*
         İki farklı Arrayde aynı indekste barındırılan ad ve soyadları örnekteki gibi
         yazdıran bir kod yazınız.
         input: ,{"John","Mark","Ali"} {"Steinbeck","Down","Can"};
         output: {John=Steinbeck, Mark=down, Ali=Can}
        */


        String[] isimler = {"John", "Mark", "Ali"};
        String[] soyisimler = {"Steinbeck", "Down", "Can"};

        Map<String, String> isimSoyisim = new HashMap<>();

        for (int i = 0; i < isimler.length; i++) {
            isimSoyisim.put(isimler[i], soyisimler[i]);

        }
        System.out.println(isimSoyisim); // {John=Steinbeck, Mark=Down, Ali=Can}

        if (isimSoyisim.get("John").equalsIgnoreCase("steinbeck")) {
            System.out.println("Aranan kişi bulundu.");
        }


    }
}
