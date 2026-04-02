package Mart4;

public class Array2D {
    public static void main(String[] args) {

        /**
         * 1D Array int[] numbers = new int [3]; -> 10,20,4 şeklinde içerisinde 3 adetv int tutar,
         *
         * 2D Array -> Satır ve sütunları olan bir yapıdır,
         * int[][] notlar = new int[3][4] -> 3 satır ve 4 sütundan oluşan bir yapı olur.
         *
         * */


        int [][] sayılar = new int[3][4]; // 3x4 lük bir tablo oluşturmuş olduk.

        sayılar[0][0] = 12;
        sayılar[1][3] = 46;
       // sayılar[3][4] = 56;  ->> bu hata olur çünkü index sıfırdan başladığı için 3. index yok bu tanımlama hatalı olur.
        // 2-3 yazılabilirdi.

        int[][] numbers = {{3, 4, 5},{3, 2, 1}};  // 2 satır-3 sütunluk bir tablodur. Kümeler satır, elemanları sütundur.

        //index mantığı;
        System.out.println("2. satır, 3. sütun elemanları: " + numbers[1][2]);
        System.out.println("1. satır, 2. sütun elemanları: " + numbers[0][1]);

        System.out.println("-----------------------------");


        //verilen dizide gezinmek ve hepsini yazdırmak istersek, for döngüsü;

        for (int i = 0; i < numbers.length; i++) {  //SATIR

            for (int j = 0; j < numbers[i].length; j++) {   //SÜTUN
                //numbers[i].length  o satırdaki sütun sayısını ifade eder.

                System.out.print(numbers[i][j] + " "); //SÜTUNLARI YAZACAK
            }
            System.out.println(); //SATIRLAR ARASI BOŞLUK BIRAKSIN DİYE EKLENDİ
        }




        System.out.println("-----------------------------");

        int[][] degiskenYapı = {{1, 2}, {3, 4, 5, 6}, {4, 5, 6}};

        for (int i = 0; i < degiskenYapı.length; i++) {

            for (int j =0; j < degiskenYapı[i].length; j++) {

                System.out.println(degiskenYapı[i][j] + " ");

            }
            System.out.println();
        }






















    }
}
