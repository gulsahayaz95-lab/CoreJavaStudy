package Mart24.soru1;


public class Telefon {
    String marka;
    String model;
    int sarjYuzdesi;

    void sarjiArttir() {
        sarjYuzdesi += 10;
    }


    void bilgileriniYaz() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Sarj Yuzdesi: " + sarjYuzdesi);
        System.out.println();
    }



}
