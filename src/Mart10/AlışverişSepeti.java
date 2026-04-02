package Mart10;

import java.util.ArrayList;
import java.util.Scanner;

public class AlışverişSepeti {
    public static void main(String[] args) {

        /**
         * Kullanıcı ürün isimlerini girecek,
         * Kullanıcı "bitti" yazana kadar giriş yapmaya devam edecek,
         * En son;
         * Sepetteki ürünleri sıra numarası ile yazdırın,
         * Kullanıcıdan girdiği bir ürünün adını aratın,
         * varsa kaçıncı sırada olduğunu yazdırın, yoksa bulunamadı yazdırın.
         *
         */


        Scanner scanner = new Scanner(System.in);

        ArrayList<String> ürünİsimleri = new ArrayList<>();
        System.out.println("Lütfen ürün isimlerini giriniz. Bitmesi durumunda BİTTİ yazınız.");


        while (true) {

            System.out.print("Ürün isimleri: ");
            String ürünler = scanner.nextLine().trim().toLowerCase();


            if (ürünler.equalsIgnoreCase("bitti")) {
                break;
            }

            if (ürünler.isEmpty()) {
                System.out.print("Ürün adı boş olamaz, tekrar girin.");
                continue;
            }


            ürünİsimleri.add(ürünler);

        }


        for (int i = 0; i < ürünİsimleri.size(); i++) {
            System.out.println((i + 1) + ". ürün ismi -> " + ürünİsimleri.get(i));
        }

        System.out.println("Aramak istediğiniz ürün adını giriniz.");
        String aranan = scanner.nextLine().trim().toLowerCase();
        int j = ürünİsimleri.indexOf(aranan);

        if (j != -1) {
            System.out.println("Aranılan ürünün sırası ->" + (j+ 1) );
        } else {
            System.out.println("Ürün bulunamadı.");
        }

        scanner.close();


    }
}
