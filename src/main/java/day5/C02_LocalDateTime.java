package day5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C02_LocalDateTime {
    /*

            -Ali 29.10.1923 tarihinden 45 yıl 8 ay ve 5 gün sonra doğdu
            -Veli 15.09.1993 tarihinden 24 yıl, 2 ay ve 11 gün önce doğdu.
            -Ali ve Velinin doğum tarihini hesaplayınız
            -Alinin doğum tarihini DD/MM/YY formatında yazdırınız
            -Ali ve Velinin doğum tarihlerini karşılaştırınız(aynı mı farklı mı kontrol ediniz)

        */
    public static void main(String[] args) {


        /*LocalDate date1 = LocalDate.of(1923,10,29);
        System.out.println("Ali'nin dogum tarihi : "+date1.plusYears(45).plusMonths(8).plusDays(5));

        LocalDate date2 = LocalDate.of(1993,9,15);
        System.out.println("Veli'nin dogum tarihi : "+date2.minusYears(24).minusMonths(2).minusDays(11));*/

        LocalDate ali = LocalDate.of(1923, 10, 29).plusYears(45).plusMonths(8).plusDays(5);

        LocalDate veli = LocalDate.of(1993, 9, 15).minusYears(24).minusMonths(2).minusDays(11);

        System.out.println(ali);  // 1969-07-04
        System.out.println(veli); // 1969-07-04

        // -Alinin doğum tarihini DD/MM/YY formatında yazdırınız

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println("Ali'nin dogum tarihi : " + ali.format(dtf)); // Ali'nin dogum tarihi : 04/07//69
        System.out.println("Veli'nin dogum tarihi : " + veli.format(dtf)); // Veli'nin dogum tarihi : 04/07//69

        if (ali.equals(veli)) {
            System.out.println("Ayni tarih");
        } else {
            System.out.println("Farkli tarih");
        }
    }

}
