package Subat19;

import java.util.Scanner;

public class MarketSepeti {
    public static void main(String[] args) {

        /***
         * Kullanıcı fiyat girsin.
         * 0 girerse bitir. Toplamı yazdır.
         * En az 1 kere fiyat sorulsun.
         */

        Scanner fiyatSor = new Scanner(System.in);

        double toplam = 0;
        double fiyat;


        do {
            System.out.println("Lütfen fiyat giriniz (Çıkış için 0'a basınız.) : ");
            fiyat = fiyatSor.nextDouble();


            if (fiyat > 0) {
                toplam += fiyat;

            } else if (fiyat < 0) {
                System.out.println("Fiyat negatif olamaz");

            }

        } while (fiyat != 0);  // -> 0 olmaması koşulu, 0 olmadığı sürece devam demek!!!!

        System.out.println("Toplam fiyat: " +  toplam);






    }
}
