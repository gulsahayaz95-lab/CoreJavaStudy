package Subat12;

public class Casting {
    public static void main(String[] args) {

        /**
         * Küçükten büyüğe doğru;
         * byte-> short-> int-> long-> float-> double
         *Widening (otomatik)
         **/
        int number = 12;
        double number2 = number; //Otomatik olarak küçük olan veriyi büyük veri tipine atadım.


        /**
         * Narrowing (Manuel)
         *
         **/

        double x = 10.9;
        int y = (int) x; // double olan değişkeni inte çevirip y değişkenine atama yaptım.
        // her zaman güvenli değildir, veri kaybına sebep olan bir casting

        // Overflow/Underflow (Taşma)
        int bigNumber = 130;
        byte b = (byte) bigNumber;
        // byte -> -128 127 arasındaki sayıları tutabilir.
        // 130 sığmaz, Casting hata çözmez fakat hatayı saklar.


        // String olan bir veriyi sayıya çevirmek-dönüştürmek:
        String sNumber = "123";  //sNumber değişkeni 123 yazısını tutar.
        int iNumber = Integer.parseInt(sNumber);
        // iNumber değişkeni artık 123 sayısı oldu.


        String sdNumber = "124.45"; //sdNumber değişkeni 124.45 yazısını tutar.
        double dNumber = Double.parseDouble(sdNumber);
        // dNumber değişkeni artık 124.45 ondalık sayısı oldu.


        String sIsTrue = "True";
        boolean isTrue = Boolean.parseBoolean(sIsTrue);

        int a = 23;
        String sa = String.valueOf(a);
        // sa değişkeni artık sayı değil yazı olarak "23" yazmış oldu.


        double d = 23.34;
        String sd= String.valueOf(d);


        //Hatalı kullanımlar;

        String s = "12a"; // Sadece sayı olsaydı alabilirdi fakar "a" olduğundan alamıyor.
        int n = Integer.parseInt(s);

        /**
         * "123" hata almaz
         * " 123" hata alınır   -boşluk var
         * "123.0" integer parse olmaz double kullanılması lazım
         **/






    }
}