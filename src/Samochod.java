import java.util.Scanner;

 public class Samochod {
     String Marka;
    String Model;
    String Nadwozie;
    String Kolor;
    int RokProdukcji;
    double Przebieg;
     Scanner wprowadzanie = new Scanner(System.in);

    Samochod() {

        System.out.print("Podaj markę samochodu: ");
        this.Marka = wprowadzanie.nextLine();
        System.out.print("Podaj model samochodu: ");
        this.Model = wprowadzanie.nextLine();
        System.out.print("Podaj rodzaj nadwozia: ");
        this.Nadwozie = wprowadzanie.nextLine();
        System.out.print("Podaj kolor samochodu: ");
        this.Kolor = wprowadzanie.nextLine();
        System.out.print("Podaj rok produkcji: ");
        this.RokProdukcji = wprowadzanie.nextInt();
        do  {
            System.out.print("Podaj przebieg (nieujemny): ");
            this.Przebieg = wprowadzanie.nextDouble();
        } while (this.Przebieg <= 0);


    }

     Samochod(String Marka, String Model, String Nadwozie, String Kolor, int RokProdukcji, double Przebieg) {
         this.Marka = Marka;
         this.Model = Model;
         this.Nadwozie = Nadwozie;
         this.Kolor = Kolor;
         this.RokProdukcji = RokProdukcji;
         this.Przebieg = Przebieg;
     }

     public void Informacja(){
         System.out.println("Marka: "+this.Marka);
         System.out.println("Model: "+this.Model);
         System.out.println("Nadwozie: "+this.Nadwozie);
         System.out.println("Kolor: "+this.Kolor);
         System.out.println("Rok produkcji: "+this.RokProdukcji);
         System.out.println("Przebieg: " +this.Przebieg+" kilometrów");
     }



}
