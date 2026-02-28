package Subat19;

public class BakiyeHesaplama {
    public static void main(String[] args) {

        /***
         * Bakiye 30 TL. Her biniş 12 TL.
         * Bakiye yettiği sürece "Biniş yapıldı" yaz.
         * Kaç biniş olduğunu çıktıda belirt.
         */

        int bakiye = 30;
        int binis = 0;
        int binisUcret = 12;



        while (bakiye > 12) {
            bakiye -= 12;
            binis++;
            System.out.println("Biniş yapıldı. Kalan ücret: " + bakiye);
        }
        System.out.println("Toplam biniş sayısı: " + binis);
        System.out.println("Kalan bakiye: " + bakiye);





    }
}
