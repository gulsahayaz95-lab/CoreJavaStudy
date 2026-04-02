package Subat24;

import jdk.nashorn.api.scripting.URLReader;

import java.util.Scanner;

public class TelefonNumarasiMaskeleme {
    public static void main(String[] args) {

        /***
         * Kullanıcıdan telefon numarası alın (String): "0555-123-45-67" ve "-" veya boşluk karakterini kaldırın.
         * Uzunluk 11 değilse hata yazdırın.
         * İlk 4 haneye göre operatör yazdırın.
         * (örn: 0555-OperatörA , 0533-OperatörB, diğer=bilinmiyor.)
         * Numaranın içinde kaç tane 5 olduğunu sayın.
         * 5 sayısı 4'ten fazlaysa "çok tekrar var" uyarısı yazdırın.
         * Maskeli formatta yazdırın: 0555****567 gibi.
         *
         */


        Scanner input = new Scanner(System.in);

        String telNumara;





            do {
                System.out.println("Lütfen telefon numaranızı giriniz: ");
                telNumara =  input.nextLine().trim();
                telNumara = telNumara
                        .replace(" ", "")
                        .replace("-", "")
                        .replace("/", "");

                 if (telNumara.length() != 11) {
                     System.out.println("Tel no 11 haneli olmalı");
                 }

            } while (telNumara.length() != 11);  //girilen tel 11 ve üzeri sayı içeriyorsa false olur döngü biter.





            String prefix = telNumara.substring(0, 4);
            String operatör;

            switch (prefix) {
                case "0555":
                    operatör = "OperatörA";
                    break;
                case "0533":
                    operatör = "OperatörB";
                    break;
                default:
                    operatör = "Bilinmeyen operatör";
                    break;

            }


            int count = 0;

            // sayaçla 5 leri sayabiliriz bu da for döngüsüdür

            for (int i = 0; i < telNumara.length(); i++) {
                if (telNumara.charAt(i) == '5') {
                    count++;

                }
            }


        System.out.println("Operatör: " + operatör);
        System.out.println("Tel no içerisindeki 5 miktarı: " + count);


        if (count > 4) {
            System.out.println("Çok fazla tekrar eden 5 var.");
        }



        String masked = telNumara.substring(0,4) + "****" + telNumara.substring(8);
        System.out.println("Masked tel no: " + masked);


    }
}
