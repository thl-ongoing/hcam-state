package example;

public class Neutral implements Zustand {

    private Freundin freundin;

    public Neutral (Freundin freundin) {
        this.freundin = freundin;
    }

    @Override
    public void unterhalten() {
        System.out.println("Hallo!");
    }

    @Override
    public void verärgern() {
        System.out.println("Du spinnst wohl! Ich bin sauer! ;-(");
        freundin.setAktuellerZustand(new Bockig(freundin));
    }

    @Override
    public void kussGeben() {
        System.out.println("Hihi :-)");
        freundin.setAktuellerZustand(new Froehlich(freundin));
    }
}
