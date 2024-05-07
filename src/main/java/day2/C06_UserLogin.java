package day2;

import java.util.Scanner;

public class C06_UserLogin {
    public static void main(String[] args) {
        /*
            username:techpro
            password:1234
            olan kullanıcı için;
            - sisteme giriş işlemi yapınız.
            - username yanlış ise geçersiz kullanıcı yazdırın
            - şifre geçersiz ise
                -şifre sıfırlama
                     -yeni şifre giriniz
                           -eski şifre ile aynıysa işlem başarısız
                           -şifre yenilendi yazdırın
                -işlem iptal etme
                           -işlem iptal edildi

 */


        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen kullanici adinizi girin : ");
        String username = scanner.next();

        if (username.equals("techpro")) {
            System.out.print("Lutfen sifrenizi giriniz : ");
            String password = scanner.next();
            if (password.equals("1234")) {
                System.out.println("Sisteme giris yaptiniz.\nHosgeldiniz :)");
            } else {
                System.out.println("Sifreniz yanlis!\n1 - Sifre Sifirlama\n0 - Islemi iptal etme");
                int secim = scanner.nextInt();
                switch (secim) {
                    case 1:
                        System.out.print("Yeni sifreyi giriniz : ");
                        String newPassword = scanner.next();
                        if (newPassword.equals("1234")) {
                            System.out.println("Islem basarisiz!");
                        } else {
                            System.out.println("Sifre yenilendi");
                        }
                        break;
                    case 0:
                        System.out.println("Islem iptal edildi.");
                        break;
                    default:
                        System.out.println("Gecersiz secim!");
                        break;
                }
            }

        } else {
            System.out.println("Kullanici adi gecersiz!");
        }


    }
}
