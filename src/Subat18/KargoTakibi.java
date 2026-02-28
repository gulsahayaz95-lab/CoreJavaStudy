package Subat18;

import java.util.Scanner;

public class KargoTakibi {
    public static void main(String[] args) {

        /**
         * Bir kargo firması için basit bir takip ve ücret hesaplama programı yazman isteniyor.
         * Kullanıcıdan şu bilgileri al:
         * Takip kodu
         * Teslim tipi (ev/ofis/şube)
         * Mesafe (km)
         *
         * Programın yapması gerekenler:
         * Kullanıcıdan girdiği takip kodunda başta veya sonda gereksiz boşluklar varsa sil
         * Takip kodu uzunluğu tam olarak 10 karakter olmalıdır
         * 10 karakter değilse kullanıcıya hata mesajı ver ve işlemi sonlandır
         * Teslim tipine göre teslimat ücreti belirle:
         * ev -> uygun bir ücret
         * ofis -> uygun bir ücret
         * şube -> uygun bir ücret
         * Bunların dışında bir değer girilirse "GEÇERSİZ TESLİM TİPİ" mesajı ver
         * Mesafe 30 kmden büyükse toplam ücrete ek bir ücret daha ekle
         * Son olarak takip kodunun ilk 2 karakterini ekrana yazdır
         * Çıktıda kullanıcıya:
         * Temizlenmiş takip kodu,
         * Kodun ilk 2 karakteri,
         * Hesaplanan toplam ücret,
         * Bilgilerini anlaşılır şekilde göster.
         */


        System.out.print("Lütfen 10 haneli takip kodunu giriniz: ");
        Scanner takipKoduSor = new Scanner(System.in);
        String takipKodu = takipKoduSor.nextLine().trim();


        System.out.print("Lütfen teslimat tipini giriniz (ev/ofis/şube):  ");
        Scanner  teslimYeriSor = new Scanner(System.in);
        String teslimYeri = teslimYeriSor.nextLine().toLowerCase();

        System.out.print("Lütfen teslimat yerine olan km uzaklığını giriniz: ");
        Scanner kmSor = new Scanner(System.in);
        int km =  kmSor.nextInt();


        if (!(takipKodu.length() == 9)) {
            System.out.println("Takip kodunuz: " +  takipKodu + " Kodun ilk 2 karakteri: " + takipKodu.substring(0,2));

        } else {
            System.out.println("GEÇERSİZ TAKİP KODU. 10 HANELİ OLMALIDIR.");

            //şimdilik konuyu işlemediğimizden uygulamayı durduramadık ileride durdurabiliriz.
            //break kullanımı switch veya döngülerde olur bu sebeple burada kullanamadık.

        }

        double ekKmUcret = 5.0;

        double ucret = 0;
        switch (teslimYeri) {
            case "ev":
                ucret = 10.0;
                break;
            case "ofis":
                ucret = 20.0;
                break;
            case "şube":
                ucret = 7.0;
                break;
            default:
                System.out.println("GEÇERSİZ TESLİM TİPİ");


        }



        if (km > 30) {
            ucret += 5.0;
            System.out.println("Toplam ödeme miktarınız: " + ucret);
        }

        System.out.println("Toplam Fiyat: " + ucret);




    }
}
