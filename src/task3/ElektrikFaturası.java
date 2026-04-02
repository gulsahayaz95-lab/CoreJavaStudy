import java.util.Scanner;

public class ElektrikFaturası {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int eski_okuma;
        int yeni_okuma;
        int elektrik_tuketimi;
        double birim_fiyat = 0;
        double aylik_fatura;

        System.out.print("Eski okuma değerini giriniz: ");
        eski_okuma = input.nextInt();

        System.out.print("Yeni okuma değerini giriniz: ");
        yeni_okuma = input.nextInt();

        elektrik_tuketimi = yeni_okuma - eski_okuma;

        if (elektrik_tuketimi < 0) {
            System.out.println("Hata! Yeni okuma eski okumadan küçük olamaz.");
        } else {

            if (elektrik_tuketimi <= 100) {
                birim_fiyat = 1.1;
            }
            else if (elektrik_tuketimi <= 200) {
                birim_fiyat = 1.3;
            }
            else if (elektrik_tuketimi <= 300) {
                birim_fiyat = 1.5;
            }
            else if (elektrik_tuketimi <= 400) {
                birim_fiyat = 1.7;
            }
            else if (elektrik_tuketimi <= 500) {
                birim_fiyat = 1.9;
            }
            else {
                birim_fiyat = 2.3;
            }

            aylik_fatura = elektrik_tuketimi * birim_fiyat;

            System.out.println("Elektrik Tüketimi: " + elektrik_tuketimi + " kWh");
            System.out.println("Birim Fiyat: " + birim_fiyat + " TL");
            System.out.println("Aylık Fatura: " + aylik_fatura + " TL");
        }

        input.close();
    }
}