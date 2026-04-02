package Mart24.soru1;

public class MainClass {
    public static void main(String[] args) {


        /**
         * Marka, model ve şarj yüzdesi bilgilerini tutan bir yapı oluşturun,
         * Bir telefon oluşturup  bilgilerini yazdırın,
         * Şarj yüzdesini 10 arttırıp tekrar yazdırın.
         *
         */


        Telefon telefon = new Telefon();
        telefon.marka = "Apple";
        telefon.model = "17 Pro Max";
        telefon.sarjYuzdesi = 40;


        System.out.println("İlk durum bilgileri: ");
        telefon.bilgileriniYaz();

        telefon.sarjiArttir();

        System.out.println("Şarj edildikten sonra: ");
        telefon.bilgileriniYaz();




    }
}
