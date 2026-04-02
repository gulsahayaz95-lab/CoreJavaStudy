package Mart18;

public class MethodCesitleri {
    public static void main(String[] args) {


        /**
         * 1-> değer döndürmeyen parametresiz method
         * 2-> değer döndürmeyen parametreli method
         * 3-> değer döndüren parametresiz method
         * 4-> değer döndüren parametreli method
         */

        selamVer();
        merhabaYaz("Gülşah");
        int toplamSonucu = toplam();  //değer dönüyor demek-> dönen değer tipinde bir değişkene atama yapmaktır.
        int carpmaSonucu = carpma(5 ,6);   //değer döndüren ve parametre alan bir method.


        System.out.println("Toplam: " + toplamSonucu);
        System.out.println("Çarpma: " + carpmaSonucu);


        menu();   //döngüdeyim ve birden fazla müşteriye menü göstermek istersem yapılacak işlemdir.






    }

    //1.
    public static void selamVer() {
        System.out.println("Method konusuna hoş geldiniz :)");
    }


    //2.
    public static void merhabaYaz(String name) {
        System.out.println("Hoş geldin " + name);
    }


    //3.
    public static int toplam() {
        return 3 + 4;

    }


    //4.
    public static int carpma(int sayı1, int sayı2) {
        return sayı1 * sayı2;
    }



    public static void menu() {
        System.out.println("-----Menü-----");
        System.out.println("1- kola");
        System.out.println("2- çay");
        System.out.println("3- kahve");
    }







}
