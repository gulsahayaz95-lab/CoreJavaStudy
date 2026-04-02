package Subat24;

import java.util.Scanner;

public class OtobüsKartı {
    public static void main(String[] args) {

        /***
         * Kullanıcıdan biniş geçmişi alın: "T,O,O,T,X,O" gibi. (T: tam, O: öğrenci)
         * Boşlukları temizleyin,
         * Her karakteri for ile dolaşın virgül ve boşlukları yok sayın,
         * switch-case ile ücret ekleyin: T=20, O=12, Diğer=0.
         * Geçersiz bir karakter varsa sayısını tutun,
         * Toplam ücret ve geçersiz kayıt sayısını yazdırın,
         * Öğrenci binişi 5'ten fazlaysa bonus mesajı verin.
         *
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Biniş Geçmişi (T/O)");
        String input = scanner.next().trim().toUpperCase();

        int toplamUcret = 0;
        int gecersizBinis = 0;
        int ogrenciBinisi = 0;   //bunları bilmediğimiz için 0'dan başladı.

        //örn input -> "T,O,O,T,X,O"
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == ',' || ch == ' ') {
                continue;

            }

            int ucret;
            switch (ch) {
                case 'T':
                    ucret = 20;
                    break;
                case 'O' :
                    ucret = 12;
                    ogrenciBinisi++;
                    break;
                default:
                    ucret = 0;
                    gecersizBinis++;
                    break;

            }
            toplamUcret += ucret;

        }

        System.out.println("Toplam Ücret: " + toplamUcret);
        System.out.println("Geçersiz biniş sayısı: " +  gecersizBinis);


        if (ogrenciBinisi > 5) {
            System.out.println("Öğrencimiz bonus biniş kazandı.");
        }


        scanner.close();






    }
}
