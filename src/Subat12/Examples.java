package Subat12;

public class Examples {
    public static void main(String[] args) {


                //Soruların çıktılarını bulumnuz.

        //1. Soru
        int a = 5;
        int b = 2;
        System.out.println(a / b);
           // int / int = int -> 2   olur virgülden sonrası atılır
        System.out.println((double) a / b);
          // (double) casting işleminden dolayı sonuç ondalıklı olarak kalır. Cevap 2.5 our.

        /**
         *println içerisindeki String ifadelerde + kullanıldığında, ayrıca parantez yoksa yazılan her şeyi birleştirir.
         * Parantez varsa öncelikle parantez içerisindeki işlemi yapıp ardından birleştirme yapar.
         */

        //2. Soru
        System.out.println("A" + 1 + 2);
           // A12
        System.out.println("A" + (1 + 2));
           // A3


        //3. Soru
        int x = 10;
        double y = 2;
        System.out.println(x / y);
        //int / double = bölme işleminde iki değerlerden biri büyükse sonuç için casting yapmaya gerek yok double olur.
        // 5.0 olur.


        //4. Soru
        double d = 12.99;
        int i = (int) d;
        System.out.println(i);
        // -> double d-> int d = 12
        // int i =12


        //5. Soru
        char c = 'A';
        System.out.println(c + 2);
        System.out.println((char)(c + 2));
        //(c+2) = A+2 = 65+2= 67
        //char (c+2) = char 67 = C olur
        //charda tek işaret tırnağı yapılır!!


        //6. Soru
        int n = 65;
        char cn = (char) n;
        System.out.println(cn);
        // 65'in charı A olduğundan char cn = A


        //7. Soru
        int ai = 10;
        int bi = 4;
        System.out.println(ai % bi);
        // % = mod olduğundan 10 % 4 = 2 olur.


        //8. Soru
        double ad = 10;
        double bd = 4;
        System.out.println(ad % bd); //2.0
        // 10 % 4 = 2.0


        //9. Soru
        int aa = 5;
        double bb = 2;
        int cc = (int)(aa / bb);
        System.out.println(cc); //2
        // (aa / bb)= 2.5 -> int (2.5) = 2


        //10. Soru
        String s = "40";
        int xx = Integer.parseInt(s);
        System.out.println(xx + 2);
        System.out.println(s + 2); // burada s yazı halinde olduğundan direkt +'dan sonra bitişik yazılır, eklenmez.
        //int xx = 40
        //42
        //402





    }
}
