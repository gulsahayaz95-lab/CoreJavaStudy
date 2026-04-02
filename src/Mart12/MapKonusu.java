package Mart12;

import java.util.HashMap;

public class MapKonusu {
    public static void main(String[] args) {

        /**
         * Array -> aynı veri tipi fakat saklayacağı veri sayısı belirli,
         * ArrayList -> aynı veri tipinde kaç veri saklayacağı belli olmayan bir yapı,
         * Set -> saklayacağı veri sayısı belli değil fakat tekrar etmeyen verileri saklar,
         * Map -> anahtar-değer şeklinde veriler saklayan bir yapıdır,
         * örn:
         * öğrenci no-öğrenci adı soy adı
         * plaka kodu-şehir adı
         * tc-kişi bilgileri
         * ürün adı-fiyat
         * key -> value
         * "TR" ->"Türkiye"
         * "DE" -> "Deutschland"
         * "EN" -> "England"
         *
         * keyler benzersiz olmalıdır,
         * aynı anahtara yeni değer eklenirse eski değer silinerek eklenir,
         *
         * map'lerde index mantığı yoktur,
         * map.get(0) kullanımı yoktur,
         *
         * Map Türleri;
         * 1) HashMap -> en hızlısı, keyleri kendi algoritmasına göre saklar, sıralı kayıtı garanti etmez.
         *
         * 2) LinkedHashMap -> ekleme sırasını korur.
         *
         * 3) TreeMap -> alfabetik ve küçükten büyüğe doğru keyleri saklar.
         *
         *
         */


        //ilk String key'i, ikincisi value ifade eder,
        //her seferinde String,String olmak zorunda değildir.

        HashMap<String, String> ulkeler = new HashMap<>();


        //veri ekleme;
        ulkeler.put("TR", "Türkiye");
        ulkeler.put("DE", "Deutschland");
        ulkeler.put("EN", "England");

        System.out.println(ulkeler);


        System.out.println("---------------");



        //veri çağırmalar key ile yapılır;
        //girilen key mapte yoksa cevap null döner
        System.out.println(ulkeler.get("DE"));
        System.out.println(ulkeler.get("US"));


        //eleman silmek istenirse yine key ile yapılır;
        ulkeler.remove("DE");



        //içeriği key ile ararız;
        System.out.println(ulkeler.containsKey("TR"));



        //map boyutu;
        System.out.println(ulkeler.size());


        //map tamamen silme;
        ulkeler.clear();







    }
}
