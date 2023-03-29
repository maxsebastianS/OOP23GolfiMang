import java.sql.SQLOutput;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Golfiväljak {
    private List<Rada> golfirajad;

    private List<Golfikepp> golfikepid;

    public Golfiväljak(List<Rada> golfirajad) {
        this.golfirajad = golfirajad;
        this.golfikepid = golfikepid;
    }

    public double löögiprotsent(Mängija mängija){
        double hcp = mängija.getHCP();
        double täpsus = (100-hcp);
        return täpsus;
    }
    public int väljakuPAR(List<Rada> golfirajad){
        int valjakupar = 0;
        for (Rada rada : golfirajad){
            valjakupar+= rada.raja_par;
        }
        return valjakupar;
    }


    public void alustamängu(Mängija mängija){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mäng algab - väljak: Estonian Golf & Country Club - Stone Course" );
        double täpsus = löögiprotsent(mängija);
        Random r = new Random();
        int löökidearv_kokku = 0;
        for (Rada rada : golfirajad){
            System.out.println(rada.rajanumber + ". rada - raja pikkus " + rada.rajapikkus + " meetrit.");
            int löökidearv_rajal = 0;
            while(Math.abs(rada.rajapikkus) > 2) {
                double random = r.nextInt(100) + 1;
                System.out.println("Sisesta golfikepp millega soovid lüüa: ");
                String inputstring = scanner.next();
                while (!(mängija.golfikeppOlemas(inputstring))) {
                    System.out.println(inputstring + " nimelist golfikeppi teil ei ole.");
                    System.out.println("Sisesta golfikepp millega soovid lüüa: ");
                    inputstring = scanner.next();
                }


                //System.out.println("sisestatud kepp:" + inputChar);
                int hea_look_alumine = mängija.Minimaalsepikkuseleidja(inputstring);
                int hea_look_ulemine = mängija.Maksimaalsepikkuseleidja(inputstring);
                if (Math.abs(rada.rajapikkus) > 10) {
                    if (random < täpsus) {
                        int loogipikkus = r.nextInt(hea_look_ulemine - hea_look_alumine) + hea_look_alumine;
                        if (Math.abs(rada.rajapikkus - loogipikkus) <= 2) {
                            System.out.println("Hea löök! Löögipikkus oli " + rada.rajapikkus + "m");
                        } else System.out.println("Hea löök! Löögipikkus oli " + loogipikkus + "m");
                        if (rada.rajapikkus < 0) rada.rajapikkus += loogipikkus;
                        else rada.rajapikkus -= loogipikkus;
                    } else {
                        int halb_look_alumine = hea_look_alumine / 2;
                        int halb_look_ulemine = hea_look_ulemine / 2;
                        int loogipikkus = r.nextInt(halb_look_ulemine - halb_look_alumine) + halb_look_alumine;
                        if (Math.abs(rada.rajapikkus - loogipikkus) <= 2) {
                            System.out.println("Hea löök! Löögipikkus oli " + rada.rajapikkus + "m");
                        } else System.out.println("Halb löök! Löögipikkus oli " + loogipikkus + "m");
                        if (rada.rajapikkus < 0) rada.rajapikkus += loogipikkus;
                        else rada.rajapikkus -= loogipikkus;
                    }
                }
                else{
                    int loogipikkus = r.nextInt(hea_look_ulemine - hea_look_alumine) + hea_look_alumine;
                    if (Math.abs(Math.abs(rada.rajapikkus) - loogipikkus) <= 2) {
                        System.out.println("Hea löök! Löögipikkus oli " + Math.abs(rada.rajapikkus) + "m");
                    } else System.out.println("Halb löök! Löögipikkus oli " + loogipikkus + "m");
                    if (rada.rajapikkus < 0) rada.rajapikkus += loogipikkus;
                    else rada.rajapikkus -= loogipikkus;
                }
                if (Math.abs(rada.rajapikkus) <= 2) {
                    System.out.println("Pall veeres auku!");
                } else {
                    System.out.println("Auguni on veel " + Math.abs(rada.rajapikkus) + " meetrit.");
                }
                löökidearv_rajal++;
            }
            System.out.println("Läbisid raja " + löökidearv_rajal + ". löögiga, raja par oli " + rada.raja_par );
            löökidearv_kokku += löökidearv_rajal;
        }
        System.out.println("Mäng läbi, kokku tegid " + löökidearv_kokku + " lööki. Väljaku par oli " + väljakuPAR(golfirajad));
    }

}
