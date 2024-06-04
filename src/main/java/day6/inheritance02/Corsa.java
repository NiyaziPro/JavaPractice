package day6.inheritance02;

public class Corsa extends Opel {
    // fields : hareket, hiz, marka, yakit, sirketMerkezi , model
    // methods : motor, yakitTuketimi,garanti, vitesSayisi

    public String hiz = "Corsa model arabalar max. 200km hiz yapar.";
    public String yakit = "Corsa arabalar benzinlidir.";
    public String model = "Corsa";

    @Override
    protected void motor() {
        System.out.println("Corsa arabalar cevreci motor.");
    }

    public void vitesSayisi(){
        System.out.println("Corsa 5 viteslidir.");
    }
}
