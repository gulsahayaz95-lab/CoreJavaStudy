package Mart18;

import java.util.Scanner;

public class HesapMakinesi {

    public static void islemlerMenüsü() {
        System.out.println("------İşlemler------");
        System.out.println("Toplama için +");
        System.out.println("Çıkarma için -");
        System.out.println("Çarpma için *");
        System.out.println("Bölme için /");


    }


    public static void sonuc(String islem, int sayı1, int sayı2) {
        switch (islem) {
            case "+":
                System.out.println("Toplam: " + (sayı1 + sayı2));
                break;
            case "-":
                System.out.println("Çıkarma: " + (sayı1 - sayı2));
                break;
                case "*":
                    System.out.println("Çarpma: " + (sayı1 * sayı2));
                    break;
                    case "/":
                        System.out.println("Bölme: " + (sayı1 / sayı2));
                        break;
            default:
                System.out.println("Geçersiz işlem");
        }
    }


    public static void main(String[] args) {


        /**
         * Kullanıcıdan 5 defa 2'şer adet sayı ve işlem alalım,
         * Kullanıcının seçtiği işleme göre cevapları sırası ile ekrana yazdıralım.
         *
         */


        Scanner scanner = new Scanner(System.in);


        for(int index = 1; index <= 5; index++){
            System.out.println("1.sayı: ");
            int sayı1 = scanner.nextInt();
            System.out.println("2.sayı: ");
            int sayı2 = scanner.nextInt();

            scanner.nextLine();

            islemlerMenüsü();
            System.out.println("İşlem seçin: ");
            String islem = scanner.nextLine().trim();

            sonuc(islem, sayı1, sayı2);

        }










    }
}
