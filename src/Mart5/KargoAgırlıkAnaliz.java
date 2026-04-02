package Mart5;

import java.util.ArrayList;
import java.util.Scanner;

public class KargoAgırlıkAnaliz {
    public static void main(String[] args) {

        /**
         * Bir kargo şubesinde paket ağırlıkları tek tek giriliyor,
         * Kullanıcıdan paket ağırlıklarını kg cinsinden alın,
         * Kullanıcı 0 girerse giriş biter,
         *
         * Kurallar;
         * 0 < ağırlık <= 2 ise "Küçük paket"
         * 2 < ağırlık <= 5 ise "Orta paket"
         * ağırlık > 5 ise "Büyük paket"
         *
         * Giriş bittikten sonra;
         * Hiç paket girilmediyse: "Hiç paket girilmedi yazdırın.
         *
         * Girildiyse;
         * Tüm paketleri sıra numarasıyla yazdırın,
         * Küçük/Orta/Büyük paket sayısını yazdırın,
         * Toplam ağırlığı yazdırın,
         * Ortalama ağırlığı yazdırın.
         *
          */


        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> agırlıklar = new  ArrayList<>();

        System.out.println("Kg cinsinden paket ağırlıklarını girin. Bitirmek için 0 tuşlayın.");


        while (true) {
            System.out.println("Ağırlık: ");
            double agırlık = scanner.nextDouble();
            scanner.nextLine();

            if (agırlık == 0) {
                break;
            }

            if (agırlık < 0) {
                System.out.println("Ağırlık negatif olamaz. Tekrar deneyin.");
                continue;
            }

            agırlıklar.add(agırlık);


        }

        if (agırlıklar.size() == 0) {
            System.out.println("Hiç paket girilmedi.");
        } else {
            int kucuk = 0, orta = 0, buyuk = 0;
            double toplam = 0;

            System.out.println("------Paket Listesi------");
            for (int index = 0; index < agırlıklar.size(); index++) {

                toplam += agırlıklar.get(index);

                String kategori;

                if (agırlıklar.get(index) <= 2) {
                    kategori = "Küçük paket";
                    kucuk++;
                } else if (agırlıklar.get(index) <= 5) {
                    kategori = "Orta paket";
                    orta++;
                } else {
                    kategori = "Buyuk paket";
                    buyuk++;
                }


                System.out.println((index + 1) + ". paket ağırlığı" + agırlıklar.get(index) + " Kategori: " + kategori );
            }

            double ortalama = toplam / agırlıklar.size();

            System.out.println("-------Analiz-------");
            System.out.println("Ortalama Ağırlık: " + ortalama);
            System.out.println("Toplam Ağırlık: " + toplam);
            System.out.println("Küçük paket sayısı: " + kucuk);
            System.out.println("Orta paket sayısı: " + orta);
            System.out.println("Büyük paket sayısı: " + buyuk);
        }

        scanner.close();




    }
}
