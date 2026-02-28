package Subat19;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        /***
         *
         * do {
         *      //tekrar edilecek kod buraya yazılıyor
         * } while (koşul);
         *
         *
         * Burada while dan fark koşul sağlanmasa dahi kod 1 defa çalışır.
         * Menü sistemleri buna örnek olabilir. Bir defa bile olsa bakılır.
         * Önce dene sonra devam edip etmeyeceğine karar ver sistemidir.
         *
         *
          */


        int i = 1;

        do {
            System.out.println(i);
            i++;

        } while (i < 5);

        //ATM örneği;
        //Bu seçenekleri bir kere bile olsa kullanıcıya göstermek ve tercihi ona bırakmak istediğim durumlar!!!

        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("1- Bakiye gör");
            System.out.println("2- Para Yatır");
            System.out.println("3- Çıkış");
            System.out.print("Seçim ");
            secim = scanner.nextInt();

        } while (secim != 3);
        System.out.println("Program sonlandı.");


        System.out.println("-------------------------------");


        int x = 10;
        // while hiç çalışmaz.
        // do-while bir kere olsa bile çalışır.

        while (x < 5) {
            System.out.println("While çalıştı.");
        }


        do {
            System.out.println("do while çalıştı.");
        } while (x < 5);











    }
}
