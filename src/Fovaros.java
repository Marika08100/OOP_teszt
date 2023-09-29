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

    public int getSzenyezetseget() {
        return szenyezetseget;
    }

    public void setSzenyezetseget(int szenyezetseget) {
        this.szenyezetseget = szenyezetseget;
    }

    public int getMetrokSzama() {
        return metrokSzama;
    }

    public void setMetrokSzama(int metrokSzama) {
        this.metrokSzama = metrokSzama;
    }

    @Override
    public String toString() {
        String megfelelo = Megfelelonev() ? "Igen" : "Nem";
        return "Név: " + getNev()+ ", Lakossága: " +getLakossag() + ", Szennyezettség: " + getSzenyezetseget() + ", Metrók száma: " +getMetrokSzama() + ", Megfelelő: " + megfelelo;
    }
}
