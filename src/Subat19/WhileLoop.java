package Subat19;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {


        /***
         * while (koşul) {
         *      // tekrar edecek kod bloğu
         * }
         *
         *koşul true olduğu sürece döngü çalışmaya devam eder
         *
         */



        int i = 1;

        while (i < 5) {
            System.out.println(i);
            i++;
        }
        //Koşul sağlanana kadar bu döngüyü devam ettirecektir.
        System.out.println(i); // burada en son değeri 5 olduğundan burada 5 yazar.


        Scanner scanner = new Scanner(System.in);
        String password = "1234";
        System.out.println("Şifre girin: ");
        String sifre = scanner.next().trim();


        while (!sifre.equals(password)) {
            System.out.println("Girilen şifre hatalıdır, tekrar deneyiniz.");
            System.out.print("Sifre girin: ");
            sifre = scanner.next().trim();

        }
        System.out.println("Giriş başarılı.");





    }
}
