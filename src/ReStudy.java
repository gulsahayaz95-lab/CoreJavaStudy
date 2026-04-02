import java.util.Scanner;

public class ReStudy {
    public static void main(String[] args) {

        // 1. adim kullanicidan kelime al
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String metin = input.nextLine(); // kelime

        // 2. adim

        //              i

        // m    e   r   h   a   b   a
        // a yi tersMetin e ekle
        // b yi tersMetin e ekle

        // a b a
        // abahrem
        String tersMetin = ""; // Ters çevrilen metni tutmak için boş bir String.

        // 3. adim
        // metin kelimesinin son indexinden basla 0. indexe kadar git ve her seferinde 1 azal
        for (int i = metin.length() - 1; i >= 0; i--) {
            tersMetin += metin.charAt(i);

            /*
            metin kelimesinin anlik index degerini al bunu tersMetin degiskenine ekle
             */
        }


        /**
         Görev:
         Kullanıcıdan alınan bir sayının faktöriyelini hesaplayan bir Java programı yazınız.
         (Faktöriyel, pozitif bir tam sayının kendisi ile 1 arasındaki tüm tam sayıların çarpımıdır.)
         Örneğin: 5! = 5 x 4 x 3 x 2 x 1 = 120
         */
        /*
        1. adim kullanicidan sayi alinacak
        2. dongu türünü sec => Baslangic, bitis ve artis(Azalis) belli oldugu icin
           FOR dongusu kullaniyorum

         */
        Scanner readInt = new Scanner(System.in);
        System.out.print("Lutfen bir sayi girin :");
        int girilenSayi = readInt.nextInt();

        int faktoriyel = 1;

        //1 x 2 x 3 x 4 x 5 = 120
        // faktoriyel*i=faktoriyel; => 1*1 =  1
        // faktoriyel*i=faktoriyel; => 1*2 =  2
        // faktoriyel*i=faktoriyel; => 2*3 =  6
        // faktoriyel*i=faktoriyel; => 6*4 =  24
        // faktoriyel*i=faktoriyel; => 24*5 = 120
        for (int i = 1; i <= girilenSayi; i++) {
            faktoriyel *= i;
            System.out.println("faktoriyel = " + faktoriyel);
        }
        System.out.println(faktoriyel);


    }


}
