package Mart10;

import java.util.ArrayList;
import java.util.Scanner;

public class NotListesi {
    public static void main(String[] args) {


        /**
         * Kullanıcıdan notlar alın,
         * -1 girilince giriş bitsin,
         * Sonunda;
         * Notları yazdırın,
         * Ortalamayı hesaplayın,
         * En yüksek ve en düşük notları yazdırın,
         * Kurallar;
         * Notlar 0-100 arası olmalı, değilse listeye eklenmesin.
         *
         */


        Scanner scanner = new Scanner(System.in);


        ArrayList<Integer> notlar = new ArrayList<>();

        System.out.println("Not girin. Notlar 0-100 arasında olmalı. Bitirmek için -1 yazın.");

        while (true) {
            System.out.println("Not: ");
            int not = scanner.nextInt();

            if (not == -1){
                break;
            }

            if (not < 0 || not > 100){
                System.out.println("Geçersiz not girişi. Notlar 0-100 arasında olmalıdır.");
                continue;
            }
            notlar.add(not);



        }

        int toplam = 0;
        int max = notlar.get(0);
        int min = notlar.get(0);
        for (int i = 0; i < notlar.size(); i++) {

            toplam  += notlar.get(i);

            if (notlar.get(i) < max){
                max = notlar.get(i);
            }

            if (notlar.get(i) > min){
                min = notlar.get(i);

            }
        }

        double ortalama = (double)  toplam / notlar.size();

        System.out.println("-----Notlar-----");
        for (int i = 0; i < notlar.size(); i++) {
            System.out.println((i + 1) + ". not" + notlar.get(i));
        }

        System.out.println("Ortalama: " + ortalama);
        System.out.println("En büyük: " + max);
        System.out.println("En küçük: " + min);












    }

}
