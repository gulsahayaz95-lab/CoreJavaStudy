package Subat26;

import java.util.Scanner;

public class OtobüsKartı {
    public static void main(String[] args) {

        /**
         * Kullanıcıdan 7 günlük harcama girmesini iste, toplam harcamayı bulalım,
         * Limit değeri alalım, eğer limit aşılırsa uyarı verelim.
         *
         */


        Scanner scanner = new Scanner(System.in);

        double[] gunluk = new double[7];
        double toplam = 0;


        for (int i = 0; i < gunluk.length; i++) {
            System.out.println((i + 1) + ". gün harcaması: ");
            double input =  scanner.nextDouble();

            if (input < 0) {
                System.out.println("Harcama negatif olamaz.");
                input = 0;

            }


            gunluk[i] = input;
            toplam += input;
        }


        System.out.println("Haftalık limiti girin: ");
        double limit =  scanner.nextDouble();

        if (toplam > limit) {
            System.out.println("Limit aşıldı karta para yükleyin.");
        }





















    }
}
