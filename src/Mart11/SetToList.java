package Mart11;

import java.util.*;

public class SetToList {
    public static void main(String[] args) {


        //Set'ten List'e çevirme;
        Set<String> isimler = new HashSet<>();
        isimler.add("Gökay");
        isimler.add("Alperen");
        isimler.add("Izzet");
        isimler.add("Hüseyin");

        //isimler.get(0); bu kullanım hatalı çünkü setlerde index yok.

        List<String> isimListesi = new ArrayList<>();
        System.out.println(isimListesi.get(3));
        //burada cevabın Gökay çıkmasının sebebi HashSet'in kendi kayıt algoritmasından dolayıdır.
        //isimler setinin çıktısını Alperen-Hüseyin-İzzet-Gökay olarak kendi inisiyatifinde aldı.


        //List'i Set'e çevirmek;
        List<String> liste = new ArrayList<>();
        liste.add("Fuat");
        liste.add("Serhat");
        liste.add("Gamze");
        liste.add("Fuat");

        System.out.println("Liste: " + liste);


        //bir listedeki tekrar eden elemanları kaldırmak için;
        Set<String> benzersiz = new HashSet<>(liste);
        System.out.println("Set'e çevrilmiş hali: " + benzersiz);


        Set<String> benzersizLinked = new LinkedHashSet<>(liste);
        System.out.println("Linked: " + benzersizLinked);


        System.out.println("--------------");

        Set<String> benzersizTree = new TreeSet<>(liste);
        System.out.println("Tree: " + benzersizTree);




    }
}
