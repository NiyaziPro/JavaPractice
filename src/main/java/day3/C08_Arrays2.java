package day3;

import java.util.Arrays;
import java.util.Scanner;

public class C08_Arrays2 {
    public static void main(String[] args) {

       /*
        -kullanıcıdan arrayin eleman sayısını isteyin:n
        - n elemanlı bir int array oluşturunuz
        - Array'in elemanlarını, sırası ile kullanıcıdan alınız
        - Array'deki elemanların ortalamasını bulunuz, yazdırınız

        - Bulunan ortalamadan daha büyük değere sahip olan elemanları yazdırınız

 */

        Scanner input = new Scanner(System.in);
        System.out.print("Arrayin eleman sayisini giriniz : ");

        int size = input.nextInt(); // 5

        int[] array = new int[size];

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


        System.out.print("Ortalamadan buyuk olan sayi : ");
        int counter = 0;
        for (int w : array){
            if (ortalama<w){
                counter++;
                System.out.print(w+", " );
            }
        }
        if (counter == 0){
            System.out.print("yok");
        }



    }
}
