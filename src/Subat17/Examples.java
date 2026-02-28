package Subat17;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        System.out.println("---------Soru1--------");
        // Kullanıcıdan isim al.İlk harfi büyük, diğerleri küçük yazsın.

        System.out.print("Lütfen isminizi giriniz: ");
        Scanner scanner = new Scanner(System.in);
        // Kullanıcı tarafından manuel veri girişi için kullanılır

        String name = scanner.nextLine().trim();
        //Scanner sonrası buffer temizleme, enter tuşu yerine kullanılır.
        //Trim ise boşlukları silmesi için eklendi.
        //Tam bir cümle veya iki isim olabileceği için nextLine kullandık

        String formatName = name.substring(0, 1).toUpperCase() +
                name.substring(1).toLowerCase();

        System.out.println("İsminiz:" + formatName);


        /**
         * Öncelikle bir talep veya ekrana iletilecek bir yazı varsa
         * sout
         * ardından kullanıcıdan veri girişi için
         * Scanner scanner = new Scanner(System.in);
         * Ardından buffer görevi görmesi için ve tek kelimelik cevap değilse
         * String name = scanner.nextLine();
         * Ardından istenen formatı girebiliriz
         *
         * Scanner scanner = new Scanner(System.in);
         * String name = scanner.nextLine()
         */

        System.out.println("Benzer örnek 1.1 ");

        // Kullanıcıdan okul ismi al.İlk harfi büyük, diğerleri küçük yazsın, boşlukları sil.

        System.out.print("Lütfen okulunuzun ismini giriniz: ");
        Scanner scanner1 =new Scanner(System.in);
        String okulİsim =scanner.nextLine();

        String okulFormatı = okulİsim.substring(0,1).toUpperCase() +
                okulİsim.substring(1).toLowerCase();

        System.out.println("Okulunuzun ismi: " + okulFormatı);


        System.out.println("---------Soru2--------");

        //Kullanıcıdan şifre al. Uzunluk < 8 ise "Zayıf", değilse "Güçlü" yazsın.

        Scanner scanner2 =new Scanner(System.in);
        String password = scanner.nextLine();

        if (password.length() < 8) {
            System.out.println("Zayıf");
        } else {
            System.out.println("Güçlü");
        }


        System.out.println("---------Soru3--------");
        // Kullanıcıdan mail al, @ yoksa geçersiz mail yaz varsa ok yazsın.

        Scanner scanner3 =new Scanner(System.in);
        String mail =  scanner.nextLine();

        if (mail.contains("@")) {
            System.out.println("OK");

        } else {
            System.out.println("Geçersiz mail adresi girdiniz.");
        }







    }
}
