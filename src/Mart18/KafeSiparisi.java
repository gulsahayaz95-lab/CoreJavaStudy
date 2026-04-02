package Mart18;

import java.util.Scanner;

public class KafeSiparisi {

    public static double fiyatBul(String icecek) {
        if (icecek.equalsIgnoreCase("kahve")) {
            return 60.0;
        } else if (icecek.equalsIgnoreCase("cay")) {
            return 40.0;
        } else if (icecek.equalsIgnoreCase("limonata")) {
            return 20.0;
        } else {
            return 0.0; //geçersiz içecek durumu için
        }
    }

    public static double araToplam(double icecekFiyatı, int adet) {
        return icecekFiyatı * adet;
    }

    public static double indirimHesapla(double araToplamBulma, String ogrenciMi) {
        if (ogrenciMi.equalsIgnoreCase("evet")) {
            return araToplamBulma * 0.10;
        } else {
            return 0.0;
        }
    }


    public static void fisYazdır(String icecek, int adet, double araToplamBulma, double indirim, double toplam) {
        System.out.println("-----Fiş-----");
        System.out.println("İçecek: " + icecek);
        System.out.println("Adet: " + adet);
        System.out.println("Ara toplam: " + araToplamBulma);
        System.out.println("İndirim: " + indirim);
        System.out.println("Toplam: " + toplam);

    }



    public static void main(String[] args) {

        /**
         * Bir kafede müşteri;
         * İçecek türü girmiş olsun (kahve, çay, limonata),
         * Adet girmiş olsun,
         * Öğrenci olup olmadığını belirtmiş olsun,
         * Program şunları yapsın;
         * İçeceğin birim fiyatını bulan bir method olsun,
         * Ara toplamı hesaplayan bir method olsun,
         * Öğrenci ise indirim tutarını hesaplayan bir method olsun,
         * Son olarak ödenecek tutarı ekrana yazdırsın.
         *
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("İçecek türü giriniz (kahve, cay, limonata): ");
        String icecek = scanner.nextLine().trim();

        System.out.println("Adet girin: ");
        int adet = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Öğrenci misiniz?: ");
        String ogrenciMi = scanner.nextLine().trim();


        double birimFiyat = fiyatBul(icecek);


        if (birimFiyat == 0.0) {
            System.out.println("Geçersiz içecek girdiniz.");
        } else {
            double araToplam = araToplam(birimFiyat, adet);

            double indirim = indirimHesapla(araToplam, ogrenciMi);

            double toplam = araToplam - indirim;

            fisYazdır(icecek, adet, araToplam, indirim, toplam);
        }

        scanner.close();


    }
}
