package Mart24.soru2;

public class MainClass {
    public static void main(String[] args) {


        /**
         * ad, numara ve ortalama bilgilerini tutan bir yapı oluşturun,
         * bir öğrenci oluşturup bilgilerini yazdırın,
         * ortalama 50 ve üzeri ise geçti yoksa kaldı yazdırın.
         *
         */


        Ogrenci2 ogrenci = new Ogrenci2();
        ogrenci.isim = "Ali";
        ogrenci.numara = 2200;
        ogrenci.ortalama = 90;

        System.out.println("İlk dönem: ");
        ogrenci.bilgiYaz();

        System.out.println("İkinci dönem: ");
        ogrenci.ortalama = 45;
        ogrenci.bilgiYaz();




    }
}
