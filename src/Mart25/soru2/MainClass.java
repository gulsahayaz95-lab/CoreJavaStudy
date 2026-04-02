package Mart25.soru2;

public class MainClass {
    public static void main(String[] args) {

        /**
         * Bir hesaplama sınıfı oluşturun,
         * kupAl() adında static bir method yazın,
         * Bu method şu işi yapsın;
         * Girilen sayının küpünü bulsun,
         * Nesne oluşturmadan bu methodu çağırıp kullanabilelim.
         *
         */

        int sonuc = Hesaplama.kupAl(4);
        System.out.println("Sonuç: " + sonuc);

        System.out.println("-JAVA- 4 ve 5'ten büyük olan: " + Math.max(4,5));
        System.out.println("-BİZİMKİ- 4 ve 5'ten büyük olan: " + Hesaplama.max(4,5));









    }
}
