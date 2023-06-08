import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Kahve {
    String hangiKahve;
    String sut;
    String seker;
    String boyut;


    Scanner scan = new Scanner(System.in);

    public void setHangiKahve() {

        System.out.println("-------------------------------------");
        System.out.println("----------HOSGELDINIZ----------------");
        System.out.println("-------------------------------------");

        System.out.println("Hangi Kahveyi istersiniz?");
        System.out.println("Turk Kahvesi, Filitre Kahve, Expresso...");
        hangiKahve = scan.nextLine().toLowerCase();

        switch (hangiKahve) {
            case "turk kahvesi":
                System.out.println("Turk Kahvesi Haızrlanıyor..");
                setBoyut();
                setSut();
                setSeker();
                kahveHazir();
                break;
            case "filitre kahve":
                System.out.println("Filitre Kahve Haızrlanıyor..");
                setBoyut();
                setSut();
                setSeker();
                kahveHazir();
                break;
            case "expresso":
                System.out.println("Expresso Haızrlanıyor..");
                setBoyut();
                setSut();
                setSeker();
                kahveHazir();
                break;

            default:
                System.out.println("lutfen bir secim yapınız");
        }

    }

    public void setSut() {

        System.out.println("Kahvenize süt eklemek istermisiniz? Lutfen evet yada hayır olarak cevaplayınız");
        sut = scan.next().toLowerCase();
        switch (sut) {
            case "evet":
                System.out.println("Kahvenize Sut ekleniyor...");
                break;
            case "hayır":
                System.out.println("Kahveye süt eklenmiyor...");
        }
    }

    public void setSeker() {

        System.out.println("Şeker ister misiniz? Evet yada hayır şeklinde cevaplayınız..");
        seker = scan.next();

        if (seker.equalsIgnoreCase("evet")) {
            System.out.println("Kahvenize şeker ekleniyor");
        }

        if (seker.equalsIgnoreCase("hayır")) {
            System.out.println("Kahvenize şeker eklenmedi...");
        }
    }

    public void setBoyut() {

        System.out.println("Hangi Boyutta olsun? Buyuk boy, orta boy, kucuk boy olarak giriniz");

        boyut = scan.nextLine();

        if (boyut.equalsIgnoreCase("buyuk boy")) {
            System.out.println("Kahveniz " + boyut + " seklinde hazrılanıyor..");

        } else if (boyut.equalsIgnoreCase("orta boy")) {
            System.out.println("Kahvenize " + boyut + " seklinde hazrılanıyor..");

        } else if (boyut.equalsIgnoreCase("kucuk boy")) {

            System.out.println("Kahvenize " + boyut + " seklinde hazrılanıyor..");
        }
    }

    public void kahveHazir() {
        System.out.println("Kahveniz " + boyut + " " + hangiKahve +  " şeklinde hazırlandı. Afiyet olsun!!!!");
    }
}




