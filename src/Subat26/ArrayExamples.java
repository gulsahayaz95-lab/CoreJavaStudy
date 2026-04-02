package Subat26;

public class ArrayExamples {
    public static void main(String[] args) {


        System.out.println("--------Soru1---------");


        int[] notlar = {95, 56, 45, 100};  //length=4 her bir değişkeni 1 uzunluk ve index sayar.

        //öğrencinin aldığı notlatın toplaöı ve ortalamasını bulalım.


        int toplam = 0;
        for (int not: notlar) {
            toplam += not;
        }

        System.out.println("Toplam not: " + toplam);
        System.out.println("Not ortalaması: " + (toplam/ notlar.length));





        System.out.println("--------Soru2---------");

        int[] nums = {3, 5, 56, 23, 44, 99, 54};

        //nums arrayi içerisindeki en büyük sayıyı bulalım.


        int max = nums[0];   //max değerini başlangıçta bilmiyoruz başlangıç için arrayin ilk elemanını aldık
        //bu sayede array içerisinde gezip sırayla diğer elemanları bu değer ile kıyasladık.
        //yeni değer daha büyükse max değer olarak onu atadık.

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max ) {
                max = nums[i];


            }

        }
        System.out.println("Max değer: " + max);




        System.out.println("--------Soru3---------");

        int tekSayıMiktarı = 0;

        for (int index = 0; index < nums.length; index++) {
            if (nums [index] % 2 == 1 ) {
                tekSayıMiktarı++;

            }
        }

            //Arrayi oluştururken kaç elemanlı olduğunu belirttik.
        int [] tekSayılar = new int[tekSayıMiktarı];
        int sayac = 0;

        for (int i = 0; i <nums.length ; i++) {
            //yeni oluşturulan arraye nums arrayi içerisindeki tek sayıları ekledik

                if (nums [i] % 2 == 1 ) {
                    tekSayılar[sayac] = nums[i];
                    sayac++;
                }


        }

        //tek sayılar arrayindeki elemanları ekrana yazdırdık
        for (int tek: tekSayılar) {
            System.out.println(tek);

        }
        System.out.println("Toplam tek sayı miktarı: " + tekSayıMiktarı);





        System.out.println("--------Soru4---------");


        String[] cities = {"Ankara", "Adana", "Istanbul", "Berlin", "Izmir" };
        //cities arrayindeki şehirlerinden kaç tanesi A harfi ile başlıyor

        int miktar = 0;
        for (int i = 0; i< cities.length; i++) {
            if (cities[i].startsWith("A")) {
                miktar++;

            }
        }
        System.out.println("A ile başlayan şehir sayısı: " + miktar);





        System.out.println("--------Soru4---------");





















    }
}
