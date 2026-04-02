package Mart4;

import java.util.Scanner;

public class SinemaKoltukSayısı {
    public static void main(String[] args) {

        /**
         * Bir sinema salonu 4 sıra ve her sırada 5 koltuk içeriyor,
         * Kullanıcı 0/1 girerek koltuk durumlarını doldursun,
         * 0= boş,
         * 1= dolu,
         * İstenenler;
         * Toplam dolu koltuk sayısını yazdır,
         * En çok dolu olan sırayı yazdır,
         * Eğer toplam doluluk %70 ve üstüyse "Salon dolu sayılır" mesajı ver.
         *
         */


        Scanner scanner = new Scanner(System.in);

        int sıra = 4;
        int koltuk = 5;


        int[][] koltukSırası = new int[sıra][koltuk];

        int enDoluSıraIndex = -1;
        int toplamDoluluk = 0;
        int enDoluSıra = 0;

        System.out.println("Koltuk durumlarını girin (0= boş, 1= dolu):" );

        for (int i = 0; i < koltukSırası.length; i++) {  //SIRA
            System.out.print((i + 1) + ". sıra için girdi yapın: ");


            for (int j = 0; j < koltukSırası[i].length; j++) {  //KOLTUK
                System.out.print((j + 1) + ". koltuk: ");
                int durum = scanner.nextInt();


                while (durum != 0 && durum != 1) {
                    System.out.printf("Hatalı giriş yaptınız.");
                    durum = scanner.nextInt();
                }
                koltukSırası[i][j] = durum;

            }



        }


        for (int i = 0; i < koltukSırası.length; i++) {

            int dolulukMiktarı = 0;

            for (int j = 0; j < koltukSırası[i].length; j++) {

                if (koltukSırası[i][j] == 1) {
                    toplamDoluluk++;
                    dolulukMiktarı++;

                }

                //sıra hala aynı, koltukların durumu bitti
                //dış döngü içindeyiz fakat iç döngü bitmiş oldu

                if (dolulukMiktarı > enDoluSıra) {
                    enDoluSıra = dolulukMiktarı;
                    enDoluSıraIndex = i;

                }

            }

        }
        System.out.println("Sonuçlar");
        System.out.println("Toplam dolu koltuk sayısı: " + toplamDoluluk);
        System.out.println("En dolu sıra: " + (enDoluSıraIndex + 1) + " doluluk miktarı: " + enDoluSıra);


        int toplamKoltukSayısı =  sıra * koltuk;
        double dolulukYüzdesi = (double) toplamDoluluk / toplamKoltukSayısı;

        System.out.println("Doluluk yüzdesi: " + dolulukYüzdesi);

        if (dolulukYüzdesi >= 70) {
            System.out.println("Salon dolu sayılır.");

        }


    }
}
