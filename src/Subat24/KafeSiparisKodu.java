package Subat24;

import java.util.Scanner;

public class KafeSiparisKodu {
    public static void main(String[] args) {


        /***
         * Kullanıcıdan bir sipariş kodu alın,
         * Baştaki ve sondaki boşluklar silinsin,
         * Kod uzunluğu 8 değilse hata yazdırın,
         * Kodun ilk karakteri sipariş tipini belirlesin;
         * K->KAHVE, C->ÇAY, L->LİMONATA, DİĞER->GEÇERSİZ,
         * Kodun içinde kaç rakam olduğunu sayın,
         * Rakam sayısı en az 3 değilse uyarı yazdırın,
         * Son olarak kodun ilk 3 karakterini yazdırın.
         *
         */


        Scanner siparis = new Scanner(System.in);
        String kod = "";
        String icecek = "";

        do {
            System.out.print("Sipariş kodu girin: ");
            kod = siparis.nextLine().trim();

            if (kod.length() != 8) {
                System.out.println("Kodun uzunluğu 8 karakter olmalıdır.");
            }
        } while (kod.length() != 8);

        char first = kod.charAt(0);   //ilk harfi verecek

        switch (first) {
            case 'k':
                icecek = "Kahve";
                break;
            case 'c':
                icecek = "Çay";
                break;
            case 'l':
                icecek = "Limonata";
                break;
            default:
                icecek = "Geçersiz içecek";
                break;
        }


        int rakamSayısı = 0;

        for (int i = 0; i < kod.length(); i++) {
            char ch = kod.charAt(i); //0. indexten istenen 8. indexe kadar kontrol eder!!!
            if (ch >='0' && ch <='9') {
                rakamSayısı++;
            }
        }

        if (rakamSayısı < 3) {
            System.out.println("Kod en az 3 rakam içermelidir.");
        }


        System.out.println("Kodun ilk 3 karakteri: " + kod.substring(0,3));
        System.out.println("İçecek türü: " + icecek);





    }

}
