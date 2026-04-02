package Mart19;

public class OgrenciNotSistemi {

    public static void ogrenciBilgisiYazdir(String ogrenci, int not) {
        System.out.println("---------Öğrenci Bilgileri---------");
        System.out.println("Öğrenci adı: " + ogrenci);
        System.out.println("Öğrenci notu: " + not);
    }

    public static void sınavDurumu(String ogrenci, int not) {
        if (not <= 50) {
            System.out.println();
            System.out.println(ogrenci + " sınavı geçti");
        } else {
            System.out.println();
            System.out.println(ogrenci + " sınavdan kaldı");
        }
    }

    public static void main(String[] args) {

        String ogrenci1 = "Mehmet";
        int not1 = 99;

        String ogrenci2 = "Ahmet";
        int not2 = 87;


        ogrenciBilgisiYazdir(ogrenci1, not1);
        ogrenciBilgisiYazdir(ogrenci2, not2);

        sınavDurumu(ogrenci1, not1);
        sınavDurumu(ogrenci2, not2);





    }
}
