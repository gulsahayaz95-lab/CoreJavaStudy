package Subat25;

public class MarketRafi {
    public static void main(String[] args) {

        /***
         * 3 raf var, her rafta 4 ürün var.
         * Etiketler Raf1-Ürün1,...,Raf3-Ürün4 şeklinde yazsın,
         * Ayrıca ürün numarası çiftse yanına (kampanya) yaz.
         *
         */


        int raf = 3;
        int ürün = 4;

        for (raf = 1; raf < 4; raf++) {
            for (ürün = 1 ; ürün < 5 ; ürün++ ) {

                System.out.println("Raf" + raf + "-Ürün" + ürün);

                if (ürün % 2 == 0) {
                    System.out.println("Kampanya");
                }
                System.out.println(" ");

            }
            System.out.println();


        }








    }
}
