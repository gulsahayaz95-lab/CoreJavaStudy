package Mart16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TekrarsızÖğrenciSayısı {
    public static void main(String[] args) {

        /**
         * Bir sınıftaki öğrencilerin isimleri aşağıdaki gibi bir listede tutuluyor,
         * ["Ali", "Ayşe", "Ali", "Mehmet", "Ayşe", "Zeynep", "Can"]
         *
         * İstenenler;
         * Tüm isimleri bir liste içinde saklayalım,
         * Tekrar eden isimleri çıkarıp yalnızca benzersiz isimleri ayrı bir yapıda tutalım,
         * Kaç farklı öğrenci olduğunu ekrana yazdıralım,
         * Benzersiz isimleri ekrana yazdıralım.
         *
         */


        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("Ali");
        isimler.add("Ayşe");
        isimler.add("Ali");
        isimler.add("Mehmet");
        isimler.add("Ayşe");
        isimler.add("Zeynep");
        isimler.add("Can");

        Set<String> benzersizİsimler = new HashSet<>(isimler);

        System.out.println("Tüm öğrenciler: " + isimler);
        System.out.println("Benzersiz isimler: " + benzersizİsimler);
        System.out.println("Benzersiz öğrenci miktarı: " + benzersizİsimler.size());













    }
}
