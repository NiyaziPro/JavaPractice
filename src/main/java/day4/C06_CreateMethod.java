package day4;

import java.util.Scanner;

public class C06_CreateMethod {
    public static void main(String[] args) {

        // Fahrenheit'ı, Celcius'a çeviren kodu yazınız.
        // Formül: Celcius = (Fahrenheit - 32) / 1.8


        Scanner input = new Scanner(System.in);
        System.out.print("Fahrenheit degeri : ");
        double fahrenheit = input.nextDouble();

        double celcius = fahrenheitToCelsius(fahrenheit);
        System.out.println("Fahrenheit : " + fahrenheit);
        System.out.println("Celcius : " + celcius);

        System.out.printf("%.2f",celcius);

    }


    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;

    }
}
