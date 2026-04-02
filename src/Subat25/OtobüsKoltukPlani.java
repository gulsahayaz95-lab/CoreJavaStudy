package Subat25;

public class OtobüsKoltukPlani {
    public static void main(String[] args) {


        /***
         * Otobüste 4 sıra var ve her sırada 3 koltuk var,
         * Koltukları 1A, 1B,..., 4C şeklinde ekrana yazdır.
         *
         */


        int koltukSırası = 3; //j
        int sıraSayısı = 4; //i

        for (int i = 1 ; i < 5 ; i++) {
            for (int j = 1 ; j < 4; j++) {


                char koltukAdı =(char) ('A' + j);

                System.out.println(i + "" + koltukAdı + " ");
            }
            System.out.println();
        }















    }
}
