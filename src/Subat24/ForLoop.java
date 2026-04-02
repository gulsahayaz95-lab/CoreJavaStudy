package Subat24;

import java.util.Scanner;

public class ForLoop {
    private static String system;

    public static void main(String[] args) {

        /***
         * for (başlangıç değeri ; koşul ifadesi; artma-azaltma ifadesi ) {
         *
         *       // döngünün gövdesi
         *  }
         *
         *  başlangıç: sayaç diyebiliriz buna, ilk kısımda tanımlanır
         *  koşul: true olduğu sürece döngü tekrar edecek
         *  artan/azalan ifade: her tur/tekrar sonunda sayaç değişecek
         *
         */

        for (int i = 1; i <= 5; i++) {
            //döngü gövdesine örnek olması için i değerini yazdık
            //başka kod blokları da olabilir burada
            //döngü için tanımladığım i değeri döngü gövdesindeki kodların birkaç kez tekrar edeceğini belirtir
            //değişken i olmak zorunda değil yani
            System.out.println(i);

        }


        /***
         * while döngüsünde -> ne zaman biteceği koşulabağlıydı
         * örn: kullanıcı girişi, doğrulama gibi
         *
         *
         * for döngüsünde -> bu döngünün kaç defa döneceği bellidir, sayaçlı işlemler
         *
         * for ile yapılan işlemleri while ile de yapabiliriz fakat while ile yapılan her işlemler for ile yapılamaz
         * Aşağıdaki yapı buna örnektir:
         */

        //ÖRN!!!

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }


        int j = 0;
        while (j < 5) {
            System.out.println(j);
        }


        System.out.println("-------------------------");

        Scanner input = new Scanner(System.in);
        String pass = "";

        while (!pass.equals("1234")) {
            System.out.println("Şifre girin: ");
            pass = input.nextLine();
        }
        System.out.println("Giriş başarılı.");


        System.out.println("-------------------------");

        for (int k =10; k >= 0; k-- ) {
            System.out.println(k);
        }


        System.out.println("--------------------------");



        for (int t = 2; t <= 10; t += 2) {
            System.out.println(t);
        }


        System.out.println("---------------------------");

        for (int i = 0, l =10; i <= l; i++, l--) {
            System.out.println("i: " + i + "l: " + l);
        }


        System.out.println("----------------------------");


        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                break;  //buradaki break tüm for döngüsünü durdurur!!!!
            }
        }



        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;  // tek sayı istediğim için çift görünce devam etmesini istedik!!!! her çift sayıda
                //kod tekrar yukarı çıkacak!!!
            }
            System.out.println(i);
        }










    }
}
