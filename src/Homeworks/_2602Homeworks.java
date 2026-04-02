package Homeworks;

import java.util.Scanner;

public class _2602Homeworks {
    public static void main(String[] args) {

        //1) Market Alışveriş Listesi:
        //Kullanıcıdan kaç ürün gireceğini al. Her ürün için ürün adını iste ve bir listeye ekle.
        //Sonra kullanıcıdan bir kategori seçmesini iste: "meyve", "sebze", "atıştırmalık","içecek".
        //Seçime göre, listede geçen ürün adlarında bazı düzenlemeler yap:
        //Ürün adının başındaki/sonundaki boşlukları temizle.
        //Ürün adını ekrana daha düzenli biçimde yazdır (ör. ilk harfi büyük).
        //Son olarak, listedeki ürünlerin kaç tanesinde rakam geçtiğini sayıp ekrana yazdır.


                Scanner sc = new Scanner(System.in);

                System.out.print("Kaç ürün gireceksiniz: ");
                int sayi = Integer.parseInt(sc.nextLine());

                String[] urunler = new String[sayi];
                int rakamSayisi = 0;

                for(int i=0; i<sayi; i++){
                    System.out.print("Ürün adı: ");
                    String urun = sc.nextLine().trim();

                    // İlk harfi büyütme
                    if(urun.length() > 0){
                        urun = urun.substring(0,1).toUpperCase() + urun.substring(1);
                    }

                    // Rakam kontrolü
                    for(int j=0; j<urun.length(); j++){
                        if(Character.isDigit(urun.charAt(j))){
                            rakamSayisi++;
                            break;
                        }
                    }

                    urunler[i] = urun;
                }

                System.out.print("Kategori seç (meyve/sebze/atıştırmalık/içecek): ");
                String kategori = sc.nextLine();

                System.out.println("Ürünler:");
                for(String u : urunler){
                    System.out.println(u);
                }

                System.out.println("Rakam geçen ürün sayısı: " + rakamSayisi);



        // 2) Otobüs Kartı Bakiye Kontrolü:
        //Kullanıcıdan 7 günlük yolculuk sayısını tek tek al ve bir diziye kaydet.
        //Kullanıcıdan kart türünü al: "öğrenci", "tam", "indirimli".
        //Kart türüne göre bir biniş ücretini belirle.
        //Toplam harcama hesapla ve kullanıcıdan mevcut bakiyeyi al.
        //Bakiye yeterliyse kalan bakiyeyi, değilse ne kadar eksik kaldığını yazdır.
        //Ek olarak, gün isimlerini (Pzt-Sal-...) kullanarak en çok yolculuk yapılan günü ekrana yazdır.



                Scanner sc2 = new Scanner(System.in);

                int[] gunler = new int[7];
                String[] gunIsim = {"Pzt","Sal","Çar","Per","Cum","Cts","Paz"};

                int toplamYolculuk = 0;
                int enCok = 0;
                int enCokIndex = 0;

                for(int i=0; i<7; i++){
                    System.out.print(gunIsim[i] + " yolculuk sayısı: ");
                    gunler[i] = Integer.parseInt(sc.nextLine());
                    toplamYolculuk += gunler[i];

                    if(gunler[i] > enCok){
                        enCok = gunler[i];
                        enCokIndex = i;
                    }
                }

                System.out.print("Kart türü (öğrenci/tam/indirimli): ");
                String kart = sc.nextLine();

                double ucret = 0;

                if(kart.equals("öğrenci"))
                    ucret = 5;
                else if(kart.equals("tam"))
                    ucret = 10;
                else
                    ucret = 7;

                double toplamUcret = toplamYolculuk * ucret;

                System.out.print("Mevcut bakiye: ");
                double bakiye = Double.parseDouble(sc.nextLine());

                if(bakiye >= toplamUcret)
                    System.out.println("Kalan bakiye: " + (bakiye - toplamUcret));
                else
                    System.out.println("Eksik miktar: " + (toplamUcret - bakiye));

                System.out.println("En çok yolculuk yapılan gün: " + gunIsim[enCokIndex]);



        //3) Sınıf Yoklama ve İsim Düzeltme:
        //Kullanıcıdan sınıftaki öğrenci sayısını al ve öğrencilerin isimlerini sırayla alıp bir diziye kaydet.
        //Her isim için:
        //- Baş/son boşlukları temizle
        //- İsim içinde boşluk yoksa (tek kelimeyse) uyarı ver
        //Kullanıcıdan bir yoklama kodu al: "G" (geldi), "Y" (yok), "R" (raporlu). Koda göre bir mesaj yazdır.
        //Sonra tüm isimleri numaralı şekilde ekrana bas ve içinde 'a' harfi geçen isimleri say.


                Scanner sc3 = new Scanner(System.in);

                System.out.print("Öğrenci sayısı: ");
                int sayi2 = Integer.parseInt(sc3.nextLine());

                String[] isimler = new String[sayi2];
                int aSayisi = 0;

                for(int i=0; i<sayi2; i++){
                    System.out.print("İsim: ");
                    String isim = sc3.nextLine().trim();

                    if(!isim.contains(" "))
                        System.out.println("Uyarı: İsim tek kelime!");

                    if(isim.toLowerCase().contains("a"))
                        aSayisi++;

                    isimler[i] = isim;
                }

                System.out.print("Yoklama kodu (G/Y/R): ");
                String kod = sc3.nextLine();

                if(kod.equals("G"))
                    System.out.println("Geldi");
                else if(kod.equals("Y"))
                    System.out.println("Yok");
                else
                    System.out.println("Raporlu");

                System.out.println("Öğrenci Listesi:");
                for(int i=0; i<sayi2; i++){
                    System.out.println((i+1) + ". " + isimler[i]);
                }

                System.out.println("'a' harfi geçen isim sayısı: " + aSayisi);



        //4) Kafe Sipariş Takibi:
        //Kullanıcıdan 5 sipariş al: içecek adı ve boy (S/M/L). İçecek adlarını bir diziye, boyları ayrı bir diziye kaydet.
        //İçecek türüne göre taban fiyat belirle (ör. kahve/çay/limonata/diğer).
        //Boy seçimine göre fiyatı güncelle.
        //Her sipariş için ödenecek tutarı ve gün sonunda toplam ciroyu yazdır.
        //Ayrıca içecek adlarında "şekerli" kelimesi geçiyorsa bunu tespit edip kaç tane olduğunu say.

                Scanner sc4 = new Scanner(System.in);

                String[] icecekler = new String[5];
                String[] boylar = new String[5];

                double toplamCiro = 0;
                int sekerliSayisi = 0;

                for(int i=0; i<5; i++){
                    System.out.print("İçecek adı: ");
                    icecekler[i] = sc4.nextLine();

                    System.out.print("Boy (S/M/L): ");
                    boylar[i] = sc4.nextLine();

                    double fiyat = 0;

                    if(icecekler[i].toLowerCase().contains("kahve"))
                        fiyat = 30;
                    else if(icecekler[i].toLowerCase().contains("çay"))
                        fiyat = 15;
                    else if(icecekler[i].toLowerCase().contains("limonata"))
                        fiyat = 25;
                    else
                        fiyat = 20;

                    if(boylar[i].equals("M"))
                        fiyat += 5;
                    else if(boylar[i].equals("L"))
                        fiyat += 10;

                    if(icecekler[i].toLowerCase().contains("şekerli"))
                        sekerliSayisi++;

                    toplamCiro += fiyat;

                    System.out.println("Ödenecek tutar: " + fiyat);
                }

                System.out.println("Toplam ciro: " + toplamCiro);
                System.out.println("Şekerli içecek sayısı: " + sekerliSayisi);



        //5) Telefon Operatörü Paket Seçimi:
        //Kullanıcıdan 6 aylık internet kullanımlarını (GB) alıp bir diziye kaydet.
        //Kullanıcıdan paket tipini al: "mini", "standart", "premium".
        //Paket tipine göre aylık kota belirle.
        //Her ay için kota aşıldı mı kontrol et; aşıldıysa aşım miktarını yazdır.
        //En çok aşım olan ayı bul.
        //Ayrıca kullanıcıdan müşteri numarasını al; numaranın uzunluğu belirli değilse hata
        //mesajı ver ve numara içinde kaç tane rakam olduğunu say.

                Scanner sc6 = new Scanner(System.in);

                int[] kullanim = new int[6];
                int kota = 0;
                int enCokAsim = 0;
                int enCokAy = 0;

                for(int i=0; i<6; i++){
                    System.out.print((i+1) + ". ay kullanım (GB): ");
                    kullanim[i] = Integer.parseInt(sc6.nextLine());
                }

                System.out.print("Paket tipi (mini/standart/premium): ");
                String paket = sc6.nextLine();

                if(paket.equals("mini"))
                    kota = 5;
                else if(paket.equals("standart"))
                    kota = 10;
                else
                    kota = 20;

                for(int i=0; i<6; i++){
                    if(kullanim[i] > kota){
                        int asim = kullanim[i] - kota;
                        System.out.println((i+1) + ". ay aşım: " + asim);

                        if(asim > enCokAsim){
                            enCokAsim = asim;
                            enCokAy = i+1;
                        }
                    }
                }

                System.out.println("En çok aşım olan ay: " + enCokAy);

                System.out.print("Müşteri numarası: ");
                String numara = sc6.nextLine();

                if(numara.length() < 5)
                    System.out.println("Hatalı numara!");

                int rakam_Sayisi = 0;
                for(int i=0; i<numara.length(); i++){
                    if(Character.isDigit(numara.charAt(i)))
                        rakam_Sayisi++;
                }

                System.out.println("Numaradaki rakam sayısı: " + rakamSayisi);



        //6) Ev Enerji Tüketimi Analizi:
        //Kullanıcıdan 12 aylık elektrik tüketimini (kWh) alıp bir diziye kaydet.
        //Kullanıcıdan tarife seçimi al: "gündüz", "gece", "karma".
        //Seçime göre birim fiyat belirle.
        //Yıllık toplam maliyeti hesapla.
        //Ayrıca, ortalamanın üstünde olan ayların kaç tane olduğunu say ve bu ayları "Ocak,
        //Şubat..." şeklinde yazdır.


                Scanner sc7 = new Scanner(System.in);

                int[] tuketim = new int[12];
                String[] aylar = {"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran",
                        "Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};

                double fiyat = 0;
                int toplam = 0;

                for(int i=0; i<12; i++){
                    System.out.print(aylar[i] + " tüketim: ");
                    tuketim[i] = Integer.parseInt(sc.nextLine());
                    toplam += tuketim[i];
                }

                System.out.print("Tarife (gündüz/gece/karma): ");
                String tarife = sc7.nextLine();

                if(tarife.equals("gündüz"))
                    fiyat = 2;
                else if(tarife.equals("gece"))
                    fiyat = 1.5;
                else
                    fiyat = 1.8;

                double toplamMaliyet = toplam * fiyat;
                double ortalama = toplam / 12.0;

                System.out.println("Yıllık maliyet: " + toplamMaliyet);

                System.out.println("Ortalama üstü aylar:");
                for(int i=0; i<12; i++){
                    if(tuketim[i] > ortalama)
                        System.out.println(aylar[i]);
                }





        //7) Sinema Biletleme:
        //Kullanıcıdan kaç bilet alacağını al ve her bilet için film adını bir diziye kaydet.
        //Kullanıcıdan salon türünü al: "2d", "3d", "imax".
        //Salon türüne göre bilet fiyatı belirle.
        //Kullanıcıdan yaş grubunu al: "çocuk", "öğrenci", "yetişkin", "65+" ve indirimi
        //uygula.
        //Her film için kaç bilet alındığını sayıp raporla.
        //Film adlarında aynı filmin farklı yazımları varsa (ör. büyük/küçük harf farkı),
        //sayımda aynı kabul et.


                Scanner sc8 = new Scanner(System.in);

                System.out.print("Kaç bilet: ");
                int sayi_ = Integer.parseInt(sc8.nextLine());

                String[] filmler = new String[sayi_];

                for(int i=0; i<sayi_; i++){
                    System.out.print("Film adı: ");
                    filmler[i] = sc8.nextLine().toLowerCase();
                }

                System.out.print("Salon (2d/3d/imax): ");
                String salon = sc8.nextLine();

                double fiyat_ = 0;

                if(salon.equals("2d"))
                    fiyat_ = 50;
                else if(salon.equals("3d"))
                    fiyat_ = 70;
                else
                    fiyat_ = 100;

                System.out.print("Yaş grubu (çocuk/öğrenci/yetişkin/65+): ");
                String yas = sc8.nextLine();

                if(yas.equals("çocuk") || yas.equals("öğrenci"))
                    fiyat_ *= 0.8;
                else if(yas.equals("65+"))
                    fiyat_ *= 0.7;

                System.out.println("Bilet fiyatı: " + fiyat_);

                for(int i=0; i<sayi_; i++){
                    int sayac = 0;
                    for(int j=0; j<sayi_; j++){
                        if(filmler[i].equals(filmler[j]))
                            sayac++;
                    }
                    System.out.println(filmler[i] + " filminden " + sayac + " adet");
                }



        //8) Kargo Takip ve Teslim Seçimi:
        //Kullanıcıdan 5 takip kodu alıp bir diziye kaydet.
        //Her kod için baş/son boşlukları temizle ve kod uzunluğu 10 değilse uyarı ver.
        //Kullanıcıdan teslim tipi al: "ev", "ofis", "şube".
        //Teslim tipine göre ücret belirle.
        //Kullanıcıdan mesafeyi (km) al; 30 km üstüyse ek ücret uygula.
        //Son olarak, her kodun ilk 2 karakterini yazdır ve kodlarda kaç tane harf kaç tane
        //rakam olduğunu toplamda say.


                Scanner sc9 = new Scanner(System.in);

                String[] kodlar = new String[5];
                int harf = 0, rakam = 0;

                for(int i=0; i<5; i++){
                    System.out.print("Takip kodu: ");
                    kodlar[i] = sc9.nextLine().trim();

                    if(kodlar[i].length() != 10)
                        System.out.println("Uyarı: Kod 10 karakter değil!");

                    System.out.println("İlk 2 karakter: " + kodlar[i].substring(0,2));

                    for(int j=0; j<kodlar[i].length(); j++){
                        if(Character.isLetter(kodlar[i].charAt(j)))
                            harf++;
                        else if(Character.isDigit(kodlar[i].charAt(j)))
                            rakam++;
                    }
                }

                System.out.print("Teslim tipi (ev/ofis/şube): ");
                String tip = sc9.nextLine();

                double ucret_ = 20;

                if(tip.equals("ev"))
                    ucret_ = 30;

                System.out.print("Mesafe (km): ");
                int km = Integer.parseInt(sc9.nextLine());

                if(km > 30)
                    ucret_ += 15;

                System.out.println("Teslim ücreti: " + ucret_);
                System.out.println("Toplam harf: " + harf);
                System.out.println("Toplam rakam: " + rakam);



        //9) Spor Salonunda Antrenman Günlüğü:
        //Kullanıcıdan 7 gün için antrenman türünü al: "koşu", "ağırlık", "yüzme", "dinlenme"
        //ve bir diziye kaydet.
        //Her gün için dakika bilgisini alıp ayrı bir diziye kaydet.
        //Antrenman türüne göre yakılan kalori katsayısı belirle ve günlük kalorileri hesapla.
        //Toplam kalori, en yüksek kalori olan gün ve kaç gün "dinlenme" seçildiğini yazdır.
        //Ayrıca kullanıcıdan hedef metnini al (ör. "haftada 3 gün koşu"); metinde kaç kelime
        //olduğunu say.


                Scanner sc11 = new Scanner(System.in);

                String[] tur = new String[7];
                int[] dakika = new int[7];

                int toplamKalori = 0;
                int enYuksek = 0;
                int dinlenmeSayisi = 0;

                for(int i=0; i<7; i++){
                    System.out.print("Antrenman türü: ");
                    tur[i] = sc11.nextLine();

                    System.out.print("Dakika: ");
                    dakika[i] = Integer.parseInt(sc11.nextLine());

                    int katsayi = 0;

                    if(tur[i].equals("koşu"))
                        katsayi = 10;
                    else if(tur[i].equals("ağırlık"))
                        katsayi = 8;
                    else if(tur[i].equals("yüzme"))
                        katsayi = 9;
                    else{
                        katsayi = 0;
                        dinlenmeSayisi++;
                    }

                    int kalori = dakika[i] * katsayi;
                    toplamKalori += kalori;

                    if(kalori > enYuksek)
                        enYuksek = kalori;
                }

                System.out.println("Toplam kalori: " + toplamKalori);
                System.out.println("En yüksek kalori: " + enYuksek);
                System.out.println("Dinlenme günü sayısı: " + dinlenmeSayisi);

                System.out.print("Hedef metni: ");
                String hedef = sc11.nextLine();

                String[] kelime = hedef.split(" ");
                System.out.println("Kelime sayısı: " + kelime.length);





        // 10) Araç Bakım Hatırlatıcısı:
        //Kullanıcıdan 8 farklı bakım kaleminin adını al (ör. yağ değişimi, lastik, fren, filtre...)
        //ve bir diziye kaydet.
        //Her kalem için, son bakım tarihini "GG/AA/YYYY" biçiminde metin olarak al ve ayrı
        //bir diziye kaydet.
        //Kullanıcıdan bakım türünü seçmesini iste: "acil", "normal", "kontrol".
        //Seçime göre uyarı mesajı üret.
        //Girilen tarih metninde "/" karakteri yoksa veya uzunluk uygunsuzsa uyarı ver.
        //Son olarak, bakım adı içinde en az 1 rakam geçen kayıt var mı kontrol et ve toplam
        //kaç tanesinde rakam geçtiğini yazdır.


                Scanner sc12 = new Scanner(System.in);

                String[] bakim = new String[8];
                String[] tarih = new String[8];

                int rakamliBakim = 0;

                for(int i=0; i<8; i++){
                    System.out.print("Bakım adı: ");
                    bakim[i] = sc12.nextLine();

                    System.out.print("Son bakım tarihi (GG/AA/YYYY): ");
                    tarih[i] = sc12.nextLine();

                    if(!tarih[i].contains("/") || tarih[i].length() < 8)
                        System.out.println("Tarih formatı hatalı!");

                    for(int j=0; j<bakim[i].length(); j++){
                        if(Character.isDigit(bakim[i].charAt(j))){
                            rakamliBakim++;
                            break;
                        }
                    }
                }

                System.out.print("Bakım türü (acil/normal/kontrol): ");
                String tur_ = sc12.nextLine();

                if(tur_.equals("acil"))
                    System.out.println("Acil bakım gerekli!");
                else if(tur_.equals("normal"))
                    System.out.println("Normal bakım planlandı.");
                else
                    System.out.println("Kontrol edilecek.");

                System.out.println("Rakam geçen bakım sayısı: " + rakamliBakim);









    }
}
