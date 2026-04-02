package Mart24.soru4;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {


        /**
         * Kullanıcıdan 5 tane kitap bilgisi alın,
         * Kitap sayfa sayısı 200 den fazla olanları ekrana yazdırın,
         * Kitabın yazarlarını ayrıca yazdırın.
         */

        Scanner scanner=new Scanner(System.in);
        Kitap[] kitap=new Kitap[5];

        for (int index = 0; index <= 5; index++) {

            kitap[index]=new Kitap();

            System.out.println((index + 1) + ". kitap ismi: ");
            kitap[index].adi = scanner.nextLine().trim();

            System.out.println((index + 1) + ". kitap yazarı: ");
            kitap[index].yazar = scanner.nextLine().trim();

            System.out.println((index + 1) + ". kitap sayfası: ");
            kitap[index].sayfaSayisi = scanner.nextInt();
            scanner.nextLine();

        }


        for (int i = 0; i < kitap.length; i++) {
            if (kitap[i].sayfaSayisi > 200 ) {
                System.out.println("Sayfa sayısı 200den fazla: " + kitap[i].sayfaSayisi);
            }
        }



        for (int i = 0; i < kitap.length; i++) {
            System.out.println(kitap[i].yazar);
        }



    }
}
