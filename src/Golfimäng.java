import java.util.ArrayList;
import java.util.List;

public class Golfimäng {
    public static void main(String[] args) {
        Rada rada1 = new Rada(1,456,5);
        Rada rada2 = new Rada(2,298,4);
        Rada rada3 = new Rada(3,310,4);
        Rada rada4 = new Rada(4,380,4);
        Rada rada5 = new Rada(5,140,3);
        List<Rada> golfirajad = new ArrayList<>();
        golfirajad.add(rada1);
        golfirajad.add(rada2);
        golfirajad.add(rada3);
        golfirajad.add(rada4);
        golfirajad.add(rada5);
        Golfiväljak EGCC = new Golfiväljak(golfirajad);
        Golfikepp nr9 = new Golfikepp('9',120,90);
        Golfikepp nr8 = new Golfikepp('8',140,120);
        Golfikepp nr7 = new Golfikepp('7',150,120);
        Golfikepp nr6 = new Golfikepp('6',180,150);
        Golfikepp Pitchingwedge = new Golfikepp('P',100,80);
        Golfikepp Sandwedge = new Golfikepp('S',60,20);
        Golfikepp Putter = new Golfikepp('p',10,5);
        List<Golfikepp> Mängija1_golfikepid = new ArrayList<>();
        Mängija1_golfikepid.add(nr9);
        Mängija1_golfikepid.add(nr8);
        Mängija1_golfikepid.add(nr7);
        Mängija1_golfikepid.add(nr6);
        Mängija1_golfikepid.add(Pitchingwedge);
        Mängija1_golfikepid.add(Sandwedge);
        Mängija1_golfikepid.add(Putter);
        Mängija Mangija1 = new Mängija("Max",23,Mängija1_golfikepid);
        EGCC.alustamängu(Mangija1);
    }
}