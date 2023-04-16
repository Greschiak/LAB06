
class Trojkat extends Figura
{
	double wys=0, podst=0;

	Trojkat(double wys, double podst)
	{
		this.wys = wys;
		this.podst = podst;
	}
	public Trojkat(double wys, double podst,String kolor) {
		super(kolor);
		this.wys = wys;
		this.podst = podst;
	}
	String opis(){
		return "Klasa Trójkąt. Kolor obiektu: "+kolor+" Współrzędne:"+punkt.x+","
				+punkt.y+" Długość podstawy:"+podst+" Długość wysokości:"+wys;
	}
	
}