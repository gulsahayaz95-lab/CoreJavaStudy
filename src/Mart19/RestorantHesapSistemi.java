package Mart19;

public class RestorantHesapSistemi {

    public static int toplamUcret(int adet, int birimFiyat) {
        return birimFiyat * adet;
    }

    public static boolean indirimVarmi(int toplam) {
        return toplam >=250;
    }

    public static void hesapYazdir(String urunadı, int adet, int birimFiyat) {
        int toplam = toplamUcret(adet, birimFiyat);
        System.out.println("-----Hesap Bilgileri-----");
        System.out.println("Ürün: " + urunadı);
        System.out.println("Adet: " + adet);
        System.out.println("Birim Fiyat: " + birimFiyat);
        System.out.println("Toplam ücret: " + toplam);

        if (indirimVarmi(toplam)) {
            double indirimli = toplam * 0.9;
            System.out.println("İndirim kazandınız!");
            System.out.println("İndirimli fiyat: " + indirimli);
            System.out.println();
        }

    }


    public static void main(String[] args) {

        hesapYazdir("Pizza", 3, 60);
        hesapYazdir("Döner", 2, 80);
        hesapYazdir("Kebap", 4, 100);
        hesapYazdir("Revani", 6, 30);

    }
}
