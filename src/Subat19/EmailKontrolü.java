package Subat19;

import java.util.Scanner;

public class EmailKontrolü {
    public static void main(String[] args) {

        /***
         * E-posta alın, boşlukları temizleyin, küçük harfe çevirin
         * "@" içermeli ve ".com" ile bitmeli,
         * "@" ilk karakter olamaz,
         * Doğru girilene kadar devam edin
         */



        Scanner emailSor = new Scanner(System.in);
        String email;

        //doğru olduğu sürece çalışsın demektir. ne girileceğini bilmediğin yerde kullan!!!
        while (true) {
            System.out.println("Email girin: ");
            email = emailSor.nextLine().trim().toLowerCase();

            int index = email.indexOf("@");

            if (index <= 0) {
                System.out.println("Mail @ ile başlayamaz ve mail içerisinde @ olmalıdır.");
                continue;   //kodu buradan tekrar yukarı gönderir


            }

            if (!email.contains("@") && !email.endsWith(".com")) {
                System.out.println("Mail @ içermeli ve .com bitmelidir.");
                continue;
            }


            System.out.println("Mail adresi doğru girildi: " + email);
            break;  //mail doğru girildiği için döngüyü kapatmış oldum



        }


























}



}
