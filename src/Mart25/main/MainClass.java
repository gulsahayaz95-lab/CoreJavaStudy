package Mart25.main;

import Mart25.ogrenci.Ogrenci;

public class MainClass {
    public static void main(String[] args) {

        Ogrenci  ogrenci = new Ogrenci();
        ogrenci.isim = "Mehmet";


        // soyisim default ve no private olduğundan farklı paket içerisinden erişemiyoruz.
        //isim kısmı public olduğundan dolayı erişebildik.

        //ogrenci.soyisim = "";
        //ogrenci.no = 2345; kodlarına burada ihtiyaç var.




















    }
}
