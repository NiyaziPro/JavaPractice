package day7;

import java.util.Random;

public class C03_Exception {
   /*
    rastgeleSayiBol isminde bir method olusturunuz.
    bu methodda 2 tane int random say1 olusturunuz
    ilk sayiyi ikinci sayiya bolerek sonucu ekrana yazdirinmiz

    rastgeleSayiTopla isminde bir method olusturunuz
    Bu method icerisinde iki int random sayl olusturunuz. (0'dan 10 a kadar)
    Bu iki random sayinin toplamini yazdirin ANCAK
    Eder bu iki random sayanin toplam 12 den küçükse kodunuz "Exception" versin ve mesaj olarak
            (*Toplam 12'den küçük olmamalı) yazdirsin.

    */

    public static void main(String[] args) {


        // rastgeleSayiBol();
        //System.out.println("Main methodun kodlari calismaya devam ediyor...");

        try { // Handel etmek try-catch icine alarak yapilabilir yada method signiture ye eklenebilir
            rastgeleSayiTopla();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Main methodun kodlari calismaya devam ediyor...");

    }

    public static void rastgeleSayiBol() {
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(10);
        System.out.println("Birinci sayi : " + a + "  Ikinci sayi : " + b);
        try {
            System.out.println(a + " / " + b + " = " + a / b);
        } catch (ArithmeticException e) {
            System.err.println("Hata : 0 ile bolme yapilamaz!" + e.getMessage());

            e.printStackTrace();// hatanin detayini yazdirir
        }
        System.out.println("Methodun kodlari calismaya devam ediyor...");
    }

    public static void rastgeleSayiTopla() throws Exception {
        Random random = new Random();
        int a = random.nextInt(10);
        int b = random.nextInt(10);
        System.out.println("Birinci sayi : " + a + "  Ikinci sayi : " + b);
        int toplam = a + b;
        if (toplam <= 12) {

            throw new Exception("Toplam 12'den küçük olmamalı!");

        } else {
            System.out.println(a + " + " + b + " = " + toplam);
        }
    }
}
