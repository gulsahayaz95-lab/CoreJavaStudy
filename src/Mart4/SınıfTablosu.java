package Mart4;

import java.util.Scanner;

public class SınıfTablosu {
    public static void main(String[] args) {


        /**
         * Bir sınıfta 3 öğrenci ve her öğrencinin 4 sınav notu var,
         * Kullanıcıdan notları tablo şeklinde al,
         * İstenenler;
         * Her öğrencinin ortalamasını yazdır,
         * Ortalaması 50+ olanlar "Geçti", aksi halde "Kaldı" yazdır,
         * Sınıftaki en yüksek notu ve hangi öğrenci/sınavda olduğunu yazdır.
         *
         */


        Scanner scanner = new Scanner(System.in);

        int ogrenciSayısı = 3;
        int notSayısı = 4;

        int[][]  sınavNotları = new int[ogrenciSayısı][notSayısı];

        int maxNot = 0;

        //0 diye başlatsaydık;
        //0,0 indexlerini başlangıç olarak en yüksek not ve öğrenci diye kabul etmiş oluruz
        //0. indexte 1. öğrenci olacağı için, 1. öğrencinin 1.notu en yüksek demiş olurduk.
        //Geçersiz bir değer olan -1 olarak değer atadık.
        int ogrIndex = -1;
        int sınavIndex = -1;


        //çok fazla veri olduğundan bunu aktif etmiyorum fakat veriyi dışarıdan almam gerekirse ve terminalde göstermek istersem aşağıdaki döngü gereklidir:
        //for (int i = 0; i < ogrenciSayısı; i++) {

            //for (int j = 0; j < notSayısı; j++) {

                //System.out.print((i + 1) + ". öğrencinin " + (j + 1) + ". notunu giriniz: ");
                //sınavNotları [i][j] = scanner.nextInt(); arraylerde yazılmalıdır:

                //aşağıdaki yazımın derli toplu halidir.
                //ogrenciSayısı = scanner.nextInt();
                //notSayısı = scanner.nextInt();


        for (int i = 0; i < sınavNotları.length; i++) {
            System.out.println((i + 1) + ". öğrencinin notları: ");

            for (int j = 0; j < sınavNotları[i].length; j++) {
                System.out.println((j + 1) + ". not: ");
                int not = scanner.nextInt();
                sınavNotları[i][j] = not;  //notları tabloya kayıt ettiriyoruz

                if (maxNot > not) {
                    maxNot = not;
                    ogrIndex = i;
                    sınavIndex = j;

                }

            }
            System.out.println();
        }



        //bu for döngüsü ise ortalama bulmak için;

        for (int i = 0; i < sınavNotları.length; i++) {

            int toplam = 0; // iç döngü her bitişte sıfırlandığı için dış döngüye yazdık.

            for (int j = 0; j < sınavNotları[i].length; j++) {
                toplam += sınavNotları[i][j];

            }

            //ort için;

            double ortalama = (double) toplam / sınavNotları[i].length;

            //double int bölündüğünde double olması için (double) eki yazdık.


            //IF-ELSE konusundaki ternary kullanımı
            String sınavSonucu = (ortalama >= 50) ? "Geçti" : "Kaldı";
            System.out.println((i + 1) + ". öğrencinin not ortalaması" + ortalama);

            //ternary olmasaydı
            // if (ortalama < 50) {
            //System.out.println("Kaldı");
            //} else {
            // System.out.println("Geçti");

            // tablo düzenleme;
            System.out.printf("%d. öğrenci not ortalaması: %.2f -> %s%n", (i + 1), ortalama, sınavSonucu);


            System.out.printf("En yüksek not bilgisi");
            System.out.printf("En yüksek not: " + maxNot);
            System.out.printf("En yüksek notu alan: " + (ogrIndex + 1) + ". öğrenci" + (sınavIndex + 1) + " . sınav");


        }

        scanner.close();
    }

}
