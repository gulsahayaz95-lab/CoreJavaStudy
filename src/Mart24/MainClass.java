package Mart24;

public class MainClass {
    public static void main(String[] args) {

        /**
         * String isim = "Mehmet";
         * String soyisim = "Simsek";
         * int yas = 33;
         * double boy = 1.78;
         * int[] notlar = {98, 87, 67, 78};
         *
         * List, Set, Map yapılarını gördük,
         * Aynı türden verileri tutarlar -> List ve Set,
         * Map-> key, value şeklinde tutar,
         *
         * Yularıdaki 5 değişkeni bir veri tipi altında toplayabiliyoruz,
         * Bu yapıya da Java'da class deniyor.
         *
         */


        //ogrenci1 diyerek bir nesne ürettik,
        //Class isimleri büyük harfle başlar.

        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.isim = "Mehmet";
        ogrenci1.soyisim = "Simsek";
        ogrenci1.yas = 33;
        ogrenci1.boy = 1.78;
        ogrenci1.notlar = new int[]{98, 87, 67, 78};



        Araba araba = new Araba();
        araba.marka = "Mercedes Benz";
        araba.model = "G63";
        araba.motor = 3.0;
        araba.renk = "Siyah";
        araba.hiz = 200;
        araba.manuelMi = false;
        System.out.println();


        araba.bilgileriniYazdir();

        araba.hizlan();
        araba.hizlan();


        araba.bilgileriniYazdir();

        araba.yavasla();

        araba.bilgileriniYazdir();





    }
}
