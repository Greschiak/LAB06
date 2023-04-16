
public class Ksiazka {
    String Tytuł;
    String Autor;
    String ISBN;
    String DataWydania;
    int NumerWydania;
    double Cena;

    int IloscSztuk;
    int IloscStron;
    String Rodzaj;


     Ksiazka(String Tytuł, String Autor,String ISBN,String DataWydania,int NumerWydania, double Cena,int IloscSztuk,int IloscStron) {
        this.Tytuł = Tytuł;
        this.Autor = Autor;
        this.ISBN = ISBN;
        this.DataWydania = DataWydania;
        this.NumerWydania = NumerWydania;
        this.Cena = Cena;
        this.IloscSztuk = IloscSztuk;
        this.IloscStron = IloscStron;
        this.Rodzaj = "Książka";

    }
    public void Info(){
        System.out.println("Tytuł: "+Tytuł+", Autor: "+Autor+", ISBN: "+ISBN+", Data wydania: "+DataWydania+", Numer wydania: "+NumerWydania+", Cena: "+Cena+", Ilość sztuk: "+IloscSztuk+", Ilość stron: "+IloscStron);
    }

}

