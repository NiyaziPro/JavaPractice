package day3;

import java.util.Arrays;
import java.util.Scanner;

public class C07_Arrays {
    public static void main(String[] args) {

        /*

                - 3 elemanlı bir int array oluşturunuz
                - Array'in elemanlarını, sırası ile kullanıcıdan alınız
                - Array'deki elemanların ortalamasını bulunuz, yazdırınız
                - Bulunan ortalamadan daha büyük değere sahip olan elemanları yazdırınız

         */
        int[] array = new int[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Lutfen bir sayi giriniz : ");
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));
        /*System.out.println("Lutfen arayin birinci elamnini giriniz : ");
        array[0]= input.nextInt();
        System.out.println("Lutfen arayin ikinci elamnini giriniz : ");
        array[1]= input.nextInt();
        System.out.println("Lutfen arayin ucuncu elamnini giriniz : ");
        array[2]= input.nextInt();*/

        double sum = 0;

        for (int w : array) {
            sum += w;
        }
        double ortalama = sum / array.length;
        System.out.println("Toplam : "+sum);
        System.out.println("Ortalama : " + ortalama);

        for (int w : array){
            if (ortalama<w){
                System.out.print("Ortalamadan buyuk olan sayi : "+w );
            }
        }




    }
}
