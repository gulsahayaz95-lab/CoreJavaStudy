package Mart16;

import java.util.*;

public class NotAnalizi {
    public static void main(String[] args) {

        /**
         *Bir öğretmen öğrencilerin notlarını bir listede tutuyor;
         * [70, 85, 70, 90, 100, 85, 60, 90]
         * İstenenler;
         * Tüm notları bir listede saklayalım,
         * Tekrar etmeyen notları ayrı bir yapıda saklayalım,
         * Her notun kaç defa tekrar ettiğini ayrı bir yapıda tutalım,
         * En çok tekrar eden notu bulup yazdıralım,
         * Kaç farklı not olduğunu yazdıralım.
         *
         */

        ArrayList<Integer> notlar = new ArrayList<>();
        notlar.add(70);
        notlar.add(85);
        notlar.add(70);
        notlar.add(90);
        notlar.add(100);
        notlar.add(85);
        notlar.add(60);
        notlar.add(90);

        Set<Integer> farklıNotlar =  new HashSet<>(notlar);

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer not : notlar) {
            if (map.containsKey(not)) {
                //not -> key(.anahtar)
                //map.get(not) -> o an ki notun value(değeri)
                map.put(not, map.get(not) + 1);
            } else {
                map.put(not, 1);
            }

        }

        System.out.println("--------Özet--------");
        System.out.println("Tüm notlar: " + notlar);
        System.out.println("Farklı notlar: " + farklıNotlar);
        System.out.println("Farklı notların miktarı: " + farklıNotlar.size());


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + " tekrar miktarı: " + entry.getValue());
        }


        int tekrarSayısı = 0;
        int enCokTekrarlananNot = -1;

        for (Integer key : map.keySet()) {
            //map.get(key) -> value yu verir, yani o key in tekrar miktarını verir.
            if (map.get(key) > tekrarSayısı) {
                tekrarSayısı = map.get(key);
                enCokTekrarlananNot = key;
            }
        }

        System.out.println("En çok tekrarlanan sayı: " + enCokTekrarlananNot);
        System.out.println("Tekrar miktarı: " + tekrarSayısı);




    }
}
