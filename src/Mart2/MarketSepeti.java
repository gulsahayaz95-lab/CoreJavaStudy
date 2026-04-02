package Mart2;

import java.util.Scanner;

public class MarketSepeti {
    public static void main(String[] args) {


        /**
         * Kullanıcıdan 5 ürün adı alın,
         * Her ürün adını temizleyin (boş/son boşluklar),
         * boş girilmişse tekrar isteyin,
         * Son olarak;
         * Girilen ürünleri sırayla yazdırın,
         * İçlerinde kaç tanesinde rakam geçtiğini bulun (örn: "Süt2")
         * Ürün adlarının ilk harfine göre şu sınıflandırmayı yapıp her ürün için yazdırın:
         * A-E / F-K / L-R / S-Z / Diğer
         *
         */


        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];
        int index = 0;

        String name = null;

        while (index < names.length) {  //kaç defa döneceğini bilmiyorum ama for sadece 5 defa dönerdi
            System.out.println("Ürün adı girin: ");
            name = scanner.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("ürün adı boş olamaz. Tekrar girin. ");
                continue;
            }

            names[index] = name;
            index++;

        }

        int rakamSayisi = 0;

        //ürünlerin sıra ile ismini yazdıralım
        System.out.println("Girilen ürünler: ");
        for (int i = 0; i < names.length; i++) {
            String n = names[i];

            System.out.println((i + 1) + " - " + n);

            for (int j = 0; j < n.length(); j++) {
                //names[0] = "Armut" -> length 5
                //names[1] = "Kivi" -> length 4
                char ch = n.charAt(j);


                if (ch >= '0' && ch <= '9') {  //bu koşul true ise ürün ismi içerisinde rakam var demektir.
                    rakamSayisi++;

                }


            }


        }

        System.out.println("Ürünler içerisinde geçen toplam rakam sayısı: " + rakamSayisi);









    }
}
