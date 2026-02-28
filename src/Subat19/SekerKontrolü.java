package Subat19;

import java.util.Scanner;

public class SekerKontrolü {
    public static void main(String[] args) {

        /**
         * Kullanıcıdan şeker miktarı al (0-5 arası),
         * Aralık dışı ise tekrar iste.
         */

        int seker;
        int baslangıcSeker = 0;

        Scanner sekerSor = new Scanner(System.in);


        do {
            System.out.print("Lütfen şeker miktarını giriniz (0-5 arası): ");
            seker = sekerSor.nextInt();

        } while (!(seker > 0 && seker < 5));

        System.out.println("Şeker miktarınız: " + seker);






    }
}
