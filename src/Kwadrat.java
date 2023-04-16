 class Kwadrat extends Prostokat {



     public double getBok() {
         return super.szer;
     }

     public void setBok(double bok) {
         super.wys = bok;
         super.szer = bok;
     }

     Kwadrat(double bok) {
         super(bok, bok);
     }

     Kwadrat(double bok, String kolor) {
         super(bok,bok, kolor);
     }
     String opis(){
         return "Klasa Kwadrat. Kolor obiektu: "+kolor+" Współrzędne:"+punkt.x+","
                 +punkt.y+" o powierzchni:"+getPowierzchnia()+" Długość boku:"+getBok();
     }

 }
