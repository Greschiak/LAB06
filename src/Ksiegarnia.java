public class Ksiegarnia {
    Ksiazka [] Ksiazki = new Ksiazka[10];
    Klient [] Klienci = new Klient[5];
    Zakup [] Zakupy = new Zakup[5];
    String NazwaKsiegarni;
    String AdresKsiegarni;
    String NIPKsiegarni;

    public Ksiegarnia(String NazwaKsiegarni, String AdresKsiegarni, String NIPKsiegarni) {
        this.NazwaKsiegarni = NazwaKsiegarni;
        this.AdresKsiegarni = AdresKsiegarni;
        this.NIPKsiegarni = NIPKsiegarni;
    }
}
