package Mart4;

import java.util.Scanner;

public class OtobüsKartıBakiyesi {
    public static void main(String[] args) {


        /**
         * Kullanıcıdan kaç yolculuk yapacağını alın,
         * Her yolculuk için "tam/öğrenci/indirimli" tipini sorun,
         * Her yolculukta ücret düşülsün,
         * Son olarak;
         * Toplam kullanılan ücret,
         * Kalan bakiye,
         * En çok kullanılan kart tipi hangisi yazdırın.
         * Kart tipi yanlış girilirse o yolculuğu saymayın.
         *
         */


        Scanner input = new Scanner(System.in);

        System.out.print("Şu anda bulunan bakiyenizi giriniz: ");
        double mevcutBaslangıcBakiyesi = input.nextDouble();

        System.out.print("Toplamda kaç yolculuk yapacaksınız?: ");
        int toplamYolculuk = input.nextInt();
        input.nextLine();



        // int tam = 0, ogrenci = 0, indirimli = 0; bir diğer yazım şeklidir.
        int tam = 0;
        int ogrenci = 0;
        int indirimli = 0;
        double toplamHarcamaMiktarı = 0;

        for (int i = 0; i < toplamYolculuk; i++) {
            System.out.println((i + 1) + " . yolculuk tipi girişi yapınız (tam, öğrenci, indirimli): ");
            String yolculukTipi = input.nextLine().trim().toLowerCase();

            double ucret;
            switch (yolculukTipi) {
                case "tam":
                    ucret = 20;
                    tam++;
                    break;
                case "ogrenci":
                    ucret = 15;
                    ogrenci++;
                    break;
                case "indirimli":
                    ucret =20;
                    indirimli++;
                    break;
                default:
                    System.out.println("Hatalı yolculuk tipi giriş yapıldı.");
                    i--;
                    continue;

            }


            if (mevcutBaslangıcBakiyesi < ucret) {
                System.out.println("Yetersiz bakiye");
                continue;
            }


            if (tam > ogrenci && tam>indirimli) {
                System.out.println("En çok kullanılan yolculuk tipi TAM'dır.");

            } else if (ogrenci > tam && ogrenci>indirimli) {
                System.out.println("En çok kullanılan yolculuk tipi OGRENCI.");

            } else {
                System.out.println("En çok kullanılan yolculuk tipi İNDİRİMLİ.");

            }

            mevcutBaslangıcBakiyesi -= ucret;
            toplamHarcamaMiktarı += ucret;

            System.out.println("Kalan bakiyeniz: " + ucret);
            System.out.print("Toplam kullanılan ücret: " + toplamHarcamaMiktarı);


        }


        input.close();




    }
}
