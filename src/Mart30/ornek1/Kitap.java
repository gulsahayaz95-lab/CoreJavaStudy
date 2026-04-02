package Mart30.ornek1;

public class Kitap {
    public String ad;


    //boş const kullanımı;

    /*
    public Kitap() {
        //bu javanın default olarak tanımladığıı constructor
    }

     */



    //eğer ki parametreli bir constructor yazıyorsak
    //bu classtan nesne üretirken
    //Kitap kitap = new Kitap();
    //şeklinde boş kullanamayız eğer lazımsa boş tanımlamak gerekir.

    public Kitap(String ad) {
        this.ad = ad;
        //parametre ismi ile class fieldlerinin isimleri aynı olduğunda karışabilir
        //bu sebeple class fieldlerin önüne this yazıp kullanıyoruz.

    }


    public Kitap() {

    }





}
