package task4;

import java.util.Scanner;

public class SuyunHalleri {
    public static void main(String[] args) {

        // Scanner oluştur
        Scanner scanner =  new Scanner(System.in);

        // Kullanıcıdan sıcaklık al
        System.out.print("Su sıcaklığını giriniz (°C): ");
        int suSicakligi = scanner.nextInt();

        // Suyun halini belirle

        if (suSicakligi < 0) {
            System.out.println("Su katı haldedir.");

        } else if (suSicakligi <= 100) {
            System.out.println("Su sıvı haldedir.");
        } else {
            System.out.println("Su gaz halindedir.");
        }

        scanner.close();




    }
}
