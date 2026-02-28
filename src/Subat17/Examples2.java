package Subat17;

import java.util.Scanner;

public class Examples2 {
    public static void main(String[] args) {


        System.out.println("---------Soru4--------");
        // Kullanıcıdan isim ve yaş al. Yaş >=18 ve isim boş değilse "Kayıt OK" yazsın.

        System.out.print("Lütfen isminizi giriniz: ");
        Scanner isimVer =  new Scanner(System.in);
        String isim = isimVer.nextLine();

        System.out.print("Lütfen yaşınızı giriniz: ");
        Scanner yasVer =  new Scanner(System.in);
        int yas = yasVer.nextInt();


        if (yas >= 18 && !isim.isEmpty()) {
            System.out.println("Kayıt OK");
        } else {
            System.out.println("Kayıt Başarısız");

        }

        System.out.println("---------Soru5--------");
        // Kullanıcıdan bir kelime al. İlk ve son karakter aynı ise "AYNI" yaz.
        Scanner kelimeAl = new Scanner(System.in);
        String kelime = kelimeAl.nextLine();

        if (kelime.length() >= 1 && kelime.charAt(0) == kelime.charAt(kelime.length() - 1)) {
            System.out.println("AYNI");

        } else {
            System.out.println("AYNI DEĞİL");
        }


        System.out.println("---------Soru6--------");
        //  Kelime al. "a" yoksa "YOK" , varsa indeksini yazdır.

        Scanner kelimeAl2 = new Scanner(System.in);
        String kelime2 = kelimeAl2.nextLine();



        if (!kelime2.contains("a")) {
            System.out.println("YOK");
        } else {
            System.out.println(kelime2.indexOf("a"));

        }


        System.out.println("---------Soru7--------");
        // Cümle al, sonunda nokta yoksa nokta ekle.

        Scanner cümleAl = new Scanner(System.in);
        String cümle = cümleAl.nextLine().trim();

        if (!cümle.endsWith(".")) {
            cümle = cümle + ".";
            System.out.println(cümle);
        }

        System.out.println("---------Soru8--------");
        // Kelime al. Uzunluğu < 3 ise "Kısa" , değilse ilk 3 harfi yazdır.

        Scanner kelimeAl3 = new Scanner(System.in);
        String kelime3 = kelimeAl3.next();



        if (kelime3.length() < 3) {
            System.out.println("KISA");

        } else {
            System.out.println(kelime3.substring(0,3));
        }

        System.out.println("---------Soru9--------");
        // Kullanıcıdan iki tane sayı al. (+,-,*) işlem bilgisini al ve işlem sonucunu yazdır.

        System.out.print("Sayı1: ");
        Scanner sayı1 = new Scanner(System.in);
        int sayı11 = sayı1.nextInt();


        System.out.print("Sayı2: ");
        Scanner sayı2 = new Scanner(System.in);
        int sayı22 = sayı1.nextInt();

        System.out.println("Yapmak istediğiniz işlemi yazınız: ");
        Scanner islemNe =   new Scanner(System.in);
        String islemNek = islemNe.nextLine();

        if (islemNek.equals("+")) {
            System.out.println("Toplam: " + (sayı11 + sayı22));

        } else if (islemNek.equals("-")) {
            System.out.println("Çıkarma: " + (sayı11 - sayı22));

        } else if (islemNek.equals("*")) {
            System.out.println("Çarpma: " + (sayı11 + sayı22));
        } else {
            System.out.println("Yanlış işlem girildi");

        }


        System.out.println("---------Soru10--------");
        // İki kelime al. Hangisi daha uzunsa onu yazdır. Eşitse "Eşit" yaz.

        System.out.print("Kelime1: ");
        Scanner ikiKelime = new Scanner(System.in);
        String ikiKelime1 = ikiKelime.nextLine();

        System.out.println("Kelime2: ");
        String ikiKelime2 = ikiKelime.nextLine();


        if (ikiKelime1.equals(ikiKelime2)) {
            System.out.println("Eşit");
        } else if (ikiKelime1.length() < ikiKelime2.length()) {
            System.out.println(ikiKelime2);
        } else {
            System.out.println(ikiKelime1);
        }



        System.out.println("---------Soru11--------");
        // "Ad Soyad" al. Boşluk yoksa "Soyad Yok" , varsa soyadını ekrana yazdır.

        Scanner soyadAl = new Scanner(System.in);
        String soyad = soyadAl.nextLine().trim();

       int index = soyad.indexOf(' ');

       if (index == -1) {
           System.out.println("Soyad Yok");
       } else {
           System.out.println(soyad.substring(index + 1));
       }




    }
}
