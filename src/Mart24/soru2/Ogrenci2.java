package Mart24.soru2;

public class Ogrenci2 {

    String isim;
    int numara;
    double ortalama;

    void bilgiYaz() {
        System.out.println("Ad: " + isim);
        System.out.println("Numarası: " + numara);
        System.out.println("Ortalama: " + ortalama);
    }


    void sinavDurumu() {
        if (ortalama >= 50) {
            System.out.println("Sınavı geçti.");
        } else {
            System.out.println("Sınavdan kaldı.");
        }

    }



}
