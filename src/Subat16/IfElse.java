package Subat16;

public class IfElse {
    public static void main(String[] args) {

        /**
         *  if(koşul) {
         *      // yapılacak işler ve sout
         *  }   else  {   -> eğer koşul sağlanmıyorsa else parantezleri içerisine girer
         *      // yapılacak işle ve sout
         *  }
         */

        int age = 25;
        if (age > 18) {
            System.out.println("Ehliyet alabilir.");
        }  else {
            System.out.println("Ehliyet alamaz.");
        }


        /**
         * Öğrenci notlarında 50 ve üzeri alanlar sınavı geçer
         * 70 ve üzeri alanlar "iyi" not alır
         * 85 ve üzeri alanlar "pekiyi" not alır
         */



        //if else bloklarında ifadeinin true olmasına bakılır
        //zincirleme if else lerde ise ilk true olan koşulda parantez içi yapılır ve program sonlanır
        //yani 85 alan biri hem pekiyi hem geçtin yazısını görmez, ilk talebi görür.
        //if else evet ya da hayır olarak işlem yapar ona göre düşünüp algoritma oluşturuyoruz
        //örn if(a){} bu yazım şekli hatalı çünkü soruda cevap boolean şeklinde değil, cevabın true/false olması lazımdı

        int not = 100;

        if (not >= 85) {
            System.out.println("Pekiyi");

        } else if (not >= 70) {
            System.out.println("İyi");

        } else if (not >= 50) {
            System.out.println("Sınavdan geçtin.");

        } else {
            System.out.println("Sınavdan kaldın.");

        }


        /**
         * 1) == -> eşit mi , 11 == 10 -> false
         * 2) != -> eşit değil dmi , 9 != 10 -> true
         * 3) <, >, <=, >=
         * Tabii bu ifadeler sayısal değerler için kullanılır stringlerde olmaz!!!!!
         *
         * Stringlerde equals(), equalsIgnoreCase() kullanılır!!!!
         */



        String lesson = "Java";

        if (lesson.equals("Java")) {
            System.out.println("Ders ismi doğrudur.");

        } else {
            System.out.println("Ders ismi yanlıştır.");

        }


        /**
         * Mantıksal operatörler
         *
         * && -> ve anlamına gelir, iki koşulun da doğru olduğu durumdur
         * || -> veya anlamına gelir, iki koşuldan biri doğru ise kullanılır
         * ! -> değil anlamına gelir
         */


        int age1 = 18;
        boolean kimlikVarMı = true;

        if (age1 > 18 && kimlikVarMı) {
            System.out.println("Ehliyet alabilir.");

        } else {
            System.out.println("Sınava giremez.");
        }


        /**
         * Kısa if yazımı (Ternary Operatörü)
         *
         * int sayı = 5;
         *
         * String result =  ( sayı % 2 == 0 ) ?  Doğruysa "Çift" : Değilse "Tek" ;
         * Çünkü modu sıfır olan sayı çifttir
         * System.out.println (result);
         *
         * Ternary if in parantez içi kullanımında koşul olur
         * ? den sonraki ilk ifadede if bloğu olarak, sonraki ifadede else bloğu olarak çalışır.
         *
         */


        /**
         * İç içe if ler ( Nested if )
         *
         * İf (koşul) {
         *      if (koşul) {
         *              // koşul1 ve koşul2 True ise;
         *
         *     } else {
         *         // koşul1 ve koşul2 False ise;
         *
         *     }
         *
         *  } else }
         */

        //Tavsiye edilen bir yöntem değildir, karmaşıklaşır.
        int yas3 = 18;
        boolean kimlikVarMı3 = true;

        if (yas3 >=18) {
                if (kimlikVarMı3) {
                    System.out.println("Ehliyet alabilir.");

                } else {
                    System.out.println("Ehliyet alamaz.");
                }

        } else {
            System.out.println("Ehliyet alamaz.");
        }


        // Bu karmaşıklık yerine else-if kullanılması daha uygundur

        if (yas3 >= 18 && kimlikVarMı3) {
            System.out.println("Ehliyet alabilir.");
        } else if (yas3 < 18) {
            System.out.println("Yaşı tutmuyor, ehliyet alamaz.");
        } else {
            System.out.println("Kimlik yok, sınava giremez.");
        }


        /**
         * Avrupa ülkesine 1 aylık seyehat için;
         * Schengen vize koşulu ve süre koşulu uygulansın;
          */

        int geziSüresi = 30;
        boolean schengen = true;

        if (geziSüresi <= 30 && schengen) {
            System.out.println("30 gün boyunca Avrupa'da bulunabilirsiniz.");
        } else if (geziSüresi > 30) {
            System.out.println("Gezi süreniz maksimum 30 gün olabilir.");
        } else if (schengen == false) {
            System.out.println("Schengen vizesine ihtiyacınız vardır !");
        } else  {
            System.out.println("Ne yazık ki Avrupa'da bu koşullarda bulunamazsınız.");
        }












    }



}
