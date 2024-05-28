package day5;

public class C04_StaticKeyword {

    /*
        Java'da scope (değişken kapsamı), bir değişkenin erişilebilir olduğu kod bloğunu tanımlar.
        Değişkenler, tanımlandıkları blok içerisindeki kod tarafından erişilebilir ve kullanılabilir.
        Java'da dört ana kapsam türü vardır:

        1. Yerel Değişken Kapsamı (Local Variable Scope):
        Bir metodun veya bir blok içerisindeki değişkenlerdir. Yalnızca tanımlandıkları blok içerisinde erişilebilirler.

        2. Sınıf Değişkeni Kapsamı (Class Variable Scope):
        Sınıf düzeyinde tanımlanan ve `static` anahtar kelimesi ile belirtilen değişkenlerdir.
        Sınıfın tüm örnekleri tarafından paylaşılır ve sınıfın herhangi bir yerinde erişilebilir.

        3. Örnek Değişkeni Kapsamı (Instance Variable Scope):
        Bir sınıfın örneğine ait olan ve `static` olmayan değişkenlerdir. Sadece ilgili sınıfın örneği üzerinden erişilebilirler.

        4. Blok Kapsamı (Block Scope):
        Genellikle döngüler ve koşul ifadeleri gibi bloklar içerisinde tanımlanan değişkenlerdir.
        Bu değişkenler sadece tanımlandıkları blok içerisinde erişilebilir.
             */

    /*
    scope : etki alanı/ kapsam

    1:static variable--class
    2:instance variable/field--object


    -Bir classta instance, static değişkenler oluşturunuz
    -instance ve static metodlar oluşturunuz
    -main metodda 2 tane object oluşturunuz ve yazdırınız
    -static variableın değerini artırınız.
    -obj1 in instance variableını güncelleyiniz
    -obj2 nin instance ve static variableını güncelleyiniz
    -obj1 ve obj2 nin instance ve static değerlerini yazdırınız
     */

    public int instanceNumber = 5; // field

    public static int staticNumber = 10;

    public void instanceMethod() {
        System.out.println("Instance Method : "+ this.instanceNumber); // (this ile kullanmak BEST PRACTICE )
    }

    public static void staticMethod() {
        System.out.println("Static Method");
    }
//    public C04_StaticKeyword(int number){
//        this.instanceNumber=staticNumber;
//    }
    public static void main(String[] args) {

        C04_StaticKeyword obj1 = new C04_StaticKeyword();
        obj1.instanceNumber = 25;
        C04_StaticKeyword.staticNumber = 33;

        System.out.println("obj1.instanceNumber = " + obj1.instanceNumber); // 5 ==> 25
        System.out.println("C04_StaticKeyword.staticNumber = " + C04_StaticKeyword.staticNumber); // 10 ==> 33

        C04_StaticKeyword obj2 = new C04_StaticKeyword();
        obj2.instanceNumber = 44;

        System.out.println("obj2.instanceNumber = " + obj2.instanceNumber); // 5 ==> 44
        System.out.println("C04_StaticKeyword.staticNumber = " + C04_StaticKeyword.staticNumber); // 10 ==> 33


        System.out.println("-----------obj1------------");
        obj1.instanceMethod(); // 25
        System.out.println("-----------obj2------------");
        obj2.instanceMethod(); // 44

        C04_StaticKeyword.staticMethod();



    }
}
