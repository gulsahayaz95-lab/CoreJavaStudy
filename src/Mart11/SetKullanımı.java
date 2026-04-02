package Mart11;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetKullanımı {
    public static void main(String[] args) {


        /**
         *
         * 1) HashSet() -> Tekrar eden veri tutmaz fakat kaydedilen verileri sıralı şekilde kaydetmez,
         * Diğer set türlerine göre en hızlısıdır.
         *
         * 2) LinkedHashSet() -> Tekrar eden veri tutmaz, kaydedilen verilerin sırasını tutar.
         *
         * 3) TreeSet() -> Tekrar eden veri tutmaz, eklenen verileri sıralı tutar,
         * Yani sayısal verileri küçükten büyüğe, yazıları ise alfabetik kaydeder.
         *
         */

        System.out.println("-------HashSet()--------");

        Set<String> sehirler = new HashSet<String>();
        sehirler.add("Izmir");
        sehirler.add("Ankara");
        sehirler.add("Jena");
        sehirler.add("Istanbul");
        sehirler.add("Elazığ");
        System.out.println("HashSet: " + sehirler);



        System.out.println("-------LinkedHashSet()--------");

        Set<String> isimler =  new LinkedHashSet<String>();
        isimler.add("Izzet");
        isimler.add("Kader");
        isimler.add("Humeyra");
        isimler.add("Gamze");
        isimler.add("Serhat");
        System.out.println("LinkedHashSet: " + isimler);



        System.out.println("-------TreeSet()--------");

        Set<String> dersler =  new TreeSet<String>();
        dersler.add("Java");
        dersler.add("Selenium");
        dersler.add("Appium");
        dersler.add("Docker");
        dersler.add("Math");
        System.out.println("TreeSet: " + dersler);



        Set<Integer> sayılar = new TreeSet<>();
        sayılar.add(123);
        sayılar.add(23);
        sayılar.add(45);
        sayılar.add(67);
        System.out.println("Sayılardaki durum: " + sayılar);




    }
}
