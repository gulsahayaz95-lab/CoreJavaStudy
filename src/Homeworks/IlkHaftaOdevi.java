package Homeworks;

public class IlkHaftaOdevi {
    public static void main(String[] args) {


        /**
         *Gün1 – Print / Println / Printf / Escape (1–10)
         */


        //1) Çıktı ne olur?
        System.out.print("1");
        System.out.println("2");
        System.out.print("3");
        System.out.println("4");
        /**
         *12
         *34
         **/

        //2) Çıktı ne olur?
        System.out.println("Hello");
        System.out.print("World");
        System.out.print("!");
        /**
         * Hello
         * World!
         */


        //3) Çıktı ne olur?
        System.out.print("Java ");
        System.out.print("is ");
        System.out.println("fun");
        System.out.println("Right?");
        /**
         * Java is fun
         * Right?
         */


        //4) Çıktı ne olur?
        System.out.println("Line1\nLine2\nLine3");
        /**
         * Line1
         * Line2
         * Line3
         */


        //5) Çıktı ne olur?
        System.out.println("A\t\tB\tC");
        /**
         * A    B   C
         */

        //6) Çıktı ne olur?
        System.out.println("Dosya: \"report.pdf\"");
        System.out.println("Klasör: C:\\Temp\\Logs");
        /**
         * Dosya: "report.pdf"
         * Klasör: C:\Temp\Logs
         */

        //7) Aşağıdaki kod derlenir mi? Derlenmezse neden? Doğru hali ne olmalı?
        //System.out.println("He said: "Stop!"");
        //Derlenmez, derlenmesi için \ ifadesi tırnak işareti önceleri kullanılmalıdır.


        //8) Çıktı ne olur?
        System.out.printf("Toplam=%d", 80);
        System.out.printf(" Puan=%d", 20);
        // Toplam=80 Puan = 20


        //9) Çıktı ne olur?
        System.out.printf("Pi=%.3f%n", 3.14159);
        System.out.printf("Pi=%.1f", 3.14159);
        //Pi=3.142
        //Pi=3.1

        //10) Çıktı ne olur?
        System.out.printf("[%8d]%n", 42);
        System.out.printf("[%-8d]%n", 42);
        System.out.printf("[%8s]", "Hi");
        //[      42]
        //[42      ]
        //      Hi


        /**
         * Gün2 – Casting / Aritmetik / + / char / parseInt (11–20)
         */


        //11) Çıktı ne olur?
        int a = 11;
        int b = 4;
        System.out.println(a / b);
        System.out.println(a / (double)b);
        //(a / b)= 2
        //(double)b = 4.0 -> (a / (double)b)= 11/4.0= 2.75

        //12) Çıktı ne olur?
        System.out.println("X" + 5 + 6); //-> X56
        System.out.println("X" + (5 * 6)); //-> X30
        System.out.println(5 + 6 + "X"); //11X


        //13) Çıktı ne olur?
        int x = 20;
        double y = 6;
        System.out.println(x / y);
        System.out.println((double)(x / (int)y));
        // (x / y)= 3.333333
        //(int)y= 6 -> x / (int)y = 20/6 = 3 -> (double)(x / (int)y) = 3.0


        //14) Çıktı ne olur?
        double d = 7.99;
        System.out.println((int)d); // 7
        System.out.println((int)(d * 10)); // (d * 10)= 79.9 -> int (d*10)= 79


        //15) Çıktı ne olur?
        char ch = 'D';
        System.out.println(ch + 3);  // 68+3= 71
        System.out.println((char)(ch + 3)); // char 71 = G


        //16) Çıktı ne olur?
        int n = 48;
        char c = (char)n; // -> 0
        System.out.println(c); // 0
        System.out.println(c + 1); // 48+1=49


        //17) Çıktı ne olur?
        int aa = 29;
        int bb = 6;
        System.out.println(aa % bb); //-> (aa % bb)= 5
        System.out.println(bb % aa); //-> (bb % aa)= 6


        //18) Çıktı ne olur?
        double aaa = 29;
        double bbb = 6;
        System.out.println(aaa % bbb); // 5.0
        System.out.println(10.5 % 4); // 2.5


        //19) Çıktı ne olur? (casting yeri önemli)
        int ba = 9;
        double ab = 4;
        System.out.println((int)(ba / ab));  // 2
        System.out.println((int)ba / ab);   // 2.25


        //20) Çıktı ne olur?
        String s = "007";
        int xx = Integer.parseInt(s);  // 7
        System.out.println(xx + 5); //12
        System.out.println(s + 5); // 0075


        /**
         * Gün3 – String Methods (21–30)
         */


        //21) Çıktı ne olur?
        String t = "Automation";
        System.out.println(t.length()); // 10


        //22) Çıktı ne olur?
        String tt = "Automation";
        System.out.println(tt.charAt(0));  // A
        System.out.println(tt.charAt(4));  // M


        //23) Bu kod çalışır mı? Çalışmazsa hangi hata gelir?
        //String t = "QA";
        //System.out.println(t.charAt(2));
        //Çalışmaz, uzunluk 2 fakat 2 için bir char yok 0 ve 1 var.


        //24) Çıktı ne olur?
        String sa = "Test";
        String sb = "test";
        System.out.println(sa.equals(sb)); // False
        System.out.println(sa.equalsIgnoreCase(sb)); // True


        //25) Çıktı ne olur?
        String ys = "Playwright";
        System.out.println(ys.substring(4)); // wright
        System.out.println(ys.substring(0, 4)); // Play
        System.out.println(ys.substring(2, 7)); // aywri


        //26) Çıktı ne olur?
        String ea = "Hello";
        String eb = "Java";
        System.out.println(ea.concat(" ").concat(eb)); //Hello Java
        System.out.println(ea + "-" + eb); //Hello-Java


        //27) Çıktı ne olur?
        String ms = "Java is powerful";
        System.out.println(ms.contains("is")); // True
        System.out.println(ms.contains("Power")); // False


        //28) Çıktı ne olur?
        String file = "Invoice_2026.PDF";
        System.out.println(file.startsWith("Inv")); //True
        System.out.println(file.endsWith(".PDF")); //True
        System.out.println(file.endsWith(".pdf")); //False


        //29) Çıktı ne olur?
        String ls = "banana";
        System.out.println(ls.indexOf("a")); //1
        System.out.println(ls.lastIndexOf("a")); //5
        System.out.println(ls.indexOf("na")); //2


        //30) Çıktı ne olur?
        String text = " ID: AB-123-CD ";
        System.out.println(text.trim()); //ID: AB-123-CD
        System.out.println(text.replace("-", "_")); //ID: AB_123_CD
        System.out.println(text.replaceAll("\\D", "")); //123
        System.out.println(" ".trim().isEmpty()); //True
        System.out.println(" ".isEmpty()); //False



    }
}
