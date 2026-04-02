package Mart18;

import java.util.Scanner;

public class MethodKonuAnlatımı {

    public static void toplamYaz(int a, int b) {
        int toplam = a + b;
        System.out.println("Toplam: " + toplam);
    }

    public static void main(String[] args) {

        /**
         * Belirli bir işi yapan kod bloklarıdır.
         * Örn: 2 sayının toplamasını, yazdığımız kodun başında tanımladık,
         * Aynı şekilde bu toplama işlemini bu kodun ortasında veya sonunda tekrar yapmak istedik.
         * Tekrar eden, aynı olan kodları bir blok haline getirdiğimiz yapılardır.
         */

        //public static void toplamYaz(int a, int b) {
        //        int toplam = a + b;
        //        System.out.println("Toplam: " + toplam);
        //    }
        /// BUNU MAİN ÖNCESİNDE YAZIYORUZ!!!



        //kullanıcıdan veri almak istersek yine;
        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk sayıyı girin: ");
        int a = scanner.nextInt();

        System.out.println("İkinci sayıyı girin: ");
        int b = scanner.nextInt();

        toplamYaz(a, b);    //-> ile sonucu buraya getirdik.



        //erişim belirleyici-> public
        //static-> nesne oluşturmadan direkt methodu çağırır
        //void-> geri dönüş tipi
        //toplamYaz-> methodun adı
        //int a ve int b-> methodun parametreleri


        //methodlar main methodu dışında tanımlanır, kullanılmak istendeiğinde main method içerisinden ulaşılır.
        //en başa yazmak zorunda değiliz, kod sonunda da yazabiliriz, önemli olan main dışında yazılması.
















    }
}
