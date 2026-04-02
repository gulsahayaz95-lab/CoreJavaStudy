package Mart25.ogrenci;

public class Ogrenci {

    public String isim;
    String soyisim;
    private int no;
    static String courseName;


    void bilgiYaz() {
        System.out.println("İsim: " + isim);
        System.out.println("soyisim: " + soyisim);
        System.out.println("no: " + no);
    }



    public static void courseNameYaz() {
        System.out.println("Coursename: " + courseName);
    }

}
