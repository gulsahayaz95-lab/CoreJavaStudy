package Subat17;

public class MathFunctions {
    public static void main(String[] args) {


        int a = -12;
        // Mutlak değer
        System.out.println(a + " Mutlak değeri: " + Math.abs(a));


        int b = 81;
        // Karekök
        System.out.println(b + " Karekökü: " + Math.sqrt(b));  // sonucu double verir


        // Math.round() -> En yakınına sayıyı yuvarlar. 0.5 ve üstü ise bir üste yuvarlar.
        System.out.println(Math.round(3.4)); //3
        System.out.println(Math.round(3.5)); //4


        // Math.floor() -> sayıyı aşağıya yuvarlar.
        System.out.println(Math.floor(3.9)); // 3.0
        System.out.println(Math.ceil(-3.1)); // -4


        // Math.ceil() -> sayıyı yukarı yuvarlar.
        System.out.println(Math.ceil(3.1)); // 4
        System.out.println(Math.ceil(-3.9)); //-3


        // İki sayı arasındaki büyüklük-küçüklük
        System.out.println(Math.min(5,9)); // 5
        System.out.println(Math.max(3,1)); // 3
        System.out.println(Math.max(8, Math.max(2,3))); // 8


        // 0.0 ile 1.0 arasında random bir sayı üretir fakat hiçbir zaman 1.0 dahil etmez. Limit gibi!!
        double random = Math.random();
        System.out.println("random: " + random);
        //Her çalıştırıldığında farklı bir değer üretir.









    }
}
