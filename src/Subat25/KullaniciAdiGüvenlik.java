package Subat25;

import java.util.Scanner;

public class KullaniciAdiGüvenlik {
    public static void main(String[] args) {


        /***
         * Kullanıcıdan bir kullanıcı adı al,
         * Baş ve son boşlukları temizle,
         * Temizledikten sonra boşsa uyarı ver ve bitir,
         * Kullanıcı adını tek tek gezip:
         * büyük harf, küçük farf, rakam sayılarını bul ve yazdır,
         * Eğer en az 1 büyük + 1 küçük + 1 rakam ve
         * uzunluk >= 8 ise "güçlü" , değilse "zayıf" yazdır,
         * İlk karaktere göre kategori yazdır: A-E, F-K, L-R, S-Z, Diğer.
         *
         */


        Scanner input = new Scanner(System.in);
        String kullanıcıAdı = input.nextLine().trim();

        if (kullanıcıAdı.isEmpty()) {
            System.out.println("Kullanıcı adı boş olamaz.");

        } else {
            //her değişken türü int olduğundan tek satırda yazabildik
            int upper = 0, lower = 0, digit = 0;

            for (int i = 0; i < kullanıcıAdı.length(); i++) {
                char ch = kullanıcıAdı.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    upper++;

                } else if (ch >= 'a' && ch <= 'z') {
                    lower++;

                } else if ( ch >= '0' && ch <= '9') {
                    digit++;
                }
            }

            System.out.println("Büyük harf sayısı: " + upper);
            System.out.println("Küçük harf sayısı: " + lower);
            System.out.println("Rakam sayısı: " + digit);


            if (kullanıcıAdı.length() >= 8
                    && upper >= 1
                    && lower >= 1
                    && digit >= 1) {
                System.out.println("Kullanıcı adı güçlü");

            } else {
                System.out.println("Kullanıcı adı zayıf");

            }



            String group= "";

            //kullanıcı ilk harfi büyük girme olasılığına karşı tüm kullanıcıadı küçülttük
            //çünkü biz küçük harflere göre gruplama yapıyoruz burada

            kullanıcıAdı = kullanıcıAdı.toLowerCase();
            char first = kullanıcıAdı.charAt(0);


            if (first >= 'a' && first <= 'e') {
                group = "a-e";

            } else if (first >= 'f' && first <= 'k') {
                group = "f-k";

            } else if (first >= 'l' && first <= 'r') {
                group = "l-r";

            } else if (first >= 's' && first <= 'z') {
                group = "s-z";

            } else {
                System.out.println("Diğer");
            }


            switch (group) {
                case "a-e":
                    System.out.println("Kategori: A-E Grubu");
                    break;
                    case "f-k":
                        System.out.println("Kategori: F-K Grubu");
                        break;
                        case "l-r":
                            System.out.println("Kategori: L-R Grubu");
                            break;
                            case "s-z":
                                System.out.println("Kategori: S-Z Grubu");
                                break;
                default:
                        System.out.println("Diğer");
            }












        }



















    }
}
