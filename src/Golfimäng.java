import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Golfimäng {
    public static List<Golfikepp> loeGolfikepid(String failinimi) throws Exception {
        List<Golfikepp> tulemus = new ArrayList<>();
        File fail = new File(failinimi);
        try (Scanner sc = new java.util.Scanner(fail, "UTF-8")) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] tükid = rida.split(", ");

                char kepichar = tükid[0].charAt(0);
                int maxPikkus = Integer.parseInt(tükid[1]);
                int minPikkus = Integer.parseInt(tükid[2]);

                tulemus.add(new Golfikepp(kepichar, maxPikkus, minPikkus));
            }
        }
        return tulemus;
    }
    public static void main(String[] args) throws Exception {
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
        List<Golfikepp> Mängija1Golfikepid = loeGolfikepid("golfikepp.txt");
        Mängija Mangija1 = new Mängija("Max",23,Mängija1Golfikepid);
        EGCC.alustamängu(Mangija1);
    }

}
