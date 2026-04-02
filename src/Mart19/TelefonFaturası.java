package Mart19;

public class TelefonFaturası {

    public static int toplamHesapla(int dakika) {
        return dakika * 2;
    }

    public static void indirimKontrolEt(int toplamTutar) {
        if (toplamTutar <= 1000) {
            System.out.println("İndirim kazandınız.");
        } else {
            System.out.println("İndirim yok.");
        }
    }

    public static void faturaYazdir(String isim, int dakika) {
        int toplamTutar = toplamHesapla(dakika);

        System.out.println("------Fatura Bilgileri-----");
        System.out.println("Isim: " + isim);
        System.out.println("Dakika: " + dakika);
        System.out.println("Toplam tutar: " + toplamTutar);
        indirimKontrolEt(toplamTutar);
        System.out.println();
    }


    public static void main(String[] args) {

        faturaYazdir("Gülşah", 200);
        faturaYazdir("Edibe", 380);

    }
}
