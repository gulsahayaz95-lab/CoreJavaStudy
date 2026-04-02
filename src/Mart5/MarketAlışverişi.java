package Mart5;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketAlışverişi {
    public static void main(String[] args) {

        /**
         * Bir kullanıcıdan kaç ürün alacağını öğrenin,
         * Her ürün için;
         * Ürün adını alın,
         * Ürün fiyatını alın,
         * Tüm ürünleri bir listede tutun.
         * Son olarak;
         * Ürünleri sırayla yazdırın,
         * Toplam tutarı hesaplayın,
         * Kullanıcının verdiği bütçe ile karşılaştırın.
         * Kurallar:
         * Ürün adı boş girilirse tekrar isteyin,
         * Fiyat 0(sıfır) veya negatif olamaz,
         * Toplam bütçe aşılmışsa "Bütçe aşıldı", aşılmadıysa "Bütçe uygun" yazdırın.
         *
         */


        Scanner scanner = new Scanner(System.in);

        ArrayList<String> urunler = new ArrayList<>();
        ArrayList<Double> fiyatlar = new ArrayList<>();

        System.out.print("Kaç ürün alacaksınız?: ");
        int adet = scanner.nextInt();

        System.out.println("Bütçeniz nedir?: ");
        double bütçe = scanner.nextDouble();
        scanner.nextLine();

        double toplam = 0;


        for (int i = 0; i < adet; i++) {
            String ürünAdı;
            while (true) {
            System.out.println((i + 1) + ". ürün adı: ");
            ürünAdı = scanner.nextLine();

              if (ürünAdı.isEmpty()) {
                System.out.println("Ürün adı boş olamaz, tekrar girin.");

              } else {
                break;
              }


            }


            double tutar;

            while (true) {
                System.out.println((i + 1) + ". ürün fiyatı");
                tutar = scanner.nextDouble();
                scanner.nextLine();

                if (tutar <= 0) {
                    System.out.println("Ürün fiyatı 0 veya negatif olamaz. Tekrar deneyin.");
                } else {
                    break;
                }

            }


            urunler.add(ürünAdı);
            fiyatlar.add(tutar);


            toplam += tutar;


        }


        System.out.println("------Alışveriş Listesi------");

        for (int i = 0; i < urunler.size(); i++) {
            System.out.println((i + 1) + ". ürün adı" + urunler.get(i) + " ürünün fiyatı" + fiyatlar.get(i));
        }

        System.out.println("Toplam tutar: " + toplam);


        System.out.println("Bütça: " + bütçe);


        String durum = (toplam > bütçe) ? "Bütçe aşıldı" : "Bütçe uygun";
        System.out.println("Bütçe durumu: " + durum);




















    }
}
