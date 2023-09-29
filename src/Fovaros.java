public class Fovaros extends Varos {
    private int szenyezetseget;
    private int metrokSzama;

    public Fovaros(int szenyezetseget, int metrokSzama) {
        this.szenyezetseget = szenyezetseget;
        this.metrokSzama = metrokSzama;
    }

    public Fovaros(String nev, int lakossag, int szenyezetseget, int metrokSzama) {
        super(nev, lakossag);
        this.szenyezetseget = szenyezetseget;
        this.metrokSzama = metrokSzama;
    }
}
