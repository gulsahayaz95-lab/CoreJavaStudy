package Mart24.soru3;

public class Araba2 {
    String marka;
    String renk;
    int hiz;


    void bilgileriYazdir() {
        System.out.println("Marka: " + marka);
        System.out.println("Renk: " + renk);
        System.out.println("Hızı: " + hiz);
        if (hiz > 120) {
            System.out.println("120yi geçtiniz.");
        }
        System.out.println();
    }



    void hizArttir() {
        hiz += 20;
        if (hiz > 120) {
            System.out.println("120yi geçtiniz.");
        }
    }



}
