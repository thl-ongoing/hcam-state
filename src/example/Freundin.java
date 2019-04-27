package example;

public class Freundin {

    private Zustand aktuellerZustand;

    public Freundin () {
        setAktuellerZustand(new Neutral(this));
    }

    public void setAktuellerZustand(Zustand aktuellerZustand) {
        this.aktuellerZustand = aktuellerZustand;
    }

    public void unterhalten () {
        aktuellerZustand.unterhalten();
    }

    public void kussGeben() {
        aktuellerZustand.kussGeben();
    }

    public void verärgern() {
        aktuellerZustand.verärgern();
    }
}
