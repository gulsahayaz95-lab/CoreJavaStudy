package Mart23;

import java.util.*;

public class KelimeAnalizAracı {




    public static List<String> kelimelereAyir(String veri) {
        List<String> kelimeler = new ArrayList<>();

        String[] parcalar = veri.split(" ");
        for (String parca: parcalar) {
            parca = parca
                    .trim()
                    .replace(".", "")
                    .replace(",", "")
                    .replace("!", "")
                    .toLowerCase();

            if (!parca.isEmpty()) {
                kelimeler.add(parca);
            }


        }
        return kelimeler;

    }



    public static Set<String> benzersiz(List<String> kelimeler) {
        return new LinkedHashSet<>(kelimeler);
    }


    public static void secimanalizi(int secim, List<String> kelimeler, Set<String> benzersiz, Scanner girdi) {
        switch (secim) {
            case 1:
                System.out.println("Kelimeler: " + kelimeler);
                break;
            case 2:
                System.out.println("Benzersiz kelimeler: " + benzersiz);
                break;
            case 3:
                System.out.println("Aranacak kelimeyi girin: ");
                String aranacak = girdi.nextLine().trim();
                System.out.println("Tekrar sayısı: " + kelimeSayisiBul(aranacak, kelimeler));
                break;
            case 4:
                System.out.println("Uzunluğu 4'ten büyük olan kelimeler: ");
                uzunKelimeler(kelimeler);
                break;
            default:
                System.out.println("Geçersiz seçim.");



        }
    }



    public static int kelimeSayisiBul(String aranacak, List<String> kelimeler) {
        int sayac = 0;
        for (String kelime: kelimeler) {

            if (kelime.equalsIgnoreCase(aranacak)) {
                sayac++;
            }

        }
        return sayac;
    }


    public static void uzunKelimeler(List<String> kelimeler) {
        for (String kelime: kelimeler) {
            if (kelime.length() > 4) {
                System.out.println(kelime);
            }
        }
    }

    public static void main(String[] args) {

        /**
         * Kullanıcı bir cümle giriyor, örnek giriş;
         * Java öğrenmek eğlencelidir ama Java pratik yapmadan öğrenilmez.
         * Programdan istenenler;
         * Cümleyi kelimelere ayırsım,
         * Tüm kelimeleri bir listede saklasın,
         * Aynı kelimeleri tekrarsız şekilde başka bir yapıda saklasın,
         * Her kelimeyi düzenleyip noktalama veya gereksiz boşlukları mümkün mertebe temizlesin,
         * Kullanıcıdan analiz tipi alınsın;
         * 1-> tüm kelimeleri yazdır,
         * 2-> tekrarsız kelimeleri yazdır,
         * 3-> belirli bir kelimenin kaç kez geçtiğini göster,
         * 4-> uzunluk 4'ten büyük olan kelimeleri yazdır,
         * Bu işlemlerin her biri methodlar ile çözülsün,
         * Özellikle bir method, verilen kelimenin listede kaç kez geçtiğini hesaplasın.
         *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle girin.");
        String cumle = scanner.nextLine().trim();


        List<String> kelimeler = kelimelereAyir(cumle);

        Set<String> benzersiz = benzersiz(kelimeler);

        System.out.print("1-4 arası bir seçim yapın: ");
        int secim = scanner.nextInt();

        scanner.nextLine();

        while (true) {
            System.out.println("1-4 arası bir seçim yapın: ");

            //girilen sayının tam sayı olup olmadığına bakmak için: hasNextInt();
            if (scanner.hasNextInt()) {
                secim = scanner.nextInt();
                scanner.nextLine();


                if (secim >= 1 || secim <= 4) {
                    secimanalizi(secim, kelimeler, benzersiz, scanner);
                    break;

                } else {
                    System.out.print("Lütfen 1-4 arası bir seçim yapın: ");
                }


            } else {
                System.out.println("Hatlı giriş yaptınız.");

                //hatalı girilen değeri silip yenisini almak için yazıyoruz;
                scanner.next();
            }

            System.out.print("1-4 arası bir seçim yapın: ");
            secim = scanner.nextInt();
            scanner.nextLine();

        }



    }
}
