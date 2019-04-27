package example;

public class Bockig implements Zustand {

    private Freundin freundin;

    public Bockig (Freundin freundin) {
        this.freundin = freundin;
    }

    @Override
    public void unterhalten() {
        System.out.println("Fahr jetzt nach Hause! Ich will nicht mit dir reden!");
    }

    @Override
    public void kussGeben() {
        System.out.println("Na gut! Hab dich wieder lieb.");
        freundin.setAktuellerZustand(new Neutral(freundin));
    }

    @Override
    public void verärgern() {
        System.out.println("Du machst alles bloß noch schlimmer!");
    }
}
