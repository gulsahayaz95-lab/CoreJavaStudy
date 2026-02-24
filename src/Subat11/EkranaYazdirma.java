package Subat11;

public class EkranaYazdirma {
    /**
     * Camel case nedir?
     * Class isimlendirmelerinde kelimelerin ilk harfleri büyük harfle başlar
     * _ ve & gibi ifadeler kullanmayız bunun yerine ikinci kelimeye büyük harf ile başlanır
     **/

    public static void main(String[] args) {
        /**
         * main method javada startın verildiği yerdir
         * kodlar bu main method içerisind olmalı ki çalışsın.
         * javada kodlar sırayla okunur.
         **/

        System.out.println("Hello World");  // Ekrana yazı yazdırmamı sağlar, bir sonraki cümle ile arasında boşluk var.
        System.out.print("Hello World");  //Ekrana yazdırmamı sağlar fakat bir sonraki cümle ile boşluk yok, bitişik devam.
        System.out.println("Merhaba Dünya");
        System.out.println("howyoudoin");

        /**
         * String (yazılar) için kullanacağımız özel karakterler, fazla satırdan kaçınılması için kullanılabilir,
         * \n -> yeni satır
         * \t -> tab boşluğu oluşturur
         * \" -> yazılan yazının başına çift tırnak ekler
         * \' -> tek tırnak ekler
         * \\ -> ters slahsten bir tane ekler
         */

        System.out.println("Satır1\nSatır2");  // Satır 2 bir alt satıra yazılacak
        System.out.println("Ad\tSoyad");
        System.out.println("O dedi ki: \"Merhaba Dünya\"");



    }



}
