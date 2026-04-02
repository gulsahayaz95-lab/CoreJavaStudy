import java.util.Scanner;

public class MaasHesabi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sabit_maas;
        double satis_kazanci;
        double performans_seviyesi;
        double prim_orani;
        double prim;
        double toplam_maas;

        System.out.print("Sabit maaşı giriniz: ");
        sabit_maas = input.nextDouble();

        System.out.print("Satış kazancını giriniz: ");
        satis_kazanci = input.nextDouble();

        System.out.print("Performans seviyesini giriniz: ");
        performans_seviyesi = input.nextDouble();

        // Performansa göre prim oranı belirleme
        if (satis_kazanci > performans_seviyesi) {
            prim_orani = 0.10;
        } else {
            prim_orani = 0.05;
        }

        // Prim hesaplama
        prim = satis_kazanci * prim_orani;

        // Toplam maaş hesaplama
        toplam_maas = sabit_maas + prim;

        // Sonuçları yazdırma
        System.out.println("Prim Oranı: " + prim_orani);
        System.out.println("Prim Tutarı: " + prim);
        System.out.println("Toplam Maaş: " + toplam_maas);

        input.close();
    }
}