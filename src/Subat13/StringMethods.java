package Subat13;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Gulsah";


        System.out.println("-----------length()---------");

        // 1) Bu stringin uzunluğu
        int nameLength = name.length();
        //System.out.println(name.length());
        System.out.println("İsmin uzunluğu: " + nameLength);

        System.out.println("-----------charAt()---------");

        // 2) charAt(int index) -> index gördüğümüzde saymaya 0'dan başlarız. İsimdeki herhangi bir harfi istersem.
        // O indexteki harfi veriyor.
        System.out.println(name.charAt(2));


        System.out.println("-----------indexOutOfBounds---------");
        // System.out.println(name.charAt(6)); -> İsmimin uzunluğu 5
        // Eğer belirtilen stringin toplam index sayısı dışında bir arama istersek
        // bize bu hatayı verir -> "StringIndexOutOfBoundsException"


        // 3) İki String ifadenin karşılaştırılması
        String a = "Java";
        String b = "java";
        // büyük-küçük harf duyarlı buna göre eşitliği kontrol ediyor
        System.out.println(a.equals(b)); // False
        // büyük-küçük harf duyarlı değil buna göre eşitliği kontrol ediyor
        System.out.println(a.equalsIgnoreCase(b)); // True


        System.out.println("-----------subString()---------");
        // Bu method ile String ifade içerisinden istediğimiz başlangıç ve bitiş noktalarını belirtilp çıktı alabiliriz.
        // substring(int start) veya substring(int begin, int end)
        // index olarak başlangıç ve bitişi end'i yazıya dahil etmez
        String x = "Selenium";
        System.out.println(x.substring(3)); //enium
        System.out.println(x.substring(0,3)); // Sel 0,3 arası dediğimizde 0'dan 2'ye kadar yazar, 3 yazılmaz.


        System.out.println("-----------concat()---------"); // İki stringi birleştimek.

        String d = "Bugün hava";
        String e = "cok güzel";

        //1.YOL
        System.out.println(d + " " + e); // " " kısmı iki cümle arasında bir boşluk bırakması içindi.

        //2.YOL
        System.out.println(d.concat(" ").concat(e));


        System.out.println("-----------contains()---------");
        String s = "Selenium bir test aracıdır";
        System.out.println(s.contains("test")); // İçerdiği için True çıktısı olur.
        System.out.println(s.contains("Test")); // Çıktı False olur, kelimede büyük küçük harf duyarlıdır.

        // if kullanılacak durumlarda boolean data type kullanılır. örn;

        boolean isContains = s.contains("Test");
        System.out.println(isContains); // False


        System.out.println("-----------startsWith()--endWith()---------");
        String f = "report.pdf";
        //belirtilen string ile olan string kontrol edilir
        //başlangıç ve bitiş değerleri olarak büyük-küçük hassasiyeti bulunur.
        System.out.println(f.startsWith("r")); // True
        System.out.println(f.endsWith(".pdf")); // True


        System.out.println("-----------indexOf()--lastIndexOf()---------");
        String g = "Javalandınızva";
        //Verilen string ifadeyi string içerisinde bulursa indexi yazar
        //İndexi bulamazsa -1 yazar.
        System.out.println(g.indexOf("va")); //2 -> 0'dan başlıyordu saymaya
        System.out.println(g.lastIndexOf("a")); // 13
        // last indexte ilk değil son bulduğunu yazıyor
        //String ifade içerisinde verilen karakter yoksa;
        System.out.println(g.indexOf(x)); // -1 yazar.



        System.out.println("-----------replace()---------");
        String k = "java-dersleri-gün-üç";
        System.out.println(k.replace("-"," "));

        String birthday = "05/08/1995";
        System.out.println(birthday.replace("/", "."));



        System.out.println("-----------replaceAll()---------");
        String telNo = "Tel: 555-555-55-55";
        System.out.println(telNo.replaceAll("\\D", ""));
        // Sol tarafa kuralı yazıyorum sağ tarafa da bu kuralın sonucunda ne yazacağını yazıyorum.
        // regex konusu ileride işlenecek, String ifadelerde belirli bir yapı oluşturmak için kullanılır
        // örn; password için 8 haneli olsun, bir tane rakam ve noktalama işareti olsun gibi...
        // "\\D" -> digit yani rakam dışında her şeyin silinmesini sağladı



        System.out.println("-----------toLowerCase()---toUpperCase()---------");
        String l = "MeRHabA düNYa";
        //Stringin tamamını küçültmek veya büyütmek için;
        System.out.println(l.toLowerCase());
        System.out.println(l.toUpperCase());

        //String içerisinde sadece bir kelimeyi de büyütüp küçültebiliriz.
        System.out.println(l.substring(8).toLowerCase());


        System.out.println("-----------trim()---------");
        //String içerisinde başından ve sonundan tüm boşlukları siler. Aradaki boşlukları silmez.
        String m = "     test@example.com     ";
        System.out.println(m.trim());



        System.out.println("-----------isBlank()--isEmpty()---------");
        String c = "";  //Length -> 0 isEmpty String ifadenin length() 0 olup olmadığını kontrol eder.
        //isBlank() ise String in sadece boşluklardan oluşup oluşmadığını kontrol eder.
        //ya da isEmpty nin true olmasını kontrol eder.
        System.out.println(c.isEmpty()); // true ->> ifade boşluklardan mı oluşuyor
        System.out.println(c.trim().isEmpty()); // true ->> ifade tamamen boş mu
        // isBlank bendeki sürümde yok bunun yerine String.trim().isEmpty() yazılır.
        System.out.println(" a".trim().isEmpty()); //false ->> ifadede boşluk dışında bir şey var mı

        // trim().isEmpty() == isBlank()  -> bendeki sürümü için






    }
}
