package Mart5;

import java.util.ArrayList;

public class _ArrayListKonusu {
    public static void main(String[] args) {



        /**
         * int[] sayılar = new int[5]; sayılar dizisi 5 tane int değer alabilir,
         * sayılar[0]= 3;
         *
         *String[] şehirler = new String[3]; şehirler dizisi 3 tane String değer alabilir,
         *şehirler[2]= "Izmir";
         */


        ArrayList<String> öğrenciler = new ArrayList<>();
        //boyutu belli değil, bu sayede istenilen kadar String eleman eklenebilir.


        ArrayList<Integer> notlar = new ArrayList<>();
        //arraylist kullanırken primitive tip (int,double,boolean vs) kullanmıyoruz,
        //Integer, Double, Boolean, Float, Long şeklinde class yapılarını kullanıyoruz.

        notlar.add(3);
        notlar.add(56); //1.index
        notlar.add(35);
        notlar.add(67);

        System.out.println(notlar);
        System.out.println("Eleman sayısı (lengtin karşılığı-size): " + notlar.size());


        //ekleme sonradan da yapılabilir ve arraylistin sonuna ekler;
        notlar.add(45);
        System.out.println(notlar);
        System.out.println("Eleman sayısı (lengtin karşılığı-size): " + notlar.size());


        //belirli indexe ekleme yapma;
        notlar.add(3,98); //3. indexe 98i ekle dedik, diğerlerini kaydırır
        System.out.println(notlar);
        System.out.println("Eleman sayısı (lengtin karşılığı-size): " + notlar.size());



        //index numarası ile eleman getirme;
        System.out.println("2. indexteki eleman: " + notlar.get(2));


        //index numarası ile değer güncelleme;
        notlar.add(2,68);
        System.out.println("Güncellemeden sonra 2. indexteki eleman: " + notlar.get(2));


        //index numarası ile silme işlemi;
        System.out.println("3. indexteki elemanı sildikten sonra: " + notlar.remove(3));



        //liste içerisinde içerik arama;
        System.out.println("Liste içerisinde 67 var mı? -> " + notlar.contains(67));
        //cevap true ya da false olabilir.



        //liste boş mu;
        System.out.println("Liste boş mu? -> " + notlar.isEmpty());
        //cevap true ya da false olabilir.



        //tüm arraylisti silmek için;
        notlar.clear();
        System.out.println("Listeyi sildikten sonraki (size) boyutu: " + notlar.size());



        //ilk ve son elemanı bulmak için;
        System.out.println("İlk eleman: " + notlar.get(0));
        System.out.println("Son eleman: " + notlar.get(notlar.size()-1));


    }
}
