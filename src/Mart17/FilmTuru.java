package Mart17;

import java.util.*;

public class FilmTuru {
    public static void main(String[] args) {

        /**
         * Kullanıcıdan 10 kişinin sevdiği film türünü alalım,
         * Örnek:
         * aksiyon: ali, veli, ayşe, fatma...
         * Ali-aksiyon, komedi...
         * Ayşe-komedi, bilim-kurgu...
         * İstenenler;
         * Tür isimlerini düzenleyip aynı formata getirelim,
         * Hangi türün kaç kişi tarafından seçildiğini hesaplayalım,
         * Aynı türü seçen isimleri birlikte yazdıralım,
         * Sadece 1 kişi tarafından seçilen türleri yazdıralım,
         * İsminin içerisinde "e" harfi geçen kişileri ayrıca gösterelim,
         * En popüler türü bulalım ve o türü seçen tüm kişileri yazdıralım.
         *
         */

        Scanner scanner = new Scanner(System.in);

        //film türü -> key, isimler-> value
        Map<String, List<String>> kisilerVeFilmleri = new HashMap<>();


        //10 kişilik veri almak için;
        for (int index = 1; index <= 10; index++) {
            System.out.println(index + ". kullanıcı adı: ");
            String kisi = scanner.nextLine().trim().toLowerCase();


            System.out.println("Sevdiği film türü: ");
            String filmTürü = scanner.nextLine().trim().toLowerCase();


            if (!kisilerVeFilmleri.containsKey(filmTürü)) {
                kisilerVeFilmleri.put(filmTürü, new ArrayList<>());
            }


            kisilerVeFilmleri.get(filmTürü).add(kisi);


        }


        System.out.println("-----Türlere göre kişiler-----");
        for (Map.Entry<String, List<String>> entry : kisilerVeFilmleri.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


        System.out.println("-----Türleri izleyenlerin sayısı-----");
        for (Map.Entry<String, List<String>> entry : kisilerVeFilmleri.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().size());
        }
















    }
}
