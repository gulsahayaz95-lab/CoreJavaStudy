package Subat19;

import java.util.Scanner;

public class YasKontrolü {
    public static void main(String[] args) {

        /***
         * Kullanıcı adı alın, boşlukları temizleyin,
         * En az 3 karakter değilse tekrar isteyin,
         * Yaş alın, Yaş 18'den küçükse izleyemez
         * değilse yazdırın
         */


        Scanner kullanıcıSor = new Scanner(System.in);
        String userName;

        while (true) {
            System.out.print("Kullanıcı adı girin: ");
            userName = kullanıcıSor.nextLine();

            if (userName.length() < 3) {
                System.out.println(" Kullanıcı adınız en az 3 harfli olmalıdır.");
            } else  {
                break;  // kullanıcı doğru giriş yaptı demektir
            }

        }

        System.out.println("Yaşınızı girin: ");
        int yas  = kullanıcıSor.nextInt();

        if ( yas < 18) {
            System.out.println("İzleyemez.");
        } else {
            System.out.println("İzleyebilir.");
        }






    }
}
