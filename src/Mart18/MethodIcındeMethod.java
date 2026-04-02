package Mart18;

public class MethodIcındeMethod {

    public static int toplam(int sayı1, int sayı2) {
        return sayı1 + sayı2;

    }

    public static void toplamYazdır(int sayı1, int sayı2) {
        //diğer methodu bu method içinde kullandık
        int toplam = toplam(sayı1, sayı2);
        System.out.println("Toplam: " + toplam);
    }

    public static void main(String[] args) {


        toplamYazdır(34, 678);
        toplamYazdır(67, 890);
        toplamYazdır(234, 456);



    }


}
