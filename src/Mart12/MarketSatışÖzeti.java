package Mart12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MarketSatışÖzeti {
    public static void main(String[] args) {


        /**
         * Bir markette gün boyunca satılan ürünler sırasıyla giriliyor,
         * Kullanıcı kaç satış yapacağı bilgisini giriyor,
         * Her satışta sadece ürün adı girilsin,
         * Her ürünün kaç defa satıldığını bulalım,
         * Satış sonunda tüm ürünleri ve satış miktarlarını yazdıralım,
         * En çok satılan ürünü bulup yazdıralım,
         * Hiç girilmeyen ürünler için işlem yapılmasın.
         *
         */


        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> urunler = new HashMap<>();

        System.out.println("Kaç ürün girmek istiyorsunuz?");
        int adet = scanner.nextInt();
        scanner.nextLine();

        for (int index = 1; index <= adet; index++) {
            System.out.println(index + ". ürün adı: ");
            String name = scanner.nextLine().trim();


            if (urunler.containsKey(name)) {
                urunler.put(name, urunler.get(name) + 1);
            } else {
                urunler.put(name, 1);
            }
        }

        System.out.println("-------Özet-------");
        String enCokSatılanUrun = "";
        int maxSatış = 0;

        for (Map.Entry<String, Integer> entry : urunler.entrySet()) {
            System.out.println("Ürün adı: " +  entry.getKey() + " - " + " satış miktarı: " + entry.getValue());


            if (entry.getValue() > maxSatış) {
                maxSatış = entry.getValue();
                enCokSatılanUrun = entry.getKey();
            }

        }


        System.out.println("En çok satılan ürün: " + enCokSatılanUrun);
        System.out.println("Satış Miktarı: " + maxSatış);











    }
}
