package Mart11;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ŞehirListesi {
    public static void main(String[] args) {

        /**
         * Kullanıcıdan ziyaret ettiği 7 şehir ismini alın,
         * Aynı şehir ismi varsa bunu kaydetmeyin,
         * Sonunda şehir isimlerini gittiği sıra ile yazdırın,
         * Istanbul şehrinin listede olup olmadığını kontrol edin.
         *
         */

        Scanner scanner=new Scanner(System.in);
        Set<String> sehirler = new LinkedHashSet<>();


        for (int index = 1; index <= 7; index++ ) {
            System.out.println(index + ". şehir ismi: ");
            String sehir = scanner.nextLine().trim();

            sehirler.add(sehir);

        }


        System.out.println("------Şehir İsimleri-------");
        for (String s: sehirler) {
            System.out.println(s);
        }

        if (sehirler.contains("Istanbul")) {
            System.out.println("Istanbul daha önce ziyaret edilmiştir.");
        } else {
            System.out.println("Büyük kayıp.");
        }






    }
}
