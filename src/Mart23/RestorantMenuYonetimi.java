package Mart23;

import java.util.*;

public class RestorantMenuYonetimi {
    public static void main(String[] args) {

        /**
         * Bir restoran uygulamasında,
         * menüdeki yemekler kullanıcı tarafından şu şekilde giriliyor;
         * Pizza, Lahmacun, Burger, pizza, Makarna, burger, Salata
         * Program şu işlemleri yapmalıdır;
         * Menü elemanları ayırıp bir listede saklasın,
         * Yinelenen yemekleri kaldırıp farklı yemekleri ayrı bir yapıda tutsun,
         * Kullanıcıdan bir seçim alınsın,
         * E-> Menüde "e" harfi geçen yemekleri göster,
         * B-> Menüde baş harfi "B" olan yemekleri göster,
         * U-> Tüm yemekleri büyük harfe çevirip göster,
         * K-> Karakter sayısı 6'dan fazla olan yemekleri göster,
         * Her işlem ayrı bir method ile yapılsın,
         * Ayrıca bir method, listedeki bir yemeğin menüde bulunup bulunmadığını kontrol etsin.
         *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Menü girişi yapın.");
        String menu = scanner.nextLine().trim();

        System.out.print("Seçim yapın: ");
        String secim = scanner.nextLine().trim().toLowerCase();

        System.out.print("Aramak istediğiniz yemeği girin: ");
        String aranacak = scanner.nextLine().trim();

        List<String> menudekiYemekler = new ArrayList<>();
        String[] menudekiler = menu.split(",");

        for (String yemek: menudekiler) {
            yemek = yemek.trim().toLowerCase();

            if (!yemek.isEmpty()) {
                menudekiYemekler.add(yemek);

            }

        }

        Set<String> benzersizYemekler = new HashSet<>(menudekiYemekler);

        switch (secim) {
            case "E":
                for (String y: benzersizYemekler) {
                    if (y.contains("e")) {
                        System.out.println(y);
                    }
                }
                break;
            case "B":
                for (String y: benzersizYemekler) {
                    if (y.startsWith("b")) {
                        System.out.println(y);
                    }
                }
                break;
            case "U":
                for (String y: benzersizYemekler) {
                    System.out.println(y.toUpperCase());
                }
                break;
            case "K":
                for (String y: benzersizYemekler) {
                    if (y.length() > 6) {
                        System.out.println(y);
                    }
                }
            default:
                System.out.println("Geçersiz seçim yapıldı.");

        }


        if (benzersizYemekler.contains(aranacak)) {
            System.out.println("Aranan yemek menüde var.");
        } else {
            System.out.println("Aranan yemek menüde yok.");
        }


        scanner.close();

    }
}
