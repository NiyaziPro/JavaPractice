package day6.inheritance02;

public class Opel extends Araba {

    protected String hiz = "Opel arabalar max. 240km hiz yapar.";
    protected String marka = "Opel";
    protected String sirketMerkezi = "Almanya";

    @Override
    protected void motor() {
        System.out.println("Opel arabalar opel marka motor kullanirlar.");
    }

    @Override
    protected void yakitTuketimi() {
        System.out.println("Opel arabalar az yakit tuketirler.");
    }

    protected void garanti(){
        System.out.println("Opel arabalar iki yil garantilidir.");
    }
}
