package Subat18;

import java.util.Scanner;

public class RestaurantRezervasyonu {
    public static void main(String[] args) {


        /***
         * Bir restaırant için rezervasyon kontrol programı hazırlanacak.
         * Kullanıcıdan şu bilgileri al:
         * İsim-Soy isim
         * Kişi sayısı
         * Bölüm tercihi (Sigara/Sigarasız/VIP)
         * Program aşağıdaki işlemleri yapmalıdır:
         * Kullanıcının girdiği isim ve soy isim bilgisinde başta veya sonda gereksiz boşluklar silinmeli
         * Girilen bilgide ad ve soy ad olup olmadığı kontrol edilmeli
         * Eğer isim ve soy isim içerisinde boşluk karakteri yoksa kullanıcıya "Lütfen ad ve soy ad giriniz" uyarısı ver
         * Bölüm tercihine göre kullanıcıya masa durumuyla ilgili bir mesaj göster;
         * Sigara seçilirse bununla ilgili bir mesaj,
         * Sigarasız seçilirse bununla ilgili bir mesaj,
         * VIP seçilirse bununla ilgili bir mesaj,
         * Geçersiz bir durum seçilirse uyarı mesajı ver.
         * Kişi sayısına göre ek bilgilendirme yap
         * Eğer kişi sayısı 6'dan fazlaysa "Büyük masa gereklidir." uyarısı yazdır.
         * Çıktıya kullanıcıya:
         * Rezervasyonun hangi isim adına alındığı,
         * Bölüm mesajı,
         * (Gerekli ise) büyük masa uyarısı
         * bilgilerini anlaşılır biçimde göster.
         */

        System.out.print("Lütfen isim ve soy isminizi giriniz: ");
        Scanner isimSoyisimSor = new Scanner(System.in);
        String isimSoyisim = isimSoyisimSor.nextLine().trim();


       // boolean isimDogruMU = !isimSoyisim.contains(" "); bunu direkt if içine yazabiliriz
        if (!isimSoyisim.contains(" ")) {
            System.out.println("İsim ve soy isim bilgisi eksik.");
        }


        System.out.print("Kişi sayısı giriniz: ");
        Scanner kisiSayisiSor = new Scanner(System.in);
        int kisiSayisi = kisiSayisiSor.nextInt();


        if (kisiSayisi > 6) {
            System.out.println("Büyük masa gereklidir.");
        } else if (kisiSayisi < 1) {
            System.out.println("Kişi sayısı en az 1 olmalııdır.");

        }

        System.out.print("Tercih ettiğiniz oturma bölümünü giriniz (Sigaralı/Sigarasız/VIP): ");
        Scanner oturmaBölümüSor = new Scanner(System.in);
        String oturmaBölümü = oturmaBölümüSor.nextLine();
        oturmaBölümü = oturmaBölümü.toLowerCase();


        switch (oturmaBölümü.toLowerCase()) {
            case "sigaralı":
                System.out.println("Sigaralı bölümü tercih ettiniz.");
                break;
            case "vip":
                System.out.println("VIP bölümü tercih ettiniz.");
                break;
            case "sigarasız":
                System.out.println("Sigarasız bölümü tercih ettiniz.");
                break;
            default:
                System.out.println("Hatalı bölüm girişi yaptınız.");


        }


        System.out.println("Rezervasyon " + isimSoyisim + " adına alınmıştır.");
        System.out.println("Rezervasyonunuz " + oturmaBölümü + " olarak not alınmıştır.");









    }
}
