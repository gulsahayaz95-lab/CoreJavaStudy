package Subat26;

import java.util.Scanner;

public class SinemaSalonu {
    public static void main(String[] args) {


        /***
         * Kullanıcıdan satır sayısı ve her satırdaki koltuk sayısını al,
         * Her koltuk için kullanıcı B (boş) veya D (dolu) girsin,
         * Her satır sonunda o satırdaki dolu koltuk sayısını yazdır.
         *
         */


        Scanner input = new Scanner(System.in);

        System.out.print("Satır sayısı: ");
        int satırSayısı = input.nextInt();

        System.out.println("Satırdaki koltuk sayısı: ");
        int satırdakiKoltukSayısı   = input.nextInt();
        input.nextLine();


        for (int satır = 1; satır <= satırSayısı ; satır++) {

            //her satırdaki dolu koltuk sayısı bilgisine ihtiyacımız var,
            //iç döngü bittiğinde yeni satıra geçeceği için o satırın dolu koltuk sayısı miktarını sıfırlamış oluruz.
            int doluKoltukSayısı = 0;

            System.out.println(satır + ". satır için B/D gir.");

            for (int koltukSayısı = 1; koltukSayısı <= satırdakiKoltukSayısı; koltukSayısı++){

                System.out.println("Koltuk Boş mu, Dolu mu (B/D)?: ");
                String durum = input.nextLine().trim();


                if (durum.length() == 0) {
                    System.out.println("Boş giriş yapıldı. Koltuk boş olarak kabul edildi.");
                    continue;

                }

                //büyük küçük harf girişi için equalsıgnorecase veya durum bilgisi alırken touppercase kullanılabilir.
                if (durum.equalsIgnoreCase("D")) {
                    doluKoltukSayısı++;

                } else if (durum.equalsIgnoreCase("B")) {
                    System.out.println("Geçersiz giriş yapıldı, koltuk dolu değil olarak kaydedildi.");
                }

                System.out.println("->" + satır + ". satırdaki koltuk sayısı: " + doluKoltukSayısı);










            }
        }


























    }
}
