package Mart24;

public class Araba {

    //fields- değişkenler veya özellikleri
    String marka;
    String model;
    double motor;
    String renk;
    boolean manuelMi;
    int hiz;


    //davranışlari
    void hizlan() {
        hiz += 20;

    }

    void yavasla() {
        hiz -= 20;
    }


    void bilgileriniYazdir() {
        System.out.println("Marka: " + marka);
        System.out.println("Model" + model);
        System.out.println("Motor: " + motor);
        System.out.println("Renk: " + renk);
        System.out.println("Hızı: " + hiz);
        System.out.println("Manuel Mi: " + manuelMi);
    }



}
