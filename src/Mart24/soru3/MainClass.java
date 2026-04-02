package Mart24.soru3;

public class MainClass {
    public static void main(String[] args) {


        /**
         * marka, renk ve hız bilgilerini tutan bir yapı oluşturun,
         * Önce mevcut hız bilgisini yazdırın,
         * Hızı 20 arttırın ve 120 yi geçerse uyarı verdirin.
         *
         */


        Araba2 araba = new Araba2();
        araba.marka = "Mercedes Benz";
        araba.renk = "Mavi";
        araba.hiz = 110;

        araba.bilgileriYazdir();

        araba.hizArttir();

        araba.bilgileriYazdir();



















    }
}
