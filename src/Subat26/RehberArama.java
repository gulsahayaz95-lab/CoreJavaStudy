package Subat26;

import java.util.Scanner;

public class RehberArama {

    public static void main(String[] args) {


        /**
         * Kullanıcıdan 5 isim alıp bunları rehbere kaydedelim,
         * Daha sonra kullanıcı isim girip arama yapsın,
         * Aradığı isim rehberde varsa "Rehberde var", yoksa "Rehberde yok" yazdıralım.
         *
         */


        Scanner scanner = new Scanner(System.in);


        String[] isimler = new String[5];

        //for döngüsü ile rehberi oluşturduk;
        for (int index = 0; index < isimler.length; index++) {
            System.out.println((index + 1) + " .ci isim: ");
            isimler [index] = scanner.nextLine().trim();


            // boş girdi olursa rehbere bilinmiyor olarak kayıt yapalım;
            if (isimler[index].isEmpty()) {
               isimler[index] = "Bilinmeyen kişi";

            }



        }

        System.out.println("Aramak istediğiniz kişinin adını yazın: ");
        String aranan = scanner.nextLine().trim();

        boolean varMı = false;

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].equalsIgnoreCase(aranan)) {
                varMı = true;
                break;
            }
        }


        if (varMı) {
            System.out.println("Rehberde var");
        } else {
            System.out.println("Rehberde yok");
        }


        scanner.close();


    }
}
