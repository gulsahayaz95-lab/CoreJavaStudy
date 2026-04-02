package Mart12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KelimeFrekansıAnalizi {
    public static void main(String[] args) {


        /**
         * Kullanıcıdan bir cümle alalım,
         * Cümleyi tamamıyla küçük harflere çevirelim,
         * Nokta, virgül gibi işaretleri temizleyelim,
         * Her kelimenin kaç kez tekrarlandığını kayıt edelim,
         * Sadece 2 veya daha fazla girilen kelimeleri yazdıralım,
         * En çok geçen kelimeyi ayrıca yazdıralım.
         *
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle girin: ");
        String cumle =  scanner.nextLine().trim().toLowerCase();


        cumle = cumle.replace(".", "")
                .replace(",", "")
                .replace("?", "")
                .replace("!", "");



        //cümle içinde geçen kelimeleri ayırıp kelimeleri array içinde kayıt ettik
        String[] kelimeler = cumle.split(" ");

        HashMap<String, Integer> frekans = new HashMap<>();

        for (int index = 0; index < kelimeler.length; index++) {
            String kelime = kelimeler[index];

            if (kelime.isEmpty()) {
                continue;
            }


            if (frekans.containsKey(kelime)) {
                frekans.put(kelime, frekans.get(kelime) + 1);
            } else  {
                frekans.put(kelime, 1);
            }
        }

        String enCokKullanılanKelime = "";
        int tekrarMiktarı = 0;

        for (Map.Entry<String, Integer> entry : frekans.entrySet()) {
            String k =  entry.getKey();
            int miktar = entry.getValue();

            if (miktar >= 2) {
                System.out.println(k + " -> " + miktar);
            }

            if (miktar > tekrarMiktarı) {
                tekrarMiktarı = miktar;
                enCokKullanılanKelime = k;
            }
        }

        System.out.println("--------------");
        System.out.println("En çok kullanıla kelime: " + enCokKullanılanKelime);
        System.out.println("Miktarı: " + tekrarMiktarı);


    }
}
