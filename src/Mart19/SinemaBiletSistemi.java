package Mart19;

public class SinemaBiletSistemi {

    public static boolean indirimVarMı(int toplam) {
        return toplam > 250;
    }


    public static void biletBilgisiYazdir(String isim, int adet, int birimFiyat) {
        int toplam = adet *  birimFiyat;

        System.out.println("------Bilet Bilgileri------");
        System.out.println("İsim: " + isim);
        System.out.println("Bilet adeti: " + adet);
        System.out.println("Bilet birim fiyat: " + birimFiyat);
        System.out.println("Toplam ücret: " + toplam);
        System.out.println();

        if (indirimVarMı(toplam)) {
            double indirimli = toplam * 0.95;
            System.out.println("İndirim kazandınız!");
            System.out.println("İndirimli fiyat: " + indirimli);
            System.out.println();
        }


    }


    public static void main(String[] args) {


        biletBilgisiYazdir("Ali", 2, 90);
        biletBilgisiYazdir("Ayşe", 5, 120);

    }
}
