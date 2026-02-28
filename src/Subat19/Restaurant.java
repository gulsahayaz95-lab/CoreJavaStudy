package Subat19;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {

        /***
         * Kullanıcı kişi sayısı girsin (1-10),
         * Aralık dışı ise tekrar iste,
         * 7+ ise "Büyük Masa", değilse "Normal Masa"
         */

        int kisiSayısı;
        Scanner kisiSayısıSor = new Scanner(System.in);



        do {
            System.out.println("Lütfen 1-10 arası kişi sayısı giriniz: ");
            kisiSayısı = kisiSayısıSor.nextInt();

            if (kisiSayısı > 7) {
                System.out.println("Büyük Masa");
            } else if (kisiSayısı < 1) {
                System.out.println("Kişi sayısı 1'den az olamaz.");

            } else {
                System.out.println("Normal Masa");

            }

        }while (!(kisiSayısı > 1 && kisiSayısı < 10));

        System.out.println("Kişi sayısı: " + kisiSayısı);






    }
}
