package day6.inheritance02;

public class Runner {
    public static void main(String[] args) {
        Corsa araba1 = new Corsa();

        System.out.println("araba1.hareket = " + araba1.hareket); // Araba class'indan geldi
        System.out.println("araba1.hiz = " + araba1.hiz); // Corsa class'indan geldi
        System.out.println("araba1.yakit = " + araba1.yakit); // Corsa class'indan geldi
        System.out.println("araba1.marka = " + araba1.marka); // Opel class'indan geldi
        System.out.println("araba1.sirketMerkezi = " + araba1.sirketMerkezi); // Opel class'indan geldi
        System.out.println("araba1.model = " + araba1.model); // Corsa class'indan geldi
        araba1.motor(); // Corsa class'indan geldi
        araba1.vitesSayisi(); // Corsa class'indan geldi
        araba1.yakitTuketimi(); // Opel class'indan geldi

        System.out.println("--------------------------------");

        Opel araba2 = new Corsa();
        System.out.println("araba2.hareket = " + araba2.hareket); // Araba class'indan geldi
        System.out.println("araba2.hiz = " + araba2.hiz); // Opel class'indan geldi
        System.out.println("araba2.yakit = " + araba2.yakit); // Araba class'indan geldi
        System.out.println("araba2.marka = " + araba2.marka); // Opel class'indan geldi
        System.out.println("araba2.sirketMerkezi = " + araba2.sirketMerkezi); // Opel class'indan geldi
        araba2.motor();  // Corsa class'indan geldi
        araba2.yakitTuketimi(); // Opel class'indan geldi
        araba2.garanti(); // Opel class'indan geldi

        System.out.println("---------------------------");

        Araba araba3 = new Corsa();
        System.out.println("araba3.hareket = " + araba3.hareket); // Araba class'indan geldi
        System.out.println("araba3.hiz = " + araba3.hiz); // Araba class'indan geldi
        araba3.motor(); // Corsa class'indan geldi
        araba3.yakitTuketimi(); // Opel class'indan geldi

        System.out.println("-----------------------------------------------");

        araba3 = new Opel();
        System.out.println("araba3.marka = " + araba3.marka);
        araba3.motor(); // Opel class'indan geldi



    }
}
