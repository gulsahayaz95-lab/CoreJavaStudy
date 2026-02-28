package Subat18;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {


        /**
         *
         * Switch(değişken) {
         *      case deger1:
         *           //kod1
         *           break;
         *
         *      case deger2:
         *           //kod2
         *           break2;
         *
         *      case deger3:
         *           //kod3
         *           break3;
         *
         *      default:,
         *           // hiçbir case uygun değilse burası çalışır.
         *
         * }
         *
         *
         * burada break kodu durdurmak için var yoksa ardındaki diğer değerleri de kontrol eder!
         *
         */



        System.out.print("Kaçıncı gündür?: ");
        Scanner scan = new Scanner(System.in);
        int day1 = scan.nextInt();

        switch (day1) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("ctesi");
                break;
            case 7:
                System.out.println("pazar");
            default:
                System.out.println("Geçersiz tarih aralığı.");
        }



        int seviye = 1;
        switch (seviye) {
            case 1:
                System.out.println("Seviye1");
                break;
                case 2:
                    System.out.println("Seviye2");
                    break;
                    case 3:
                    System.out.println("Seviye3");
                    break;
            default:
                System.out.println("Seviye yok");  // burada gerek yok kullanıcıdan veri girişinde yazılır.
        }

        //break yazmazsak tüm printleri yazacaktır!!!!
        //tüm caselerde olmasa da örn case2 de yalnızca break olursa ilk ikiyi alır diğerlerini yazdırmaz.


        System.out.println("----------------");

        char harf = 'B';

        switch (harf) {
            case 'A':
            case 'B':
                case 'C':
                        System.out.println("Geçer Not");
                        break;
                        case 'D':
                            case 'E':
                                System.out.println("Kaldı");
                                break;
            default:
                System.out.println("Sınava girmedi");

        }




        System.out.println("----------------");

        String brand = "QA";

        switch (brand) {
            case"DEV":
                System.out.println("Developer");
                break;
            case "QA":
                System.out.println("SDET");
                break;
            case "PM":
                System.out.println("Project Manager");
                break;
            default:
                System.out.println("Yapay zeka yeni branş buldu");
        }
















    }
}
