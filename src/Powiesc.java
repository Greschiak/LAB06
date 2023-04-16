public class Powiesc extends Ksiazka {

    String Gatunek;

    Powiesc(String Tytuł, String Autor,String ISBN,String DataWydania,int NumerWydania, double Cena,int IloscSztuk,int IloscStron,String Gatunek) {
        super(Tytuł,Autor,ISBN,DataWydania,NumerWydania,Cena,IloscSztuk,IloscStron);
        this.Gatunek = Gatunek;
        this.Rodzaj = "Powieść";

    }
    public void Info(){
        super.Info();
        System.out.println(", Gatunek: "+Gatunek+", Rodzaj: "+Rodzaj);
    }




}
