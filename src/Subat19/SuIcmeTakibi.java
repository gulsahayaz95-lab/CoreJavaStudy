package Subat19;

import java.util.Scanner;

public class SuIcmeTakibi {
    public static void main(String[] args) {

        /***
         * Günlük hedef 2000 ml
         * Kullanıcı her defasında içtiği ml'yi girsin
         * Toplam hedefe ulaşınca bitir.
         */


        int baslangic = 0;
        int hedef = 2000;
        int ml;
        Scanner mlSor = new Scanner(System.in);



        do {
            System.out.print("Lütfen içtiğiniz su miktarını ml olarak giriniz: ");
            ml = mlSor.nextInt();


            if (ml < 1) {
                System.out.println("Lütfen 0'dan büyük bir sayı giriniz.");
            } else if (ml > 1) {
                System.out.println("İçilen miktar: " +  baslangic);
                baslangic += ml;
            }

        } while (baslangic < hedef);


        System.out.println("Hedefinize ulaştınız, içtiğiniz su miktarı: " + baslangic + " ml'dir.");









    }
}
