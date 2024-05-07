package day2;

import java.util.Scanner;

public class C05_Switch {
    public static void main(String[] args) {

        /*

                Kullanıcıdan 0-4 arasında bir puan girdisi isteyin.

                Eğer ki puanı,
                    0,0 - 1,0 arasinda ise: KALDI yaziniz.
                    1,0 - 2,0 arasinda ise: GECTI yaziniz.
                    2,0 - 2,5 arasinda ise: IYI yaziniz.
                    2,5 - 3,5 arasinda ise: UST yaziniz.
                    3,5 - 4,0 arasinda ise: HARIKA yaziniz.

                Devaminda,

                Switch Case kullanarak harf notlari veriniz.
                    KALDI   = F
                    GECTI   = D
                    IYI     = C
                    UST     = B
                    HARIKA  = A


         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 0-4 arasında bir puan giriniz");
        double inNum = scanner.nextDouble();

        String sonuc = "";

        if (inNum >= 0 && inNum < 1) {
            sonuc = "Kaldi";

        } else if (inNum >= 1 && inNum < 2) {
            sonuc = "Gecti";
        } else if (inNum >= 2 && inNum < 2.5) {
            sonuc = "Iyi";
        } else if (inNum >= 2.5 && inNum < 3.5) {
            sonuc = "Ust";
        } else if (inNum >= 3.5 && inNum <= 4) {
            sonuc = "Harika";
        } else {
            sonuc = "Lutfen gecerli bir puan giriniz!";
        }
        System.out.println(sonuc);

        switch (sonuc) {
            case "Kaldi":
                System.out.println("Notunuz : F");
                break;
            case "Gecti":
                System.out.println("Notunuz : D");
                break;
            case "Iyi":
                System.out.println("Notunuz : C");
                break;
            case "Ust":
                System.out.println("Notunuz : B");
                break;
            case "Harika":
                System.out.println("Notunuz : A");
                break;
            default:
                System.out.println("Not belirsiz!");


        }


    }
}
