package Mart10;

import java.util.ArrayList;
import java.util.Scanner;

public class ŞehirListesi {
    public static void main(String[] args) {

        /**
         * Kullanıcıdan kaç tane şehir ismi gireceğini alın,
         * Sonrasında kullanıcıdan silmek istediği şehir ismini alın,
         * Eğer bu isim liste içerisinde varsa listeden silin ve silindi yazın,
         * yoksa şehir bulunamadı yazın.
         *
         */


        Scanner scanner = new Scanner(System.in);

        ArrayList<String> şehirler = new ArrayList<>();
        System.out.println("Kaç şehir ismi gireceksiniz?");
        int sehirmiktarı = scanner.nextInt();

        for (int index = 0; index < sehirmiktarı; index++) {
            System.out.println((index + 1) + ". isim: ");
            String isim = scanner.nextLine().trim();
            while (true) {

                if (isim.isEmpty()) {
                    System.out.println("Şehir ismi boş olamaz.");
                    index--;
                } else {
                    şehirler.add(isim);
                    break;
                }

            }
        }

        int index = -1;
        System.out.println("Silmek istediğiniz şehir ismi: ");
        String silinecek = scanner.nextLine().trim();

        for (int i = 0; i < şehirler.size(); i++) {

            if (silinecek.equalsIgnoreCase(şehirler.get(i))) {
                index = i;
                break;
            }
        }


        if (index == -1) {
            System.out.println("Aranan şehir bulunamadı.");
        } else {
            System.out.println("Şehir silindi.");
            System.out.println("Listedeki geri kalan şehirler: ");
            System.out.println(şehirler);
            System.out.println("Listedeki şehirlerin miktarı: " + şehirler.size());
        }








    }
}
