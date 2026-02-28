package Subat19;

import java.util.Scanner;

public class Asansor {
    public static void main(String[] args) {

        /***
         * Bulunduğun kat 1, hedef katı kullanıcıdan alıyoruz.
         * 1'er 1'er artsın ve her adımda kaçıncı katta olduğunu belirtsin.
         */


        int bulunduguKat = 1;

        System.out.print("Lütfen gitmek istediğiniz kat sayısını belirtiniz: ");
        Scanner hedefKatSor = new Scanner(System.in);
        int hedefKat = hedefKatSor.nextInt();

        while (bulunduguKat < hedefKat) {
            bulunduguKat++;
            System.out.println("Bulunduğunuz kat: " + bulunduguKat);

        }
        System.out.println("Bulunduğunuz kata ulaştınız. " + hedefKat + ". kattasınız.");




    }
}
