package day1;

public class C02_Ortalama {
    public static void main(String[] args) {

        double num1 = 12.4;
        double num2 = 25.8;
        double num3 = 800;
        double num4 = 8.3;
        double num5 = 105.3;

        // yukaridaki sayilari ortalamasini bulan kodu yazalim

        double sum = num1 + num2 + num3 + num4 + num5;
        System.out.printf("Sayilarin toplami : %.2f  " ,sum);
        System.out.println();
        double avarage = sum / 5;
        System.out.printf("Sayilarin ortalamasi : %.2f  ", avarage);


    }
}
