package Subat16;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {

        System.out.println("---------Soru1---------");

        int a = 10, b=4;  // Eğer iki değişken aynı veri tipinde ise;
        //Tek bir veri tipi kullanılarak birden fazla veri girişi olabilir
        //Bunun için değişkenlere atama yaptıktan sonra aralarına virgül ekleriz.

        System.out.println(a / b); // 2
        System.out.println((double) a / b); // double a = 10.0 /4 -> 2.5
        System.out.println(a / (double) b); // 10/ 4.0 -> 2.5


        System.out.println("---------Soru2---------");

        System.out.println(29 % 5); //4
        System.out.println(30 % 5); //0



        System.out.println("---------Soru3---------");

        System.out.println(-7 % 3); // -1
        System.out.println(7 % -3); // +1
        System.out.println(-7 % -3); // -1


        System.out.println("---------Soru4---------");

        int x = 5;
        System.out.println(x++); // 5 -> aşağıya 6 olarak gider
        System.out.println(++x); // 6+1= 7 aşağıya sonuç olarak yansır
        System.out.println(x); // 7

        System.out.println("---------Soru5---------");

        int r = 8 + 2 * 5 - 6 / 3;
        System.out.println(r); // 16


        System.out.println("---------Soru6---------");

        char c = 'A'; // char A=65
        System.out.println(c + 1); // 66
        System.out.println((char)(c + 1)); // char 66 = B


        System.out.println("---------Soru7---------");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        sc.nextLine(); // sayısal ifade kullandığım için ekledim!!
        String name =  sc.nextLine();


        sc.close();





    }
}
