package Subat16;

public class ArithmeticOperators {
    public static void main(String[] args) {


        /**
         * Java'da temel aritmetik operatörler:
         *
         * sayısal değerler için geçerlidir.
         *  + -> Toplama
         *  - -> Çıkarma
         *  * -> Çarpma
         *  / -> Bölme
         *  % -> Mod alma
         */

        int a = 10;
        int b = 3;

        System.out.println("Toplama: " + (a + b));
        System.out.println("Çıkarma: " + (a - b));
        System.out.println("Çarpma: " + (a * b));
        System.out.println("Bölme: " + (a / b));
        System.out.println("Mod alma: " + (a % b));


        int x = 5;
        double y = 2;
        System.out.println("Bölme Sonucu: " + (x / y));

        int n = 5;
        System.out.println(n++); // direkt olarak 5 yazar, ardından kendisinden sonra +1 ekler ve sonraki soruya geçer
        //yani aşağıdaki çıktı için n artık 5 değil 6 olur
        System.out.println(n); // 6

        int m = 5;
        System.out.println(++m); // öncelikle 1 ekler sonra yazar yani 5+1= 6 çıktısıdır, aşağıdakine 6 olarak geçer
        System.out.println(m); // 6

        int v = 10;
        v += 5;  // -> v= v + 5; ->15 bir sonraki soru için v artık 15 oluyor!!!!
        v -= 5;  // -> v= v - 5; ->10 bir sonraki soru için v artık 10 oluyor!!!!
        v *= 5;  // -> v= v * 5; ->50 bir sonraki soru için v artık 50 oluyor!!!!
        v /= 5;  // -> v= v / 5; ->5 bir sonraki soru için v artık 5 oluyor!!!!
        v %= 5;  // -> v= v % 5; ->0
        System.out.println("v: " + v);

        /**
         * işlem önceliği;
         * 1-> () içi işlemler
         * 2-> * ve /
         * 3-> + ve -
         * 4-> =, +=, -=
         *
         */

        int result = 10 * 3 + 2;
        System.out.println("Sonuç: " + result); //Sonuç: 32


        int result2 = (10 + 2) * 3;
        System.out.println("Result2: " + result2); // Result2: 36



    }
}
