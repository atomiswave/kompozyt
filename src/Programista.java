
public class Programista implements Pracownik {

	private String imie;
	private double hajs;
	
	
	public Programista(String imie, double hajs){
		this.imie = imie;
		this.hajs = hajs;
		
	}
	
	@Override
	public void dodaj(Pracownik pracownik) {
		// nie dotyczy - ta klasa jest li�ciem w hierarchii
		
	}

	@Override
	public void wywal(Pracownik pracownik) {
		// nie dotyczy - ta klasa jest li�ciem w hierarchii
		
	}

	@Override
	public Pracownik potomek(int i) {
		// nie dotyczy - ta klasa jest li�ciem w hierarchii
		return null;
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
	
		System.out.println("\nImie = " + getImie() + ", pensja = " + getHajs() + ", programista");
	}

}
