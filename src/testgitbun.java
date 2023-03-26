public class testgitbun {
    private int niisama;

    public testgitbun(int niisama) {
        this.niisama = niisama;
    }

    public int getNiisama() {
        return niisama;
    }

    public void setNiisama(int niisama) {
        this.niisama = niisama;
    }

    @Override
    public String toString() {
        return "testgitbun{" +
                "niisama=" + niisama +
                '}';
    }
}
