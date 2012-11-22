import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Kierownik implements Pracownik {
	
	String imie;
	double hajs;
	
	Kierownik(String imie, double hajs){
		this.imie = imie;
		this.hajs = hajs;
	}
	
	List<Pracownik> pracownicy = new ArrayList<Pracownik>();
	

	@Override
	public void dodaj(Pracownik pracownik) {
		
		pracownicy.add(pracownik);
	}

	@Override
	public void wywal(Pracownik pracownik) {

		pracownicy.remove(pracownik);
	}

	@Override
	public Pracownik potomek(int i) {
		
		return pracownicy.get(i);
	}

	@Override
	public String getImie() {
	
		return imie;
	}

	@Override
	public double getHajs() {
		
		return hajs;
	}

	@Override
	public void wypisz() {
		
	System.out.println("\nImie = " + getImie() + ", pensja = " + getHajs() + ", kierownik");
		
	Iterator<Pracownik> iterujPracownikow = pracownicy.iterator();
	
	while(iterujPracownikow.hasNext()){
			Pracownik pracownik = iterujPracownikow.next();
			pracownik.wypisz();
		}
	}
}
