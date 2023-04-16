import java.util.Scanner;

public class SamochodOsobowy extends Samochod {
    double Waga;
    double Pojemnosc;
    int IloscOsob;
    Scanner wprowadzanie = new Scanner(System.in);
    SamochodOsobowy(){
        super();

        do  {
            System.out.print("Podaj wagę samochodu (Przedział: 2-4.5 t): ");
            this.Waga = wprowadzanie.nextDouble();
        } while (this.Waga <= 2 || this.Waga >= 4.5);
        do  {
            System.out.print("Podaj pojęmność silnika (Przedział: 0.8l-3.0l): ");
            this.Pojemnosc = wprowadzanie.nextDouble();
        } while (this.Pojemnosc <= 0.8 || this.Pojemnosc >= 3.0);
        System.out.print("Podaj ilość osób: ");
        this.IloscOsob = wprowadzanie.nextInt();
    }



    public void Informacja(){
       super.Informacja();
        System.out.println("Waga: " + this.Waga + " ton");
        System.out.println("Pojemność silnika: " + this.Pojemnosc+ " litrów");
        System.out.println("Liczba miejsc siedzących: " + this.IloscOsob);
    }


}
