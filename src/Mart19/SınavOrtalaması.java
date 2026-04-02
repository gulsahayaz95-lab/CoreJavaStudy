package Mart19;

public class SınavOrtalaması {

    public static double ortalamaHesaplama(int not1, int not2, int not3) {
        return (not1 + not2 + not3) / 3.0;
    }

    public static void sınavDurumu(double ortalama) {
        if (ortalama >= 50) {
            System.out.println("Sınavı geçti.");
        } else {
            System.out.println("Sınavdan kaldı.");
        }
    }


    public static void ogrenciBilgisiYazdir(String ogrenci, int not1, int not2, int not3) {
        double ortalama = ortalamaHesaplama(not1, not2, not3);

        System.out.println("-------Öğrenci Sınav Bilgileri-------");
        System.out.println("Öğrenci ismi: " + ogrenci);
        System.out.println("1. not: " + not1);
        System.out.println("2. not: " + not2);
        System.out.println("3. not: " + not3);
        System.out.printf("Ortalama: %.2f%n" , ortalama);
        System.out.println("Ortalama: " + Math.round(ortalama)); //yüzdelik kısmını attık
        sınavDurumu(ortalama);
        System.out.println();
    }



    public static void main(String[] args) {


        ogrenciBilgisiYazdir("Ali" , 34, 45, 98);
        ogrenciBilgisiYazdir("Veli" , 10, 55, 78);
        ogrenciBilgisiYazdir("Ayşe" , 100, 89, 98);
        ogrenciBilgisiYazdir("Fatma" , 99, 100, 88);



    }
}
