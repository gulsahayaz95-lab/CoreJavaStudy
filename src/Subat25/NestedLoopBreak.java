package Subat25;

public class NestedLoopBreak {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }



        for (int satir = 0; satir < 3; satir++) {
            for (int sütun = 0; sütun < 5; sütun++) {
                if (sütun == 3) {
                    break;
                }
                System.out.println(sütun + " ");
            }
            System.out.println();
        }


        System.out.println("-----------------------------");

        outer:
        for (int k = 1; k <= 3 ; k++) {
            int s;
            for (s = 1; s <= 5; s++) {
                if (k == 2 && s == 2) {
                    break outer;  //dış döngü dahil her şey durur buna LABELAD denir. değişken gibi istenilen isim verilebilir.

                }
            }
            System.out.println("k= " + k + "s" + s);
        }











    }
}
