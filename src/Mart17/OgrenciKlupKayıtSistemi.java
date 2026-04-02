package Mart17;

import java.util.*;

public class OgrenciKlupKayıtSistemi {
    public static void main(String[] args) {

        /**
         * Her öğrenci bir klübe kayıt oluyor,
         * Kullanıcıdan 7 öğrencinin adını ve kayıt olduğu kulübü alalım,
         * İstenenler;
         * Öğrenci adlarını ve kulüp isimlerini düzenli hale getirelim,
         * Aynı kulübe kayıt olan öğrencileri birlikte gösterelim,
         * her kulüpte kaç öğrenci olduğunu yazdıralım,
         * Birden fazla öğrencisi olan kulüpleri ayrı gösterelim,
         * İsmi "m" harfi ile başlayan öğrencileri bulalım,
         * Hiç tekrar etmeyen kulüp isimlerini ayrı olarak ekrana yazdıralım.
         *
         */


        Scanner scanner = new Scanner(System.in);

        //birden fazla value olduğu durumda yazılarda list kullanılır
        //örn futbol kulübü -> ahmet, mehmet, ayşe, fatma
        //birden fazla ismi tutması için list yazmak durumundayız: List<String>
        Map<String, List<String>> kulüpögrencileri = new HashMap<>();

        //farklı kulüp isimlerini bir yerde tutalım,
        Set<String> kulüpSeti =  new HashSet<>();

        //m harfil ile başlayan öğrenciler;
        List<String> mHarfiİleBaslayanlar = new ArrayList<>();


        //7 öğrenci;
        for (int index = 1; index <= 7; index++) {
            System.out.println("Öğrenci ismi: ");
            String ogrenci = scanner.nextLine().trim().toLowerCase();

            System.out.println("Kulüp ismi: ");
            String kulüp = scanner.nextLine().trim().toLowerCase();

            kulüpSeti.add(kulüp);


            //m harfi ile başlayan öğrenciler;
            if (ogrenci.startsWith("m")) {
                mHarfiİleBaslayanlar.add(ogrenci);

            }


            //eğer bu kulüpten map içerisinde yoksa önce o kulübü mape eklemek gerekir;
            //fakat değer(value) kısmı için direkt olarak öğrenci ismini eklemedik çünkü value bir list, eklemeyi aşağıda yaptık.
            if (!kulüpögrencileri.containsKey(kulüp)) {
                kulüpögrencileri.put(kulüp, new ArrayList<>());

            }


            //artık kulüp map içerisinde oluştu, value ataması yapabiliriz.
            //kulüpogrencileri.get.(kulüp) bu value kısmını ifade eder, valuelar List<String> dir.
            //bu sebeple add() ile value ya atama yapabiliriz
            kulüpögrencileri.get(kulüp).add(ogrenci);


        }

        System.out.println("-------Kulüplere Göre Öğrenci İsimleri-------");


        for (Map.Entry<String, List<String>> entry: kulüpögrencileri.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


        System.out.println("--------Her Kulüpteki Öğrenci Sayısı--------");


        for (Map.Entry<String, List<String>> entry: kulüpögrencileri.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().size());
        }


        System.out.println("--------İsmi M Harfi İle Başlayanlar---------");


        for (String name: mHarfiİleBaslayanlar) {
            System.out.println(name);
        }


        System.out.println("--------Farklı Kulüp İsimleri----------");
        System.out.println(kulüpSeti);






    }
}
