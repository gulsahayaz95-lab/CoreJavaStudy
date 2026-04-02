package Mart18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodÖrnekleri_2 {
    public static void main(String[] args) {

        /**
         * Kullanıcıdan 5 tane ayrı ayrı isim ve soy isim alalım,
         * En sonunda bu isim ve soy isimleri tek bir satırda yazdıran bir method yazalım.
         *
         */


        Scanner scanner = new Scanner(System.in);

        List<String> tamİsimler = new ArrayList<>();

        for (int index = 1; index <= 5; index++) {
            System.out.println(index + ". isim");
            String isim = scanner.nextLine().trim();
            System.out.println(index + ". soy isim");
            String soyisim = scanner.nextLine().trim();

            String tamİsim = fullName(isim, soyisim);
            tamİsimler.add(tamİsim);

        }

        for (int index = 1; index <= 5; index++) {
            System.out.println(index + " kullanıcı isim ve soy ismi: " + tamİsimler.get(index));
        }




    }

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
