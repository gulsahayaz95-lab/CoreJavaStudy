package Mart18;

import java.util.Scanner;

public class KargoUcretHesaplama {


    public static double fiyatBul(String gönderiTuru) {
        if (gönderiTuru.equalsIgnoreCase("standart")) {
            return 20;
        } else if (gönderiTuru.equalsIgnoreCase("hızlı")) {
            return 40;
        } else if (gönderiTuru.equalsIgnoreCase("ekspres")) {
            return 60;
        } else {
            return 0;
        }
    }


    public static double agırlıkUcretiHesapla(double kilo) {
        if (kilo <= 1) {
            return 0;
        } else {
            return (kilo - 1) * 20;
        }
    }


    public static double sehirDısıUcretHesaplama(String sehirDısıMı) {
        if (sehirDısıMı.equalsIgnoreCase("evet")) {
            return 30;
        } else {
            return 0;
        }
    }


    public static void ucretOzeti(String gönderiTuru, double kilo, double temelUcret, double ekÜcret, String sehirDışıMı, double toplamÜcret ) {
        System.out.println("---------Özet---------");
        System.out.println("Gönderi turu: " + gönderiTuru);
        System.out.println("Kilo: " + kilo);
        System.out.println("Temel ücret: " + temelUcret);
        System.out.println("Ağırlık ek ücret: " + ekÜcret);
        System.out.println("Şehir dışı mı?: "+ sehirDışıMı);
        System.out.println("Toplam Ücret: " + toplamÜcret);
    }



    public static void main(String[] args) {


        /**
         * Bir kargo firmasında müşteri;
         * Gönderi türünü girsin (Standart, hızlı, ekspres),
         * Paketin ağırlığını girsin,
         * Şehir dışına gönderilip gönderilmeyeceğini girsin (evet/hayır),
         * Program şunları yapsın;
         * Gönderi türüne göre temel ücreti bulan bir method olsun,
         * Ağırlığa göre ek ücreti hesaplayan bir method olsun,
         * Şehir dışı durumuna göre ekstra ücret hesaplayan bir method olsun,
         * Son ücreti ekrana düzenli şekilde yazdıran bir method olsun.
         *
         */



        Scanner scanner = new Scanner(System.in);


        System.out.println("Gönderi türü seçin (standart,hızlı,ekspres)");
        String gönderiTuru = scanner.nextLine().trim();

        System.out.println("Paket ağırlığı: ");
        double kilo = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Şehir dışı mı? ");
        String sehirDısıMı =  scanner.nextLine().trim();

        double temelUcret = fiyatBul(gönderiTuru);
        double toplamUcret = fiyatBul(gönderiTuru);

        if (toplamUcret == 0) {
            System.out.println("Hatalı bir gönderi türü seçtiniz.");
        } else {
            double agırlıkÜcreti = agırlıkUcretiHesapla(kilo);

            double sehirDısı = sehirDısıUcretHesaplama(sehirDısıMı);

            double toplam = temelUcret + agırlıkÜcreti + sehirDısı;


            ucretOzeti(gönderiTuru, kilo, temelUcret, agırlıkÜcreti, sehirDısıMı, toplam);


        }






    }
}
