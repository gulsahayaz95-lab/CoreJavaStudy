package Mart17;

import java.util.*;

public class KelimeFrekansveHarfAnalizi {
    public static void main(String[] args) {

        /**
         * Kullanıcıdan bir cümle alalım,
         * İstenenler;
         * Cümleyi kelimelere ayıralım,
         * Kelimeleri düzenleyip aynı formata getirelim,
         * Her kelimenin kaç defa geçtiğini hesaplayalım,
         * Tekrar etmeyen kelimeleri gösterelim,
         * Uzunluğu 4'ten büyük olan kelimeleri ayrıca gösterelim,
         * En çok geçen kelimeyi bulalım,
         * Cümlede kullanılan farklı kelimeleri alfabetik düşünmeden tekil şekilde ekrana yazdıralım.
         *
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir cümle girin.");
        String cumle = scanner.nextLine().trim();

        String[] kelimeler = cumle.split(" ");

        Map<String, Integer> kelimeSayıları =  new HashMap<>();

        Set<String> benzersizKelimeler = new HashSet<>();

        //uzunluğu 4'ten büyük kelimeler için;
        List<String> uzunKelimeler = new ArrayList<>();

        //kelimeler arasında iki boşluk eklenmiş olabilir bunu da düşünelim: trim()
        //kelimele içerisinde tek tek gezelim;
        for (String kelime : kelimeler) {
            kelime = kelime.trim();

            if (kelimeSayıları.containsKey(kelime)) {
                kelimeSayıları.put(kelime, kelimeSayıları.get(kelime) + 1);

            } else {
                kelimeSayıları.put(kelime, 1);
            }

            //aynı kelime gelirse otomatik olarak set onu kaydetmez;
            benzersizKelimeler.add(kelime);


            if(kelime.length() > 4 && !uzunKelimeler.contains(kelime)) {
                uzunKelimeler.add(kelime);
            }

        }


        String enCokGecenKelime = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry: kelimeSayıları.entrySet()) {

            if (entry.getValue() > max) {
                max = entry.getValue();
                enCokGecenKelime = entry.getKey();

            }

        }


        System.out.println("--------Kelimeler ve Miktarları---------");

        for (Map.Entry<String, Integer> entry: kelimeSayıları.entrySet()) {
            System.out.println("kelime: " + entry.getKey() + ", miktarı: " + entry.getValue());
        }

        System.out.println("--------Benzersiz Kelimeler---------");
        System.out.println(benzersizKelimeler);

        System.out.println("---------En Çok Geçen Kelime ve Miktarı--------");
        System.out.println(enCokGecenKelime + " - " + max);


        scanner.close();

    }
}
