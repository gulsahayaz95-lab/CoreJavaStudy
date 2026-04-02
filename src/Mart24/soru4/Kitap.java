package Mart24.soru4;

public class Kitap {

    String adi;
    String yazar;
    int sayfaSayisi;

    void bilgileriYazdir(){
        System.out.println("Kitap ismi: " + adi);
        System.out.println("Yazarı: " + yazar);
        System.out.println("Sayfa sayısı: " + sayfaSayisi);

        if (sayfaSayisi > 200) {
            System.out.println("Sayfa sayısı 200'den fazladır.");
        }
        System.out.println();
    }




    void yazarlar() {
        System.out.println("-------Yazarlar------");
        System.out.println(yazar);
    }










}
