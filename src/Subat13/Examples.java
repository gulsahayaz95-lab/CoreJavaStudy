package Subat13;

public class Examples {
    public static void main(String[] args) {


        System.out.println("--------Soru1---------");
        String s = "Automation";
        System.out.println(s.substring(4, s.length() - 1));  //matio


        System.out.println("--------Soru2---------");
        String a = "java@spring@boot";
        int i = a.indexOf("@");  // a.indexOf("@") = 4 ->int i
        System.out.println(a.substring(0, i));  // substring(0, i)
        // a.substring(0, 4) = java


        System.out.println("--------Soru3---------");
        String y = "report.final.v2.pdf";
        System.out.println(y.substring(y.lastIndexOf('.') + 1));
        // y.lastIndexOf(".") -> son nokta + 1 ifadesi ise p olur. -> y.lastIndexOf(".") = pdf


        System.out.println("--------Soru4---------");
        String x = "2026-02-13";
        System.out.println(x.replace("-", "/"));  // 2026/02/13


        System.out.println("--------Soru5---------");
        String c = "Order# TR-98A-1200!";
        System.out.println(c.replaceAll("\\D", ""));  // 981200


        System.out.println("--------Soru6---------");
        String v = "https://medlehrer.com";
        System.out.println(v.startsWith("https://") && v.contains("medlehrer"));
        // v.startsWith("https://") -> True
        // v.contains("medlehrer") -> True
        // ifadelerden biri bile yanlış olursa sonuç da yanlış olurdu
        //Her ikisi True olduğundan çıktı da True olur.


        System.out.println("--------Soru7---------");
        String n = "ADMIN";
        String b = "admin";
        System.out.println(n.equalsIgnoreCase(b));  // ignore dediğimiz için büyük küçük bakmaz birebir olmasına bakar
        //True olur.
        //ignore olmasaydı false olurdu.


        System.out.println("--------Soru8---------");
        String m = "TR123456";
        System.out.println(m.length()); // 8
        System.out.println(m.substring(m.length() - 2));
        // (m.length() - 2) -> 56
        System.out.println(m.substring(6)); // 56


        System.out.println("--------Soru9---------");
        String r = "selenium";
        System.out.println(r.indexOf("b")); // -1



        System.out.println("--------Soru10---------");
        int z = 7;
        int u = 5;
        String j = String.valueOf(z).concat(String.valueOf(u));
        System.out.println(j);
        // String.valueOf(u)=5, String.valueOf(z)=7  // Çıktı-> 75



        System.out.println("--------Soru11---------");
        String name = "Gulsah Ayaz Izmir";
        int index = name.indexOf(" ");
        System.out.println(name.substring(0, index));
        // name.indexOf(" ")= Gulsah -> int index=5  -> name.substring(0, 5) = Gulsah



        System.out.println("--------Soru12---------");
        String p = "QA SDET Java";
        System.out.println(p.substring(p.lastIndexOf(" ") + 1));
        //  Java



        System.out.println("--------Soru13---------");
        String email = "user.test@med.uni-jena.de";
        System.out.println(email.substring(email.indexOf("@") + 1));
        //med.uni-jena.de


    }
}
