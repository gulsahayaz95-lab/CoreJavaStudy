package Subat18;

import java.util.Scanner;

public class ÖrnKahveSiparişi {

    public static void main(String[] args) {

        /**
         * Kullanıcıdan;
         * İçecek türü: kahve, çay, limonata (string)
         * Boy: S/M/L (String)
         * Şeker: 0-5 (int)
         * İstenen:
         * switch-case ile içeceğe göre taban fiyat
         * if-else ile boyut farkını ekle
         * String'i toLowerCase() ile normalize et, boy için equalsIgnorCase() ile kullan
         * Son fiyatı yazdır.
         *
         */

        System.out.print("Hangi içeceği istersiniz? (Kahve-Çay-Limonata) : ");
        Scanner icecekSor = new Scanner(System.in);
        String icecek =  icecekSor.next().trim();

        System.out.print("Hangi boy istersiniz? (S/M/L): ");
        Scanner boySor = new Scanner(System.in);
        String boy =  boySor.next().trim();

        System.out.print("İstenilen şeker seviyesini giriniz (0-5 arası): ");
        Scanner sekerSor = new Scanner(System.in);
        int seker = sekerSor.nextInt();


        double fiyat = 0;


        switch (icecek) {
            case "kahve": fiyat = 20;
                break;
            case "Kahve": fiyat = 20; // equalıgnore burada kullanamadığım için ekledim - baş harfi değişik!
            break;
            case "limonata": fiyat = 30;
                break;
            case "cay": fiyat = 40;
            default:
                System.out.println("Geçersiz içecek");
        }



        if (boy.equalsIgnoreCase("M")) {
            fiyat += 5;


        } else if (boy.equalsIgnoreCase("L")) {
            fiyat += 10;

        } else if (!boy.equalsIgnoreCase("S")) {
            System.out.println("Geçersiz boy girişi");
        }



        if (seker < 0 || seker > 5) {
            System.out.println("Şeker seviyesi 0-5 aralığında olmalıdır.");

        }


        System.out.println("İçecek: " + icecek + "Boyutu: " + boy + "Fiyatı: " + fiyat);
        System.out.println("Toplam tutar: " + fiyat);





    }
}
