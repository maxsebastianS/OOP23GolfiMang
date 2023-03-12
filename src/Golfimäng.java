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
        Mängija Mangija1 = new Mängija("Max",23);
        EGCC.alustamängu(Mangija1);
    }
}