package day7;

import java.util.Arrays;
import java.util.Scanner;

public class C05_TersCumle {
    public static void main(String[] args) {
                     /*
                Bir String değişkeni cümlesi verildiğinde,
                her sözcüğü almak için kod yazın ve
                tersine ters çevrilmiş String'e atayın.
            Test Data:
            sentence -> "Java is fun"
            reversed **-> "**fun is Java**"**
                */


        Scanner input = new Scanner(System.in);
        System.out.println("Cumle : ");
        String sentense = input.nextLine();
        String[] list = sentense.split(" ");
        String[] newList = new String[list.length];
        System.out.println(Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            newList[i] = list[list.length - 1 - i];


        }
        System.out.println(Arrays.toString(newList));
        System.out.println(String.join(" ", newList));

        for (String e : newList) {
            System.out.print(e + " ");
        }
    }

    public static void reversed() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Cümle : ");
        String sentence=scanner.nextLine();

        String[] words=sentence.split(" ");
        String[] reverseWords=new String[words.length];

        for (int i= words.length-1;i>=0;i--){

            System.out.print(words[i] + " ");
            reverseWords[words.length-1-i]=words[i];//kelimelerin ilk indeksini reverseWordsün son indeksine ekledik

        }
        System.out.println();

        System.out.println(String.join(" ", reverseWords));
    }
}
