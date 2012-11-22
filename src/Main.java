
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pracownik prac1 = new Programista("Janusz", 2000);
		Pracownik prac2 = new Programista("Seba", 1500);
		Pracownik kier1 = new Kierownik("Popar", 9000);
		kier1.dodaj(prac1);
		kier1.dodaj(prac2);
		Pracownik prac3 = new Programista("Karyna", 1200);
		Kierownik szefu = new Kierownik("Pawulon", 500000);
		szefu.dodaj(prac3);
		szefu.dodaj(kier1);
		szefu.wypisz();

	}

}
