package Subat11;

public class Printf {
    public static void main(String[] args) {

        /**
         * print () -> ieçrisindeki yazıyı yazıp imleci orada bırakıyoruz
         * println () -> imleç yazı sonunda bir alt satıra iner
         * printf () -> ekrana formatlı şekilde yazılar yazmamızı sağlar. Otomatik olarak alt satıra inmez.
         * Eğer alt satıra inmek istersek \n veya %n kullanılır.
         */


        String ad = "Gülşah";
        int yas = 30;

        System.out.printf("Ad: %s,Yas: %d" , ad, yas);
        // %s yazılar için,
        // %d digit yani sayılar için kullanılır.

        System.out.printf("%nAd: %s, %nYas: %d" , ad, yas);
        // hangi kelimeden başlayarak alt satıra inmesini istersem onun başına %n yazmalıyım

        // Genişlik verme için [%sayıd] kullanılır.
        System.out.printf("%n[%5d]", 7);

        System.out.printf("%n[%5d]", 123);
        // %5 demek 5 adet boşluk demek değildir, parantez içerisinde 5 sayılık boşluk koy demektir.

        //Sayıyı sola yaslamak için;
        System.out.printf("%n[%-5d]", 7);

        // Ondalıklı sayı kontrolü için;
        System.out.printf("%nOrtalama %f", 10.34567);
        System.out.printf("%nOrtalama %.2f", 10.34567);  // Virgülden sonraki 2 sayıya kadar yuvarlayıp alır.

        // Yazı hizalama, tablolama;
        System.out.printf("%n%-10s %-10s %-10s", "Ad", "Soyad", "Sehir");
        System.out.printf("%n%-10s %-10s %-10s", "Gulsah", "Ayaz", "Izmir");


    }
}
