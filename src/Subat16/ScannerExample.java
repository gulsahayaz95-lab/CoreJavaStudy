package Subat16;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        String a = "Gulsah";
        int age = 30;
        double motor = 2.4;
        // Bu atamaları kendimiz yapıyorduk, kullanıcı tarafından ataması yapılması için scanner kullanılacak.


        Scanner scanner = new Scanner(System.in);
        // System.in -> Kullanıcının veri girişine izin verir.

        System.out.println("Öğrencinin ismini girin");
        String name = scanner.next();  // -> kullanıcının klavyede yazdığı yazıyı alır

        System.out.println("Öğrencinin yaşını girin");
        int age1 = scanner.nextInt(); // -> kullanıcının klavyede yazdığı sayıyı alır

        System.out.println("Öğrencinin ismi: " + name + " Öğrencinin yaşı: " + age1);



        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String name1 = scanner1.next();

        System.out.println("Lütfen yaşınızı giriniz");
        int age2 = scanner1.nextInt();

        System.out.println("İsminiz: " + name1 + " Yaşınız:" + age2);


        System.out.print("1. Sayı:");
        int sayı1 = scanner.nextInt();

        System.out.print("2. Sayı:");
        int sayı2 = scanner.nextInt();

        System.out.println("Toplam: " + (sayı1 + sayı2));


        // String için 2 scanner methodu bulunur.
        // birinde tek kelime yazıldıktan sonra diğerinde ise cümle kurduktan sonra yazılır
        // String kelime = scanner.next()
        // String cümle = scanner.nextLine()


        // Sayılar için scanner;
        int aa = scanner.nextInt();
        double b = scanner.nextDouble();
        long l = scanner.nextLong();

        //Boolean - True False için;
        boolean isActive = scanner.nextBoolean();

        /**
         * Scanner kullanımında dikkagt edilmesi gereken nokta:
         * sayısal bir değer girdikten sonra imleç enter ile aşağıya inmez
         * bu nedenle nextLine i direkt kullanırsak enter görevi görür
         * yeni cümle yazmamıza izin vermez, bu sebeple sayısal girişlerden sonra
         * değişkene atama yapmadan nextLine kullanmamız gerekir
         *
         * int number = scanner.nextInt()
         * scanner.nextLine() -> buffer temizleme, enter tuşu görevi görür mutlaka int sonrası eklenir
         * String name = scanner.nextLine()
         *
         * nextInt() ya da nextDouble() kullanırken ya klavyeden abc diye bir şey yazarsam?
         * Hata verir -> InputMisMatchException (yanlış veri tipi girişi oldu)
         */


        scanner.close();
        // Klavyeden giriş için başta açmıştık.
        // Bu son satır ile klavyeden girişi de kapatmış oluyoruz.
        // buradan itibaren arka veya ön planda yazılan hiçbir şey çalışmaz ve girilemez.



    }
}
