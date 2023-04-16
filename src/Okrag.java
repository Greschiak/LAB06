public class Okrag extends Figura{

    double promien;

    public double getPromien() {
        return promien;
    }
    public Punkt getSrodek(){ return punkt;}
    public void  setSrodek(Punkt punktPar){ this.punkt=punktPar; }

    public void setPromien(double promien) {
        this.promien = promien;
    }
    public double getSrednica(){
        return 2*getPromien();
    }
    public double getPowierzchnia(){
        return Math.PI*Math.pow(promien,2);
    }
    public void wSrodku(Punkt punkt){
        double lStrona = Math.pow(punkt.x-punkt.x,2)+ Math.pow(punkt.y-punkt.y,2);
        double pStrona = Math.pow(promien,2);
        if(lStrona <=pStrona){
            punkt.opis();
            System.out.print(" Znajduje się w okregu o srodku S["+ punkt.x+","+punkt.y+"]");
        } else {
            punkt.opis();
            System.out.print(" Znajduje sie poza okregiem");
        }


    }

    public Okrag(Punkt srodek, double promien) {
        this.punkt = srodek;
        this.promien = promien;
    }
    public Okrag(){
        punkt.x = 0.0;
        punkt.y=0.0;
        promien =0;
    }
}
