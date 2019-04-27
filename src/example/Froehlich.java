package example;

public class Froehlich implements Zustand {

    private Freundin freundin;

    public Froehlich(Freundin freundin) {
        this.freundin  = freundin;
    }

    @Override
    public void unterhalten() {
        System.out.println("Hihi, mir gehts super!");
    }

    @Override
    public void kussGeben() {
        System.out.println("Hihi, :-D");
    }

    @Override
    public void verärgern() {
        System.out.println("Du spinnst wohl! ;-(");
        freundin.setAktuellerZustand(new Bockig(freundin));
    }
}
