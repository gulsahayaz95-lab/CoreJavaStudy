package Subat18;

import java.util.Scanner;

public class MarketIndirimi {
    public static void main(String[] args) {

        /**
         * Kullanıcıdan;
         * Ürün adı (string)
         * Adet (int)
         * Kupon kodu (string)
         * İstenen:
         * Kupon kodunu trim() + toUpperCase() yap
         * switch-case ile kupon tipine göre indirim uygula: SAVE10, SAVE20, NONE
         * if-else ile adet 5'ten büyük ise ekstra indirim ver
         *
         * Ürün adında süt geçiyorsa (contains) bir uyarı yazdır
         *
         */


        System.out.print("Lütfen ürün ismi giriniz: ");
        Scanner ürünSor =   new Scanner(System.in);
        String ürün = ürünSor.nextLine();


        System.out.print("Lütfen ürün adedi giriniz: ");
        Scanner adetSor =   new Scanner(System.in);
        int adet =  adetSor.nextInt();

        System.out.print("Lütfen kupon kodu giriniz (SAVE10-SAVE20-NONE): ");
        Scanner kuponSor =    new Scanner(System.in);
        String kupon = kuponSor.nextLine().trim();


        double urunFiyatı = 20.0;
        double totalFiyat = urunFiyatı * adet;

        switch(kupon) {
            case "SAVE10": totalFiyat *= 0.9;
            break;
                   case "SAVE20": totalFiyat *= 0.8;
                   break;
                       case "NONE": totalFiyat *= 0.0;
                       break;
            default:
                System.out.println("Geçersiz kupon girildi.");
        }



        if (adet > 5) {
            totalFiyat *= 0.95;
        }


        if (ürün.toLowerCase().contains("süt")) {   // -> önce ürün ismini aldım küçülttüm sonra içeriği kontrol ettim.
            System.out.println("Ürün içerisinde süt vardır.");

        }


        System.out.println("Ürün: " + ürün + " Miktar " + adet);
        System.out.println("Kupon: " + kupon + " Total: " + totalFiyat);
        System.out.println("İndirim miktarı: ");  //BUNA TEKRAR BAK!!!




    }
}
