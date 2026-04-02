package Mart18;

public class ReturnKullanımı {

    //1-
    public static int kontrolEt(int sayı) {
        if (sayı < 0){
            return 0;
        }
        return  sayı;
    }



    //2-
    public static void yasKontrolü(int yas) {
        if (yas < 0){
            System.out.println("Yaş sıfırdan küçük olamaz.");
            return;  //geriye değer döndürmek için değil, methodu bitirmek için kullanıldı.
        }
        System.out.println("Yaş: " + yas);
    }


    public static void main(String[] args) {

        /**
         * return iki şekilde kullanılır;
         * 1- geriye bir değer döndürüyordu,
         * 1- methodu bitirmek için kullanılır.
         */



        int number = kontrolEt(-43);
        System.out.println("Sayı: " + number);
        yasKontrolü(-23);
        yasKontrolü(23);





    }
}
