package Mart19;

public class MaasHesaplama {


    public static int maasHesapla(int aylıkSaati, int calismaÜcreti) {
        return aylıkSaati * calismaÜcreti;

    }



    public static void calisanBilgisiYazdir(String isim, String bölüm, int aylıkSaati, int calismaÜcreti) {
        System.out.println("------Çalışan Bilgisi------");
        System.out.println("Çalışan ismi: " + isim);
        System.out.println("Çalıştığı bölüm: " + bölüm);
        System.out.println("Aylık çalışma saati: " + aylıkSaati);
        System.out.println("Çalışma ücreti: " + calismaÜcreti);
        System.out.println("Maaşı: " + maasHesapla(aylıkSaati, calismaÜcreti));
        System.out.println();
    }



    public static void main(String[] args) {

        //isim, bölüm, aylık çalışma saati, saatlik ücreti;
        calisanBilgisiYazdir("Mehmet", "Yazılım", 160, 150);
        calisanBilgisiYazdir("Gülşah", "Yazılım", 100, 250);
        calisanBilgisiYazdir("Ayşe", "QA", 120, 80);
        calisanBilgisiYazdir("Fatma", "QMS", 80, 90);



    }
}
