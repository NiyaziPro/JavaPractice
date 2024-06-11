package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_Fibonacci {
    public static void main(String[] args) {
         /*
        Kulanicidan alinan bir tam sayi kadar(47den kucuk olmak kosuluyla)
        FIBONACCI dizisi olusturun
        Or: sayi=10 icin
        0-1-1-2-3-5-8-13-21-34 gibi
                */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen pozitif Bir tam sayı girin (47'den küçük): ");
        int num = scanner.nextInt();
        if (num >= 47) {
            try {
                throw new Exception("Lütfen 47'den küçük bir sayı girin.");
            } catch (Exception e) {
                System.err.println(e.getMessage());

            }

        }else {

            fibonacci(num);
            System.out.println();
            fibonacci2(num);
        }


    }

    public static void fibonacci(int number) {
        int f1 = 0;
        int f2 = 1;
        // Formul f(n) = f(n-1) + f(n-2)


        System.out.print("Fibonacci Dizisi: ");
        for (int i = 0; i < number; i++) {
            System.out.print(f1 + " ");

            int nextNum = f1 + f2;
            f1 = f2;
            f2 = nextNum;
        }


    }
    public static void fibonacci2(int number) {
        int f1 = 0;
        int f2 = 1;
        // Formul f(n) = f(n-1) + f(n-2)


        List<Integer> fibonacciNumber = new ArrayList<>();

        for (int i = 0; i < number-2; i++) {

            fibonacciNumber.add(f1);

            int nextNum = f1 + f2;
            f1 = f2;
            f2 = nextNum;
        }
        fibonacciNumber.add(f1);
        fibonacciNumber.add(f2);
        System.out.println("Fibonacci Dizisi : "+fibonacciNumber);

        System.out.println(f1+","+f2);


    }
}
