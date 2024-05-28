package day5.inheritance01;

public class Parent {

     /*
            - isim ve soyisim static değişkenleri oluşturalım.
            - method1 ve method2 static method'ları oluşturalım.
            - yas isimli bir instance variable oluşturalım.
            - method3 ve method4 isimli instance method'lar oluşturalım.
            - Oluşturduğumuz değişken ve method'ları, Child class'tan inheritance yaparak çağıralım.
        */

    protected static String name = "Ali";
    protected static String surname = "Can";

    public static void method1() {
        System.out.println("Parent class static method 1");
    }

    public static void method2() {
        System.out.println("Parent class static method 2");
    }

    protected int yas = 30;

    public void method3() {
        System.out.println("Parent class non-static method 3 : " + this.yas);
    }

    public void method4() {
        System.out.println("Parent class non-static method 4 : " + this.yas);
    }


}
