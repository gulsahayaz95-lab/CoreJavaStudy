package Mart12;

import java.util.HashMap;

public class ÜrünFiyatları {
    public static void main(String[] args) {


        HashMap<String , Integer> sepet = new HashMap<>();


        sepet.put("Elma", 10);
        sepet.put("Karpuz", 20);
        sepet.put("Çilek", 40);
        sepet.put("Kiraz", 33);


        System.out.println("Karpuzun fiyat: " + sepet.get("Karpuz"));
        System.out.println("Toplam ürün sayısı: " + sepet.size());


        if (sepet.containsKey("Kiraz")) {
            System.out.println("Kiraz listede var.");
        } else {
            System.out.println("Kiraz listede yok.");
        }

        sepet.remove("Elma");

        System.out.println("Sepette kalan ürünler: " + sepet);

        sepet.clear();
        System.out.println("Sepetin son hali: " + sepet);






    }
}
