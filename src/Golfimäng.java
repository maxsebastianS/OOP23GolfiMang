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
                String kepistring = tükid[2];
                int maxPikkus = Integer.parseInt(tükid[0]);
                int minPikkus = Integer.parseInt(tükid[1]);

                tulemus.add(new Golfikepp(kepistring, maxPikkus, minPikkus));
            }
        }
        return tulemus;
    }
    public static void main(String[] args) throws Exception {
        Rada rada1 = new Rada(1,447,5);
        Rada rada2 = new Rada(2,282,4);
        Rada rada3 = new Rada(3,145,3);
        Rada rada4 = new Rada(4,300,4);
        Rada rada5 = new Rada(5,455,5);
        Rada rada6 = new Rada(6,373,4);
        Rada rada7 = new Rada(7,291,5);
        Rada rada8 = new Rada(8,158,3);
        Rada rada9 = new Rada(9,289,4);
        List<Rada> golfirajad = new ArrayList<>();
        golfirajad.add(rada1);
        golfirajad.add(rada2);
        golfirajad.add(rada3);
        golfirajad.add(rada4);
        golfirajad.add(rada5);
        golfirajad.add(rada6);
        golfirajad.add(rada7);
        golfirajad.add(rada8);
        golfirajad.add(rada9);
        Golfiväljak EGCC = new Golfiväljak(golfirajad);
        List<Golfikepp> Mängija1Golfikepid = loeGolfikepid("golfikepp.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta oma Händikäpi index: (vahemik 0-54) ");
        String inputstring = scanner.next();
        while (Integer.parseInt(inputstring) < 0 || Integer.parseInt(inputstring) > 54) {
            System.out.println("Sellist händikäpi ei ole olemas");
            System.out.println("Sisesta oma Händikäpi index: (vahemik 0-54) ");
            inputstring = scanner.next();
        }
        Mängija Mangija1 = new Mängija(Integer.parseInt(inputstring),Mängija1Golfikepid);
        EGCC.alustamängu(Mangija1);
    }

}
