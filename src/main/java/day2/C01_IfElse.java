package day2;

import java.util.Scanner;

public class C01_IfElse {
    public static void main(String[] args) {

        /*
                Kullanıcıdan iki sayı isteyin,
                    - Sayıların ikisi de pozitif ise sayıların toplamını yazdırın.
                    - İkisi de negatif ise sayıların çarpımını yazdırın.
                    - İkisi farklı işaretlere sahip ise sayılarla işlem yapılamadığını yazdırın.
                    - Sayılarda sıfıra eşit olan var ise yutan eleman yazdırın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen birinci sayi'yi giriniz : ");
        int num1 = input.nextInt();
        System.out.println("Lutfen ikinci sayi'yi giriniz : ");
        int num2 = input.nextInt();

        if (num1 > 0 && num2 > 0) {
            System.out.println("Sayilarin toplami : " + (num1 + num2));
        } else if (num1 < 0 && num2 < 0) {
            System.out.println("Sayilarin carpimi : " + (num1 * num2));
        } else if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) { // num1*num2<0
            System.out.println("Sayılarla işlem yapılamaz");
        } else {
            System.out.println("Yutan eleman");
        }


    }
}
