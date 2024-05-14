package day3;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *


         satır no     yıldız sayısı
                1                1
                2                2
                3                3
                n                n

               2.parça
               satır no     yıldız sayısı
                4                4
                3                3
                2                2
                n                n

         */
        int sayi = 5;


        for (int i = 1; i <= sayi; i++) { // i = satir takip
            for (int j = 1; j <= i; j++) { // j = yildiz takip
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = sayi - 1; i > 0; i--) { // i = satir takip
            for (int j = 1; j <= i; j++) { // j = yildiz takip
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
