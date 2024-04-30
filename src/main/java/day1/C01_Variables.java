package day1;

public class C01_Variables {
    public static void main(String[] args) {
        //Bir yaş variable'ı oluştur ve yazdır.
        byte age = 21;

        System.out.println("18");//hard coding
        System.out.println("Yaş : " + age);//dinamik coding

        // Bir sayi variable'i olustur ve yazdir

        int number = 12345;
        System.out.println("number = " + number);

        // Bir tane myAge isminde variable olustur, mevcut olan age degiskeninin degerini ata
        double myAge = age;
        System.out.println("Benim yasim : " + myAge);

        // bir isim variable' i olustur,yazdir

        String name = "Jack";
        System.out.println("Isim : " + name);

        // myName variable'i olustur ve mevcut name degiskeninin degerini ata

        String myName = name;
        System.out.println("name = " + name);
        System.out.println("myName = " + myName);
        System.out.println("Isim : " + myName);

        name = "Harry";
        System.out.println("name = " + name);
        System.out.println("myName = " + myName);

        //





    }
}
