package day6;

public class C01_Encapsulation {
    // data hiding : datalari saklamak
    //  private access modifiera sahip variablelar oluşturun: isim, soyisim, yas seklinde
    //    parametreli ve parametresiz constructor oluşturun
    //    toString metodunu oluşturun

    private String isim;
    private String soyisim;
    private int yas;

    public C01_Encapsulation(String isim, String soyisim, int yas) {
        this.isim = isim;
        this.soyisim = soyisim;
        if (yas < 0) {
            System.out.println("Yas negatif olamaz!");
        } else {
            this.yas = yas;
        }
    }

    public C01_Encapsulation() {
    }

    @Override
    public String toString() {
        return
                "{isim='" + isim + '\'' +
                        ", soyisim='" + soyisim + '\'' +
                        ", yas=" + yas +
                        '}';
    }

    public String getIsim() {
        if (isim!=null){
            return isim.charAt(0)+"*".repeat(isim.length()-1);
        }else {
            return null;
        }

    }

    public void setIsim(String isim) {

        this.isim = isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
    }

    public String getSoyisim() {
        if (soyisim!=null){
            return soyisim.charAt(0)+"*".repeat(soyisim.length()-1);
        }else {
            return null;
        }
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas < 0) {
            System.out.println("Yas negatif olamaz!");
        } else {
            this.yas = yas;
        }
    }


}
