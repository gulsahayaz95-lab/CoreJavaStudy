package Mart25.soru1;

public class MainClass {
    public static void main(String[] args) {

        /**
         * Bir araba sınıfı oluşturun,
         * Her araba için ortak olan değişken üretim yeri adıdır,
         * Bu arabadan 2 adet üretip çıktılara bakalım.
         *
         */

        Araba araba1 = new Araba();
        araba1.marka = "Mercedes";
        araba1.model = "G63";
        araba1.motorHacmi = 3.0;

        Araba araba2 = new Araba();
        araba1.marka = "BMW";
        araba1.model = "m5";
        araba1.motorHacmi = 2.4;


        System.out.println("Araba1 marka: " + araba1.marka);
        System.out.println("Araba2 marka: " + araba2.marka);


        System.out.println("Üretim yeri: " + Araba.uretimYeri);






    }
}
