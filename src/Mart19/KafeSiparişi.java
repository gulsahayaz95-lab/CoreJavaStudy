package Mart19;

public class KafeSiparişi {

    public static int toplamHesapla(int birimFiyat, int adet) {;
        return birimFiyat * adet;
      }


    public static void siparisYazdir(String icecek, int adet, int birimFiyat) {
        int toplam = toplamHesapla(birimFiyat, adet);
        System.out.println("-----Fiş----");
        System.out.println("İçecek: " + icecek);
        System.out.println("Adet: " + icecek);
        System.out.println("1 içecek fiyatı: " + birimFiyat);
        System.out.println("Toplam fiyat: " + toplam);
    }



    public static void main(String[] args) {


        siparisYazdir("Kahve", 2, 45);
        siparisYazdir("Cay", 4, 20);
        siparisYazdir("Sıcak Çikolata", 3, 50);
        siparisYazdir("Limonata", 5, 43);



    }
}
