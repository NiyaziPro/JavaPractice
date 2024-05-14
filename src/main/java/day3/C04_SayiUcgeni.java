package day3;

import java.util.Scanner;

public class C04_SayiUcgeni {
    public static void main(String[] args) {
        /*

                - Kullanıcıdan bir satır sayısı girdisi isteyin.
                - Verilen girdiye göre, aşağıdaki üçgeni oluşturun:
                    Örn: 4
                    1
                    2 3
                    4 5 6
                    7 8 9 10

         */

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir satir sayisi giriniz : ");
        int row = input.nextInt();

        int counter = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }


        /*
        - Kullanıcıdan bir satır sayısı girdisi isteyin.
        - Verilen girdiye göre, aşağıdaki üçgeni oluşturun:
                    Örn: 4

                         10 9 8 7
                         6 5 4
                         3 2
                         1
         */

        counter--;
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter--;
            }
            System.out.println();
        }

    }
}
