package Mart30;

import Mart30.ornek1.Araba;
import Mart30.ornek1.Kitap;
import Mart30.ornek1.Ogrenci;

public class ConstructorKonusu {

    /**
     *
     * Constructor, bir class tan nesne ürettiğimiz anda otomatik çalışan yapıdır,
     * Nesne oluştururken başlangıç değerleri verilebilir, ortak işlemler yapılabilir.
     *
     * Özellikleri;
     * 1-Class ismi ile aynı olmalı,
     * 2-Geri dönüş tipi yok fakat void ile yazılmaz,
     * 3-Nesne oluştururken otomatik oluşur,
     * 4-İstenirse parametre eklenebilir.
     *
     * Örnek:
     * class Araba {
     *
     *     Araba() {
     *         System.out.println("Araba nesnesi oluşturuldu.");
     *     }
     * }
     *
     * Araba araba = new Araba();
     *
     */


    public static void main(String[] args) {
        Araba araba = new Araba();

        Ogrenci ogrenci = new Ogrenci();


        //ad ve yas için bir atama yapmadık gelen değerler constructor methodundan otomatik geliyor
        System.out.println("Ad: " + ogrenci.ad);
        System.out.println("Yas: " + ogrenci.yas);


        System.out.println("-------------");


        Ogrenci ogrenci1 = new Ogrenci("Gülşah", 30);

        System.out.println("Ad: " + ogrenci1.ad);
        System.out.println("Yas: " + ogrenci1.yas);


        System.out.println("-------------");


        Kitap kitap = new Kitap("İnsanlar ve Fareler");

        Kitap kitap1 = new Kitap();










    }




}
