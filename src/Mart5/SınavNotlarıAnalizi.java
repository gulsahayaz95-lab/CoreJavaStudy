package Mart5;

import java.util.ArrayList;
import java.util.Scanner;

public class SınavNotlarıAnalizi {
    public static void main(String[] args) {

        /**
         * Kullanıcıdan sınav notlarını tek tek alarak bir program yazın,
         * Kullanıcı 0-100 arasında notlar girebilir,
         * Kullanıcı -1 yazarsa not girişi biter ve analiz kısmına geçilir,
         * Kullanıcı 0-100 dışında (örn: 120, -5 gibi) bir değer girerse;
         * "Geçersiz not" uyarısı verin, bu notu listeye eklemeyin tekrar giriş isteyin,
         * Giriş tamamlandıktan sonra;
         * Eğer hiç geçerli not girilmediyse "Hiç not girilmedi, analiz yapılamaz." uyarısı verin,
         * Eğer en az 1 geçerli not girildiyse girilen notları sırayla numarasıyla yazdırın,
         * Notların ortalamasını hesaplayın (ondalıklı),
         * Geçen ( >=50) ve kalan (<50) sayısını yazdırın,
         * En yüksek ve en düşük notu yazdırın.
         *
         */


        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> notlar = new ArrayList<>();

        System.out.println("0-100 arası sınav notunuzu girin. Bitirmek için -1 girin.");

        while (true) {
            System.out.print("Not: ");
            int sınavNotu = scanner.nextInt();


            if (sınavNotu == -1) {
                break;
            }

            if (sınavNotu < 0 || sınavNotu > 100 ) {
                System.out.println("Not aralığı 0-100 arasında olabilir. Tekrar deneyiniz.");
                continue;
            }


            notlar.add(sınavNotu);

        }


        if (notlar.isEmpty()) {
            System.out.println("Hiç not girilmedi, analiz yapılamaz.");
        } else {
            int toplam = 0;
            int gecenSayısı = 0;
            int kalanSayısı = 0;

            int enYüksekNot = notlar.get(0);
            int enDüşükNot = notlar.get(0);

            for (int i = 0; i < notlar.size(); i++) {

                toplam += notlar.get(i);


                if (notlar.get(i) >= 50) {
                    gecenSayısı++;
                } else {
                    kalanSayısı++;
                }

                if (notlar.get(i) >= enYüksekNot) {
                    enYüksekNot = notlar.get(i);
                }

                if (notlar.get(i) < enDüşükNot) {
                    enDüşükNot = notlar.get(i);
                }
                
                
            }

            double ortalama = (double) toplam / notlar.size();

            System.out.println("------Notlar------");
            for (int i = 0; i < notlar.size(); i++) {
                System.out.println((i + 1) + ". not: " + notlar.get(i));
            }

            System.out.println("----------Analiz Sonuçları---------");
            System.out.println("Ortalama: " + ortalama);
            System.out.println("Geçen sayısı: " + gecenSayısı);
            System.out.println("Kalan sayısı: " + kalanSayısı);
            System.out.println("En yüksek not: " + enYüksekNot);
            System.out.println("En düşük not: " + enDüşükNot);
            
            
            
        }
        scanner.close();










    }
}
