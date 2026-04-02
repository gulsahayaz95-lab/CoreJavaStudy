package Mart30.enums;

public class MainClass {
    public static void main(String[] args) {
        Gun bugun = Gun.PAZARTESİ;

        System.out.println(bugun);





        TrafikIsiklari isik = TrafikIsiklari.SARI;

        if (isik == TrafikIsiklari.KIRMIZI) {
            System.out.println("dur");
        } else if (isik == TrafikIsiklari.SARI) {
            System.out.println("hazırlan");
        } else {
            System.out.println("geç");
        }






        Mevsimler mevsim = Mevsimler.YAZ;

        switch (mevsim) {
            case YAZ:
                System.out.println("sıcak");
                break;
            case KIŞ:
                System.out.println("soğuk");
                break;
            case İLKBAHAR:
                System.out.println("bahar");
                break;
            case SONBAHAR:
                    System.out.println("sonbahar");
                    break;
        }


        System.out.println("----------------");
        KahveBoyutu boyut = KahveBoyutu.BUYUK;

        System.out.println("Kahve boyutu: " + boyut);
        System.out.println("Fiyatı: " + boyut.fiyat);


        System.out.println("----------------");

        SiparisDurumu durum = SiparisDurumu.KARGODA;
        System.out.println("SiparisDurumu: " + durum.aciklama);


        System.out.println("-----------------");


        Yon secim = Yon.GUNEY;
        System.out.println("Yon: " + secim);
        System.out.println("Açıklaması: " + secim.yon);










    }




}
