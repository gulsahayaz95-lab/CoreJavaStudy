package Mart18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodÖrnekleri {
    public static void main(String[] args) {


        //kullanıcıdan alınan sayının
        //tek veya çift mi olduğunu bulan bir method yazalım.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı girin: ");
        int sayı = scanner.nextInt();

        /*
        if (sayı % 2 == 0) {
            System.out.println("Sayı çifttir.");
        } else {
            System.out.println("Sayı tektir.");
        }
         */


        List<Boolean> sayılarınDurumu = new ArrayList<>();
        
        for (int index = 1; index <= 5; index++) {
            System.out.println(index + ". sayıyı girin: ");
            int number = scanner.nextInt();
            boolean result = ciftMi(number);
            sayılarınDurumu.add(result);

        }

        for (boolean sonuc: sayılarınDurumu) {
            if (sonuc) {
                System.out.println("Sayı çifttir.");
            } else {
                System.out.println("Sayı tektir.");
            }
        }

    }

    public static boolean ciftMi (int sayı) {
        if (sayı % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }





}
