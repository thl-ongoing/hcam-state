package example;

import example.Freundin;

public class FreundinMain {

    public static void main(String[] args) {

        Freundin freundin = new Freundin();

        freundin.unterhalten();
        freundin.verärgern();
        System.out.println();

        freundin.unterhalten();
        freundin.unterhalten();
        System.out.println();

        freundin.kussGeben();
        freundin.kussGeben();

        freundin.unterhalten();
    }
}
