package Subat26;

public class ArrayKonusu {
    public static void main(String[] args) {

        /***
         * Aynı türden birden fazla elemana aynı değişken ismini vermemi sağlar.
         * int a = 5;
         * int b = 6; yerine
         * int [] sayılar = {5, 6};   olur.
         * Array içerisindeki elemanlara index ile ulaşırız.
         * Index 0'dan (sıfır) başlar.
         * Array uzunluğu oluşturulduktan sonra değiştirilemez.
         *
         * String[], double[], float[] vs...
         *
         */


        int [] yaslar = new int[5];  //5 elemanlık bir int dizisi
        //bu dizi içerisinde 5 tane int yas bilgisini tutabilir.

        /***
         * Arrayin limitini oluşturup değer ataması yapmadığım durumlarda default değerleri kendisi otomatik atar.
         *
         * int -> 0
         * double -> 0.0
         * boolean -> false
         * String -> null
         *
         * değerlerini yazar.
         *
         *
         * yaslar Arrayinde daha atama yapılmadığından şu şekilde atama olur;
         * 0,0,0,0,0, -> 5 elemanlı bir int dizisi olduğundan 5 tane 0 atar.
         *
         * bu yapı değerleri tek tek tanımlamak yerine kullanılabilir.
         *
         */



        String[] cities = {"Berlin", "Jena", "Ankara", "Izmir"};
        int[] nums = {3, 45, 99, 1, 8, 78};

        System.out.println(cities.length);  //4
        System.out.println(nums.length);  //6

        System.out.println("Değişiklik yapmadan önce: " + nums[0]); //3

        nums[0] = 34; //yeni değer ataması

        System.out.println("Değişiklik yaptıktan sonra: " + nums[0]); //34

        System.out.println(cities[2]);  //Ankara
        System.out.println(nums[7]); // hata verir çünkü 6. index yok, index sıfırdan başlıyor.

        //Arrayerde sınır değeri baştan belli olur, bunu aşarsak hata verir
        //bu hata da -> ArrayIndexOutOfBoundsException




        //index gerektiği durumda fori ile array içerisinde gezeriz.
        for (int index = 0; index < nums.length; index++) {
            System.out.println(index + ". indexteki eleman" + nums[index]);
        }




        //sadece eleman lazımken foreach kullanırız.
        for (int num: nums) {
            System.out.println(num);
        }



        for (String city: cities) {
            System.out.println(city + " ");
        }













    }
}
