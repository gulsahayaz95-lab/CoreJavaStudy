package Mart16;

import java.util.*;

public class MarketÜrünSayacı {
    public static void main(String[] args) {

        /**
         * Bir markette müşterinin aldığı ürünler sırasıyla şöyle giriliyor:
         * elma, armut, elma, muz, muz, muz, armut
         * İstenenler;
         * Ürünleri bir liste içinde saklayalım,
         * Her ürünün kaç kez alındığını ayrı bir yapıda tutalım,
         * Sadece farklı ürünleri ayrı bir yapıda saklayalım,
         * Sonuç olarak;
         * Kaç farklı ürün var ve hangi üründen ne kadar alındığını ekrana yazdıralım.
         *
         */


        //Ürünlerin bir liste içerisinde saklanması;
        ArrayList<String> meyveler = new ArrayList<>();
        meyveler.add("elma");
        meyveler.add("armut");
        meyveler.add("elma");
        meyveler.add("muz");
        meyveler.add("muz");
        meyveler.add("muz");
        meyveler.add("armut");

        //Sadece farklı ürünlerin ayrı bir yapıda saklanması;
        Set<String> benzersizMeyveler =  new HashSet<>(meyveler);

        Map<String, Integer> urunSayıları = new HashMap<>();


        /**
         * örn muz bu örnekte 3 defa geçiyor, bu sebeple mpat içerisinde
         * // muz,3
         *
         */

        for (String meyve : meyveler) {

            if (urunSayıları.containsKey(meyve)) {
                urunSayıları.put(meyve, urunSayıları.get(meyve) + 1);
            } else {
                urunSayıları.put(meyve, 1);
            }

        }


        System.out.println("-----özet-----");
        System.out.println("Tüm ürünler: " + meyveler);
        System.out.println("Benzersiz Meyveler: " + benzersizMeyveler);
        System.out.println("Farklı ürün miktarı: " + benzersizMeyveler.size());


        //ürün miktarları;

        for (String urun : urunSayıları.keySet()) {
            System.out.println(urun + " - " + urunSayıları.get(urun));
        }


        System.out.println("Ürün miktarları entrySet() ile");
        for (Map.Entry<String, Integer> entry : urunSayıları.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("Map içinde value ile gezme");
        for (Integer value : urunSayıları.values()) {
            System.out.println(value);
        }




    }
}
