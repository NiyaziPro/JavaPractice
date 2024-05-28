package day5;

public class C03_StringBuilder {
    public static void main(String[] args) {

        /*
            string->immutable
            sb->mutable

            -Kapasitesi 7 olan bir SB objesi oluşturunuz
            -Capacity ve length değerlerini konsola yazdırınız
            -Bu SB objesine "hava güzel" verisini ekleyiniz ve yazdırınız.
            -aradaki boşluğu kaldırınız

                */

        String str = "Java";
        System.out.println(str);
        str = str + " is easy";
        System.out.println(str);

        StringBuilder sb = new StringBuilder(7);
        System.out.println("Kapasite : " + sb.capacity()); // Kapasite : 7
        System.out.println("Length : " + sb.length()); // Length : 0
        sb.append("hava guzel");
        System.out.println("Kapasite : " + sb.capacity()); // Kapasite : 16
        System.out.println("Length : " + sb.length()); // Length : 10


        sb.deleteCharAt(sb.indexOf(" "));
        System.out.println("Kapasite : " + sb.capacity()); // Kapasite : 16
        System.out.println("Length : " + sb.length()); // Length : 9

        sb.reverse();
        System.out.println(sb);

        sb.delete(sb.length() - 4, sb.length());
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.insert(0,"Java ");
        System.out.println(sb);
        System.out.println("Kapasite : " + sb.capacity()); // Kapasite : 16
        System.out.println("Length : " + sb.length()); // Length : 10




    }
}
