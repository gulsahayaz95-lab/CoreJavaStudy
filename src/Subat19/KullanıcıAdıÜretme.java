package Subat19;

import java.util.Scanner;

public class KullanıcıAdıÜretme {
    public static void main(String[] args) {


        /***
         * Ad Soy ad alın ve boşlukları silin,
         * Ad soy ad arasında en az 1 boşluk yoksa tekrar isteyin
         * Varsa: adın ilk harfi + soy adın tamamı şeklinde kullanıcı adı üretin
         * ve küçük harfle yazdırın
         */


        Scanner isimSor = new Scanner(System.in);

        String fullName;

        do {
            System.out.println("Ad soy ad: ");
            fullName = isimSor.nextLine().trim();

            if (!fullName.contains(" ")) {
                System.out.println("Ad soy ad arasında boşluk bırakınız.");
            }

        } while (!fullName.contains(" "));


        int index = fullName.indexOf(" "); // isim ve soy ismi ayırabilmek için bunu buldum!!!
        String firstName = fullName.substring(0, index);
        String lastName = fullName.substring(index + 1); //boşluk alınmasın diye 1 ekledik!!

        String kullanıcı = (firstName.substring(0,1) + lastName).toLowerCase();
        System.out.println("Kullanıcı adınız: " +  kullanıcı);






    }
}
