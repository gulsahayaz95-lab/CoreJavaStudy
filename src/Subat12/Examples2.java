package Subat12;

public class Examples2 {
    public static void main(String[] args) {

        System.out.println("------soru1------");
        String s = "3.5";
        double d = Double.parseDouble(s); //double d = 3.5
        System.out.println(d * 2); // 3.5*2= 7.0


        System.out.println("------soru2------");
        int a = 2;
        System.out.println(a + "3" + 4); // 234 -> int+string+int = komple string birleştirme
        System.out.println(a + 3 + "4"); // 2+3= 54 -> int+int+string = int toplama ve sonra string birleştirme


        System.out.println("------soru3------");
        System.out.println("A" + 'B' + 1); // A67 -> stringle başladığı için karakter birleştirdi= string+char+int
        System.out.println('A' + 'B' + "1"); // 1311 -> char+char= sayısal değerlerinden dolayı int gibi davranır


        System.out.println("------soru4------");
        //Javada kural; bölünen sayının işareti belirler.
        System.out.println(-10 % 3); // - 1
        System.out.println(10 % -3); // + 1


        System.out.println("------soru5------");
        String ss = "010";
        int n = Integer.parseInt(ss); //10
        System.out.println(n + 5); // 15
        System.out.println(ss + 5); // 0105


        System.out.println("------soru6------");
        double dd = 0.1 + 0.2;
        System.out.println(dd); // 0.300000..... -> cevabın sadece 0.3 olmaması double hassasiyetinden kaynaklıdır.
        System.out.println(dd == 0.3); // False
        //== ifadesi javada sorgudur cevabı doğru ya da yanlış olabilir.



    }
}
