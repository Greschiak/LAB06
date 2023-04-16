
 class Prostokat  extends Figura{


	double wys=0, szer=0;
	
	Prostokat(double wys,double szer){
		this.wys = wys;
		this.szer = szer;
			
	}

	 Prostokat(double wys, double szer,String kolor) {
		super(kolor);
		this.wys = wys;
		this.szer = szer;
	}


	double getPowierzchnia() {
        return (szer * wys);
    }
	public void przesun(double Offset_x,double Offset_y){
		punkt.x += Offset_x;
		punkt.y += Offset_y;

	}
	 String opis(){
		 return "Klasa Prostokat. Kolor obiektu: "+kolor+" Współrzędne:"+punkt.x+","
				 +punkt.y+" o powierzchni"+getPowierzchnia()+" Długość boków:"+wys+","+szer;
	 }


    
    
}