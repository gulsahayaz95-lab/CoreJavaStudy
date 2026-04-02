package Mart12;

import java.util.HashMap;
import java.util.Scanner;

public class NotSorgulama {
    public static void main(String[] args) {

        /**
         * Bir öğretmenin elinde öğrencinin notları ve isimleri var,
         * 4 öğrenci ve notu Map içine ekleyelim,
         * Kullanıcıdan öğrenci adını alalım,
         * Öğrenci varsa notunu gösterelim, yoksa öğrenci sistemde yok yazdıralım.
         *
         */


        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> ogrenciler = new HashMap<>();
        ogrenciler.put("Serhat", 89);
        ogrenciler.put("Izzet", 90);
        ogrenciler.put("Kader", 92);
        ogrenciler.put("Mehmet", 97);


        System.out.println("Aramak istediğiniz öğrencinin adı: ");
        String name =  scanner.nextLine().trim();


        if (ogrenciler.containsKey(name)) {
            System.out.println("Öğrenci notu: " + ogrenciler.get(name));
        } else {
            System.out.println("Aranan öğrenci sistemde yoktur.");
        }









    }
}
