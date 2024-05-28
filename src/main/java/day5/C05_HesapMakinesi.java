package day5;

import java.util.Scanner;

public class C05_HesapMakinesi {
     /*
        4 işlem yapabilen bir hesap makinesi uyg yazınız

        -Kullanıcıdan 2 tane sayı ve işlem sembolünü (+, - , * , /) alınız
        -sonucu hesaplayıp konsola yazdırınız
         Örn: kullanıcı girdileri : 8,9,+
              sonuç : 8 + 9 = 17

     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen birinci sayiyi giriniz : ");
        double number1 = input.nextDouble();
        System.out.print("Lutfen ikinci sayiyi giriniz : ");
        double number2 = input.nextDouble();

        System.out.println("Islem turunu seciniz (+ , - , * , /)");
        char operator = input.next().charAt(0);

        hesapla(number1, number2, operator);
        calculator(number1, number2, operator);


    }

    public static void hesapla(double num1, double num2, char operator) {

        if (operator == '+') {
            System.out.println("Sayilarin toplami : " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Sayilarin farki : " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Sayilarin carpimi : " + num1 * num2);
        } else if (operator == '/') {
            System.out.println("Sayilarin bolumu : " + num1 / num2);
        } else {
            System.out.println("Lutfen gecerli bir islem operatoru giriniz!");
        }
    }

    public static void calculator(double num1, double num2, char operator) {
        double sonuc = 0;

        switch (operator) {
            case '+':
                sonuc = num1 + num2;
                break;
            case '-':
                sonuc = num1 - num2;
                break;
            case '*':
                sonuc = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0 ile bölme yapılamaz!!!");
                } else
                    sonuc = num1 / num2;
                break;
            default:
                break;
        }
        System.out.println("Sonuç : " + num1 + " " + operator + " " + num2 + " = " + sonuc);
    }
}
