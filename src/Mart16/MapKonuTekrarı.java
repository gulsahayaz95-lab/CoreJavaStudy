package Mart16;

import java.util.*;

public class MapKonuTekrarı {
    public static void main(String[] args) {

        //array:kaç tane olacağı baştan belli ör: haftanın günleri, yılın ayları
        //set:tekrarlı veri istenmiyorsa kullanılır. ör: aynı plakayı bir kere tutmak, sisteme giriş yapmış benzersiz kullanıcılaar
        //array :boyut sabit aynı türde veri tutuyor indeks var lenght kullanılır
        //array list: boyut dinamik eleman eklenip çıkarılıyor index var ve size kullanılıyor
        //array list tüm ürünleri sırayla tutacak
        //set sadece farklı ürünleri
        //map her ürünün kaç kez geçtiği
        //keyset(): anahtarlar
        //values(): değerler
        //entryset(): ikisi birlikte


        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("Mehmet");
        isimler.add("Alperen");
        isimler.add("Gökay");
        isimler.add("Hüseyin");
        isimler.add("Serhat");
        isimler.add("Mehmet");
        isimler.add("Kader");
        isimler.add("Gülşah");
        isimler.add("Hüseyin");

        System.out.println("Toplam isim miktarı: " + isimler.size());

        Set<String> benzersizİsimler = new HashSet<>(isimler);

        System.out.println("Toplam setteki isim miktarı: " + benzersizİsimler.size());


        for (String isim : isimler) {
            System.out.println(isim);
        }


        ArrayList<String> indexliBenzersizİsimler =  new ArrayList<>(benzersizİsimler);
        System.out.println("1. eleman: " + indexliBenzersizİsimler.get(0));


        /**
         * 3 çeşit set vardır
         *
         * 1) HashSet
         * -Kendi algoritması var elemanları ona göre sıralar.
         *
         * 2)LinkedHashSet
         * -Elemanları ekleme sırasına göre sıralar.
         *
         * 3)TreeSet
         * -Alfabetik sıra veya büyüklük-küçüklüğe göre sıralar.
         *
         */

        System.out.println("--------------");
        Set<String> sehirlerHash = new HashSet<>();
        sehirlerHash.add("Istanbul");
        sehirlerHash.add("Ankara");
        sehirlerHash.add("Izmir");
        sehirlerHash.add("Erzurum");

        Set<String> sehirlerLinked = new LinkedHashSet<>();
        sehirlerLinked.add("Istanbul");
        sehirlerLinked.add("Ankara");
        sehirlerLinked.add("Izmir");
        sehirlerLinked.add("Erzurum");

        Set<String> sehirlerTree = new TreeSet<>();
        sehirlerTree.add("Istanbul");
        sehirlerTree.add("Ankara");
        sehirlerTree.add("Izmir");
        sehirlerTree.add("Erzurum");


        System.out.println("Hash: " + sehirlerHash);
        System.out.println("Linked: " + sehirlerLinked);
        System.out.println("Tree: " + sehirlerTree);









    }
}
