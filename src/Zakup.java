public class Zakup {
    Ksiazka ksiazka;
    Klient klient;

    int IloscSztukZakupionych;

    public Zakup(Ksiazka ksiazka, Klient klient, int IloscSztukZakupionych) {
        this.ksiazka = ksiazka;
        this.klient = klient;
        this.IloscSztukZakupionych = IloscSztukZakupionych;
    }
    public void Info(){
        System.out.println("Książka: "+ ksiazka.Tytuł +", Klient: "+klient.Imie+klient.Nazwisko+", Ilość zakupionych sztuk: "+IloscSztukZakupionych+", Wartość zakupu: "+IloscSztukZakupionych*ksiazka.Cena);
    }

}
