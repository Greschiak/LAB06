import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int NumerZadania;
        do{
            System.out.print("\n--------------------------------------------------------------------------\n");
            System.out.print("Wybierz numer zadania\n");
            System.out.print("1. Zadanie 1\n");
            System.out.print("2. Zadanie 2\n");
            System.out.print("3. Zadanie 3\n");
            System.out.print("0. Wyjdz z programu \n");
            NumerZadania = WprowadzanieInt();
            switch (NumerZadania) {
                case 1:
                    run1();
                    break;
                case 2:
                    run2();
                    break;
                case 3:
                    run3();
                    break;
                case 0:
                    Close();
                    break;
                default:
                    System.out.println("Nieprawidłowy numer zadania.");
                    break;

            }
        }while(true);

    }
    public static void  run1(){
        //Zadanie 1
        Punkt punkt1  = new Punkt(2,3);
        Punkt punkt2  = new Punkt(4,5);
        Punkt punkt3  = new Punkt(7,8);
        Prostokat prostokat1 = new Prostokat(3,6,"czerwony");
        prostokat1.punkt= new Punkt(0,0);
        prostokat1.przesun(3,5);
        System.out.println(prostokat1.opis());


        Kwadrat kwadrat1 = new Kwadrat(4,"Zielony");
        kwadrat1.punkt = new Punkt(0,0);
        kwadrat1.przesun(4,8);
        kwadrat1.getPowierzchnia();
        System.out.println(kwadrat1.opis());
        Trojkat trojkat1 = new Trojkat(6,7,"Niebieski");
        trojkat1.punkt = new Punkt(0,0);
        System.out.println(trojkat1.opis());

        punkt1.opis();
        punkt1.przesun(2,3);
        punkt1.opis();
        punkt2.setX(23);
        punkt2.setY(1);
        punkt2.opis();
        punkt3.zeruj();
        punkt3.opis();
        Okrag okrag = new Okrag(new Punkt(2,3),3);
        okrag.wSrodku(new Punkt(2.5,4));
    }

    public static void  run2(){
        //Zadanie 2

        Samochod samochod1 = new Samochod();
        System.out.println("Informacje o samochodzie");
        samochod1.Informacja();
        Samochod samochod2 = new Samochod("Alfa Romeo","GTV","coupe","czerwony",1994,21321.321);
        System.out.println("Informacje o samochodzie");
        samochod2.Informacja();
        SamochodOsobowy osobowy1 = new SamochodOsobowy();
        System.out.println("Informacje o samochodzie");
        osobowy1.Informacja();



    }
    public static void run3(){
        Ksiegarnia ksiegarnia1 = new Ksiegarnia("Słoneczna","ul. kawęczyńska 37, 33-200 Rzeszów","834-130-22-83");
        ksiegarnia1.Klienci[0]= new Klient("Jan","Kowalski","12345678901","232-323-11-22","ul. Krakowska 50","22-200","Poznań");
        ksiegarnia1.Klienci[1]= new Klient("Piotr","Nowak","34345672014","111-223-51-33","ul. Nowa 34","32-300","Kraków");
        ksiegarnia1.Klienci[2]= new Klient("Krzysztof","Lewandowski","55555678933","444-321-55-77","ul. Stara 20","12-120","Warszawa");
        ksiegarnia1.Klienci[3]= new Klient("Marcin","Kowal","66665629011","552-433-33-86","ul. Długa 44","22-200","Poznań");
        ksiegarnia1.Klienci[4]= new Klient("Kacper","Nowacki","43436780142","999-433-51-74","ul. Słoneczna 11","26-240","Gdańsk");
        ksiegarnia1.Ksiazki[0] = new Ksiazka("Hobbit","J.R.R. Tolkien","1234567890123","02.02.1999",4,34.99,7,341);
        ksiegarnia1.Ksiazki[1] = new Ksiazka("Władca Pierscieni","J.R.R. Tolkien","5554567890123","03.05.2004",7,39.99,9,441);
        ksiegarnia1.Ksiazki[2] = new Powiesc("Opowieści o pilocie Pirxie","Stanisław Lem","7834569090123","08.07.1994",8,37.99,3,243,"Science Fiction");
        ksiegarnia1.Ksiazki[3] = new Powiesc("Solaris","Stanisław Lem","6229012345273","09.01.1992",11,38.99,12,323,"Science Fiction");
        ksiegarnia1.Ksiazki[4] = new Powiesc("Kongres futurologiczny","Stanisław Lem","4444562220123","09.11.1991",4,33.99,42,211,"Science Fiction");
        ksiegarnia1.Ksiazki[5] = new Powiesc("Solaris","Stanisław Lem","5554562290123","09.01.1992",11,38.99,12,323,"Science Fiction");
        ksiegarnia1.Ksiazki[6] = new Powiesc("Czy androidy śnią o elektrycznych owcach?","Philip K. Dick","3454522290177","09.01.1999",15,42.99,8,442,"Science Fiction");
        ksiegarnia1.Ksiazki[7] = new Powiesc("Silmarillion","J.R.R. Tolkien","6666567890123","02.02.1994",3,31.99,2,123,"Fantasy");
        ksiegarnia1.Ksiazki[8] = new Podrecznik("Podręcznik do matematyki","Jan Nowak","1111563390166","04.02.2012",3,28.99,11,153,7,"Podstawóka");
        ksiegarnia1.Ksiazki[9] = new Podrecznik("Podręcznik do Fizyki","Jacek Kowal","1343363391336","05.09.2022",5,25.99,4,122,3,"Liceum");
        ksiegarnia1.Zakupy[0] = new Zakup(ksiegarnia1.Ksiazki[1],ksiegarnia1.Klienci[3],3 );
        ksiegarnia1.Zakupy[1] = new Zakup(ksiegarnia1.Ksiazki[4],ksiegarnia1.Klienci[1],1 );
        ksiegarnia1.Zakupy[2] = new Zakup(ksiegarnia1.Ksiazki[5],ksiegarnia1.Klienci[2],2 );
        ksiegarnia1.Zakupy[3] = new Zakup(ksiegarnia1.Ksiazki[3],ksiegarnia1.Klienci[4],2 );
        ksiegarnia1.Zakupy[4] = new Zakup(ksiegarnia1.Ksiazki[2],ksiegarnia1.Klienci[0],1 );
        for (int i = 0; i < 10; i++) {
            ksiegarnia1.Ksiazki[i].Info();
        }
        ksiegarnia1.Zakupy[0].Info();
        ksiegarnia1.Zakupy[1].Info();
        ksiegarnia1.Zakupy[2].Info();
        ksiegarnia1.Zakupy[3].Info();
        ksiegarnia1.Zakupy[4].Info();









    }

    public static int WprowadzanieInt(){
        Scanner wprowadzanie = new Scanner(System.in);
        int liczba = wprowadzanie.nextInt();
        return liczba;
    }
    public static String WprowadzanieString(){
        Scanner wprowadzanie = new Scanner(System.in);
        String napis = wprowadzanie.next();
        return napis;
    }
    public static void Close() {
        System.out.println("\t\t\tCzy na pewno chcesz wyjsc t || T");
        String znak = WprowadzanieString();
        String st1="t";
        String st2="T";
        if (znak.equals(st1) || znak.equals(st2) ) System.exit(0);
    }

}