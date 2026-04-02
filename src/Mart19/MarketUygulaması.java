package Mart19;

public class MarketUygulaması {


    public static void urunBilgisiYazdır(String urun, double fiyat, int adet) {
        System.out.println("-----Ürün Bilgileri-----");
        System.out.println("Ürün adı: " + urun);
        System.out.println("Ürün fiyatı: " + fiyat);
        System.out.println("Ürün miktarı: " + adet);
    }

    public static double tutarHesapla(double fiyat, int adet) {
            return fiyat * adet;
    }



     public static void indirimHesapla(double toplam) {
        if (toplam > 100) {
            double indirimli = toplam * 0.9;
            System.out.println("İnidirim uygulandı.");
            System.out.println("İndirimli toplam fiyat: " + indirimli);
        } else {
            System.out.println("İndirim yoktur.");
            System.out.println("Toplam fiyat: " + toplam);
        }
     }


    public static void main(String[] args) {

        String urun1 = "Elma";
        double fiyat1 = 23.5;
        int adet1 = 5;


        String urun2 = "Kivi";
        double fiyat2 = 45.5;
        int adet2 = 3;


        urunBilgisiYazdır(urun1, fiyat1, adet1);
        urunBilgisiYazdır(urun2, fiyat2, adet2);


        double tutar1 = tutarHesapla(fiyat1, adet1);
        double tutar2 = tutarHesapla(fiyat2, adet2);

        System.out.println("1. ürün toplam fiyatı: " + tutar1);
        System.out.println("2. ürün toplam fiyatı: " + tutar2);

        double genelToplam = tutar1 + tutar2;
        indirimHesapla(genelToplam);


















    }
}
