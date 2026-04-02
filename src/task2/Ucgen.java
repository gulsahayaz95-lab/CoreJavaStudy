package task2;

import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.print("1. kenarı giriniz: ");
                double a = input.nextDouble();

                System.out.print("2. kenarı giriniz: ");
                double b = input.nextDouble();

                System.out.print("3. kenarı giriniz: ");
                double c = input.nextDouble();

                // Önce üçgen geçerli mi kontrol edilir
                if (a + b > c && a + c > b && b + c > a) {

                    System.out.println("Geçerli bir üçgendir.");

                    // Tür belirleme
                    if (a == b && b == c) {
                        System.out.println("Eşkenar Üçgen");
                    }
                    else if (a == b || a == c || b == c) {
                        System.out.println("İkizkenar Üçgen");
                    }
                    else {
                        System.out.println("Çeşitkenar Üçgen");
                    }

                } else {
                    System.out.println("Geçersiz üçgen! Bu kenarlarla üçgen oluşmaz.");
                }

                input.close();

    }
}
