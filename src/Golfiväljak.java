import java.util.List;
import java.util.Random;

public class Golfiväljak {
    private List<Rada> golfirajad;

    public Golfiväljak(List<Rada> golfirajad) {
        this.golfirajad = golfirajad;
    }
    public double löögiprotsent(Mängija mängija){
        double hcp = mängija.getHCP();
        double täpsus = (100-hcp);
        return täpsus;
    }

    public void alustamängu(Mängija mängija){
        System.out.println("mang algab");
        double täpsus = löögiprotsent(mängija);
        Random r = new Random();
        for (Rada rada : golfirajad){
            System.out.println("rada number " + rada.rajanumber);
            int löökidearv = 0;
            while(rada.rajapikkus > 5){
                double random = r.nextInt(100) + 1;
                if (random < täpsus) {
                    int hea_look_alumine = 100;
                    int hea_look_ulemine = 180;
                    int loogipikkus = r.nextInt(hea_look_ulemine-hea_look_alumine)+hea_look_alumine;
                    rada.rajapikkus -= loogipikkus;
                    System.out.println("Hea löök! Löögipikkus oli "+ loogipikkus +"m");
                    löökidearv++;
                }
                else{
                    int halb_look_alumine = 20;
                    int halb_look_ulemine = 50;
                    int loogipikkus = r.nextInt(halb_look_ulemine-halb_look_alumine)+halb_look_alumine;
                    rada.rajapikkus -= loogipikkus;
                    System.out.println("Halb löök! Löögipikkus oli "+ loogipikkus +"m");
                    löökidearv++;
                }
            }
        }
    }
}
