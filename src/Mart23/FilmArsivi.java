package Mart23;

import java.util.*;

public class FilmArsivi {

    public static List<String> filmListesi(String veri) {
        List<String> filmler = new ArrayList<>();

        String[] filmIsimleri = veri.split(",");

        for (String film : filmIsimleri) {
            film = film.trim();

            if (!film.isEmpty()) {
                //aynı isimde film olursa ikinci kez kaydetmemesi adına harf düzenleyelim;
                filmler.add(film.toUpperCase());
            }
        }

        return filmler;
    }


    public static Set<String> benzersizFilmler(List<String> filmler) {
        //buraya list verdiğimizde otomatik set e dönüştürür
        return new HashSet<>(filmler);
        /**
         * bu kullanım yukarıdaki ile aynı sonucu verir:
         * Set<String> benzersiz = new HashSet<>(filmler);
         * return benzersiz;
         */
    }

    public static String kategoriBilgisi(String kod) {
        //return ifadesi iki şekilde kullanılır
        //1. methodun döneceği değer
        //2. methodu o anda bitirmek için kullanılır
        switch (kod.toUpperCase()) {
            case "A":
                return "Bilim Kurgu";
            case "B":
                return "Dram";
            case "C":
                return "Aksiyon";
            default:
                return "Tanımsız";

        }
    }

    public static void main(String[] args) {


        /**
         * Bir sinema uygulamasında kullanıcıdan virgülle ayrılmış şekilde film listeleri alınır:
         * Örnek giriş;
         * Avatar, Inception, avatar, Interstellar, Joker, Joker
         * Program şunu yapmalıdır;
         * Film isimlerini uygun şekilde parçalayarak bir koleksiyona aktarsın,
         * Tekrar eden film isimlerini temizlesin,
         * Her film adının başında ve sonundaki boşlukları silsin,
         * Kullanıcıdan ayrıca bir kategori kodu alınsın,
         * A-> Bilim Kurgu
         * B-> Dram
         * C-> Aksiyon
         * diğer durumlar-> Tanımsız
         * Bir method film listesini düzenlesin,
         * Bir method tekrar edenleri kaldırsın,
         * Bir method kategori koduna göre tür açıklamasını döndürsün,
         * Son olarak ekrana temizlenmiş film listesi ve seçilen kategori yazdırılsın.
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Film isimlerini arada virgül olacak şekilde giriniz.");
        String veri =  scanner.nextLine().trim();


        System.out.println("Kategori kodu girin (A,B veya C): ");
        String kod = scanner.nextLine().trim();

        List<String> filmler = filmListesi(veri);

        Set<String> benzersizFilmler =  benzersizFilmler(filmler);

        String kategori = kategoriBilgisi(kod);

        System.out.println("Film listesi: " + filmler);
        System.out.println("Benzersiz film listesi: " + benzersizFilmler);
        System.out.println("Film konusu: " + kategori);


    }
}
