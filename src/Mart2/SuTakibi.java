package Mart2;

import java.util.Scanner;

public class SuTakibi {
    public static void main(String[] args) {

        /**
         * Kullanıcıdan 7 gün için (Pzt-Paz) günlük içtiği su miktarını (lt) alın,
         * Son olarak;
         * Toplam su miktarını yazdırın,
         * Ortalama su miktarını yazdırın,
         * Hangi gün(ler) ortalamanın altında kaldıysa gün adını yazdırın,
         * Ek olarak kullanıcıdan hedef litre alın ve hedefe göre "az/ideal/fazla" mesajı verin.
         *
         */


        Scanner input = new Scanner(System.in);

        String[] days = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Ctesi", "Pazar"};

        double[] su = new double[7];


        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i] + " su miktarı");
            su[i] = input.nextDouble();

        }


        double toplam = 0;

        for (int index = 0; index < su.length; index++) {
            toplam += su[index];
        }


        double ortalama = toplam / su.length;
        System.out.println("Toplam su miktarı: " + toplam);
        System.out.println("Ortalama su miktarı: " + ortalama);


        System.out.println("----Ortalamanın altında kalan günler----");

        for (int i = 0; i < su.length; i++) {
            if (su[i] < ortalama) {
                System.out.println(days[i] + " günü" + su[i] + " ortalama altında kalmıştır.");

            }
        }

        System.out.println("Hedef litre miktarı girin: ");
        double hedef = input.nextDouble();

        for (int i = 0; i < days.length; i++) {
            if (su[i] < hedef) {
                System.out.println(days[i] + "günü hedefe göre az.");
            } else if (su[i] == hedef) {
                System.out.println(days[i] + "günü hedefe uygun.");
            } else {
                System.out.println(days[i] + "günü hedeften fazla.");
            }

        }













    }

}
