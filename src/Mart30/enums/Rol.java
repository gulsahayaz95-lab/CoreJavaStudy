package Mart30.enums;

public enum Rol {
    OGRENCI, OGRETMEN, MUDUR;


    //enum içerisinde method tanımlayabiliriz
    //buradaki this kavramı -> enum un fieldleridir

    public void yetkiYazdir() {
        switch (this) {
            case MUDUR:
                System.out.println("MUDUR");
            case OGRETMEN:
                System.out.println("OGRETMEN");
            case OGRENCI:
                System.out.println("OGRENCI");
        }
    }












}
