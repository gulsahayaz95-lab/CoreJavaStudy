package Subat12;

public class DataTypes {
    public static void main(String[] args) {

        /**
         * Bilgisayar her bir veriyi 0 veya 1 olarak saklar.
         * Data types (Veri Tipleri) bu 0/1 leri yorumlamak için bulunur.
         * 'A', "Gulsah", 1, 1.4646, dogru gibi kelimelerin hiçbirinden bir şey anlamaz.
         *
         * Java'da 2 grupta veri tipleri toplanır:
         * 1) Primitive (ilkel) veri tipleri,
         * 2) Nonprimitive (Referans) veri tipleri
         **/

        // 1) Primitive (İlkel) Veri Tipleri

        //Sayılar için olan veri tipleri:

        byte b = 1; //1 byte
        short s = 2;
        int i = 10;
        float f = 12.23f;
        double d = 13.89877;
        long l = 9000000L;

        //Harf için olan veri tipleri:

        char c = 'A'; // 01000001 eger bu char ise karşılığı 'A' fakat int ise karşılığı 65 olur.

        //Dogru ve yanlis ifadeler için veri tipleri:

        boolean dogru = true;
        boolean yanlis = false;  // boolean veri tipi yalnızca iki değer alır.

        // 2) Nonprimitive (Referans) Veri Tipleri

        //Bunlar sınıflardır (class). String, Array, Scanner, List, kendi oluşturduğumuz classlar...


        String name = "Gulsah";
        int[] numbers = {1,2,3}; // Bu bir Array yapısıdır, içinde birden fazla int sayı tutabilir.



    }
}
