package Mart11;

import java.util.HashSet;
import java.util.Set;

public class SetKonusu {
    public static void main(String[] args) {

        /**
         * Aynı elemanı birden fazla kez saklamaz,
         * örn -> Istanbul, Izmir, Ankara, Jena, Izmir
         * ArrayList -> bu listeyi olduğu gibi String olarak saklar,
         * Set ise ikinci defa girilen Izmir String ifadesini saklamaz.
         *
         * Tekrar eden verileri önlemek isrediğimizde,
         * Bir elemanın var olup olmadığını kontrol etmek istediğimizde,
         * Liste gibi sıra önemli değilse,
         * Benzersiz kayıtlar tutmak istediğimizde kullanırız.
         *
         */


        Set<String> şehirler = new HashSet<>();

        şehirler.add("Istanbul");
        şehirler.add("Ankara");
        şehirler.add("Izmir");
        şehirler.add("Jena");
        şehirler.add("Izmir");


        System.out.println(şehirler);
        System.out.println("Eleman sayısı: " + şehirler.size());


        /**
         * Set'lerde add methodu ile eleman eklemek istediğimizde add methodunun cevabı boolean olur.
         * Eğer var olan değerden ekleme yapmak istersek hata vermez bunu yerine cevap false olur.
         */


        System.out.println(şehirler.add("Ankara")); //false -> çünkü halihazırda ekli
        System.out.println(şehirler.add("Koeln"));  //true


        /**
         * Set'lerde index olmaz. şehirler.get(0) diye bir kullanım yok.
         */


        //index çağrısı yapılamıyor bu şekilde getirebiliriz.
        for (String şehir: şehirler) {
            System.out.println(şehirler);
        }



        //Eleman silmek istersek;
        Set<String> isimler = new HashSet<>();
        isimler.add("Gökay");
        isimler.add("Alperen");
        isimler.add("Izzet");
        isimler.add("Kader");
        isimler.add("Mehmet");

        System.out.println("Silmeden önce: " + isimler);


        isimler.remove("Mehmet");
        System.out.println("Sildikten sonra: " + isimler);



        //Eleman var mı kontrolü;
        System.out.println(isimler.contains("Kader")); //true
        System.out.println(isimler.contains("Humeyra")); //false





    }
}
