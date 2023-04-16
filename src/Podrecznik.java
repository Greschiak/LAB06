public class Podrecznik extends Ksiazka{
    int Klasa;
    String RodzajSzkoly;

    Podrecznik(String Tytuł, String Autor,String ISBN,String DataWydania,int NumerWydania, double Cena,int IloscSztuk,int IloscStron, int Klasa,String RodzajSzkoly){
        super(Tytuł,Autor,ISBN,DataWydania,NumerWydania,Cena,IloscSztuk,IloscStron);
        this.Klasa = Klasa;
        this.RodzajSzkoly = RodzajSzkoly;
        this.Rodzaj = "Podręcznik";


    }
    public void Info(){
        super.Info();
        System.out.println(", Klasa: "+Klasa+", Rodzaj Szkoły: "+RodzajSzkoly+", Rodzaj: "+Rodzaj);
    }
}
