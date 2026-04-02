package Mart30.ornek1;

public class MainClass {
    public static void main(String[] args) {



        //boş constructor ile nesne tanımlama;
        Calisan calisan1 = new Calisan();
        calisan1.isim = "Gülşah";
        calisan1.maas = 60000;
        calisan1.department = "Yazılım";
        calisan1.isActive = true;


        //parametreli constructor kullanımı;
        Calisan calisan2 = new Calisan("Mehmet", "Yazılım");
        Calisan calisan3 = new Calisan("Izzet", 55000);
        Calisan calisan4 = new Calisan("Alperen", true);
        Calisan calisan5 = new Calisan("Mehmet", "Yazılım", 53000, true);

















    }
}
