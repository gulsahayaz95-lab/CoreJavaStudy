package Mart10;

import java.util.ArrayList;
import java.util.Scanner;

public class YazıİçindekiSayılar {
    public static void main(String[] args) {

        /**
         * Kullanıcıdan bir yazı girmesini isteyin,
         * Bu yazı içerisinde kaç tane sayısal değer olduğunu bulun,
         * Son olarak bu sayısal değerleri ekrana yazdırın.
         *
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir yazı girin, yazı içerisinde sayısal ifadeler olabilir.");
        String text = scanner.nextLine().trim();


        int toplam = 0;
        ArrayList<Integer> sayılar = new ArrayList<>();

        //örn text : password123
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= '0' && ch <= '9') {
                toplam++;
                int sayı = ch - '0'; // char olarak gelen rakamı inte çevirdik
                sayılar.add(sayı);
            }

        }

        System.out.println("Bu yazı içerisinde toplam " + toplam + " sayısal ifade vardır.");
        System.out.println(sayılar);











    }
}
