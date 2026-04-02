package Mart11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FarklıKelimeler {
    public static void main(String[] args) {

        /**
         * Kullanıcıdan bir cümle alın,
         * Bu cümleleri kelimelerine ayırın,
         * Kelimeleri kaydedin fakat tekrar eden kelimeleri kaydetmeyin,
         * Tüm benzersiz kelimeleri yazdırın,
         * Kaç tane kelime olduğunu bulun.
         *
         */


        Scanner input = new Scanner(System.in);

        System.out.println("Bir cümle girin: ");
        String cümle = input.nextLine().trim();

        //split() bir String methodudur, parantez içerisinde verilen ifadeye göre String içerisinde bölmeler yapar.
        //örn ->"" kullanılırsa harf harf,  "." kullanılırsa noktalara göre veya " " şeklinde boşluk olursa boşluklara göre kelimelere böler.

        String [] kelimeler = cümle.split(" ");


        //Tekrar etmeyen kelimeleri kaydedecek set;
        Set<String> farklıKelimeler = new HashSet<>();

        for (String kelime: kelimeler) {
            farklıKelimeler.add(kelime);

        }


        System.out.println("--------Farklı Kelimeler--------");
        System.out.println(farklıKelimeler);
        System.out.println("Toplam farklı kelime sayısı: " + farklıKelimeler.size());




    }
}
