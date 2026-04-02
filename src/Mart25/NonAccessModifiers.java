package Mart25;

public class NonAccessModifiers {

    /**
     * non access modifiers:
     * 1. static-> bir methodu static yaparsak o methodu nesne oluşturmadan class ismi ile kullanabiliriz.
     * bir değişkeni static yaparsak o classtan oluşturulan tüm nesneler için bu değişken ortak olur.
     *
     * 2. final-> değişmezlik veya sınır koyma olarak tanımlanabilir.
     * Değeri belli olup sonradan değiştirilmesini istemediğimiz değişkenleri final ile tanımlarız.
     *
     * 3. abstract
     */


    public static void main(String[] args) {

        Calisan calisan1 = new Calisan();
        Calisan calisan2 = new Calisan();

        calisan1.isim = "Mehmet";
        calisan1.soyisim = "Simsek";

        calisan2.isim = "Gülşah";
        calisan2.soyisim = "Ayaz";


        System.out.println(calisan1.soyisim);
        System.out.println(calisan2.isim);
        //sirketIsmi değişkeni static olarak tanımlandığı için her iki nesneye ait ortal bir değer oldu.
        //static değişken nesneye ait değildir, classa aittir,
        //bu sebeple kullanırken class ismi ile kullanırız.
        System.out.println(Calisan.sirketIsmi);

        String cumle = "Bugün hava çok güzel.";
        System.out.println("Karakter sayısı: " + cumle.length());


        int a = 12;
        int b = 34;
        int max = Math.max(a,b);
        System.out.println("Max: " + max);


        Sabitler.PI = 3.14;
        //final olarak yazıldığı için 3.14 değeri dışında yazıldığında hata verecektir.
        //t.c no veya şehir plakaları gibi...


        System.out.println("Kare alanı: " + GeometriHesapla.kare(5));
        System.out.println("Dikdörtgenin alanı: " + GeometriHesapla.dikdortgen(3,5));















    }
















}
