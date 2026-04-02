package Subat25;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class NestedLoop {
    public static void main(String[] args) {

        /***
         * // dış döngünün tur sayısını belirtir:
         * for ( int = 0; i < bitisDegeri ; i++) {  //SATIR
         *
         *      // iç döngünün o turda tekrar sayısını belirtir:
         *      for ( int j = 0; j < bitisDegeri2 ; j++) {  //SÜTUN
         *          }
         *   }
         *
         *   örn: haftaiçi 5 gün ve her gün 3 ders var,
         *   Toplamda haftalık 15 ders vardır.
         */


        for (int gun = 1; gun <= 5; gun++) {
            for (int ders = 1; ders <= 3; ders++) {
                System.out.println(gun + ".gün " + ders + ".ders");
            }
            System.out.println();
        }





















    }
}
