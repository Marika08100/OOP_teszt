public class Varos {
    private String nev;
    private int lakossag;
    private Fovaros fovaros;

    public Varos() {
    }

    public Varos(String nev, int lakossag) {
        this.nev = nev;
        this.lakossag = lakossag;
    }

    public boolean Megfelelonev() {
        return (getLakossag() < 100000
                && fovaros.getSzenyezetseget() < 50
                && fovaros.getMetrokSzama() > 5);
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getLakossag() {
        return lakossag;
    }

    public void setLakossag(int lakossag) {
        this.lakossag = lakossag;
    }

    public Fovaros getFovaros() {
        return fovaros;
    }

    public void setFovaros(Fovaros fovaros) {
        this.fovaros = fovaros;
    }

    @Override
    public String toString() {
        return "Név: " + nev +
                ", Lakosság:" + lakossag;
    }
}
