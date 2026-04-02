package Mart30.enums;

public enum SiparisDurumu {
    HAZIRLANIYOR("Kargo hazırlanıyor"),
    KARGODA("yolda"),
    TESLIM_EDILDI("teslim edildi"),
    IPTAL_EDILDI("iptal edildi");

    String aciklama;

    SiparisDurumu(String aciklama){
        this.aciklama = aciklama;
    }


}
