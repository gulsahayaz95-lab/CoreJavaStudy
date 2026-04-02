package Mart11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MisafirAdları {
    public static void main(String[] args) {

        /**
         * Kullanıcıdan 6 tane misafir ismi alalım,
         * Aynı isimden birden fazla giriş yapılırsa kayıt edilmeyecek,
         * En sonunda misafir isimlerini yazdırın,
         * Toplam kaç misafir olduğunu yazdırın.
         *
         */


        Scanner scanner = new Scanner(System.in);

        //soruda ya da görevde özellikle belirtilmezse set olarak HASHSET kullanılır.
        Set<String> isimler = new HashSet<>();


        for (int index = 0; index < 6; index++) {
            System.out.println((index + 1) + ". misafirin ismi: ");
            String isim = scanner.nextLine().trim();

            isimler.add(isim);
        }

        System.out.println("---------Misafir İsimleri--------");
        for (String name : isimler) {
            System.out.println(name);
        }

        System.out.println("Toplam misafir sayısı: " + isimler.size());



    }
}
