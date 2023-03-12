public class Golfikepp {
    private char kepichar;
    private int maksimaalne_hea_pikkus;
    private int minimaalne_hea_pikkus;

    public Golfikepp(char kepichar, int maksimaalne_hea_pikkus, int minimaalne_hea_pikkus) {
        this.kepichar = kepichar;
        this.maksimaalne_hea_pikkus = maksimaalne_hea_pikkus;
        this.minimaalne_hea_pikkus = minimaalne_hea_pikkus;
    }

    public char getKepichar() {
        return kepichar;
    }
    public int getMaksimaalne_hea_pikkus() {
        return maksimaalne_hea_pikkus;
    }
    public int getMinimaalne_hea_pikkus() {
        return minimaalne_hea_pikkus;
    }
}
